package ro.uvt.info.designpatternslab2023.classes;

public class AlignRight implements AlignStrategy{
    @Override
    public void render(String text) {
        System.out.println("Paragraph: " + "#" + text);
    }
}
