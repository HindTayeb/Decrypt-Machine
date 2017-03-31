

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
        newtxt = "";
    }
    
    
    protected char[] get1DAlphabitsArray(){
        char[] alphabits = new char[26];
        char letters = 'A';
        for(int u = 0; u < alphabits.length; u++){
            alphabits[u] = letters;
            letters++;
        }
        
        return alphabits;
    }
    
   protected String[][] get2DAlphabitsArray(){
        String[][] alphabit = {{"a", "b", "c", "d", "e"}, {"f", "g", "h", "ij", "k"}, {"l", "m", "n", "o", "p"}, {"q", "r", "s", "t", "u"}, {"v", "w", "x", "y", "z"}};
        
        
        return alphabit;
    }
    
}
