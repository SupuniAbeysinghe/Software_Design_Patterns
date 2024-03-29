package Adoptor;

import Adoptor.Image.ImageViewer;

public class ImageAdaptor implements MediaPlayer {
    private ImageViewer imageViewer;

    public ImageAdaptor(ImageViewer imageViewer) {
        this.imageViewer = imageViewer;
    }

    @Override
    public void play(String filePath) {
        imageViewer.show(filePath);

    }
}
