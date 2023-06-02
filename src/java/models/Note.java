/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;

/**
 *
 * @author mfgperez
 */
public class Note implements Serializable {

   
    private String title; 
    private String contents; 
    
    
    public Note() {
        
        this.title = ""; 
        contents = ""; 
        
    }
    
    // used to create a note 
    public Note(String title, String note) {
        
        this.title = title; 
        contents = note; 
        
    }
    
    
     public String getTitle() {
        return title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
    
       public void setTitle(String title) {
        this.title = title;
    }
    
       
       @Override
       public String toString() {
           return this.title + " " + contents + "\n"; 
       }
    
    
    
}
