/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mixmaster.test;

/**
 *
 * @author thomasleysen
 */
public enum Keys {
    
        A1("Abm"), 
        A2("Ebm"),
        A3("Bbm"),
        A4("Fm"),
        A5("Cm"),
        A6("Gm"),
        A7("Dm"),
        A8("Am"),
        A9("Em"),
        A10("Bm"),
        A11("F#m"),
        A12("Dbm"),
        B1("B"),
        B2("F#"),
        B3("Db"),
        B4("Ab"),
        B5("Eb"),
        B6("Bb"),
        B7("F"),
        B8("C"),
        B9("G"),
        B10("D"),
        B11("A"),
        B12("E");
        
    
    private final String key;
    
    private Keys(String s){
        this.key = s;
    }
    
    public String getKeyToString(){
        return key;
    }
}
