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
public class A1Z26 extends Cipher{
    
    public A1Z26(){
       
    }
    
    public A1Z26(String text){
       super(text);
    }
     
    @Override
    public void encrypt(){
        
        for(int i = 0; i < getCipherText().length(); i++){
            int j = 1;
            for(char c = 'A';c <= 'Z'; c++, j++){
               char p = Character.toUpperCase(getCipherText().charAt(i));
                if(p == c)
                  newtxt += (j) + "-";
            }
            
        }
        newtxt += "\b";
       setCipherText();
       reset();
    }
    
    @Override
    public void decrypt(){
       char[] alphabets = get1DAlphabetsArray();
       String[] ciphertxt = getCipherText().split("-");
       int[] ciphert = new int[ciphertxt.length];
       
       for(int i = 0; i < ciphertxt.length - 1; i++){
           
         ciphert[i] = Integer.parseInt(ciphertxt[i].trim());
         
       }
        for(int i = 0; i < ciphert.length; i++){
            for(int j =0; j < alphabets.length; j++){
               if(ciphert[i] == j+1)
                    newtxt += alphabets[j];
            }
        }
       setCipherText();
       reset();
        
}
}
