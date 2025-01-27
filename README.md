# <img width="218" alt="image" src="https://user-images.githubusercontent.com/97227920/233664150-1a6a6e7b-b9a5-4502-9990-ece8c6963d67.png">

사회 구성원 모두가 아동에 대해 CCTV가 될 수 있도록 도와주는 웹 서비스입니다.
<br>
[**ChildCTV**](https://child-ctv.com)
<br>
<br>

# 프로젝트 소개
<br>
  오늘 날에는 도심 곳곳에 CCTV가 설치가 되고, 수 많은 사회 안전망이 작동 중입니다. 그 덕분에 한국의 아동 실종률은 해마다 감소하고 있습니다.
이는 보이지 않는 곳에서 열심히 노력해주시는 여러 사람의 결과로 매우 감사하게 생각합니다. 
그러나, 그러한 노력에도 불구하고 장기 실종자의 비율은 증가하는 추세입니다. 
이는 실종 아동을 찾는 골든 타임을 넘기면, 실종 아동이 가족의 품으로 돌아갈 확률이 급격히 감소한다는 뜻입니다.
<br>
<br>

  저희 팀 FirstCalss(팀장 : 박정인, 팀원 : 신태섭, 이창훈, 장대준, 권소현, 안수민)는 이런 문제를 해결하기 위해 
실종 아동에 대한 공익 제보를 받고, 실종 아동을 초기에 발견하는 것을 목표로 삼았습니다. 
이를 통해 실종 아동의 가족이 겪을 고통을 최소화하는 것이 이 프로젝트의 핵심 가치입니다.
<br>
<br>

# 제공 서비스
  저희는 다음과 같은 핵심 서비스를 통해 실종 아동을 최대한 빨리 발견하고, 가족의 품으로 돌아갈 수 있도록 노력하고 있습니다.
  
  
  
1. 다양한 사람이 실종 정보를 확인할 수 있도록 합니다. 실종자 정보를 누구나, 어디서든 볼 수 있도록 모바일 웹 형태를 제공합니다.
2. 누구나 공익제보를 할 수 있습니다. 실종 아동을 찾기 위해 가장 중요한 것은 시민분들의 공익 제보입니다. 시민들의 작은 관심을 모아 빠르게 실종 아동을 발견하고자 합니다.
3. 아동을 보호하고 있는 사람을 위해 보호 신고와 보호 중인 아동을 받아줄 수 있는 안전 정보를 제공합니다. 이를 통해 실종 아동을 발견한 시민이 실종 아동을 안전하게 보호할 수 있습니다.
4. 실종 아동의 가족은 실종 아동 등록을 통해 공익 제보와 보호 신고에 대한 알림을 받을 수 있습니다.

# 프로젝트 기술
![스크린샷 2023-04-22 오전 12 04 25](https://user-images.githubusercontent.com/97227920/233669939-4fbc6eed-2c68-41e2-a728-659bc8795cee.png)


# 서비스 상세 기능 소개

## 게시판 기능

### API 명세서
|Page|Method|URL|Description|
|----|----|----|----------|
|ReportBoard|Get|/reportBoard/get|실종 게시판 상세 글 조회|
|ReportBoard|Post|/reportBoard/register|실종 게시판 글 작성|
|ReportBoard|Post|/reportBoard/update|실종 게시판 글 수정|
|ReportBoard|Post|/reportBoard/delete|실종 게시판 글 삭제|

<br>

|Page|Method|URL|Description|
|----|----|----|----------|
|ProtectBoard|Get|/protectBoard/list|보호 글 전체 리스트 조회|
|ProtectBoard|Get|/protectBoard/get|보호 게시판 상세 글 조회|
|ProtectBoard|Post|/protectBoard/register|보호 게시판 글 작성|
|ProtectBoard|Post|/protectBoard/update|보호 게시판 글 수정|
|ProtectBoard|Post|/protectBoard/delete|보호 게시판 글 삭제|


### 실종 아동 매칭 로직

<img src="./Matching.png" />

<img src="./MatchingLogic.png" />
