<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>


<head>
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <!------ Include the above in your HEAD tag ---------->
    <link rel="stylesheet" type="text/css" href="<c:url value='/static/css/style.css' />"/>
    <%--    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/style.css" type="text/css">--%>

</head>

<div class="wrapper fadeInDown">
    <div id="formContent">
        <!-- Tabs Titles -->

        <!-- Icon -->
        <div class="fadeIn first">
            <img src="http://danielzawadzki.com/codepen/01/icon.svg" id="icon" alt="User Icon"/>
        </div>
        <!-- Login Form -->
<%--        <form>--%>
<%--            <input type="text" id="login" class="fadeIn second" name="login" placeholder="login">--%>
<%--            <input type="text" id="password" class="fadeIn third" name="login" placeholder="password">--%>
<%--            <input type="submit" class="fadeIn fourth" value="Log In">--%>
<%--        </form>--%>

<%--        <form:form action="login" method="post">--%>
        <form:form action="formLogin" method="post">

            <!-- need to associate this data with customer id -->
            <%--            <form:hidden path="id" />--%>

<%--            <label for="userId" class="col-md-3 control-label">userId</label>--%>
<%--            <form:input type="text" placeholder="login" path="userId" cssClass="fadeIn second"/>--%>
            <form:input type="text" placeholder="login" path="account" cssClass="fadeIn second"/>

<%--            <div class="form-group">--%>
<%--                <!-- Button -->--%>
<%--                <div class="col-md-offset-3 col-md-9">--%>
<%--                    <form:button cssClass="btn btn-primary">Submit</form:button>--%>
<%--                </div>--%>
<%--            </div>--%>
        </form:form>

        <!-- Remind Passowrd -->
        <div id="formFooter">
            <a class="underlineHover" href="#">Forgot Password?</a> or <a class="underlineHover" href="#">signUp</a>
        </div>

    </div>
</div>