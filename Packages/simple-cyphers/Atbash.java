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
public class Atbash extends Cipher{
   
    public Atbash(){
        super("svool");
    }
    
    public Atbash(String text){
        super(text);
    }
  
    public void encryptingOrDecrypting(){
         for (int i =0; i < getCipherText().length(); i++){
            char o = getCipherText().charAt(i);
            o = Character.toLowerCase(o);
            switch(o){
                case 'a':newtxt += 'z';break; case 'b':newtxt += 'y';break; case 'c':newtxt += 'x';break; case 'd':newtxt += 'w';break; 
                case 'e':newtxt += 'v';break; case 'f':newtxt += 'u';break; case 'g':newtxt += 't';break; case 'h':newtxt += 's';break; 
                case 'i':newtxt += 'r';break; case 'j':newtxt += 'q';break; case 'k':newtxt += 'p';break; case 'l':newtxt += 'o';break; 
                case 'm':newtxt += 'n';break; case 'n':newtxt += 'm';break; case 'o':newtxt += 'l';break; case 'p':newtxt += 'k';break; 
                case 'q':newtxt += 'j';break; case 'r':newtxt += 'i';break; case 's':newtxt += 'h';break; case 't':newtxt += 'g';break; 
                case 'u':newtxt += 'f';break; case 'v':newtxt += 'e';break; case 'w':newtxt += 'd';break; case 'x':newtxt += 'c';break; 
                case 'y':newtxt += 'b';break; case 'z':newtxt += 'a';break; 
            }
        }
        
      setCipherText();
       reset();
    }
    
    public void encrypt(){
        encryptingOrDecrypting();
      
    }
    
    
    
    public void decrypt(){
        encryptingOrDecrypting();
}
}
