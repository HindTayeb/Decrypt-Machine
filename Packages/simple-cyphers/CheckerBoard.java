/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimpleCyphers;

import cipher.Cipher;

/**
 *
 * @author hpoje
 */

public class CheckerBoard extends Cipher {

    final String[][] alphabit = {{"a", "b", "c", "d", "e"}, {"f", "g", "h", "ij", "k"}, {"l", "m", "n", "o", "p"}, {"q", "r", "s", "t", "u"}, {"v", "w", "x", "y", "z"}};
    
    
    public CheckerBoard() {
        super("23-15-31-31-34");
    }

    public CheckerBoard(String text) {
       super(text);
    }

    @Override
    public void encrypt() {
        String toLowerCase = getCipherText().toLowerCase();
        String[] ciphert = toLowerCase.split("");
        for (int h = 0; h < getCipherText().length(); h++) {
            for (int i = 0; i < alphabit.length; i++) {
                for (int j = 0; j < alphabit.length; j++) {
                    if (alphabit[i][j].contains(ciphert[h])) {
                        newtxt += "" + (i + 1) + (j + 1);
                    }
                }
            }
        }
        setCipherText();
         reset();
    }

    @Override
    public void decrypt() {
        javax.swing.JOptionPane.showMessageDialog(null, "For meanwhile, If your massege were containing the letter i or j they will show together.");
        String[] ciphert = getCipherText().split("");
        int[] arr = new int[ciphert.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(ciphert[i]);
        }
        
        for(int i = 0; i < arr.length; i++){
            int first = index(arr, i);
            //System.out.println(first);
            int sec = index(arr, ++i);
           //System.out.println(sec);
            newtxt += alphabit[--first][--sec];
        }
           
        setCipherText();
         reset();
    }

    
    public int index(int[] arr,int charnum){
        int index = 0;
        for (int i = 1; i <= arr.length; i++) { 
                    //System.out.println(charnum);
                   if (arr[charnum] == i) {
                       index = i;
                      
                    }
     }
        return index;
 }
}
