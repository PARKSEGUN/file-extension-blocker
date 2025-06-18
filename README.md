# file-extension-blocker

파일 확장자 블로킹 기능을 제공하는 경량 REST API 서버  
MySQL과 연동하여 허용되지 않은 확장자의 파일 업로드를 차단합니다.

## 기능

- 허용된 확장자 리스트 관리 (CRUD)
- 업로드 요청 시 확장자 검증
- MySQL 데이터베이스 연동

## 기술 스택

- 언어/프레임워크: Java/Spring Boot
- 데이터베이스: MySQL
- 도커: Docker & Docker Compose

```bash
   docker-compose up -d
   ```
