

package cipher;


/**
 *
 * @author hpoje
 */
public abstract class Cipher {
    private String cipher, plainText;
     protected String newtxt = "";
     
    protected Cipher(){
        
    }
    
    protected Cipher(String cypherText){
        cipher = cypherText;
    }
    
    protected void setCipherText(){
        cipher = this.newtxt;
    }
    
    public void setPlainText(String pt){
        plainText = pt;
    }
    
    public String getPlainText(){
       return plainText;
    }
    
    public String getCipherText(){
        return cipher;
    }
    
    public abstract void encrypt();
    public abstract void decrypt();
    
    public String toString(){
        return cipher;
    }
    
    protected void reset(){
        newtxt = "new";
    }
    
    
    protected char[] get1DAlphabetsArray(){
        char[] alphabets = new char[26];
        char letters = 'A';
        for(int u = 0; u < alphabets.length; u++){
            alphabets[u] = letters;
            letters++;
        }
        
        return alphabets;
    }
    
   protected String[][] get2DAlphabetsArray(){
        String[][] alphabet2D = {{"a", "b", "c", "d", "e"}, {"f", "g", "h", "ij", "k"}, {"l", "m", "n", "o", "p"}, {"q", "r", "s", "t", "u"}, {"v", "w", "x", "y", "z"}};
        
        
        return alphabet2D;
    }
    
}
