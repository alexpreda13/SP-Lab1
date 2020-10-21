import java.awt.*;
import java.util.ArrayList;

public class MyBook {

    public static void main(String[] args) {
        MyBook discoTitanic = new MyBook("Disco Titanic");
        discoTitanic.createNewParagraph("Paragraph 1");
        discoTitanic.createNewParagraph("Paragraph 2");
        discoTitanic.createNewParagraph("Paragraph 3");
        discoTitanic.createNewImage("Image 1");
        discoTitanic.createNewParagraph("Paragraph 4");
        discoTitanic.createNewImage("Image 2");
        discoTitanic.createNewParagraph("Paragraph 5");

        discoTitanic.print();
    }
    private final String title;
    private final ArrayList<String> paragraph = new ArrayList<String>();
    private final ArrayList<String> image = new ArrayList<String>();

    public MyBook(String title) {
        this.title = title;
    }

    public void createNewParagraph(String paragraph){
        this.paragraph.add(paragraph);
    }

    public void createNewImage(String image){
        this.image.add(image);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", paragraph=" + paragraph +
                ", image=" + image +
                '}';
    }

    public void print(){
        System.out.println(this.toString());
    }
}