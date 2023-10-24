package ro.uvt.info.designpatternslab2023.classes;

import java.util.ArrayList;
import java.util.List;

public class Section extends Element{
    protected String title;

    public Section(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println(title);
        for (Element element : elementList) {
            element.print();
        }
    }

}
