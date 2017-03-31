/*
 Modifide affine cipher
 */
package SimpleCyphers;

import cipher.Cipher;

/**
 *
 * @author hpoje
 */
public class MAC extends Cipher {

    public MAC(String t) {
        super(t);
    }

    @Override
    public void encrypt() {
        char[] alphabets = get1DAlphabetsArray();
        for (int i = 0; i < getCipherText().length(); i++) {
            for (int j = 0; j < alphabets.length; j++) {
                char p = getCipherText().charAt(i);
                p = Character.toUpperCase(p);
                if (p == alphabets[j]) {
                   int index = (++j * getCipherText().length()) % 26;
                    newtxt += alphabets[--index];
                }

            }
        }
        setCipherText();
        reset();
    }

    @Override
    public void decrypt() {
        char[] alphabets = get1DAlphabetsArray();
        for (int i = 0; i < getCipherText().length(); i++) {
            for (int j = 0; j < alphabets.length; j++) {
                char p = getCipherText().charAt(i);
                p = Character.toUpperCase(p);
                if (p == alphabets[j]) {
                    int index = j;
                    boolean stat;
                    while(++index % getCipherText().length() != 0){
                    if(index % getCipherText().length() == 0){
                        newtxt += alphabets[index / getCipherText().length()];
                    }else{
                        index += 26;
                    }
                    }
                }
            }
        }
    }

}
