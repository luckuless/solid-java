package com.luckuless.code.singleResponsibility.after;

public class Book {
    private String name;
    private String author;
    private String synopsys;

    //constructor, getters and setters

    // methods that directly relate to the book properties
    public String replaceWordInSynopsys(String word, String replacementWord){
        return synopsys.replaceAll(word, replacementWord);
    }

    public boolean isWordInSynopsys(String word){
        return synopsys.contains(word);
    }

}
