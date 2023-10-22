package ro.uvt.info.designpatternslab2023.classes;

public interface Element {
    public void print();
    public void add(Element e);
    public void remove(Element e);
    public Element get(int index);
}