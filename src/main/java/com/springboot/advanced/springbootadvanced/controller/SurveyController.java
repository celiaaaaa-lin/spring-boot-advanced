package com.springboot.advanced.springbootadvanced.controller;

import com.springboot.advanced.springbootadvanced.model.Question;
import com.springboot.advanced.springbootadvanced.model.Survey;
import com.springboot.advanced.springbootadvanced.service.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class SurveyController {

    @Autowired
    private SurveyService surveyService;

    @GetMapping("/surveys/{surveyId}/questions")
    public List<Question> retrieveQuestionsForSurvey(@PathVariable String surveyId){
        return surveyService.retrieveQuestions(surveyId);
    }

    @PostMapping("/surveys/{surveyId}/questions")
    public ResponseEntity<Void> addQuestionToSurvey(@PathVariable String surveyId, @RequestBody Question newQuestion){
        Question question = surveyService.addQuestion(surveyId, newQuestion);
        if (question == null) {
            return ResponseEntity.noContent().build();
        }
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(question.getId()).toUri();
        return ResponseEntity.created(location).build();
    }

    @GetMapping("/surveys/{surveyId}/questions/{questionId}")
    public Question retrieveDetailsForQuestion(@PathVariable String surveyId, @PathVariable String questionId){
        return surveyService.retrieveQuestion(surveyId, questionId);
    }

    @GetMapping("/surveys/")
    public List<Survey> retrieveAllSurveys(){
        return surveyService.retrieveAllSurveys();
    }
}
