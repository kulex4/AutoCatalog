<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>All Advertisements</title>
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

<div class="span9" style="height: 95%; width: 95%;">
    <c:forEach items="${adverts}" var="advert">
        <div class='panel panel-default' style="width: 50%; margin: 0 auto;">
            <div class='panel-heading'>
                -
                <div style="float: left;">
                    <table>
                        <tr>
                            <td width='40px'>${advert.auto.brand.name}</td>
                            <td width='40px'>${advert.auto.model.name}</td>
                            <td width='80px'>${advert.auto.year}</td>
                            <td width='100px'>${advert.auto.mileage} km</td>
                        </tr>
                    </table>
                </div>
                <div style="float: right;">
                    <table>
                        <tr>
                            <td width='50px'>${advert.auto.state.name}</td>
                            <td width='100px'>${advert.auto.price} $</td>
                        </tr>
                    </table>
                </div>
            </div>
            <div class='panel-body'>
                Body type: ${advert.auto.bodyType.name}<br/>
                Engine type: ${advert.auto.engineType.name}<br/>
                Transmission: ${advert.auto.transmission.name}<br/>
                Color: ${advert.auto.color.name}
            </div>
            <div class='panel-footer'>
                -
                <div style="float: right;">
                    <table>
                        <tr>
                            <td width='140px' style="float: right;">${advert.seller.name}</td>
                            <td width='120px'>${advert.seller.phone}</td>
                            <td width='140px' style="float: right;">${advert.seller.email}</td>
                        </tr>
                    </table>
                </div>
            </div>
        </div>
    </c:forEach>
</div>

</body>
</html>
