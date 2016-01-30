<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>All Advertisements</title>
    <link href="<c:url value='/static/css/bootstrap.css' />" rel="stylesheet"/>
    <link href="<c:url value='/static/css/app.css' />" rel="stylesheet"/>
    <script src="https://code.jquery.com/jquery-2.2.0.min.js"></script>
</head>
<body>

<div class="panel-heading" style="position: fixed; width: 100%">
    <span class="lead">Auto Catalog</span>
</div>
<div class="menu-bar" style="position: fixed; margin-top: 50px;">
    <ul class="menu-container">
        <li class="active"><a href="/home"><span>Home</span></a></li>
        <li class="menu-li"><a href="/adverts-all">All Advertisements</a></li>
        <sec:authorize access="hasRole('ADMIN')">
            <li class="menu-li"><a href="/adverts-own">Own Advertisements</a></li>
            <li class="menu-li"><a href="/advert-create">Create Advertisement</a></li>
        </sec:authorize>
        <ul style="float:right;list-style-type:none;">
            <li class="menu-li"><a href="/logout">Logout</a></li>
        </ul>
    </ul>
</div>

<div class="generic-container"  style="float: left; margin-top: 120px">
    <div class="panel panel-default">
        <div class="panel-heading">
            <span class="lead">All Advertisements</span>
        </div>
        <table cellspacing="0" class="table table-hover" style="overflow:scroll">

            <tbody>
            <%--<c:forEach items="${menu}" var="menuCategory">
                <tr style="width: 100%">
                    <th>${menuCategory.name}</th>
                </tr>
                <c:forEach items="${menuCategory.menu}" var="menuItem">
                    &lt;%&ndash;<tr>
                        <td>
                            <img src="${menuItem.image}" style="width:125px; height:125px"/>
                        </td>
                        <td>${menuItem.in_category_id}</td>
                        <td>${menuItem.title}</td>
                        <td>${menuItem.weight}</td>
                        <td>${menuItem.cost}</td>
                    </tr>&ndash;%&gt;
                    <tr>
                        <td valign="top">
                        <div align="top" style="float: left">
                            <div  onclick='onMenuItemClick(${menuItem.dish_id}, ${menuItem.in_category_id}, ${menuItem.cost})'
                                  style="float: left; display: inline-block">
                                <img src="${menuItem.image}" style="width:130px; height:130px;"/>
                            </div>
                            <div style="float: left; margin-left: 20px; width: 500px">
                                <div><h><p style="font-weight: bold" id="dish-title-${menuItem.dish_id}">${menuItem.title}</p></h></div>
                                <div><span>${menuItem.description}</span></div>
                                <div><span>Вес: ${menuItem.weight}</span></div>
                                <div><span>Стоимость: ${menuItem.cost}</span></div>
                                <div><span>Номер: ${menuItem.in_category_id}</span></div>
                            </div>
                        </div>
                        </td>
                    </tr>
                </c:forEach>
            </c:forEach>--%>
            </tbody>
        </table>
    </div>
</div>

</body>
</html>
