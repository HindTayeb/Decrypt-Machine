/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimpleCyphers;

/**
 *
 * @author hpoje
 */
public class Ceaser {
    public static char cesar(char letter, int key) {
      boolean upper = Character.isUpperCase(letter);
      if(Character.isLetter(letter)) {
        letter = (char)(((int)Character.toLowerCase(letter) + key - (int)'a') % 26 + (int)'a');
        if(upper) {
          letter = Character.toUpperCase(letter);
        }
      }
      return letter;
    }
}
