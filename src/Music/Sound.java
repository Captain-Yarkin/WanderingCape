package Music;


import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.net.URL;

public class Sound {
    Clip clip;
    //This is to track what audio file we choose and also ad later sound effects
    URL soundURL[] = new URL[69];


    public Sound(){
        soundURL[0] = getClass().getResource("/resource/runescapeTheme.wav");
    }

    public void setFile(int n){

        try {
            AudioInputStream sound = AudioSystem.getAudioInputStream(soundURL[n]);
            clip = AudioSystem.getClip();
            clip.open(sound);
        }
        catch (Exception e) {

        }

    }

    public void play(){
        clip.start();
    }

    public void loop(){
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }

    public void stop(){
        clip.stop();
    }




}
