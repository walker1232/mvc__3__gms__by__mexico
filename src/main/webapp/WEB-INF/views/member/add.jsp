<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% String ctx = application.getContextPath(); %>

	<div id="content">
		<h1>회원가입</h1>
	<form id="add_form" name="add_form" >
		ID: <input type="text" name="memID" required><br />
		Name: <input type="text" name="name" required><br />
		Pass: <input type="text" name="password" required><br />
		Ssn : <input type="text" name="ssn" required><br />
		소속팀
		<input type="radio" name="teamID" value="none" checked="checked" />없음
		<input type="radio" name="teamID" value="nolja"/>걍놀자
		<input type="radio" name="teamID" value="jieunHouse"/>지은이네
		<input type="radio" name="teamID" value="turtleKing"/>터틀킹
		<input type="radio" name="teamID" value="codingZzang"/>코딩짱 <br />
		프로젝트역할
		<select name="roll" id="roll">
			<option value="leader">팀장</option>
			<option value="front">프론트개발</option>
			<option value="back">백단개발</option>
			<option value="android">안드로이드개발</option>
			<option value="minfe">민폐</option> <br />
		</select>
		수강과목
		<input type="checkbox" name="subject" value="java" checked="checked"/>Java
		<input type="checkbox" name="subject" value="clang"/>c
		<input type="checkbox" name="subject" value="JSP"/>JSP
		<input type="checkbox" name="subject" value="PHP"/>PHP
		<input type="checkbox" name="subject" value="nodejs"/>NodeJs
		<input type="checkbox" name="subject" value="linux"/>Linux
		<input type="checkbox" name="subject" value="html"/>HTML
		<input type="checkbox" name="subject" value="spring"/>Spring <br />
		<input id="add_submit" type=button value="Join">
	</form>
	</div> <!-- content end -->
	

	
	