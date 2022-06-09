// 그래프 구현 3가지 방법

// 1. 에지 리스트
// 배열에 출발 노드, 도착 노드를 저장하여 에지 표현
// or 출발 노드, 도착 노드, 가중치를 저장하여 가중치가 있는 에지 표현
// 밸만 포드나 크루스칼 알고리즘에 사용
// 노드 중심에는 잘 사용하지 않음

// 1-1 가중치 없는 노드 표현하기
// 출발 노드와 도착 노드만 표현하므로 배열의 행은 2개면 충분
// 여러 자료형을 사용할 수 있다.

// 1-2 가중치 있는 노드 표현하기
// 행을 3개로 늘려 3번째 행에 가중치를 저장

// 2. 인접 행렬
// 2차원 배열을 자료구조로 이용하여 그래프 표현
// 에지 리스트와 다르게 노드 중심으로 표현
// 그래프 구현이 쉽고, 배열에 직접 접근하면 바로 확인할 수 있음
// 노드 개수에 비해 에지가 적을때는 공간효율성 떨어짐
// 노드 개수가 많은 경우 아예 2차원 배열 선언 자체를 할 수 없음
// 노드 개수에 따라 사용 여부를 적절하게 판단하는 능력 필요
// 노드가 3만개가 넘으면 자바 힙 스페이스 에러가 발생

// 2-1 가중치 없는 그래프 표현
// 2-2 가중치 있는 그래프 표현

// 3. 인접 리스트 (중요)
// ArrayList로 그래프 표현
// 노드 개수만큼 리스트 선언
// 다른 방법에 비해 구현이 복잡
// 탐색시간 매우 뛰어남
// 메모리 초과 에러 발생하지 않음
// 코테에서 선호되는 방식

// 3-1 가중치 없는 그래프 표현
// N번 노드와 연결되어 있는 노드를
// 배열의 위치 N에 연결된 노드 개수만큼 배열을 연결하는 방식으로 표현

// 3-2 가중치 있는 그래프 표현 (중요)
// 자료형을 클래스로 사용
