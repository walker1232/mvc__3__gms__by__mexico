"use strict";


var app = app || {};
app = {
		init : x => {
			console.log('step 1 ::');
			app.session.ctx(x);
			app.onCreate();
	    },
	    onCreate : ()=>{
	    	console.log('step 3 ::');
	    	app.setContenView();
	    	$('#login_btn').click(()=>{
	    		/*alert(app.session.path('ctx')+'/move');*/
	    		console.log(app.x()+'/move');
	    		/*alert(app.x()+'/move');*/
	    		location.href = app.x()+'/move/public/member/login';
	    	});
	    	$('#join_btn').click(()=>{
	    		alert(app.x()+'/move');
	    		location.href = app.x()+'/move/public/member/add';
	    	});
	    	$('#login_form_btn').click(()=>{
	    		alert('로그인 버튼 클릭');
	    		location.href = app.x()+'/member/login';
	    	});
	    	$('#join_form_btn').click(()=>{
	    		alert('회원가입 버튼 클릭');
	    		location.href = app.x()+'/move/auth/member/auth';
	    	});
	    	$('#logout_btn').click(()=>{
	    		alert('로그아웃 버튼 클릭');
	    		location.href = app.x()+'/member/logout';
	    	});
	    },
	    setContenView : ()=>{
	    	console.log('step 4 ::'+app.session.path('js'));
	    }
};
app.session = {
		ctx : x =>{
			console.log('step 2 ::'+x);
			sessionStorage.setItem('ctx', x);
			sessionStorage.setItem('js', x+'/resources/js');
			sessionStorage.setItem('css', x+'/resources/css');
			sessionStorage.setItem('img', x+'/resources/img');
		},
		path : x =>{
			return sessionStorage.getItem(x);
		}
};
app.x = ()=>{
	return app.session.path('ctx');
};
app.j = ()=>{
	return app.session.path('js');
};
app.c = ()=>{
	return app.session.path('css');
};
app.i = ()=>{
	return app.session.path('img');
};