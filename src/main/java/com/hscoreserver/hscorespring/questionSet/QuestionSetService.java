package com.hscoreserver.hscorespring.questionSet;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class QuestionSetService {

  private final QuestionSetRepository questionSetRepository;

  public QuestionSet getQuestionSet(String questionSetName) {
    return questionSetRepository.findByName(QuestionSetName.valueOf(questionSetName));
  }
}