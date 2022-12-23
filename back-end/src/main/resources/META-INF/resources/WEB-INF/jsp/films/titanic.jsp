<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="common/header2.jspf" %>


    <%@ include file="common/navigation.jspf" %>
       <br>
    <br>
        <center><iframe src="https://www.youtube.com/embed/qtRKdVHc-cE"></iframe><br><br></center>  
        <center><div class="container2"><br>
        
        <p2>FIGHT CLUB - (3.5/5) </p2><br>
        <p1>Narrator, who is discontented with his white-collar job
         forms a "fight club" with soap salesman Tyler Durden,
          and becomes embroiled in a relationship with Marla Singer.</p1><br><br>
        <br>

        
        <c:forEach items="${films}" var="film">
          <center><p1>Your Rating - <c:out value = "${film.rating}"/>/5</p1>                  
		</c:forEach>
		</center></center><br>
        <center><button><a href="rate" style="text-decoration:none">Rate</a></button></center>
        <br>
        </div> 
<%@ include file="common/footer.jspf" %>