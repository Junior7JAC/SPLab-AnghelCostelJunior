package ro.uvt.info.designpatternslab2023.classes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SubChapter {
    private String name;
    private List<Element> elementList = new ArrayList<>();
    public SubChapter(String name)
    {
        this.name = name;
    }

    public void createNewParagraph(String s) {
        Paragraph para = new Paragraph(s);
        this.elementList.add(para);
        //Sort();
    }

    public void createNewImage(String s) {
        Image im = new Image(s);
        this.elementList.add(im);
        //Sort();
    }
    public void createNewTable(String s){
        Table t = new Table(s);
        this.elementList.add(t);
        //Sort();
    }

    public void print(){
        System.out.println("Subchapter:" + this.name);

        for(Element el : elementList)
            el.print();
    }


}