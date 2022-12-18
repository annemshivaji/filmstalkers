<%@ include file="common/header.jspf" %>
        <br>
		<p1>Rate the film</p1><br>
		<form method="post">
			<p1>Rating : </p1> <input type="number" name="rating" min="0" max="5" required><br><br>

			<input type="submit">
		</form>
<%@ include file="common/footer.jspf" %>