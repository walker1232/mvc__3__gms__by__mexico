"use strict";


var app = app || {};
app = {
		init : x => {
			alert('step 1 ::');
			app.session.ctx(x);
			app.onCreate();
	    },
	    onCreate : ()=>{
	    	alert('step 3 ::');
	    	app.setContenView();
	    },
	    setContenView : ()=>{
	    	alert('step 4 ::'+app.session.path('js'));
	    }
};
app.session = {
		ctx : x =>{
			alert('step 2 ::'+x);
			sessionStorage.setItem('ctx', x);
			sessionStorage.setItem('js', x+'/resources/js');
			sessionStorage.setItem('css', x+'/resources/css');
			sessionStorage.setItem('img', x+'/resources/img');
		},
		path : x =>{
			return sessionStorage.getItem(x);
		}
};