package Adoptor.Image;

public class JpegImageViewer implements ImageViewer {
    @Override
    public void show(String file) {
        System.out.println("Showing jpeg image" + file);

    }
}
