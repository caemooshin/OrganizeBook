/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package organizebook;

/**
 *
 * @author Y-V-D
 */
public class ScienceFictioneAudioBook extends ScienceFictionBook implements eAudioBook, eBook{
    
     private int numberTracks;
    private String size;
    
    public ScienceFictioneAudioBook(String title, String author, int year, String subject, int numberTracks, String size){
        super(title, author, year, subject);
        this.numberTracks = numberTracks;
        this.size = size;
    }
    
    public int getNumberOfTracks(){
        return numberTracks;
    }
    @Override
    public String getSize(){
        return size;
    }
    
    public void print(){
        super.print();
        System.out.println("Number of Tracks: " + numberTracks);
        System.out.println("Size: " + size);
    }
}
