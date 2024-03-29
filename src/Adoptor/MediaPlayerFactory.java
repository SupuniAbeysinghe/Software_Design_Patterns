package Adoptor;

import Adoptor.Image.JpegImageViewer;
import Adoptor.Image.PngImageViewer;

public class MediaPlayerFactory {

    public static MediaPlayer getInstance(String file) {
        MediaPlayer mediaPlayer = null;

        if (file.endsWith(".mp3")) {
            mediaPlayer = new MP3MediaPalyer();
        }
        if (file.endsWith(".mp4")) {
            mediaPlayer = new MP4MediaPlayer();
        }
        if (file.endsWith(".jpeg")){
            mediaPlayer = new ImageAdaptor(new JpegImageViewer());
        }
        if (file.endsWith(".png")){
            mediaPlayer = new ImageAdaptor(new PngImageViewer());
        }

        return mediaPlayer;

    }

}

