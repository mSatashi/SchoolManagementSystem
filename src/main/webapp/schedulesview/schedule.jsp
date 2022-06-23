<%@ page import="com.example.schoolmanagementsystem.controller.ScheduleController" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: mSatashi
  Date: 6/22/2022
  Time: 8:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Class Management System</title>
    <style>
        @import "../assets/css/uikit.min.css";
    </style>
    <script src="../assets/js/uikit.min.js"></script>
    <script src="../assets/js/uikit-icons.min.js"></script>

</head>
<body>
<div class="uk-position-medium">
    <div style="display: flex; flex-direction: row">
        <c:forEach items="${listdays}" var="day">
            <div style="flex-direction: column">
                <div class="uk-margin-small-right">
                    <h4 class="uk-text-bold uk-text-center">${day.dayname}</h4>
                    <hr class="uk-divider-small">
                    <c:forEach items="${listschedules}" var="schedule">
                        <c:if test="${schedule.day == day.dayid}">
                            <div class ="uk-card uk-card-small uk-card-hover uk-card-default uk-width-small uk-text-center">
                                <h4 class = "uk-text-small uk-text-bold">${schedule.schtitle}</h4>
                                <p class="uk-text-small">${schedule.schdesc}</p>
                                <p class="uk-text-meta">${schedule.timestart} - ${schedule.timeend}</p>
                            </div>
                        </c:if>
                    </c:forEach>
                    <!-- This is the anchor -->
                    <a class="uk-button uk-button-primary uk-button-small uk-align-center" href="#add-schedule" >ADD SCHEDULE</a>
                </div>
            </div>
            <!-- This is the modal -->
            <div id="add-schedule" class="uk-modal">
                
            </div>
        </c:forEach>
    </div>
</div>
</body>
</html>
