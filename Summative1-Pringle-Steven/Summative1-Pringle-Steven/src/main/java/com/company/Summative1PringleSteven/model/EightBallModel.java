package com.company.Summative1PringleSteven.model;

public class EightBallModel
{
    //properties

    private String question;
    private String answer;
    private int Id;

    //default constructor

    public EightBallModel(){}

    //constructor

    public EightBallModel(String question, String answer, int Id )
    {
        this.question = question;
        this.answer = answer;
        this.Id = Id;

    }

    //getters and setters

    public String getQuestion(){return question;}
    public void setQuestion(String question){this.question = question;}

    public String getAnswer(){return answer;}
    public void setAnswer(String answer){this.answer = answer;}

    public int getId(){return Id;}
    public void setId(int iD){Id = iD;}
}
