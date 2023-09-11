package kr.kh.spring.vo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class BoardVO {
	private int bo_num, bo_ori_num, bo_views, bo_up, bo_down, bo_bt_num, bo_comment;
	private String bo_title, bo_me_id, bo_contents;
	private Date bo_reg_date, bo_up_date;
	
	private List<FileVO> fileVoList;
	
	=ap3
	package com.kh.test.model;
	 
	public class Test {
		private int    seq 	   = 0;
		private String writer  = null;
		private String title   = null;
		private String content = null;
		private String regdate = null;
		
		public Test() {
		}
		
		public Test(int seq, String writer, String title, String content, String regdate) {
			this.seq = seq;
			this.writer = writer;
			this.title = title;
			this.content = content;
			this.regdate = regdate;
		}
		
		public int getSeq() {
			return seq;
		}
		
		public void setSeq(int seq) {
			this.seq = seq;
		}
		
		public String getWriter() {
			return writer;
		}
		
		public void setWriter(String writer) {
			this.writer = writer;
		}
		
		public String getTitle() {
			return title;
		}
		
		public void setTitle(String title) {
			this.title = title;
		}
		
		public String getContent() {
			return content;
		}
		
		public void setContent(String content) {
			this.content = content;
		}
		
		public String getRegdate() {
			return regdate;
		}
		
		public void setRegdate(String regdate) {
			this.regdate = regdate;
		}
	}

	public String getBo_up_date_str() {
		if(bo_up_date == null) {
			return "";
		}
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		return format.format(bo_up_date);
	}
	public String getBo_reg_date_str() {
		if(bo_reg_date == null) {
			return "";
		}
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		return format.format(bo_reg_date);
	}
}