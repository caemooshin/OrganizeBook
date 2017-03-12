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
public class DramaBook extends Book{
        private String time, place;

        public DramaBook(String title, String author, int year, String time, String place) {
        super(title, author, year);
        this.time = time;
        this.place = place;
    }
        public String getTime() {
        return time;
    }
    public String getPlace() {
        return place;
    }
    
    public void print() {
        super.print();
        System.out.println("Time: " + time);
        System.out.println("Place: " + place);
    }
        
    
}
