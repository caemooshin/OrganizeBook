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
public class ScienceFictionBook extends Book{
    private String subject;
    
    public ScienceFictionBook(String title, String author, int year, String subject){
        super(title, author, year);
        this.subject = subject;
    }
    
    public String getSubject(){
        return subject;
    }
    
    public void print(){
        super.print();
        System.out.println("Subject: " + subject);
    }
}
