dojo.declare("Container_CallResult", wm.Page, {
	start: function() {
		try {
            //this.pageShowResult.setValue("pageName", "Result" + app.varGroup.getValue("dataValue") + app.varSelSource.getValue("dataValue"));
            dojo.connect(this.pnlClose.domNode, "onclick", this, function(){
                app.pageDialog.dismiss();
            });
            this.connect(app.pageDialog, "onPageReady", this, function(){
                this.pageShowResult.setValue("pageName", "Result" + app.varGroup.getValue("dataValue") + app.varSelSource.getValue("dataValue"));
            });
			
		} catch(e) {
			app.toastError(this.name + ".start() Failed: " + e.toString()); 
		}
	},
  _end: 0
});