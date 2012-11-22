dojo.declare("ResultList4215", wm.Page, {
	start: function() {
		try {
	        app.test.setValue("service","WebServiceListLawsuitService");
            app.test.setValue("operation",["getLostCarList","getLostCarListCrime"]);
			
		} catch(e) {
			app.toastError(this.name + ".start() Failed: " + e.toString()); 
		}
	},

	_end: 0
});