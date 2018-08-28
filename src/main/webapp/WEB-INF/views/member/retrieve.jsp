<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

	<div id="content">
		<div style="margin: auto" align="center">
	<a id="modify_btn">UPDATE FORM 이동</a>
	<a id="remove_btn">DELETE FORM 이동</a>
		</div>
	<div>

<table style="width:50%; margin: auto" border="1" >
	<tr>
		<td rowspan="3" width="200" height="150"><img src="${img}/${profile}" width="200" height="150"/></td>
		<td>아이디</td>
		<td colspan="2">${user.memID}</td>
	</tr>
	<tr>
		<td>이름</td>
		<td colspan="2">${user.name}</td>
	</tr>
	<tr>
		<td>비번</td>
		<td colspan="2">*******</td>
	</tr>
	<tr>
		<td>나이</td>
		<td>${user.age}</td>
		<td>팀명</td>
		<td>${user.teamID}</td>
	</tr>
	<tr>
		<td>성별</td>
		<td>${user.gender}</td>
		<td>역할</td>
		<td>${user.roll}</td>
	</tr>
</table>
</div>
	</div> <!-- content end -->



