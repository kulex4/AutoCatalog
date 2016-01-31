<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>AutoCatalog</title>
    <link href="<c:url value='/static/css/bootstrap.css' />" rel="stylesheet"/>
    <link href="<c:url value='/static/css/app.css' />" rel="stylesheet"/>
    <script src="https://code.jquery.com/jquery-2.2.0.min.js"></script>
</head>
<body style="overflow-x:visible; overflow-y:visible">

<div class="panel panel-default" style="position: fixed; width: 100%">

    <div class="panel-heading" style="position: fixed; width: 100%">
        <span class="lead">Auto Catalog</span>
    </div>
    <div class="menu-bar" style="position: fixed; margin-top: 50px;">
        <ul class="menu-container">
            <li class="active"><a href="/home"><span>Home</span></a></li>
            <li class="menu-li"><a href="/adverts-all">All Advertisements</a></li>
            <sec:authorize access="isAuthenticated()">
                <li class="menu-li"><a href="/adverts-own">Own Advertisements</a></li>
                <li class="menu-li"><a href="/advert-create">Create Advertisement</a></li>
            </sec:authorize>
            <ul style="float:right;list-style-type:none;">
                <li class="menu-li">
                    <sec:authorize access="!isAuthenticated()">
                        <a href="/login">Login</a>
                    </sec:authorize>
                    <sec:authorize access="isAuthenticated()">
                        <a href="/logout">Logout</a>
                    </sec:authorize>
                </li>
            </ul>
        </ul>
    </div>
</div>

</body>
</html>
