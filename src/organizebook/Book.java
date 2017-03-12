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
public class Book { 
    
        private String title, author;
        private int year; 
        
        public Book(String title, String author, int year){
             this.title = title;
             this.author = author;
             this.year = year;
        }
        public String getTitle(){
               return title;
        }

        public String getAuthor(){
                return author;
        }

        public int getYearOfPublication(){
                return year;
        }

        public void print(){
                System.out.println("Title: " + title);
                System.out.println("Author: " + author);
                System.out.println("Year of publication: " + year);
        } 
}
