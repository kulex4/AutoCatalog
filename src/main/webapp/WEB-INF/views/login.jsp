<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Login page</title>
    <script src="/static/js/libs/jquery/jquery.min.js"></script>
    <script src="/static/bootstrap/dist/js/bootstrap.min.js"></script>
    <link rel="stylesheet" type="text/css" href="/static/bootstrap/dist/css/bootstrap.min.css" media="screen" />
    <link rel="stylesheet" type="text/css" href="/static/bootstrap/dist/css/bootstrap-responsive.min.css" media="screen" />
</head>

<body>
<div class="container-fluid">
    <div class="row-fluid">
        <div class="span4 offset4">
            <div class="signin">
                <div class="well">
                    <c:url var="loginUrl" value="/login" />
                    <form action="${loginUrl}" method="post">
                        <c:if test="${param.error != null}">
                            <div class="alert alert-danger">
                                <p>Invalid username and password.</p>
                            </div>
                        </c:if>
                        <c:if test="${param.logout != null}">
                            <div class="alert alert-success">
                                <p>You have been logged out successfully.</p>
                            </div>
                        </c:if>
                        <fieldset>
                            <legend>Authorization</legend>
                            <div class="well" style="padding: 50px;">
                                <div class="row">
                                    <label for="username" class="col-lg-2 control-label">Login</label>
                                    <div class="col-lg-10">
                                        <input type="text" class="form-control" id="username" name="login" placeholder="Enter Username" required>
                                    </div>
                                </div>
                                <br/>
                                <div class="row">
                                    <label for="password" class="col-lg-2 control-label">Password</label>
                                    <div class="col-lg-10">
                                        <input type="password" class="form-control" id="password" name="password" placeholder="Enter Password" required>
                                    </div>
                                </div>
                                <br/>
                                <div class="row">
                                    <div class="form-group">
                                        <div class="col-lg-10 col-lg-offset-5">
                                            <input type="submit" class="btn btn-primary" value="Log in">
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <input type="hidden" name="${_csrf.parameterName}"  value="${_csrf.token}" />
                        </fieldset>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>