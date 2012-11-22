dojo.declare("Search_p", wm.Page, {
	start: function() {
		try {            
            if(app.varSource.getValue("dataValue") != ""){
                this.pageShowSearch.setValue("pageName", "Polis" + app.varGroup.getValue("dataValue"));
                this.linktopage();
            }
			
		} catch(e) {
			app.toastError(this.name + ".start() Failed: " + e.toString()); 
		}
	},
  serStartAppSuccess: function(inSender, inDeprecated) {
	  try {
            if(app.varSource.getValue("dataValue") == ""){
                app.varGroup.setValue("dataValue", this.serStartApp.getItem(0).getValue("group"));
                this.linktopage();
            }
		  
	  } catch(e) {
		  console.error('ERROR IN serStartAppSuccess: ' + e); 
	  } 
  },
  linktopage: function(){
        this.pageShowSearch.setValue("pageName", "Polis" + app.varGroup.getValue("dataValue"));
        dojo.connect(this.pnlsearch.domNode, "onclick", this, function(){
            app.varSelSource.setValue("dataValue", app.varSource.getValue("dataValue").substring(0, 2));
            
            wm.Page.getPage("Web_polis_menu_footer").pnliconpicOnClick1();
            
           this.serInsertLogNew.update();
            app.navCallSearchResult.update();
        });
  },
  lfInsertDataSuccess: function(inSender, inData) {
	  try {
		  alert(1);
		  
	  } catch(e) {
		  console.error('ERROR IN lfInsertDataSuccess: ' + e); 
	  } 
  },
  _end: 0
});