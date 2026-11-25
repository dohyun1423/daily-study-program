package com.devstudy.generation;
// api 출력값 검증 로직

import com.devstudy.quiz.Quiz;

public class generationValidator {
    
    public void validateQuiz(Quiz quiz){
        // 검증 조건 1 

        
    }

}


/* json 검증항목
| 검증 항목 | 통과 조건 |

1. | 필수 항목과 타입    | 세 묶음이 모두 있고, 필수 문자열은 `null`이나 공백만 있는 값이 아님. 선지 ID와 정답 ID는 정수 |
2. | 선지 개수와 ID     | 각 퀴즈에 선지가 정확히 4개 있고, ID `1`, `2`, `3`, `4`가 한 번씩 등장 |
3. | 정답 참조          | `correctOptionId`가 **같은 퀴즈의** `options` 안에 존재 |
4. | 선지 내용 중복      | 각 퀴즈에서 앞뒤 공백을 제거한 선지 문구가 서로 다름 |
5. | 개념키 형식        | 예시처럼 소문자와 점, 하이픈을 쓰는 일정한 형식을 정하고 적용 |
6. | 요청 주제 일치     | 미리 선정한 개념키가 있다면 API가 돌려준 키와 일치 |
*/

// 예시 json
// {
//   "developmentStudy": {
//     "topic": "HTTP 요청의 멱등성",
//     "conceptKey": "http.idempotency",
//     "description": "동일한 요청을 여러 번 보내도 서버에 의도한 효과가 한 번 보냈을 때와 같으면 멱등하다고 합니다.",
//     "quiz": {
//       "question": "다음 중 멱등하게 동작하는 요청은 무엇인가요?",
//       "options": [
//         {
//           "id": 1,
//           "text": "요청할 때마다 포인트를 100점 추가한다.",
//           "explanation": "두 번 요청하면 총 200점이 추가되므로 한 번 요청했을 때와 효과가 다릅니다."
//         },
//         {
//           "id": 2,
//           "text": "사용자의 알림 설정을 꺼짐으로 변경한다.",
//           "explanation": "같은 요청을 반복해도 알림 설정은 꺼짐 상태로 유지됩니다."
//         },
//         {
//           "id": 3,
//           "text": "요청할 때마다 장바구니 상품 수량을 1개 늘린다.",
//           "explanation": "요청 횟수에 따라 최종 수량이 달라집니다."
//         },
//         {
//           "id": 4,
//           "text": "요청할 때마다 새 주문을 생성한다.",
//           "explanation": "요청을 반복하면 그만큼 주문이 더 생성됩니다."
//         }
//       ],
//       "correctOptionId": 2
//     }
//   },
//   "userStudy": {
//     "topic": "다단계 인증",
//     "conceptKey": "security.multi-factor-authentication",
//     "description": "다단계 인증은 비밀번호와 인증 앱처럼 서로 다른 유형의 인증 요소를 조합해 본인을 확인하는 방식입니다.",
//     "quiz": {
//       "question": "다음 중 서로 다른 유형의 인증 요소를 조합한 것은 무엇인가요?",
//       "options": [
//         {
//           "id": 1,
//           "text": "비밀번호와 보안 질문의 답",
//           "explanation": "둘 다 사용자가 알고 있는 정보에 해당합니다."
//         },
//         {
//           "id": 2,
//           "text": "서로 다른 두 개의 비밀번호",
//           "explanation": "비밀번호가 두 개여도 둘 다 지식 기반 요소입니다."
//         },
//         {
//           "id": 3,
//           "text": "비밀번호와 등록된 기기의 인증 앱 코드",
//           "explanation": "알고 있는 정보와 소유한 기기를 함께 확인합니다."
//         },
//         {
//           "id": 4,
//           "text": "지문과 얼굴 인식",
//           "explanation": "둘 다 사용자의 생체 특성을 확인하는 요소입니다."
//         }
//       ],
//       "correctOptionId": 3
//     }
//   },
//   "developmentTerm": {
//     "term": "커넥션 풀",
//     "conceptKey": "db.connection-pool",
//     "description": "DB 연결을 미리 만들어 두고, 요청이 필요할 때 빌려 쓰고 반환하는 방식입니다."
//   }
// }