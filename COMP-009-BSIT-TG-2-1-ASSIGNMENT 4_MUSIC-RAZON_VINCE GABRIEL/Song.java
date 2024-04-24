package assignment;

import javax.sound.sampled.*;
import java.io.*;

public class Song {
    private String songFile;
    private Clip clip;
    private AudioInputStream audioStream;

    public Song(String songFile) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        this.songFile = songFile;
        File file = new File(songFile);
        audioStream = AudioSystem.getAudioInputStream(file);
        clip = AudioSystem.getClip();
        clip.open(audioStream);
    }

    public void play() {
        clip.setMicrosecondPosition(0);
        clip.start();
    }

    public void stop() {
        clip.stop();
    }

    public void close() {
        clip.close();
    }
}
