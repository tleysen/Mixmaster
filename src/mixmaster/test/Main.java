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
public class Main {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Init
        boolean debug = Boolean.TRUE;
        if(debug)
        {
            MusicData db = new MusicData(2);
            Song song1 = new Song("Fabrix", "Side Effect", Keys.A1);
            Song song2 = new Song("Hybrid Minds", "Lost", Keys.A2);
            
            db.AddSong(song1);
            db.AddSong(song2);
            db.PrintList();
            
        }
        
    }
    
}
