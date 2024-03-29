package Adoptor;

public class MP3MediaPalyer implements MediaPlayer {
    @Override
    public void play(String filePath) {
        System.out.println("Playing MP3 file: " + filePath);

    }
}
