/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mixmaster.test;

import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author thomasleysen
 */
public class MusicData {
    
    private static final String path = "/Users/thomasleysen/GitHub/Mixmaster/db/musicdb.txt";
    
    public static void WriteToDb(String song){
        
        BufferedWriter bw = null;
	FileWriter fw = null;
        
        try {
            fw = new FileWriter(path, true);
            bw = new BufferedWriter(fw);
            bw.write(song);
            bw.write(System.lineSeparator());
        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null)
                    bw.close();
		if (fw != null)
                fw.close();
            } catch (IOException ex) {
		ex.printStackTrace();
            }
        }
    }
    
    public static void AddSong(Song newSong){
        WriteToDb(newSong.ToString());
    }
    
    
}
