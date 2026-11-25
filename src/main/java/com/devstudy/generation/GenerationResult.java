package com.devstudy.generation;

import com.devstudy.quiz.Quiz;

public record GenerationResult(
    StudyContent developmentStudy,
    StudyContent userStudy,
    DevelopmentTerm developmentTerm
) {
    public record StudyContent(
        String topic,
        String conceptKey,
        String description,
        Quiz quiz
    ) {}

    public record DevelopmentTerm(
        String term,
        String conceptKey,
        String description
    ) {}
}
