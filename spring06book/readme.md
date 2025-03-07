# 실전 예제
도서 정보 시스템 구현하기

## 프로젝트
spring06book

## 요구사항	
- SpringDoc 적용시켜 시각화할 것
- 패키지를 파일 유형별로 구분할 것
- 다음 도서 정보를 데이터베이스(H2)와 연동할 것
  - Entity의 이름은 Book으로 설정할 것
  - JPA repository는 BookRepository로 구현할 것
- CRUD 기능을 Mapping의 종류에 맞게 구현할 것
	- 컨트롤러의 이름은 BookController로 구현할 것
	- 컨트롤러의 공용주소는 /book으로 구현할 것

## 테이블 항목
| 항목명 | 이름 | 형태 | 설명 |
| --- | --- | --- | --- |
| 도서코드 | bookId | Long | 도서 번호, 대표 항목 |
| 도서제목 | bookTitle | String | 도서의 제목, 최대 한글 100글자이며 필수 항목 |
| 출판사 | bookPublisher | String | 출판사의 이름, 최대 한글 30글자이며 선택 항목 |
| 저자 | bookAuthor | String | 도서의 지은이 이름, 최대 한글 30글자이며 선택 항목 |
| 판매가 | bookPrice | Integer | 판매가격, 필수 항목 |
| 장르 | bookGenre | String | 도서의 장르, 최대 한글 4글자이며 필수 항목 |

