package com.pattern.test1;

public class Document {

    private String content;

    public Backup save(){
        return new Backup(content);
    }

    public void resume(Backup backup){
        content = backup.content;
    }

    public void change(String content){
        this.content = content;
    }

    public void print(){
        System.out.println(content);
    }

}

interface Meimory{

}

class Backup implements Meimory{
    public String content;

    public Backup(String backup){
        super();
        this.content = backup;
    }
}