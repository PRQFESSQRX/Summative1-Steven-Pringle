package com.company.Summative1PringleSteven.model;

public class WordModel
{
    //properties

    private String word;
    private String definition;
    private int Id;

    //default constructor

    public WordModel(){}

    //constructor
    public WordModel(String word, String definition, int Id)
    {
        this.word = word;
        this.definition = definition;
        this.Id = Id;
    }

    //getters and setters

    public String getWord(){return word;}
    public void setWord(String word){this.word = word;}

    public String getDefinition() {return definition;}
    public void setDefinition(String definition) {this.definition = definition;}

    public int getId() {return Id;}
    public void setId(int id) {Id = id;}
}
