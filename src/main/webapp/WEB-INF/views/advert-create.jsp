<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Create Advertisement</title>
    <script src="/static/js/libs/jquery/jquery.min.js"></script>
    <script src="/static/bootstrap/dist/js/bootstrap.min.js"></script>
    <link rel="stylesheet" type="text/css" href="/static/bootstrap/dist/css/bootstrap.min.css" media="screen" />
    <link rel="stylesheet" type="text/css" href="/static/bootstrap/dist/css/bootstrap-responsive.min.css" media="screen" />
</head>
<body>

<div style="text-align: center;">
    <h2>Auto Catalog</h2>
</div>
<nav class="navbar navbar-default" role="navigation">
    <div class="navbar-header">
        <a  href="/home"><img src="/static/images/banner_96x50.jpg" style="height: 50px;"/></a>
    </div>

    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
        <ul class="nav navbar-nav">
            <li class="menu-li"><a href="/adverts-all">All Advertisements</a></li>
        </ul>
        <ul class="nav navbar-nav navbar-right">
            <sec:authorize access="isAuthenticated()">
                <li class="menu-li"><a href="/adverts-own">Own Advertisements</a></li>
                <li class="menu-li"><a href="/advert-create">Create Advertisement</a></li>
            </sec:authorize>
            <li class="menu-li">
                <sec:authorize access="!isAuthenticated()">
                    <a href="/login">Login</a>
                </sec:authorize>
                <sec:authorize access="isAuthenticated()">
                    <a href="/logout">Logout</a>
                </sec:authorize>
            </li>
        </ul>
    </div>
</nav>

</body>
</html>
