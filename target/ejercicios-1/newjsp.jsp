<%-- 
    Document   : newjsp
    Created on : 28 oct. 2022, 08:57:39
    Author     : COMPU06
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>INFO</h1>
        <%
            int flag = 1;
            if (flag==0){
                %>
                    <p>parrafo</p>
                    <form> 
                        entrada<input type="text">
                    </form>
                <%
            }else{
                %>
                    <p>No hay nada para mostrar</p>
                <%
            
            }
        %>
    </body>
</html>
