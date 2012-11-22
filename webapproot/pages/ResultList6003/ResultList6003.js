dojo.declare("ResultList6003", wm.Page, {
	start: function() {
		try {
			
			
		} catch(e) {
			app.toastError(this.name + ".start() Failed: " + e.toString()); 
		}
	},

	dojoGrid1CustomField1Format: function( inValue, rowId, cellId, cellField, cellObj, rowObj) {
	  try {
        return "<input type='chcekbox name='"+rowId+"''>";		  
		  
	  } catch(e) {
		  console.error('ERROR IN dojoGrid1CustomField1Format: ' + e); 
	  } 
  },
  _end: 0
});