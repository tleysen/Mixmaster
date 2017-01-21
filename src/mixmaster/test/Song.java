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
public class Song {
    
    
    private final Keys key;
    private final String songname;
    private final String artistname;
    
    public Song(String artistname, String songname, Keys key){
        this.artistname = artistname;
        this.songname = songname;
        this.key = key;   
    }

    public String getKey() {
        return key.getKeyToString();
    }

    public String getSongname() {
        return songname;
    }

    public String getArtistname() {
        return artistname;
    }   
    
    public String ToString(){
        return this.artistname + "\t - " + this.songname + "\t " + this.key;
    }
}