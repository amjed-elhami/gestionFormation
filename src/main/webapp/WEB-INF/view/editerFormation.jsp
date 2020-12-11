<%@ page language="java" contentType="text/html; charset=windows-1256"
 pageEncoding="windows-1256"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<link rel="stylesheet" type="text/css"
href="webjars/bootstrap/4.3.1/css/bootstrap.min.css" />
<c:url value="/css/main.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" />
<script type="text/javascript"
src="webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Modifier une Formation</title>
</head>
<body>
<div class="container mt-5">
<div class="card-body">
<form action="updateFormation" method="post">
 <div class="form-group" >
 <label class="control-label">ID Formation :</label>
 <input type="text" name="idFormation" value="${formation.idFormation}"
readonly class="form-control"/>
 </div>
 <div class="form-group">
 <label class="control-label">Titre Formation :</label>
 <input type="text" name="titreFormation" value="${formation.titreFormation}"
class="form-control"/>
 </div>
 <div class="form-group">
 <label class="control-label">Prix Formation :</label>
 <input type="text" name="prixFormation" value="${formation.prixFormation}"
class="form-control"/>
 </div>
 <div class="form-group">
 <label class="control-label"> Date cr�ation :</label>
 <fmt:formatDate pattern="yyyy-MM-dd" value="${formation.dateAjoutFormation}"
var="formatDate" />
 <input type="date" name="date" value="${formatDate}" class="formcontrol" />
 </div>
 <div>
 <button type="submit" class="btn btn-primary">Modifier</button>
</div>
</form>
</div>
<br/>
<br/>
<a href="ListeFormations"> Liste Formations </a>
</div>
</body>
</html>