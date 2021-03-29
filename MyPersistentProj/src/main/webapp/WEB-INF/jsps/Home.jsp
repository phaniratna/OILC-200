<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Dynamic Drop Down List Demo</title>
<script src="https://code.jquery.com/jquery-1.12.3.min.js"></script>
<script type="text/javascript">
	function bye() {

		//document.getElementById("ab").style.visibility = "hidden";
		var x = document.getElementById("a").value;
		var dataa = "";
		$
				.ajax({
					type : 'GET',
					url : "gett/" + x,
					dataType : 'json',
					success : function(data) {
						var node = document.getElementById("tablebody");
						while (node.hasChildNodes()) {
							node.removeChild(node.lastChild);
						}

						if (data) {
							if ($.isArray(data)) {
								var v = "";
								for (var i = 0; i < data.length; i++) {
									if (data[i].concent)
										v = "<td><input type='checkbox' checked= 'checked' name = 'concent'></td></tr>"
									else
										v = "<td><input type='checkbox' name = 'concent'></td></tr>"
									$("#table1")
											.append(

													"<tr><td><input name = 'id' value = " + data[i].id + "></td>"
															+ "<td><input name = 'name' value = " + data[i].name + "></td><td>"
															+ v

											);

								}
							}
						}
					},
					error : function() {
						alert("from error");
					}
				});
	}
</script>
</head>
<body>
	<select name="homeList" onchange="bye()" id="a">
		<option value="select" selected="selected">Select</option>
		<c:forEach items="${homeList}" var="homes">
			<option value="${homes.id}">${homes.name}</option>
		</c:forEach>
	</select>



	<br>
	<br>
	<br>

	<div id="ab">
		<form:form method="post" action="update2">
			<table id="table1">
				<thead>
					<tr>
						<th>Id</th>
						<th>Name</th>
						<th>Consent</th>
					</tr>
				</thead>
				<tbody id="tablebody">
					<c:forEach items="${members}" var="contact" varStatus="status">
						<tr>
							<td><input name="members[${status.index}].id"
								value="${contact.id}" /></td>
							<td><input name="members[${status.index}].name"
								value="${contact.name}" /></td>
							<c:choose>
								<c:when test="${contact.concent}">
									<td><input type="checkbox" checked="checked"
										name="members[${status.index}].concent" /></td>
								</c:when>
								<c:otherwise>
									<td><input type="checkbox"
										name="members[${status.index}].concent" /></td>
								</c:otherwise>
							</c:choose>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<br />
			<input type="submit" value="update" />
		</form:form>



	</div>



</body>
</html>