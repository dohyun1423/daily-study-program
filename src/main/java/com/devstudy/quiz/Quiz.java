package com.devstudy.quiz;

import java.util.List;

// json에서 record 객체로 파싱한 내용

public record Quiz(
    String question, // 질문 내용
    List<QuizOption> options, // 퀴즈 옵션 id, 선지, 해설
    Integer correctOptionId // 정답
) {}
