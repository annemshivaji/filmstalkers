<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="common/header2.jspf" %>


    <%@ include file="common/navigation.jspf" %>
       <br>
    <br>
        <center><iframe src="https://www.youtube.com/embed/-Zc7T0vUpj0"></iframe><br><br></center>  
        <center><div class="container2"><br>
        
        <p2>BASKETBALL DIARIES</p2><br>
        <p1>A teenager finds his dreams of becoming a basketball star threatened after he free falls into the harrowing world of drug addiction.
        </p1><br><br>
        <br>

        <center><p1 style="font-size:25px;">Your Previous Ratings</p1><br>
        <c:forEach items="${films}" var="film">
          <c:if test = "${(film.filmname ==  'basketball diaries')}">
        <center><p1>Rating - <c:out value = "${film.rating}"/>/5</p1>
        </c:if>                
		</c:forEach>
		</center></center><br>
        <center><button class="button2"><a href="rate" style="text-decoration:none">Rate</a></button></center>
        <br>
        </div> 
<%@ include file="common/footer.jspf" %>