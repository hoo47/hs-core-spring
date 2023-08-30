package com.hscoreserver.hscorespring.question;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/questions")
@RequiredArgsConstructor
public class QuestionController {

  private final QuestionService questionService;

  @GetMapping
  public List<Question> list(@RequestParam Long questionSetId) {
    return questionService.getQuestions(questionSetId);
  }
}
