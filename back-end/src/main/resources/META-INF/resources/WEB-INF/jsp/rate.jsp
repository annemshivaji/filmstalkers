<%@ include file="common/header.jspf" %>
        <br>
		<p1>Rate the film</p1><br>
	    <form:form method="post" modelAttribute="film">
			<p1>Rating : </p1> 
			<form:input type="number" path="rating"
			 required="required"/>
			<br><br>
			<input type="submit"/>
		</form:form>
<%@ include file="common/footer.jspf" %>