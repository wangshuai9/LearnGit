package com.pattern.test1;

public class Test {

    public static void main(String[] args) {
        History history = new History();
        Document doc = new Document();

        doc.change("123");
        doc.print();
        history.add(doc.save());

        doc.change("wwwww");
        history.add(doc.save());

        doc.change("SSSSSS");
        history.add(doc.save());


        doc.resume(history.getLastVersion());
        doc.resume(history.getLastVersion());
        doc.print();
    }


}
