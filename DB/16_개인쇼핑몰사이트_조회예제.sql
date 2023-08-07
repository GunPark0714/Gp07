-- qwe123회원이 구매(환불, 반품을 제외)한 제품명과 옵션명 목록을 확인하는 쿼리
Select 
	OR_ME_ID AS 주문아이디,
    PR_NAME AS 제품명,
    OP_NAME AS 옵션명,
    PR_PRICE AS 제품가격,
    OL_AMOUNT AS 구매 수량,
FROM `ORDER`
	JOIN ORDER_LIST ON OL_OR_NUM = OR_NUM
    JOIN `OPTION` ON OL_OP_NUM = OP_NUM 
    JOIN PRODUCT ON OP_PR_CODE = PR_CODE
WHERE OR_STATE NOT IN('환불', '반품') and OR_ME_ID = 'qwe123';

-- abc123 회원이 장바구니에 담은 제품명과 옵션명, 수량을 확인하는 쿼리를 작성해보세요.
Select BA_ME_ID AS 회원아이디,
	   PR_NAME AS 제품명,
       OP_NAME AS 옵션명,
       BA_OP_AMOUNT AS 수량
 FROM 
	Basket 
	JOIN `OPTION` ON BA_OP_NUM = OP_NUM
    JOIN PRODUCT ON OP_PR_CODE = PR_CODE
    WHERE BA_ME_ID = 'abc123';

-- abc123회원이 등록한 배송지 정보를 조회하는 쿼리
Select ad_addr FROM address WHERE AD_ME_ID = 'abc123';
	
-- 등록된 모든 제품을 검색하는 쿼리
select * FROM product;

-- KH가 제품명에 포함된 제품들을 검색하는 쿼리
select * FROM product WHERE PR_NAME LiKE CONCAT('%','KH', '%');

-- KH가 제품명에 포함된 제품들 중에서 1페이지에 해당하는 제품들을 검색하는 쿼리(한 페이지에는 제품이 최대 5개)
select * FROM product WHERE PR_NAME LiKE CONCAT('%','KH', '%') LIMIT 0,5;
select * FROM product WHERE PR_NAME LiKE CONCAT('%','KH', '%') LIMIT 5,5;
-- abc123회원이 제품을 받고 구매 확정을 눌렀을 때의 쿼리
-- 주문에 구매확정으로 수정 

-- <포인트>내역에 적립 내용을 추가
-- 회원 정보에 포인트를 누적
UPDATE MEMBER SET ME_POINT = ME_POINT + 3000 WHERE NE_ID = 'abc123';

-- abc123회원이 구매 학정한 ABC001제품 중 무선인 제품에 '좋은 마우스입니다'. 라고 리뷰를 등록했을 때 쿼리
INSERT INTO REVIEW(RE_CONTENT, RE_THUMB, RE_OP_NUM, RE_ME_ID)
VALUES('좋은 마우스입니다.', NULL, 1, 'abc123');
-- abc123회원이 작성한 모든 리뷰를 조회하는 쿼리
Select * FROM review WHERE RE_ME_ID = 'abc123';

-- abc123 회원이 작성한 리뷰가 있는 제품명을 조회
Select PR_NAME AS 리뷰제품 FROM review 
	JOIN `OPTION` ON RE_OP_NUM = OP_NUM
    JOIN PRODUCT ON PR_CODE = OP_PR_CODE
    WHERE RE_ME_ID = 'abc123';
-- 제품 코드가 ABC001이고, 옵션명이 무선인 제품에 달린 리뷰를 조회
Select * FROM review
	JOIN `OPTION` ON RE_OP_NUM = OP_NUM
    WHERE op_pr_code = 'ABC001' and op_name = '무선';

-- 제품명이 KH무선마우스인 제품의 리뷰 개수를 조회하는 쿼리
Select COUNT(*) AS 'KH무선마우스 리뷰수' FROM review 
	JOIN `OPTION` ON RE_OP_NUM = OP_NUM
    JOIN PRODUCT ON PR_CODE = OP_PR_CODE
    WHERE pr_name = 'KH무선마우스'; 
    
-- 제품별 리뷰 개수를 조회하는 쿼리 (리뷰가 등록된 제품만 조회 가능)
Select Count(*) AS 리뷰수,
	   OP_PR_CODE AS 제품코드
 FROM review 
		JOIN 
	`OPTION` ON RE_OP_NUM = OP_NUM
GROUP BY OP_PR_CODE;    
    
-- 제품별 옵션의 개수를 조회하는 쿼리
Select Count(*) AS 옵션수, pr_name AS 제품명
FROM PRODUCT
		RIGHT JOIN 
        `OPTION` ON op_pr_code = pr_code
GROUP BY pr_name;  

-- 제품별 판매량(반품, 환불을 제외한)을 조회하는 쿼리(제품명, 판매량)
SELECT 
PR_NAME AS 제품명,
SUM(OL_AMOUNT) AS 판매량
FROM PRODUCT 
		JOIN 
`OPTION` ON OP_PR_CODE = PR_CODE
	LEFT JOIN
ORDER_LIST ON OL_OP_NUM = OP_NUM
	LEFT JOIN
`ORDER` ON OR_NUM = OL_OR_NUM
WHERE
	OR_STATE IS NULL OR OR_STATE NOT IN ('반품', '환불')
GROUP BY PR_CODE;

-- 제품별 판매량(반품, 환불을 제외한)을 조회하는 쿼리(제품명, 옵션명, 판매량)
SELECT
PR_NAME AS 제품명,
op_name AS 옵션명,
SUM(OL_AMOUNT) AS 판매량
FROM PRODUCT 
		JOIN 
`OPTION` ON OP_PR_CODE = PR_CODE
	LEFT JOIN
ORDER_LIST ON OL_OP_NUM = OP_NUM
	LEFT JOIN
`ORDER` ON OR_NUM = OL_OR_NUM
WHERE
	OR_STATE IS NULL OR OR_STATE NOT IN ('반품', '환불')
GROUP BY PR_CODE;