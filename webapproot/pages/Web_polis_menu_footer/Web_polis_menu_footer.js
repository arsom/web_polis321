dojo.declare("Web_polis_menu_footer", wm.Page, {
    source: [],
	start: function() {
		try {
            if(app.varSource.getValue("dataValue") != ""){
                this.source = app.varSource.getValue("dataValue").split(",");
                this.createcomponent();
            }
            
		} catch(e) {
			app.toastError(this.name + ".start() Failed: " + e.toString()); 
		}
	},

	serStartAppSuccess: function(inSender, inDeprecated) {
	  try {
            if(app.varSource.getValue("dataValue") == ""){
                app.varGroup.setValue("dataValue", this.serStartApp.getItem(0).getValue("group"));
                
                var getsourte = this.serStartApp.getItem(0).getValue("source");
                var varsourt = "";
                for(i = 0; i < getsourte.length; i = i + 2){
                    this.source.push(getsourte.substring(i, i+2));
                    varsourt += getsourte.substring(i, i+2) + ",";
                }
                app.varSource.setValue("dataValue", varsourt.substring(0, varsourt.length-1));
                this.createcomponent();
            }
		  
	  } catch(e) {
		  console.error('ERROR IN serStartAppSuccess: ' + e); 
	  } 
  },
  pnliconpicOnClick:function(index,i){
        dojo.connect(index, "onclick", this, function(){
            for(j=0;j<this.source.length;j++){
                $("div[id$=pnliconpointer" + j + "]").removeClass("pnlpointertop");
                $("div[id$=pnliconresult" + j + "]").removeClass("pnlpointerbottom");
//            $("div[id$=pnliconresult" + i + "]").addClass("pnliconresult");
            }
            $("div[id$=pnliconpointer" + i + "]").addClass("pnlpointertop");
            $("div[id$=pnliconresult" + i + "]").addClass("pnlpointerbottom");
        wm.Page.getPage("Search_p").panel18.setShowing(false);
        wm.Page.getPage("Search_p").panel13.setShowing(false);
        app.varSelSource.setValue("dataValue",app.varSource.getValue("dataValue").split(",")[i]);
        wm.Page.getPage("Search_p").pageShowSearch.setPageName("ResultList"+app.varGroup.getValue("dataValue")+app.varSource.getValue("dataValue").split(",")[i]);
          
        }); 
        
  },
   pnliconpicOnClick1:function(){
        $("div[id$=pnliconpointer" + 0 + "]").addClass("pnlpointertop");
        $("div[id$=pnliconresult" + 0 + "]").addClass("pnlpointerbottom");
        wm.Page.getPage("Search_p").panel18.setShowing(false);
        wm.Page.getPage("Search_p").panel13.setShowing(false);
        
        wm.Page.getPage("Search_p").pageShowSearch.setPageName("ResultList"+app.varGroup.getValue("dataValue")+app.varSource.getValue("dataValue").split(",")[0]);
  },
  
  createcomponent: function(){
        this.pnliconpointer.setShowing(false);
        this.pnliconresult.setShowing(false);
        this.lblresult.setShowing(false);
        this.picicon.setShowing(false);
        
        var pnlpointer = [];
        var pnlresult = [];
        var pnliconpic = [];
        var lblresult = [];
        for(i = 0; i < this.source.length; i++){
            pnlpointer[i] = this.pnlpointer.createComponent("pnliconpointer" + i, "wm.Panel", {width:"140px", height:"100%"});
            pnlresult[i] = this.pnlshowresult.createComponent("pnliconresult" + i, "wm.Panel", {width:"140px", height:"100%", 
                horizontalAlign:"center", verticalAlign:"bottom"});
            
//            if(i == 0){
//                $("div[id$=pnliconpointer" + i + "]").addClass("pnlpointertop");
//                $("div[id$=pnliconresult" + i + "]").addClass("pnlpointerbottom");
//            }
//            else{
                $("div[id$=pnliconresult" + i + "]").addClass("pnliconresult");
//            }
            
            lblresult[i] = pnlresult[i].createComponent("lblresult" + i, "wm.Label", {width:"60px", height:"23px", caption:"", align:"center"});
            lblresult[i].domNode.style.color = "#FFFFFF";
            
            pnliconpic[i] = this.pnliconpic.createComponent("picicon" + i, "wm.Picture", {width:"140px", height:"100%",
                source:"services/sevFileTransfer.download?method=getPhoto&id=" + this.source[i] + "&base=DAT_SOURCE_C&action=SOURCE_IMG_A"});
            this.pnliconpicOnClick(pnliconpic[i],i);
        }
        
        this.pnlpointer.reflow();
        this.pnlshowresult.reflow();
        this.pnliconpic.reflow();
  },
  _end: 0
});