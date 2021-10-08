package com.company.Summative1PringleSteven.controller;

import com.company.Summative1PringleSteven.model.QuoteModel;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class QuoteController
{
    private List<QuoteModel> quoteModelList;
    private static int iDCounter = 0;

    public QuoteController ()
    {
        quoteModelList = new ArrayList<>();
        quoteModelList.add(new QuoteModel("Sun Tzu" , "Victorious warriors win first and then go to war, while defeated warriors go to war first and then seek to win." , iDCounter++));
        quoteModelList.add(new QuoteModel( "G.K. Chesterton" , "A true warrior fights not because he hates what is in front of him, but because he loves what is behind him." , iDCounter++));
        quoteModelList.add(new QuoteModel( "Chogyam Trungpa" , "To be a warrior is to learn to be genuine in every moment of your life" , iDCounter++));
        quoteModelList.add(new QuoteModel( "Confucius" , "A warrior's greatest glory is not in never falling, but in rising every time we fall" , iDCounter++));
        quoteModelList.add(new QuoteModel( "Bruce Lee" , "The successful warrior is the average man with laser like focus" , iDCounter++));
        quoteModelList.add(new QuoteModel( "Bruce Lee" , "I fear not the man who has practiced 10,000 kicks once, but I fear the man who has practiced one kick 10,000 times" , iDCounter++));
        quoteModelList.add(new QuoteModel( "Japanese Proverb" , "In the struggle between the stone and water, in time, the water wins" , iDCounter++));
        quoteModelList.add(new QuoteModel( "African Proverb" , "If you want to know the end, look at the beginning" , iDCounter++));
        quoteModelList.add(new QuoteModel( "African Proverb" , "A roaring lion kills no game" , iDCounter++));
        quoteModelList.add(new QuoteModel( "African Proverb" , "If a woman doesn’t love you, she calls you “brother" , iDCounter++));
        quoteModelList.add(new QuoteModel( "Thessalonians 5:11" , "Therefore encourage one another and build each other up, just as in fact you are doing" , iDCounter++));
        quoteModelList.add(new QuoteModel( "Nehemiah 8:10" , "Do not grieve, for the joy of the Lord is your strength" , iDCounter++));
    }

    @RequestMapping(value = "/quote", method = GET)
    @ResponseStatus(value = HttpStatus.OK)
    public QuoteModel getQuote()
    {
        int randint = (int)(Math.random() * (10+1) + 0 );

        return quoteModelList.get(randint);
    }
}
