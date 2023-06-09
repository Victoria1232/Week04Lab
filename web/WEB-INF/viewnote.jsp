<%-- 
    Document   : viewnote
    Created on : Jun 2, 2023, 12:04:42 PM
    Author     : mfgperez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Note Keeper</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        
           <h2>View Note </h2>
           
           <p><strong>Title:  ${newNote.title} ${newTitle}</p> <br>
           
            <p><strong>Contents:  ${newNote.contents} ${newContents}</p>
            
          
             <a href="note?edit" >Edit</a>
            <!-- https://www.amazon.ca/search?search_query=rock+climbing -->
           
    </body>
</html>
