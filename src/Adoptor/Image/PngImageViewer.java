package Adoptor.Image;

public class PngImageViewer implements ImageViewer {
    @Override
    public void show(String file) {
        System.out.println("Showing png viewer" + file);
    }
}
