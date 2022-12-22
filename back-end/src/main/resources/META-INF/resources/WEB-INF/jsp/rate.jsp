<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="common/header.jspf" %>
        <br>
		<p1>Rate the film</p1><br>
	    <form:form method="post" modelAttribute="film">
			<p1>Rating : </p1> 
			<form:input type="number" path="rating" min="0" max="5"
			 required="required"/>
			 <form:input type="text" path="filmname" required="required"/>
			 <form:input type="hidden" path="id" />
			 <form:input type="hidden" path="username" />
			<br><br>
			<input type="submit"/>
		</form:form>
<%@ include file="common/footer.jspf" %>