package com.company.Summative1PringleSteven.model;

public class QuoteModel
{
    //properties

    private String  author;
    private String quote;
    private int Id;

    //default constructor

    public QuoteModel(){}

    //constructor
    public QuoteModel(String author, String quote, int Id)
    {
        this.author = author;
        this.quote = quote;
        this.Id = Id;
    }

    //getters and setters

    public String getAuthor(){return author;}
    public void setAuthor(String author){this.author = author;}

    public String getQuote(){return quote;}
    public void setQuote(String quote) {this.quote = quote;}

    public int getId() {return Id;}
    public void setId(int id) {Id = id;}
}
