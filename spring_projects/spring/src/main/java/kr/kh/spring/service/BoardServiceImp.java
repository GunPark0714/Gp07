package kr.kh.spring.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kr.kh.spring.dao.BoardDAO;
import kr.kh.spring.pagination.Criteria;
import kr.kh.spring.util.UploadFileUtils;
import kr.kh.spring.vo.BoardVO;
import kr.kh.spring.vo.FileVO;
import kr.kh.spring.vo.LikeVO;
import kr.kh.spring.vo.MemberVO;

@Service
public class BoardServiceImp implements BoardService{

	@Autowired
	BoardDAO boardDao;
	
	String uploadPath = "D:\\uploadfiles";

	@Override
	public boolean insertBoard(BoardVO board, MemberVO user, MultipartFile[] files) {
		if(user == null || user.getMe_id() == null) {
			return false;
		}
		if(board == null || board.getBo_title()==null || board.getBo_title().length() == 0) {
			return false;
		}
		board.setBo_me_id(user.getMe_id());
		if(!boardDao.insertBoard(board)) {
			return false;
		}
		//泥⑤��뙆�씪�쓣 �뾽濡쒕뱶
		if(files == null || files.length == 0) {
			return true;
		}
		
			//泥⑤��뙆�씪�쓣 �꽌踰꾩뿉 �뾽濡쒕뱶 �븯怨�, DB�뿉 ���옣
		uploadFileAndInsert(files, board.getBo_num());
		
		return true;
	}

	private void uploadFileAndInsert(MultipartFile[] files, int bo_num) {
		if(files == null || files.length == 0) {
			return;
		}
		for(MultipartFile file : files) {
			if(file == null || file.getOriginalFilename().length() == 0) {
				continue;
			}
			try {
				String fi_name = UploadFileUtils.uploadFile(uploadPath, file.getOriginalFilename(), file.getBytes());
				FileVO fileVo = new FileVO(bo_num, fi_name, file.getOriginalFilename());
				boardDao.insertFile(fileVo);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	//ap4
	package com.kh.test.model;
	 
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.util.ArrayList;
	import java.util.HashMap;
	import java.util.List;
	import java.util.Map;
	import org.apache.ibatis.session.SqlSession;
	import org.apache.ibatis.session.SqlSessionFactory;
	import org.apache.log4j.Logger;
	 
	public class TestDao {
		Logger logger = Logger.getLogger(TestDao.class);
		public static final String _DRIVER = "oracle.jdbc.driver.OracleDriver";
		public static final String _URL    = "jdbc:oracle:thin:@192.168.10.3:1521:xe";
		public static final String _USER   = "kh";
		public static final String _PW     = "kh";
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		private SqlSessionFactory sqlSessionFactory = null;
		SqlSession sqlSession = null;
		
		public TestDao() {
			sqlSessionFactory = MyBatisCommonFactory.getSqlSessionFactory();
		}	
		
		public List<Test> selectList() {
			StringBuilder sql = new StringBuilder();
			sql.append("SELECT seq, writer, title, content, regdate FROM test");
			List<Test> testList = new ArrayList<>();
			try {
				Class.forName(_DRIVER);
				con = DriverManager.getConnection(_URL, _USER, _PW);
				pstmt = con.prepareStatement(sql.toString());
				rs = pstmt.executeQuery();
				Test test = null;
				while(rs.next()) {
					test = new Test();
					test.setSeq(rs.getInt("seq"));
					test.setWriter(rs.getString("writer"));
					test.setTitle(rs.getString("title"));
					test.setContent(rs.getString("content"));
					test.setRegdate(rs.getString("regdate"));
					testList.add(test);
				}		
			} catch (Exception e) {
				logger.info("Exception : "+e.toString());
			}
			return testList;
		}
	}

	@Override
	public List<BoardVO> getBoardList(Criteria cri) {
		if(cri == null) {
			cri = new Criteria();
		}
		return boardDao.selectBoardList(cri);
	}

	@Override
	public int getTotalCount(Criteria cri) {
		if(cri == null) {
			cri = new Criteria();
		}
		return boardDao.selectBoardCount(cri);
	}

	@Override
	public BoardVO getBoard(Integer bo_num) {
		if(bo_num == null) {
			return null;
		}
		return boardDao.selectBoard(bo_num);
	}

	@Override
	public void updateViews(Integer bo_num) {
		if(bo_num == null) {
			return;
		}
		boardDao.updateBoardViews(bo_num);
	}

	@Override
	public boolean updateBoard(BoardVO board, MultipartFile[] files, Integer[] delFiles, MemberVO user) {
		if(board == null || board.getBo_title()==null || board.getBo_title().length() == 0 ) {
			return false;
		}
		//寃뚯떆湲� �젙蹂대�� 媛��졇�샂(濡쒓렇�씤�븳 �쉶�썝怨� �옉�꽦�옄媛� 媛숈�吏� �솗�씤�쓣 �쐞�빐) 
		BoardVO dbBoard = boardDao.selectBoard(board.getBo_num());
		//db�뿉 �빐�떦 寃뚯떆湲��씠 �뾾嫄곕굹 寃뚯떆湲� �옉�꽦�옄�� 濡쒓렇�씤�븳 �쉶�썝�씠 �떎瑜� 寃쎌슦
		if(dbBoard == null || !dbBoard.getBo_me_id().equals(user.getMe_id())) {
			return false;
		}
		if(!boardDao.updateBoard(board)) {
			return false;
		}
		//泥⑤��뙆�씪 �뾽�뜲�씠�듃 
		//異붽��맂 泥⑤��뙆�씪�쓣 �꽌踰꾩뿉 �뾽濡쒕뱶 諛� DB�뿉 異붽�
		uploadFileAndInsert(files, board.getBo_num());
		
		//�궘�젣�맂 泥⑤��뙆�씪�쓣 �꽌踰꾩뿉�꽌 �젣嫄� 諛� DB�뿉�꽌 �젣嫄�
		deleteFile(delFiles);
		return true;
	}

	private void deleteFile(Integer[] delFiles) {
		if(delFiles == null || delFiles.length == 0) {
			return;
		}
		
		for(Integer num : delFiles) {
			if(num == null) {
				continue;
			}
			//泥⑤��뙆�씪 �젙蹂대�� 媛��졇�샂
			FileVO fileVo = boardDao.selectFile(num);
			if(fileVo == null) {
				continue;
			}
			UploadFileUtils.deleteFile(uploadPath, fileVo.getFi_name());
			//DB�뿉�꽌 �젣嫄� 
			boardDao.deleteFile(num);
		}
		
	}

	@Override
	public boolean deleteBoard(Integer bo_num, MemberVO user) {
		if(bo_num == null || user == null) {
			return false;
		}
		BoardVO board = boardDao.selectBoard(bo_num);
		//�뾾�뒗 寃뚯떆湲��씠嫄곕굹 �옉�꽦�옄媛� �븘�땲硫� 
		if(board == null || !board.getBo_me_id().equals(user.getMe_id())) {
			return false;
		}
		//泥⑤��뙆�씪 �궘�젣
		List<FileVO> fileList = board.getFileVoList();
		deleteFile(fileList);
		//寃뚯떆湲� �궘�젣 
		boardDao.deleteBoard(bo_num);
		return true;
	}

	private void deleteFile(List<FileVO> fileList) {
		if(fileList == null || fileList.size() == 0) {
			return;
		}
		//List<FileVO> => Integer[]
		Integer [] nums = new Integer[fileList.size()];
		for(int i = 0; i<nums.length; i++) {
			nums[i] = fileList.get(i).getFi_num();
		}
		deleteFile(nums);
	}

	@Override
	public int like(LikeVO likeVo) {
		if(likeVo == null || likeVo.getLi_me_id() == null) {
			return -100;
		}
		//湲곗〈 異붿쿇 �젙蹂대�� 媛��졇�샂(寃뚯떆湲� 踰덊샇�� �븘�씠�뵒)
		LikeVO dbLikeVo = boardDao.selectLike(likeVo.getLi_bo_num(), likeVo.getLi_me_id());
		
		//湲곗〈 異붿쿇 �젙蹂닿� �뾾�쑝硫�
		if(dbLikeVo == null) {
			//異붽�
			boardDao.insertLike(likeVo);
		}
		else {//�엳�쑝硫�
			//db�뿉 �엳�뒗 異붿쿇 �긽�깭�� �솕硫댁뿉 �늻瑜� 異붿쿇 �긽�깭媛� 媛숈쑝硫� => 痍⑥냼 
			if(dbLikeVo.getLi_state() == likeVo.getLi_state()) {
				likeVo.setLi_state(0);
			}
			//�뾽�뜲�씠�듃
			boardDao.updateLike(likeVo);
		}
		boardDao.updateBoardLike(likeVo.getLi_bo_num());
		return likeVo.getLi_state();
	}
     
	/se1
	@Override
	public LikeVO getBoardLike(Integer bo_num, MemberVO user) {
		if(bo_num == null || user == null) {
			return null;
		}
		return boardDao.selectLike(bo_num, user.getMe_id());
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException{
				logger.info("doGet 호출 성공");
				Board board = new Board();
				board.setBoardTitle(req.getParameter("btitle"));
				board.setBoarWriter(req.getParameter("bwriter"));
				board.setBoardContent(req.getParameter("bcontent"));
				int result = 0;
				BoardService bs = new BoardService();
				result = bs.insertBoard(board);
				logger.info("result: "+result);
		 
				if(result == 1) {
					res.sendRedirect("/first/blist?page=1");
				}else {
					req.setAttribute("message", "게시글 등록 실패!");
					RequestDispatcher view = req.getRequestDispatcher("/WEB-INF/views/common/error.jsp");
					view.forward(req, res);
				}
			}		
			
			public void doPost(HttpServletRequest req, HttpServletResponse res)
					throws ServletException, IOException{
				doGet(req,res);
		}
			
	 /se2
	 public int insertBoard(Connection con, Board board) {
			int result =0;
			PreparedStatement pstmt = null;
			DBConnectionMgr dbMgr = DBConnectionMgr.getInstance();
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO board(BOARD_NUM,BOARD_TITLE,BOARD_WRITER,BOARD_CONTENT)");
			sql.append("VALUES(seq_khboard.nextval,?,?,?)");
	 
			try {
				// true면 insert후에 자동 커밋
				con.setAutoCommit(false); // 생략 - 디폴트가 true라서
				con = dbMgr.getConnection();
				pstmt = con.prepareStatement(sql.toString());
				pstmt.setString(1, board.getBoardTitle());
				pstmt.setString(2, board.getBoardWriter());
				pstmt.setString(3, board.getBoardContent());
				result = pstmt.executeUpdate();
				if(result == 1) {
					con.commit();
				}
			} catch (Exception e) {
				logger.info("Exception : "+e.toString());
			} finally {
				dbMgr.freeConnection(con, pstmt);
			}
			return result;
	}
	 /se3
	 
	 public int insertBoard(Board board) {
			logger.info("insertBoard 호출 성공");
			Connection con = getConnection();
			int result = 0;
			result = boardDao.insertBoard(con, board);
	 
			if(result > 0) {
				commit(con);
			} else {
				rollback(con);
			}
			close(con);
			return result;
	}
	 
	
	/se4
	
	public class JDBCTemplate {
		 
		public JDBCTemplate() {
		}
	 
		public static Connection getConnection() {
			Connection con = null;
			Properties prop = new Properties();
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				con = DriverManager.getConnection("jdbc:oracle:thin:@128.168.25.30:1521:xe", "student ", "student ");
			} catch (Exception e) {
				e.printStackTrace();
			}
			return con;
		}
	 
		public static void close(Connection con) {
			try {
				if (con != null && !con.isClosed()) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	 
		public static void close(Statement stmt) {
			try {
				if (stmt != null && !stmt.isClosed()) {
					stmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	 
		public static void close(ResultSet rset) {
			try {
				if (rset != null && !rset.isClosed()) {
					rset.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	 
		public static void commit(Connection con) {
			try {
				if (con != null && !con.isClosed()) {
					con.commit();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	 
		public static void rollback(Connection con) {
			try {
				if (con != null && !con.isClosed()) {
					con.rollback();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}