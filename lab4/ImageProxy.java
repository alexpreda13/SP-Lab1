package MainPackage;

public class ImageProxy implements Element {
    String url;
    int dim;
    Image realImage;

    ImageProxy(String url) {
        this.url = url;
    }
    private Image loadImage() {
        if(realImage == null) {
            realImage = new Image(url);
        }
        return realImage;
    }

    @Override
    public void print() {
        loadImage().print();
    }
}
