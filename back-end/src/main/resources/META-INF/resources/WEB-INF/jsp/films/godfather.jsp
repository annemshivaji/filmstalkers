<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="common/header2.jspf" %>


    <%@ include file="common/navigation.jspf" %>
       <br>
    <br>
        <center><iframe src="https://www.youtube.com/embed/OA1ij0alE0w"></iframe><br><br></center>  
        <center><div class="container2"><br>
        
        <p2>THE GOD FATHER</p2><br>
        <p1>The early life and career of Vito Corleone in 1920s New York City is portrayed,
         while his son, Michael, expands and tightens his grip on the family
          crime syndicate.</p1><br><br>
        <br>

        <center><p1 style="font-size:25px;">Your Previous Ratings</p1><br>
        <c:forEach items="${films}" var="film">
          <c:if test = "${(film.filmname ==  'the god father')}">
        <center><p1>Rating - <c:out value = "${film.rating}"/>/5</p1>
        </c:if>                
		</c:forEach>
		</center></center><br>
        <center><button class="button2"><a href="rate" style="text-decoration:none">Rate</a></button></center>
        <br>
        
          <br> 

 <div class="w3-container">  
  <hr>   
  <p2>COMMENTS</p2><br></div>
    <div class="w3-container">    
  <div class="w3-card-4" style="width:100%">
  <c:forEach items="${filmss}" var="film">
    <c:if test = "${(film.filmname ==  'the god father') && (film.comment!=null)}">           
      <br>
      <p3>${film.username}</p3><br>
      <hr>
    <header class="w3-container w3-light-grey">
    
      <h5>${film.comment}</h5>
    </header>
     </c:if>  
    </c:forEach>
     
</div>
<br><br>
        </div> 
<%@ include file="common/footer.jspf" %>