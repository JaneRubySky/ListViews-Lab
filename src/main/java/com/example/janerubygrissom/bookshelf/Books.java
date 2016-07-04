package com.example.janerubygrissom.bookshelf;

/**
 * Created by drewmahrt on 12/16/15.
 */
public class Books {
    private String mTitle;
    private String mAuthor;

    public Books(String title, String author){
        mTitle = title;
        mAuthor = author;
    }

    public String getTitle() {
        
        return mTitle;
    }

    public String getAuthor() {
        
        return mAuthor;
    }

}
