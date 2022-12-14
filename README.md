1. 수정, 삭제 API의 request를 어떤 방식으로 사용하셨나요? (param, query, body)
req.param
- 주소에 포함된 변수를 담음 
   ex) naver.com/post/12345가 있다면 12345를 담음
- 서버에서 Path Variable로 칭함

req.query
- 주소 바깥, ? 이후의 변수를 담음
  ex) naver.com/post?post_id=12345일 경우 Node.js를 담음
- &로 연결하여 여러개의 데이터를 넘길수있음
  ex) naver.com/post?post_id=1234&key=value
- 서버에서 Query parameter로 칭함

req.body
- XML,JSON,Multi Form 등의 데이터를 담음
- 주소에서 확인할 수 없음
- 크롬 개발자 도구, Fiddler와 같은 툴로 요청 내용을 확인할 수 있음
- 민감한 데이터의 경우 반드시 암호화해 전송해야 함


query string(query/parameter) vs body
body를 사용할 때
- 인수에 플랫 키-값 구조가 없는 경우
- 직렬화 된 이진 데이터과 같이 사람이 읽을 수 는 경우
- 매우 많은 수의 인구가 있을떄 body에는 제한이 없음

query string을 사용할 때
- 인수가 디버깅하는 동안보고 싶을 떄
- 코드를 개발하는 동안 수동으로 호출 할 수 있기를 원할 때
- 여러 웹 서비스에서 인수가 공통적이 경우

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------

2. 수정, 삭제 API의 request를 어떤 방식으로 사용하셨나요? (param, query, body)
- GET / 전체 게시글 조회 , 게시글 조회 , 게시글 비밀번호 확인     
- POST / 게시글 작성
- PUT / 게시글 수정
- DELETE / 게시글 삭제

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------

3. RESTful한 API를 설계했나요? 어떤 부분이 그런가요? 어떤 부분이 그렇지 않나요?
- 자원을 식별
- GET / 전체 게시글 조회 api/test , 게시글 조회 api/test/{id} , 게시글 비밀번호 확인 api/testPassword/{id}/{password}
- POST / 게시글 작성 api/test
- PUT / 게시글 수정 api/test/{id}
- DELETE / 게시글 삭제 api/test/{id}

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------

4. 적절한 관심사 분리를 적용하였나요? (Controller, Repository, Service)
- Controller - URL 매핑 , Repository - DB 작업 , Service - 로직

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------

5. 작성한 코드에서 빈(Bean)을 모두 찾아보세요!
- @Service @Controller @Repository

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------

6. API 명세서 작성 가이드라인을 검색하여 직접 작성한 명세서와 비교해보세요!

