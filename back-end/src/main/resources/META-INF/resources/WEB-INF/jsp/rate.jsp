<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="common/header.jspf" %>
       <%@ include file="common/navigation.jspf" %>
        <br>
		<p1  style="font-size:24px;">Rate the film</p1><br><br>
	    <form:form method="post" modelAttribute="film">
			<p1>Rating : </p1> <br><br>
			<form:input type="number" path="rating" min="0" max="5"
			 required="required"/><br><br>
			 <p1>Filmname ( Enter the film name in small letters for verification ) : </p1><br><br>
			 <form:input type="text" path="filmname" required="required"/>
			 <form:input type="hidden" path="id" />
			 <form:input type="hidden" path="username" />
			<br><br>
			<a><input class="button2" type="submit"/></a>
		</form:form>
<%@ include file="common/footer.jspf" %>