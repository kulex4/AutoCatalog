<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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

<div class="row-fluid">
    <div class="span5" style="margin:0 auto; float:none;" >
        <div class="well" style="padding: 70px;">
            <div style="text-align: center; margin-bottom: 40px">
                <h2>Create New Advertisement</h2>
            </div>
            <form:form method="POST" modelAttribute="advertDto" action="/advert-create-new">
                <form:input type="hidden" path="id" id="id"/>
                <div class="row">
                    <div class="form-group col-md-12">
                        <label class="col-md-3 control-lable" for="price">Price</label>
                        <div class="col-md-7">
                            <form:input type="number" path="autoDto.price" id="price" class="form-control input-sm" value="9600"/>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="form-group col-md-12">
                        <label class="col-md-3 control-lable" for="year">Year</label>
                        <div class="col-md-7">
                            <form:input type="number" path="autoDto.year" id="year" class="form-control input-sm" value="2008"/>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="form-group col-md-12">
                        <label class="col-md-3 control-lable" for="mileage">Mileage</label>
                        <div class="col-md-7">
                            <form:input type="number" path="autoDto.mileage" id="mileage" class="form-control input-sm" value="123000"/>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="form-group col-md-12">
                        <label class="col-md-3 control-lable" for="state">State</label>
                        <div class="col-md-7">
                            <form:select path="autoDto.idState" id="state" class="form-control input-sm">
                                <form:option value="NONE" label="--- Select ---" />
                                <form:options items="${states}" itemValue="id" itemLabel="name"/>
                            </form:select>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="form-group col-md-12">
                        <label class="col-md-3 control-lable" for="brand">Brand</label>
                        <div class="col-md-7">
                            <form:select path="autoDto.idBrand" id="brand" class="form-control input-sm">
                                <form:option value="NONE" label="--- Select ---" />
                                <form:options items="${brands}" itemValue="id" itemLabel="name"/>
                            </form:select>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="form-group col-md-12">
                        <label class="col-md-3 control-lable" for="model">Model</label>
                        <div class="col-md-7">
                            <form:select path="autoDto.idModel" id="model" class="form-control input-sm">
                                <form:option value="NONE" label="--- Select ---" />
                                <form:options items="${models}" itemValue="id" itemLabel="name"/>
                            </form:select>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="form-group col-md-12">
                        <label class="col-md-3 control-lable" for="color">Color</label>
                        <div class="col-md-7">
                            <form:select path="autoDto.idColor" id="color" class="form-control input-sm">
                                <form:option value="NONE" label="--- Select ---" />
                                <form:options items="${colors}" itemValue="id" itemLabel="name"/>
                            </form:select>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="form-group col-md-12">
                        <label class="col-md-3 control-lable" for="bodyType">Body Type</label>
                        <div class="col-md-7">
                            <form:select path="autoDto.idBodyType" id="bodyType" class="form-control input-sm">
                                <form:option value="NONE" label="--- Select ---" />
                                <form:options items="${bodyTypes}" itemValue="id" itemLabel="name"/>
                            </form:select>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="form-group col-md-12">
                        <label class="col-md-3 control-lable" for="engineType">Engine Type</label>
                        <div class="col-md-7">
                            <form:select path="autoDto.idEngineType" id="engineType" class="form-control input-sm">
                                <form:option value="NONE" label="--- Select ---" />
                                <form:options items="${engineTypes}" itemValue="id" itemLabel="name"/>
                            </form:select>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="form-group col-md-12">
                        <label class="col-md-3 control-lable" for="transmission">Transmission</label>
                        <div class="col-md-7">
                            <form:select path="autoDto.idTransmission" id="transmission" class="form-control input-sm">
                                <form:option value="NONE"  label="--- Select ---" />
                                <form:options items="${transmissions}" itemValue="id" itemLabel="name"/>
                            </form:select>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="form-group">
                        <div class="col-lg-10 col-lg-offset-5">
                            <input type="submit" value="Create" class="btn btn-primary"/>
                            <a href="<c:url value='/adverts-own'/>" class="btn">Cancel</a>
                        </div>
                    </div>
                </div>
                <input type="hidden" name="${_csrf.parameterName}"  value="${_csrf.token}" />
            </form:form>
        </div>
    </div>
</div>

</body>
</html>
