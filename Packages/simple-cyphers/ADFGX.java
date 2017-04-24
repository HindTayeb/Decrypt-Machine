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
public class ADFGX extends Cipher {

    final String[][] alphabet = {{"A", "b", "c", "d", "e"}, {"f", "g", "h", "ij", "k"}, {"l", "m", "n", "o", "p"}, {"q", "r", "s", "t", "u"}, {"v", "w", "x", "y", "z"}};

    public ADFGX() {
        super("DFAXFAFAFG");
    }

    public ADFGX(String cipherText) {
        super(cipherText);
    }

    private char returnChar(int i) {
        switch (i) {
            case 0:
                return 'A';
            case 1:
                return 'D';
            case 2:
                return 'F';
            case 3:
                return 'G';
            case 4:
                return 'X';

        }
        return ' ';
    }

    private int returnIndex(char c) {
        switch (c) {
            case 'A':
                return 0;
            case 'D':
                return 1;
            case 'F':
                return 2;
            case 'G':
                return 3;
            case 'X':
                return 4;

        }
        return 0;
    }

    @Override
    public void encrypt() {
        String toLowerCase = getCipherText().toLowerCase();
        String[] ciphert = toLowerCase.split("");
        for (int h = 0; h < ciphert.length; h++) {
            for (int i = 0; i < alphabet.length; i++) {
                for (int j = 0; j < alphabit.length; j++) {
                    if (alphabet[i][j].contains(ciphert[h])) {
                        newtxt += "" + returnChar(i) + returnChar(j);
                    }
                }
            }
        }

        setCipherText();
        reset();
    }

    @Override
    public void decrypt() {
        int first = 0, second = 0;
        for (int i = 0; i < getCipherText().length() - 1; i++) {
            first = returnIndex(getCipherText().charAt(i));
            second = returnIndex(getCipherText().charAt(++i));
            newtxt += alphabet[first][second];
        }

        setCipherText();
        reset();

    }

}
