package com.springboot.advanced.springbootadvanced.controller;

import com.springboot.advanced.springbootadvanced.model.Question;
import com.springboot.advanced.springbootadvanced.service.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SurveyController {

    @Autowired
    private SurveyService surveyService;

    @GetMapping("/surveys/{surveyId}/questions")
    public List<Question> retrieveQuestionsForSurvey(@PathVariable String surveyId){
        return surveyService.retrieveQuestions(surveyId);
    }
}
