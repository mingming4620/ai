-- [X] VIEW, IN-LINE VIEW, ★TOP-N★ 
-- 1. VIEW : 가상의 테이블 (1) 단순뷰 (2) 복합뷰
-- (1) 단순뷰 : 하나의 테이블을 이용해서 만든 뷰 (가상의 테이블은 물리공간과 데이터가 따로 없음)
CREATE OR REPLACE VIEW EMPv0 -- EMP테이블에서 특정 필드만 VIEW로 생성
    AS SELECT EMPNO, ENAME, JOB, MGR, HIREDATE, DEPTNO 
        FROM EMP;
SELECT *
    FROM EMPv0;
SELECT *
    FROM TAB; -- 내 계정이 갖고 잇는 테이블들 리스트 (가상의 테이블 포함)
SELECT *
    FROM USER_TABLES; -- 내 계정이 갖고있는 테이블 (가상의 테이블 미포함)
SELECT *
    FROM USER_VIEWS; 
INSERT INTO EMPv0
    VALUES (1111, '홍', 'MANAGER', NULL, NULL, 40); -- 뷰에 INSERT
SELECT *
    FROM EMPv0;
SELECT *
    FROM EMP;
ROLLBACK;

CREATE OR REPLACE VIEW EMPv0 -- EMP테이블에서 특정 행(ROW)만 VIEW로 생성
    AS SELECT * 
            FROM EMP 
            WHERE DEPTNO =30;
SELECT *
    FROM EMPv0;
INSERT INTO EMPv0 
    VALUES ( 1111, '홍', 'MANAGER', NULL, NULL, 9000, NULL, 40); -- 인서트 가능
SELECT *
    FROM EMPv0; -- 1111번 사원 안 보임
SELECT *
    FROM EMP; -- 1111번 사원 보임

-- 단순뷰에서 INSERT가 불가한 경우 : 뷰 생성시 NOT NULL 필드를 미포함한 경우
CREATE OR REPLACE VIEW EMPv0
    AS SELECT ENAME, JOB
            FROM EMP;
SELECT *
    FROM EMPv0;
INSERT INTO EMPv0 
    VALUES ( '홍', ',MANAGER'); 
ROLLBACK;
DELETE FROM EMP WHERE EMPNO = 1111;

-- VIEW의 제한 조건
-- WITH CHECK OPTION 추가 : 뷰의 조건에 해당되는 데이터만 삽입, 수정, 삭제가 가능
-- WITH READ ONLY 추가 : 읽기 전용 뷰
CREATE OR REPLACE VIEW EMPv0
    AS SELECT *
            FROM EMP 
            WHERE DEPTNO = 30
            WITH CHECK OPTION;
SELECT *
    FROM EMPv0 E, DEPT D
    WHERE E.DEPTNO = D.DEPTNO;
INSERT INTO EMPv0 (EMPNO, ENAME, DEPTNO)
    VALUES (1111, '홍' , 30); -- 가능
INSERT INTO EMPv0 (EMPNO, ENAME, DEPTNO)
    VALUES (1111, '박' , 40); -- VIEW 제한조건으로 에러
SELECT *
    FROM EMP
    WHERE ENAME = 'SMITH';
DELETE FROM EMPv0
    WHERE  ENAME = 'SMITH'; --VIEW 제한조건에 맞지 않은 데이터는 DELETE 안 됨
SELECT *
    FROM EMP
    WHERE ENAME = '홍';
DELETE FROM EMPv0
    WHERE ENAME = '홍';
COMMIT;

-- 읽기 전용 단순뷰 ( WITH READ ONLY 추가)
CREATE OR REPLACE VIEW EMPv0
    AS SELECT *
            FROM EMP
            WHERE DEPTNO = 20 WITH READ ONLY;
INSERT INTO EMPv0 (EMPNO, ENAME, DEPTNO) VALUES (1111,'홍', 20); -- READ ONLY 에러

-- (2) 복합뷰 : 2개 이상의 테이블로 구성한 뷰, 가상의 필드를 이용한 뷰. DML문을 제한적으로만 이용(SELECT)
-- ① 2개 이상의 테이블로 구성한 복합뷰
CREATE OR REPLACE VIEW EMPv0
    AS SELECT EMPNO ,ENAME, JOB, DNAME 
            FROM EMP E, DEPT D
            WHERE E.DEPTNO = D.DEPTNO;
SELECT *
    FROM EMPv0;
INSERT INTO EMPv0
    VALUES ( 1111, ' 홍', ' MANAGER', 'SALES'); -- 에러
-- ② 가상의 필드를 이용한 복합뷰 (컬럼에 별칭을 사용)
CREATE OR REPLACE VIEW EMPv0
    AS SELECT EMPNO, ENAME, SAL*12 YEAR_SAL
            FROM EMP
            WHERE DEPTNO=10; -- 별칭을 필드에 사용
CREATE OR REPLACE VIEW EMPv0 (NO, NAME, YEAR_SAL) 
    AS SELECT EMPNO, ENAME, SAL*12
            FROM EMP
            WHERE DEPTNO=10; -- 별칭들만 따로 사용
SELECT *
    FROM EMPv0;
INSERT INTO EMPv0 VALUES (1111, 'LEE', 1200); -- 복합뷰는 INSERT 불가

    -- EX1. 사번, 이름, 급여 10의 자리에서 반올림 급여를 뷰로 생성(EMPv0)
    CREATE OR REPLACE VIEW EMPv0
        AS SELECT EMPNO, ENAME, ROUND(SAL, -2) SAL
                FROM EMP;
    INSERT INTO EMPv0 VALUES ( 1111, '홍' , 1300) ; -- 복합뷰는 INSERT 불가
    -- EX2. 중복이 제거된 JOB, DEPTNO를 뷰로 생성(EMPv01)
    CREATE OR REPLACE VIEW EMPv1
        AS SELECT DISTINCT JOB, DEPTNO
                FROM EMP;
    -- EX3. 부서번호, 최소급여, 최대급여, 부서평균(소수점 1자리에서 반올림)을 포함한 뷰로 생성(EMPv0)
    CREATE OR REPLACE VIEW EMPv0 (DEPTNO, MINSAL, MAXSAL, AVGSAL)
        AS SELECT DEPTNO, MIN(SAL) , MAX(SAL) , ROUND(AVG(SAL), 1) 
                FROM EMP
                GROUP BY DEPTNO;
    -- EX4. 부서명, 최소급여, 최대급여, 부서평균(소수점 1자리에서 반올림)을 포함한 뷰로 생성(EMPv0)
    CREATE OR REPLACE VIEW EMPv0 (DNAME, MINSAL, MAXSAL, AVGSAL)
        AS SELECT DNAME, MIN(SAL), MAX(SAL), ROUND(AVG(SAL), 1) 
                FROM EMP E, DEPT D 
                WHERE E.DEPTNO = D.DEPTNO
                GROUP BY DNAME;
    SELECT *
       FROM EMPv0;
       
-- (2) INLINE-VIEW : FROM절에 서브쿼리를 INLINE-VIEW라 하며, FROM절에 오는 서브쿼리는 VIEW 작용
    -- EX. 급여가 2000을 초과하는 사원의 평균 급여를 출력
    SELECT AVG(SAL)
        FROM EMP
        WHERE SAL >2000;
    SELECT AVG(SAL)
        FROM (SELECT SAL FROM EMP WHERE SAL > 2000) E; -- 실행하는 동안 잠깐 생겼다 사라지는 VIEW (INLINE-VIEW)
-- SELECT 필드1, 필드2,...
-- FROM (서브쿼리) 별칭, 테이블N, .... 
-- WHERE 조건
    -- EX. 부서평균의 월급보다 높은 월급을 받는 사원의 사번, 이름, 급여, 부서번호, 해당부서의 평균급여(반올림)
    SELECT EMPNO, ENAME, SAL, E.DEPTNO, ROUND(AVGSAL,1)
        FROM EMP E, (SELECT DEPTNO, AVG(SAL) AVGSAL
                                FROM EMP
                                GROUP BY DEPTNO) G
        WHERE E.DEPTNO = G.DEPTNO
            AND SAL > AVGSAL;
            
-- 3. TOP-N 구문(TOP 1~10등, 11~20등....)
    -- ROWNUM : 테이블로부터 가져온 순서
SELECT ROWNUM, ENAME, SAL
    FROM EMP
    WHERE DEPTNO = 20;
SELECT ROWNUM, ENAME, SAL
    FROM EMP;
SELECT ROWNUM, ENAME, SAL   -- 2
    FROM EMP    -- 1
    ORDER BY SAL;   -- 3
SELECT ROWNUM RANK, ENAME, SAL 
    FROM (SELECT *
                FROM EMP
                ORDER BY SAL DESC); -- 1등~ 꼴등

-- SAL을 기준으로 1~5등
-- SAL을 기준으로 6~10등
SELECT ROWNUM ,ENAME, SAL
    FROM (SELECT *
                FROM EMP
                ORDER BY SAL)
    WHERE ROWNUM <6;
SELECT ROWNUM ,ENAME, SAL
    FROM (SELECT *
                FROM EMP
                ORDER BY SAL)
    WHERE ROWNUM BETWEEN 6 AND 10;    
    
-- TOP-N
SELECT * 
    FROM EMP 
    ORDER BY SAL; -- 1단계
SELECT ROWNUM RN, A.* 
    FROM (SELECT * 
                FROM EMP 
                ORDER BY SAL) A; -- 2단계(RANK 포함)
SELECT *
    FROM (SELECT ROWNUM RN, A.* 
                FROM (SELECT *
                            FROM EMP 
                            ORDER BY SAL) A)
    WHERE RN BETWEEN 11 AND 14; -- 3단계 ( TOP- N 구문)
SELECT *
    FROM (SELECT ROWNUM RN, ENAME, SAL
                FROM (SELECT *
                            FROM EMP 
                            ORDER BY SAL))
    WHERE RN BETWEEN 6 AND 10; 
    
    -- EX. 이름 알파벳순으로 6번째~10번째 사원을 출력(순서, 이름, 사번, JOB, MGR, HIREDATE)
    SELECT *
        FROM (SELECT ROWNUM RN, ENAME, EMPNO, JOB, MGR, HIREDATE
                    FROM (SELECT *
                                FROM EMP
                                ORDER BY ENAME))
        WHERE RN BETWEEN 6 AND 10;
    -- EX. 입사순으로 11번째~ 15번째 사원의 모든 필드 출력( 순서는 출력 안 함 )
    SELECT EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO
        FROM (SELECT ROWNUM RN, A.*
                    FROM (SELECT *
                                 FROM EMP
                                 ORDER BY HIREDATE) A)
        WHERE RN BETWEEN 11 AND 15;
    

    --★ ★ <총 연습문제> ★ ★ ★
    -- 1. 부서명과 사원명을 출력하는 용도의 뷰, DNAME_ENAME_VU 를 작성하시오
    CREATE OR REPLACE VIEW DNAME_ENAME_VU
        AS SELECT DNAME, ENAME
                FROM EMP E, DEPT D
                WHERE E.DEPTNO = D.DEPTNO;
    SELECT *
        FROM DNAME_ENAME_VU;
    -- 2. 사원명과 직속상관명을 출력하는 용도의 뷰,  WORKER_MANAGER_VU를 작성하시오
    CREATE OR REPLACE VIEW WORKER_MANAGER_VU
        AS SELECT W.ENAME WORKER, M.ENAME MANAGER
                FROM EMP W, EMP M
                WHERE W.MGR = M.EMPNO;
    SELECT *
        FROM WORKER_MANAGER_VU;
    -- 3. 부서별 급여합계 등수를 출력하시오(부서번호, 급여합계, 등수). -- 학생 질문
    SELECT  DEPTNO, SUMSAL, RN
        FROM (SELECT ROWNUM RN ,A.*
                    FROM (SELECT DEPTNO, SUM(SAL) SUMSAL
                                FROM EMP
                                GROUP BY DEPTNO
                                ORDER BY SUM(SAL) DESC)A);            
    -- 3-1. 부서별 급여합계 등수가 2~3등인 부서번호, 급여합계, 등수를 출력하시오.
    SELECT DEPTNO, SUMSAL,  RN
        FROM (SELECT ROWNUM RN, A.*
                    FROM (SELECT DEPTNO, SUM(SAL) SUMSAL
                                FROM EMP
                                GROUP BY DEPTNO
                                ORDER BY SUM(SAL) DESC)A)
            WHERE RN BETWEEN 2 AND 3;
    -- 4. 사원테이블에서 사번, 사원명, 입사일을 입사일이 최신에서 오래된 사원 순으로 정렬하시오
    SELECT EMPNO, ENAME, HIREDATE
        FROM EMP
        ORDER BY HIREDATE DESC;
    -- 5. 사원테이블에서 사번, 사원명, 입사일을 입사일이 최신에서 오래된 사원 5명을 출력하시오
    SELECT EMPNO, ENAME, HIREDATE 
        FROM (SELECT ROWNUM RN, A.*
                     FROM (SELECT EMPNO, ENAME, HIREDATE
                                FROM EMP
                                ORDER BY HIREDATE DESC)A)
        WHERE RN BETWEEN 1 AND 5;
    -- 6. 사원 테이블에서 사번, 사원명, 입사일을 최신부터 오래된 순으로 6번째로 늦은 사원부터 10번째 사원까지 출력
    SELECT EMPNO, ENAME, HIREDATE
        FROM ( SELECT ROWNUM RN, A.*
                      FROM(SELECT EMPNO, ENAME, HIREDATE
                                FROM EMP
                                ORDER BY HIREDATE DESC)A)
        WHERE RN BETWEEN 6 AND 10;

