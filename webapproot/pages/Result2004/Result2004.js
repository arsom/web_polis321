dojo.declare("Result2004", wm.Page, {
	start: function() {
		try {
            app.wsVehicleDetailGetCrime.update();
            app.wsVehicleDetailGetCrimeEXT.update();
	        app.wsVehicleDetailGetCrime.clearData();
            app.wsVehicleDetailGetCrimeEXT.clearData();
		} catch(e) {
			app.toastError(this.name + ".start() Failed: " + e.toString()); 
		}
	},


  lblresult7ReadOnlyNodeFormat: function(inSender, inValue) {
	  try {
        var mydate= new Date(inSender);
        return dojo.date.locale.format(mydate, {selector:"date", datePattern:"dd/MM/yyyy" });		  
		  
	  } catch(e) {
		  console.error('ERROR IN lblresult7ReadOnlyNodeFormat: ' + e); 
	  } 
  },
  _end: 0
});