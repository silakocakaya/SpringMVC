<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Confirmation</title>
</head>
<body>
Name and Surname: ${student.firstName} ${student.lastName}
<br><br>

Country: ${student.country}

<br><br>

City: ${student.city}

<br><br>

Favorite Language: ${student.favoriteLanguage}

<br><br>

Operating Systems:

<ul>
	<c:forEach var="opSis" items="${student.operatingSystems}">

		<li> ${opSis} </li>

	</c:forEach>
</ul>

</body>
</html>