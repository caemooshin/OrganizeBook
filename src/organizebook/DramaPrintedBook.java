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
public class DramaPrintedBook extends DramaBook implements PrintedBook{
    private String dimensions, weight;
    
    public DramaPrintedBook(String title, String author, int year, String time, String place, String dimensions, String weight){
        super(title, author, year, time, place);
        this.dimensions = dimensions;
        this.weight = weight;
    }
    
    public String getDimensions(){
        return dimensions;
    }
    
    public String getWeight(){
        return weight;
    }
    
    public void print(){
        super.print();
        System.out.println("Weight: " + weight);
        System.out.println("Dimensions: " + dimensions);
    }
}
