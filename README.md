# Aassignment

## 주제
- To-do List 웹서비스 제작

### 기술스택
- Front : Bootstrap
- Back  : Spring Boot
- ORM : Spring Data JPA
- Build : Gradle
- DB : Mysql

### Features
- 할일 CRUD
- 다른 할일 참조
- 할일 완료
- 페이징

### API Endpoint

  | URI            | Method         | 설명                           |
  | :------------- | :------------- | :-------------                 |
  | /Todo/{bid}    | GET            | bid에 해당하는 할일을 가져온다.  |
  | /Todo          | POST           | 할일을 등록한다.                |
  | /Todo/{bid}    | PUT            | bid에 해당하는 할일을 수정한다.  |
  | /Todo/{bid}    | DELETE         | bid에 해당하는 할일을 삭제한다.  |
