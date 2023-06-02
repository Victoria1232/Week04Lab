<%-- 
    Document   : editnote
    Created on : Jun 2, 2023, 12:04:20 PM
    Author     : mfgperez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <title>Note Keeper</title>
    </head>
    <body>
      <h1>Simple Note Keeper</h1>
      
         <h2>Edit Note </h2>
         
         <form method ="post" action="note">
             
             <label><strong> Title:  </label><input type="text" name="title" required><br>  
                <br> 
                <label><strong> Contents:   <textarea  name="contents"rows="10" cols="50"><b>
                
            <input type="submit" value="Save">  
             
         </form>
         
    </body>
</html>
