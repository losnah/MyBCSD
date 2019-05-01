# **git**

git은 소스코드의 효율적인 관리를 위한 관리 도구 중 하나입니다.

![](http://cfile3.uf.tistory.com/image/999F153A5C3D7D2E07949C)

git은 분산형 관리 시스템으로, 소스코드를 여러 개발 PC와 저장소에 분산해서 저장하기 때문에 중앙 서버에 장애가 발생해도 로컬 저장소에 커밋을 할 수 있으며, 로컬 저장소들을 이용하여 중앙 저장소의 복원도 가능합니다. 분산형으로 코드를 관리하기 때문에 다양한 Workflow를 사용하는 것이 가능합니다.

---

### git의 장점

-   소스코드를 주고 받을 필요 없이, 같은 파일을 여러 명이 동시에 작업하는 개발이 가능합니다. (즉 브랜치를 통해 개발한 뒤, 본 프로그램에 Merge하여 개발을 진행할 수 있다)
    
-   분산 버전관리이기 때문에 인터넷이 연결되지 않은 곳에서도 개발을 진행할 수 있으며, 중앙 저장소가 날라가버려도 다시 원상복구할 수 있습니다.
    
-   팀 프로젝트가 아닌, 개인 프로젝트일지라도 GIT을 통해 버전 관리를 하면 체계적인 개발이 가능해지고 프로그램이나 패치를 배포하는 과정도 간단해집니다. (pull을 통한 업데이트, patch 파일 배포)
    

![](http://cfile9.uf.tistory.com/image/994FCA485C3D06A519C1BB)

여기서 git과 github는 다르다는 것을 알아야합니다.

git은 개발자 컴퓨터 즉 로컬컴퓨터에 파일을 버전별로 저장해두었다가, 원격저장소(github)에 push하는 방식으로 연결해서 사용합니다. 즉 github는 원격저장소일 뿐, git이 아닙니다. github는 구글드라이브, 네이버클라우드와 같은 역할을 한다고 보셔도 됩니다.

![](http://cfile21.uf.tistory.com/image/999585345C3D07111B5900)

그리고 git을 사용하려면 git command를 사용해야해서 어려우므로, sourceTree와 같은 gui 보조 프로그램을 많이 사용합니다.

---

# **gitflow!**

![](http://cfile3.uf.tistory.com/image/99BCBC505C3D07951A99C9)

위의 가지가 보이시나요? 이는 두 개의 브런치를 사용한 것인데요. 이와같은 브런치를 5개 사용하는 전략이 바로 gitflow입니다.

![](http://cfile24.uf.tistory.com/image/99599B3E5C3D083E1AACEB)

gitflow 모델은 5개의 branch를 가지고 이것은 다시 2개의 핵심 branch와 나머지 3개의 branch로 나뉘어 사용됩니다.

◎ 핵심 branch

```
≫ master

  - 모든 테스트 등이 끝나고 상용화가 가능한 버전이 커밋되는 branch

≫ develop

  - 실제 개발 내용들이 커밋되는 branch
```

◎ 나머지 branch

```
≫ feature

  - 특정 기능을 개발하는 branch

≫ release

  - 계획했었던 작업 내용들이 어느 정도 완성되었을 때 만들어서 다듬은 후 완전히

    완성되었을 때 master로 merge하는 예비 master라고 할 수 있는 branch

≫ hotfixes

  - 갑자기 오류가 나서 디버그해야하는 경우와 같이 긴급하게 코드를 수정해야

    하는 경우의 사용하는 branch
```

간단하게

```
- master : 배포용 branch / 배포 버전별로 커밋이 된다.

- develop : 개발용 branch / 큰 뼈대의 작업들이 진행된다.

- feature : 기능구현용 branch / 특정한 기능들의 구현이 진행된다.

- release : 배포준비용 branch / 거의 완성된 작업의 마무리 수정작업이 이루어진다.

- hotfix : 긴급오류수정용 branch / 긴급한 오류의 수정이 이루어진다.

- tag : master의 커밋마다 배포 버전별 태그를 달아 구분을 명확히 한다.
```

라고 생각하시면됩니다.

진행순서는 다음과 같습니다.

1.  프로젝트 시작(master 생성)
2.  개발 시작(develop 생성)
3.  큰 뼈대 작업 진행(develop에서 작업)
4.  특정 기능 필요시 feature 생성하고 작업
5.  기능 구현 완료되면 develop으로 merge
6.  배포 버전의 작업이 완료되면 release 생성
7.  release에서 오류 수정 작업 진행
8.  작업 완전히 끝났으면 release를 master와 develop으로 merge
9.  tag로 master의 버전 확인

여기까지 git과 gitflow에 대한 정보를 마크다운으로 작성해보았습니다.

---

추가

## github pull request (PR)란

master 같은 메인 브랜치에 merge 하기 전에 이루어져야 하는 과정으로 권한을 가진 사람이 코드를 리뷰하고 커밋을 허락하는 단계를 거치는 프로세스를 말합니다.
기존에 코드리뷰를 하느라 걸리는 많은 시간을 단축하기위해 생겨났으며 GitHub의 원격 저장소를 각자의 계정으로 Fork해 간 뒤에 작업용 브랜치를 하나 만들어서 작업하고,
이를 Fork한 저장소에 푸시해서 풀 리퀘스트로 원격 저장소에 보내는 방식으로 사용합니다.