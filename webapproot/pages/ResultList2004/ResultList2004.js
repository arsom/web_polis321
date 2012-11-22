dojo.declare("ResultList2004", wm.Page, {
	start: function() {
		try {
			
			
		} catch(e) {
			app.toastError(this.name + ".start() Failed: " + e.toString()); 
		}
	},

	dojoGrid1CustomFieldFormat: function( inValue, rowId, cellId, cellField, cellObj, rowObj) {
	  try {
		  return (rowObj.crimeNo+"/"+rowObj.crimeYear);
		  
	  } catch(e) {
		  console.error('ERROR IN dojoGrid1CustomFieldFormat: ' + e); 
	  } 
  },

  dojoGrid1CustomField1Format: function( inValue, rowId, cellId, cellField, cellObj, rowObj) {
	  try {
		  return (rowObj.occTitle+" "+rowObj.occFname+" "+rowObj.occLname);
		  
	  } catch(e) {
		  console.error('ERROR IN dojoGrid1CustomField1Format: ' + e); 
	  } 
  },
  dojoGrid1CustomField2Format: function( inValue, rowId, cellId, cellField, cellObj, rowObj) {
	  try {
        return (rowObj.vehicleRegNo1+"-"+rowObj.vehicleRegNo2);	  
		  
	  } catch(e) {
		  console.error('ERROR IN dojoGrid1CustomField2Format: ' + e); 
	  } 
  },
  dojoGrid1CustomField3Format: function( inValue, rowId, cellId, cellField, cellObj, rowObj) {
	  try {
		  return "<input type = 'checkbox' name='"+rowId+"'>";
		  
	  } catch(e) {
		  console.error('ERROR IN dojoGrid1CustomField3Format: ' + e); 
	  } 
  },
  dojoGrid1SelectionChange1: function(inSender) {
	  try {
		  app.wsVehicleDetailGetCrime.update();
          app.wsVehicleDetailGetCrimeEXT.update();
		  
	  } catch(e) {
		  console.error('ERROR IN dojoGrid1SelectionChange1: ' + e); 
	  } 
  },
  _end: 0
});