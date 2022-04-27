package Music;


import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.net.URL;

public class Sound {
    Clip clip;
    //This is to track what audio file we choose and also ad later sound effects
    URL soundURL[] = new URL[69];

    /**
     * Choose what sound to play for the current action
     */
    public Sound(){
        soundURL[0] = getClass().getResource("/Resource/runescapeTheme.wav");
        soundURL[1] = getClass().getResource("/Resource/swordSlashSoundEffect.wav");
    }

    /**
     * Managing and selected file so that is can be played --> heared by the user.
     * @param n
     */
    public void setFile(int n){

        try {
            AudioInputStream sound = AudioSystem.getAudioInputStream(soundURL[n]);
            clip = AudioSystem.getClip();
            clip.open(sound);
        }
        catch (Exception e) {

        }

    }

    /**
     * play chosen sound
     */
    public void play(){
        clip.start();
    }

    /**
     * loop chosen sound
     */
    public void loop(){
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }

    /**
     * stop chosen sound
     */
    public void stop(){
        clip.stop();
    }




}
