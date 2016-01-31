<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Auto Catalog</title>
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

<div class="jumbotron span8" style="margin:0 auto; float:none;">
    <h1>Welcome!</h1>
    <p>Welcome to the server private placement of ads Car!</p>
    <p>The server provides its clients with the ability to view the ads of cars, as well as placing classified ads with personal car.</p>
    <p>The system is represented by an extensive range. You can pick up the necessary equipment and color.</p>
</div>

</body>
</html>
