<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    

<h1>Welcome</h1>

<h3>Display data...</h3>

<table border=3px>
	<tr>
         <th>ID</th>
	     <th>First Name</th>
	     <th>Last Name</th>
	     <th>Email</th>
	     <th>Password</th>
	     <th>Actions</th>
    </tr>
    
     <c:forEach var="p" items="${list}">   
   <tr>  
	   <td>${p.id}</td>  
	   <td>${p.fname}</td>  
	   <td>${p.lname}</td>
	   <td>${p.email}</td> 
	    <td>${p.password}</td>  
	   <td><a href="edit/${p.id}">Edit</a>     | 
	   <a href="delete/${p.id}">Delete</a></td>  
   </tr>  
   </c:forEach>  

    
</table>    

