
package servlets;

import models.Note;
import java.io.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mfgperez
 */
public class NoteServlet extends HttpServlet {
    
    
    
   @Override
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { // used to display web page 
       
       
       /* When browser first makes request ill use doGet */ 
       
                    // get path 
       String path = getServletContext().getRealPath("/WEB-INF/note.txt");
       
       // read file
       BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(path)));
       
      
       String title = bufferedReader.readLine().replace("ÿþ", " "); // ÿþ
       String contents  = bufferedReader.readLine();
       
         request.setAttribute("noteTitle" , title); 
         request.setAttribute("noteContents" , contents); 
        
       
       getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response); // use / before WEB
    
       
   }
   
    @Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   
       // what to do 
       // make variables for title, contents 
       // get the value for the text input and text area, then put them in the variables
       // add those to the note object 
       // write the new variables to the txt file / write note to the txt file 
       // then load the viewnote page again if submit is activated = submit != null . 
       
       
       // link goes to the edit jsp 
       
  
       /*PARAMITERS*/
 
        // get path 
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
       
        String newTitle = request.getParameter("title");
        String newContents = request.getParameter("contents");
        

        Note newNote = new  Note (newTitle, newContents) ;
         
         //request.setAttribute("noteTitle" , newTitle); 
        // request.setAttribute("noteContents" , newContents); 
         
                 // write to file 
      PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter(path, false)));
       
      
      printWriter.write(newNote.toString());
      //printWriter.write(newTitle);
      // printWriter.write(newContents + "\n");
       
       // 
         getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
         
   
      
        
   }
   
  

}
