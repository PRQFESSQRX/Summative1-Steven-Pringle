package com.company.Summative1PringleSteven.controller;

import com.company.Summative1PringleSteven.model.QuoteModel;
import com.company.Summative1PringleSteven.model.WordModel;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class WordController
{
    private List<WordModel> wordModelList;
    private static int iDCounter = 0;

    public WordController()
    {
        wordModelList = new ArrayList<>();
        wordModelList.add(new WordModel( "Dope" , "Cool or awesome" , iDCounter++));
        wordModelList.add(new WordModel( "GOAT" , "Greatest of All Time" , iDCounter++));
        wordModelList.add(new WordModel( "Gucci" , "Good, cool, or going well" , iDCounter++));
        wordModelList.add(new WordModel( "No cap" , "Totally true or no lie" , iDCounter++));
        wordModelList.add(new WordModel( "Hangry" , "Hungry & Angry" , iDCounter++));
        wordModelList.add(new WordModel( "Kick back" , "Small party" , iDCounter++));
        wordModelList.add(new WordModel( "Shook" , "To be shocked or incredibly surprised." , iDCounter++));
        wordModelList.add(new WordModel( "Mood" , "something that is relatable" , iDCounter++));
        wordModelList.add(new WordModel( "Flex" , "To show off" , iDCounter++));
        wordModelList.add(new WordModel( "Lit" , "When something is very good, enjoyable, or exciting" , iDCounter++));
        wordModelList.add(new WordModel( "Extra" , "Unnecessarily dramatic, excessive, or over the top" , iDCounter++));
    }

    @RequestMapping(value = "/word", method = GET)
    @ResponseStatus(value = HttpStatus.OK)
    public WordModel getWord()
    {
        int randint = (int)(Math.random() * (10+1) + 0 );

        return wordModelList.get(randint);
    }
}
