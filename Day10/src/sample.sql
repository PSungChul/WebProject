CREATE DATABASE Hotel; // 데이터베이스 생성
show databases; // 데이터베이스 확인
USE 데이터베이스명 // 데이터베이스 사용
USE Hotel;
CREATE TABLE 테이블명 // 테이블 생성
(
	필드이름 필드타입,
	필드이름 필드타입,
	...
);
CREATE TABLE Test
(
    ID INT,
    Name VARCHAR(30),
    ReserveDate DATE,
    RoomNum INT
);
SELECT * FROM 테이블명; // 테이블 내부 데이터 조회
SELECT * FROM Test;
DESC 테이블명; // 테이블에 대한 정보 조회
DESC Test;
--------------------------------------------------------
INSERT INTO 테이블이름(필드이름1, 필드이름2, 필드이름3, ...) // 테이블의 부분적인 필드에만 값을 넣어줄 경우
VALUES (데이터값1, 데이터값2, 데이터값3, ...);
INSERT INTO 테이블이름 // 테이블의 필드 전체에 값을 넣어줄 경우 필드이름 생략 가능
VALUES (데이터값1, 데이터값2, 데이터값3, ...); // 데이터값 순서는 필드 생성 순서대로 넣어준다.
INSERT INTO Test
VALUES (1, 'tester1', '2022-10-06', 101);

SELECT 조회하고싶은 열 이름1, 2, 3, ... FROM 테이블명;
SQL의 작성은 언제나 "열"이고 반환값은 언제나 "행"이다.
// 예제 1
DELETE FROM Test; // 위에서 작성한 데이터값들을 테이블 전체 초기화
INSERT INTO Test
VALUES (1, '홍길동', '2016-01-05', 2014);
INSERT INTO Test
VALUES (2, '임꺽정', '2016-02-12', 918);
INSERT INTO Test
VALUES (3, '장길산', '2016-01-16', 1208);
INSERT INTO Test
VALUES (4, '홍길동', '2016-03-17', 504);
INSERT INTO Test
VALUES (5, '이순신', '2016-02-16', 1108);
// 논외 INSERT INTO 한번에 넣어줄 경우 예제 2 잘 사용은 안함
INSERT INTO Test
VALUES (6, '홍길동', '2016-04-04', 2022),
	   (7, '임꺽정', '2016-05-05', 999);

SELECT 열이름1, 열이름2, …
FROM 테이블명 --> 전체 행
WHERE 열이름1="값", 열이름2="값"; --> 조건 // 조건에 만족하는 행
// 해당 테이블에서 행을 조회할 수 있는 값/병위

// 예제3
CREATE TABLE Room
(
	RoomNum INT,
	People INT,
	Season VARCHAR(30)
);

INSERT INTO Room
VALUES (101, 2, 'spring');
INSERT INTO Room
VALUES (102, 2, 'spring');
INSERT INTO Room
VALUES (201, 4, 'summer');
INSERT INTO Room
VALUES (202, 4, 'fall');
INSERT INTO Room
VALUES (301, 8, 'winter');

SELECT Season
FROM ROOM
WHERE RoomNum=102;

SELECT RoomNum
FROM ROOM
WHERE Season='fall';

SELECT People
FROM ROOM
WHERE Season='winter';

SELECT RoomNum, People
FROM ROOM
WHERE Season='spring';

DELETE FROM Room
WHERE Season='fall';

INSERT INTO Room
VALUES (302, 8, 'fall');

