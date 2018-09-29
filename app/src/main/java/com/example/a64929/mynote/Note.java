package com.example.a64929.mynote;

public class Note {
    private String title="Title";
    private String time="1998";
    private String context="Hello World";
    private int id=0;
    public Note(int id,String title,String context){
        setId(id);
        setTitle(title);
        setContext(context);
    }

    public Note(int id,String title,String time,String context){
        setId(id);
        setTitle(title);
        setTime(time);
        setContext(context);
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTime(String time){
        this.time=time;
    }

    public String getTime() {
        return time;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getContext() {
        return context;
    }
}
