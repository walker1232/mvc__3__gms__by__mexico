<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- Navigation -->
    <nav class="navbar navbar-expand-lg navbar-light fixed-top" id="mainNav">
      <div class="container">
        <a class="navbar-brand" href="index.html">Start Bootstrap</a>
        <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
          Menu
          <i class="fa fa-bars"></i>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
          <ul class="navbar-nav ml-auto">
            <li class="nav-item">
              <a class="nav-link" href="index.html">${user.name}님의 홈</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" id="retrieve_btn">mypage</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="post.html">Sample Post</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="contact.html">Contact</a>
            </li>
            <li class="nav-item">
            	<a class="nav-link" id="logout_btn" >Logout</a>
            </li>
          </ul>
        </div>
      </div>
    </nav>
    <script>
    	user.session({
    		memID : '${user.memID}',
    		name : '${user.name}',
    		gender : '${user.gender}',
    		age : '${user.age}',
    		roll : '${user.roll}',
    		teamID : '${user.teamID}'
    	});
    	/* app.user.set('memID') */
    </script>