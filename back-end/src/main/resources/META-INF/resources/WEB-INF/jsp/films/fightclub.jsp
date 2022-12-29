<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="common/header2.jspf" %>


    <%@ include file="common/navigation.jspf" %>
       <br>
    <br>
        <center><iframe src="https://www.youtube.com/embed/qtRKdVHc-cE"></iframe><br><br></center>  
        <center><div class="container2"><br>
        
        <p2>FIGHT CLUB</p2><br>
        <p1>Narrator, who is discontented with his white-collar job
         forms a "fight club" with soap salesman Tyler Durden,
          and becomes embroiled in a relationship with Marla Singer.</p1><br><br>
        <br>

        <center><p1 style="font-size:25px;">Your Previous Ratings</p1><br>
        <c:forEach items="${films}" var="film">
          <c:if test = "${(film.filmname ==  'fight club')}">
        <center><p1>Rating - <c:out value = "${film.rating}"/>/5</p1>
        </c:if>                
		</c:forEach>
		</center></center><br>
        <center><button class="button2"><a href="rate" style="text-decoration:none">Rate</a></button></center>
        <br>
        </div> 
<%@ include file="common/footer.jspf" %>