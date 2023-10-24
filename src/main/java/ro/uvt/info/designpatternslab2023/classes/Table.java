package ro.uvt.info.designpatternslab2023.classes;

import java.util.List;

public class Table extends Element {
    private String title;

    public Table(String title) {
        this.title = title;
    }

    public void print(){
        System.out.println("Table with Title: " + title);
    }
}