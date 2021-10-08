package com.company.Summative1PringleSteven.controller;

import com.company.Summative1PringleSteven.model.EightBallModel;
import com.company.Summative1PringleSteven.model.WordModel;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class EightBalController
{
    private List<EightBallModel> eightBallModelList = new ArrayList<>();

    String[] response = {"Looks like a yes to me" , "Mmmm... maybe later" , ";)" , "Calculating..." , ":((" , ":))" , "Better Luck Next Time" };
    int iDCounter;

    @RequestMapping(value = "/magic", method = POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public EightBallModel createEightBallModel (@RequestBody EightBallModel eightBallModel)
    {
        String[] response = { "Looks like a yes to me" , "Mmmm... maybe later" , ";)" , "Calculating..." , ":((" , ":))" , "Better Luck Next Time" };
        int randint = (int)(Math.random() * (6+1) + 0);

        eightBallModel.setId(iDCounter++);
        eightBallModel.setAnswer(response[randint]);
        eightBallModelList.add(eightBallModel);

        return eightBallModel;
    }

}
