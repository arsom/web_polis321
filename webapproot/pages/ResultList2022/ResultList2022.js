dojo.declare("ResultList2022", wm.Page, {
	start: function() {
		try {
			
			
		} catch(e) {
			app.toastError(this.name + ".start() Failed: " + e.toString()); 
		}
	},

	dojoGrid1CustomField1Format: function( inValue, rowId, cellId, cellField, cellObj, rowObj) {
	  try {
            return "<input type='checkbox' name='"+rowId+"'>";		  
		  
	  } catch(e) {
		  console.error('ERROR IN dojoGrid1CustomField1Format: ' + e); 
	  } 
  },
  dojoGrid1CustomFieldFormat: function( inValue, rowId, cellId, cellField, cellObj, rowObj) {
	  try {
            return (rowObj.plate+" "+rowObj.provName);		  
		  
	  } catch(e) {
		  console.error('ERROR IN dojoGrid1CustomFieldFormat: ' + e); 
	  } 
  },
  _end: 0
});