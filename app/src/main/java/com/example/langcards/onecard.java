package com.example.langcards;

public class onecard {
    private String top, bottom;

    public onecard(String top, String bottom){
        this.top = top;
        this.bottom = bottom;
    }

    public void setTop(String top){
        this.top = top;
    }
    public void setBottom(String bottom){
        this.bottom = bottom;
    }
    public String getTop(){
        return this.top;
    }
    public String getBottom(){
        return this.bottom;
    }

    //TODO
    //public void setAudio()
    //public void getAudio()
    //public void setColor()
    //public void getColor()
}
