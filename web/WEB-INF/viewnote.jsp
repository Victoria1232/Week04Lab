<%-- 
    Document   : viewnote
    Created on : Jun 2, 2023, 12:04:42 PM
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
        
           <h2>View Note </h2>
           
           <p><strong>Title: ${noteTitle}</p> <br>
           
            <p><strong>Contents: ${noteContents} </p>
            
               <a href="./edit" name="editlink">Edit</a>
    </body>
</html>
