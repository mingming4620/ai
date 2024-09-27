-- [XI] 인덱스 : 조회를 빠르게 하는 인덱스
DROP TABLE EMP01;
CREATE TABLE EMP01
    AS SELECT *
            FROM EMP; -- EMP테이블과 내용이 같은 EMP01
SELECT *   
    FROM EMP01; -- 14행
INSERT INTO EMP01
    SELECT *
        FROM EMP01; -- 데이터 뻥튀기 1번 실행( 28번) 2번 실행 (56행)
SELECT TO_CHAR(COUNT(*), '9,999,999')
    FROM EMP01;
INSERT INTO EMP01
    SELECT *
        FROM EMP01; -- 11번 실행 (11만개)
SELECT TO_CHAR(COUNT(*), '9,999,999')
    FROM EMP01; -- 11만개 
INSERT INTO EMP01 (EMPNO, ENAME, DEPTNO)
    VALUES ('1111', '홍길동',40);
INSERT INTO EMP01
    SELECT *
        FROM EMP01; -- 1번 (22만) , 2번 (44만), 3번 ( 90만)
SELECT TO_CHAR(COUNT(*), '9,999,999')
    FROM EMP01;
-- INDEX 없이 조회
SELECT *
    FROM EMP01
    WHERE ENAME = '홍길동'; -- 인덱스 없이 조회 (0.027초)
-- INDEX 생성 (검색할 필드로 만들기)
CREATE INDEX IDX_EMP01_ENAME -- CREATE INDEX 인덱스명
    ON EMP01(ENAME); -- 1.262초
SELECT *
    FROM EMP01
    WHERE ENAME = '홍길동'; -- 인덱스 생성후 조회 (0.013초)
COMMIT;
INSERT INTO EMP01
    SELECT *
        FROM EMP01; -- 인덱스 생성 후 91만 -> 182만개 (36.662초)
SELECT TO_CHAR(COUNT(*), '9,999,999')
    FROM EMP01; -- 183,만개
ROLLBACK; -- 15.628초
DROP INDEX IDX_EMP01_ENAME; -- 인덱스 삭제
INSERT INTO EMP01
    SELECT *
        FROM EMP01; -- 인덱스 삭제 후 91만 ->  182만개 (4.42초)
ROLLBACK; -- 0.187초
DROP TABLE EMP01; -- 테이블을 지우면 해당 테이블의 인덱스는 자동 삭제





