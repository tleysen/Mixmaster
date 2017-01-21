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
    
    private ArrayList<Song> musicList;
    private static final String path = "/Users/thomasleysen/Desktop/naamloze map/test.txt";
    
    public MusicData(int length) {
        this.musicList = new ArrayList<Song>(length);
        
    }
    
    public void WriteToDb(String song){
        
        BufferedWriter bw = null;
	FileWriter fw = null;
        
        try {
            fw = new FileWriter(path, true);
            bw = new BufferedWriter(fw);
            bw.write(song);
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
    
    public void AddSong(Song newSong){
        musicList.add(newSong);
        this.WriteToDb(newSong.ToString());
    }
    
    public void PrintList(){
        for(int i = 0; i < musicList.size(); i++){
            System.out.println(musicList.get(i).ToString()); 
        }
    }

    public ArrayList<Song> getMusicList() {
        return musicList;
    }
    
    
}
