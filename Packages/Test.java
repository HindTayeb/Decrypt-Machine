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
public class Test {
    public static void main(String[] args) {
        
        Cipher r = new A1Z26("ghost");
        r.encrypt();
        System.out.println(r);
        A1Z26 d = new A1Z26("ghost");
        d.encrypt1();
        System.out.println(d);
        
        
       
    
    }
}
