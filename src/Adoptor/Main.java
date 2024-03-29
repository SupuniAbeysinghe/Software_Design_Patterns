package Adoptor;

public class Main {
    public static void main(String[] args) {
        String file = args[0];

        MediaPlayer mediaPlayer = null;
        if (file.endsWith(".mp3")){
            mediaPlayer = new MP3MediaPalyer();
        }if (file.endsWith(".mp4")){
            mediaPlayer = new MP4MediaPlayer();
        }

        if (mediaPlayer!=null){
            mediaPlayer.play(file);
        }else {
            System.out.println("Could not found the media player");
        }


    }
}