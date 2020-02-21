<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="UTF-8">
<title>News site</title>
<style>
td, th {
  font-family: arial, sans-serif;
}
</style>
<script type="text/javascript">
	function validate() {
		if (document.forms["post"]["ptitle"].value == "") {
			alert("Please enter title");
			document.forms["post"]["ptitle"].focus();
			return false;
		}
		if (document.forms["post"]["shortDescr"].value == "") {
			alert("Please enter shortDescr");
			document.forms["post"]["shortDescr"].focus();
			return false;
		}
		if (document.forms["post"]["descr"].value == "") {
			alert("Please enter descr");
			document.forms["post"]["descr"].focus();
			return false;
		}
		if (document.forms["post"]["pmeta"].value == "") {
			alert("Please enter meta");
			document.forms["post"]["pmeta"].focus();
			return false;
		}
		if (document.forms["post"]["urlSlug"].value == "") {
			alert("Please enter urlSlug");
			document.forms["post"]["urlSlug"].focus();
			return false;
		}
		if (document.forms["post"]["posted_on"].value == "") {
			alert("Please enter posted_on");
			document.forms["post"]["posted_on"].focus();
			return false;
		}
		if (document.forms["post"]["category"].value == "") {
			alert("Please enter category");
			document.forms["post"]["category"].focus();
			return false;
		}
	}
</script>
</head>
<body style="background-color: #FFFFE0;">
<div style="margin-top:50px; margin-left:250px; height:50px;"><h2>Post <c:out value="${post.id != null ? 'Update' : 'Post' }" /></h2></div>
<form:form method="POST" modelAttribute="post" action="/home" name="post">
<table style="vertical-align: center; margin-left:20%;">
	
	<tr>
		<td><form:hidden path="id"/></td>
	</tr>
    <tr>
        <td>Title :</td>
        <td><form:input path="title" id="ptitle" /></td>
    </tr>
    <tr>
        <td>Short description :</td>
        <td><form:input path="shortDescription" id="shortDescr"/></td>
    </tr>
    <tr>
        <td>Description :</td>
        <td><form:input path="description" id="descr"/></td>
    </tr>
    <tr>
        <td>Meta :</td>
        <td><form:input path="meta" id="pmeta"/></td>
    </tr>
    <tr>
        <td>URL slug :</td>
        <td><form:input path="urlSlug" id="urlSlug"/></td>
    </tr>
    <tr>
        <td>Published :</td>
        <td><form:input path="published" id="published" /></td>
    </tr>
    <tr>
        <td>Age :</td>
        <td><form:input path="posted_on" id="posted_on" /></td>
    </tr>
    <tr>
        <td>Personal Email :</td>
        <td><form:input path="category" id="category" /></td>
    </tr>
    <tr>
        <td colspan="2"><input type="submit" value="<c:out value="${post.id != null ? 'Update' : 'Post' }" />"
         onclick="return validate();">&nbsp;&nbsp; <a href="/list">Post List</a>&nbsp;
         <c:if test="${post.id ne null}"><b>|</b>&nbsp;<a href="/post">Post</a></c:if>
         </td>
    </tr>
</table>
</form:form>

</body>
</html>