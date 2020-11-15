package MainPackage;

public class Paragraph implements Element {
    String pText;
    AlignStrategy alStr;
    Paragraph(String text) {
        this.pText = text;
    }



    public void setAlignStrategy(AlignStrategy alStr) {
        this.alStr = alStr;
    }

    public String getpText() {
        return pText;
    }
    @Override
    public String toString() {
        return "Paragraph{" +
                "pText='" + pText + '\'' +
                '}';
    }


    @Override
    public void print() {
        if(alStr == null) {
            System.out.println(this.toString());
            return;
        }
        alStr.render(this, new Context());
    }
}
