package com.company;


import java.awt.event.ActionListener;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


public class SoundEffects {
    public SoundEffects() {
    }

    // Action listener
    public static ActionListener PlaySound(String filepath) {
        try {
            File soundPath = new File(filepath);
            // If file exists then play audio
            if (soundPath.exists()) {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(soundPath);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();
            } else {
                // Error handling
                System.out.println("Cant find file");
            }
        } catch (Exception var4) {
            var4.printStackTrace();
        }

        return null;
    }
}