/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hargi
 */
public class AdapterMain {
   public static void main(String[] args) {
      AudioPlayer audioPlayer = new AudioPlayer();

      audioPlayer.play("mp3", "Talk To Me RedVelvet.mp3");
      audioPlayer.play("mp4", "Bad Boys - RedVelvet.mp4");
      audioPlayer.play("vlc", "So Far Away A7X.vlc");
      audioPlayer.play("avi", "Mind Skirellex And Diplo (Jack Ü) Feat Kai.avi");
   }
}