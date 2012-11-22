dojo.declare("ResultList6002", wm.Page, {
	start: function() {
		try {
			
			
		} catch(e) {
			app.toastError(this.name + ".start() Failed: " + e.toString()); 
		}
	},

	dojoGrid1CustomFieldFormat: function( inValue, rowId, cellId, cellField, cellObj, rowObj) {
	  try {
          var age = null;
          if(rowObj.birthDte != null){
            dateNow = new Date();
            var yearNow = dateNow.getFullYear()+543;
            var age = (yearNow - rowObj.birthDte.substr(0,4));
          }
          return age;	  
		  
	  } catch(e) {
		  console.error('ERROR IN dojoGrid1CustomFieldFormat: ' + e); 
	  } 
  },
  dojoGrid1CustomField1Format: function( inValue, rowId, cellId, cellField, cellObj, rowObj) {
	  try {
            return (rowObj.addrDesc31+" "+rowObj.addrDesc32);	  
		  
	  } catch(e) {
		  console.error('ERROR IN dojoGrid1CustomField1Format: ' + e); 
	  } 
  },
  dojoGrid1CustomField2Format: function( inValue, rowId, cellId, cellField, cellObj, rowObj) {
	  try {
		   return (rowObj.firstTnme+" "+rowObj.lastTnme);
		  
	  } catch(e) {
		  console.error('ERROR IN dojoGrid1CustomField2Format: ' + e); 
	  } 
  },
  dojoGrid1SexFormat: function( inValue, rowId, cellId, cellField, cellObj, rowObj) {
	  try {
            if(rowObj.sex=="1"){
                rowObj.sex= "ชาย";
            }else{
                rowObj.sex= "หญิง";    
            }
            return rowObj.sex;
	  } catch(e) {
		  console.error('ERROR IN dojoGrid1SexFormat: ' + e); 
	  } 
  },
  dojoGrid1CustomField3Format: function( inValue, rowId, cellId, cellField, cellObj, rowObj) {
	  try {
        return "<input type='checkbox' name ='"+rowId+"'>";		  
		  
	  } catch(e) {
		  console.error('ERROR IN dojoGrid1CustomField3Format: ' + e); 
	  } 
  },
  _end: 0
});