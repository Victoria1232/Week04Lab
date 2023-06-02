/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author mfgperez
 */
public class Note {
    
    private String title; 
    private String contents; 
    
    // used to create a note 
    public Note(String title, String note) {
        
        this.title = title; 
        contents = note; 
        
    }
    
    
    
}
