dojo.declare("Main", wm.Page, {
	start: function() {
		try {
            this.picHideOnLoad1.setShowing(false);
            this.picHideOnLoad2.setShowing(false);
            
		} catch(e) {
			app.toastError(this.name + ".start() Failed: " + e.toString());
		}
	},
    changpichover: function(index){
        dojo.connect(index.domNode, "onmouseover", this, function(){
            name = index.name.substring(4, index.name.length-4);
            index.setSource("services/sevFileTransfer.download?method=getPhoto&id=" + name + "&base=DAT_GROUP_C&action=GROUP_IMG_O");
            index.domNode.style.cursor = "pointer";
        });
    },
    changpichout: function(index){
        dojo.connect(index.domNode, "onmouseout", this, function(){
            name = index.name.substring(4, index.name.length-4);
            index.setSource("services/sevFileTransfer.download?method=getPhoto&id=" + name + "&base=DAT_GROUP_C&action=GROUP_IMG");
            index.domNode.style.cursor = "default";
        });
    },
    changpicClick: function(index, code, slide){
        dojo.connect(index, "onclick", this, function(){
            var isLevel = 0;
            for(i = 0; i < this.sevSelDatGroupC.getCount(); i++){
                if(this.sevSelDatGroupC.getItem(i).getValue("mom") != null && this.sevSelDatGroupC.getItem(i).getValue("mom") == code){
                    isLevel++;
                    var item = $("div[id$=" + slide[i].name.replace(".", "_") + "]");
                    var left = $("div[id$=" + index.name.replace(".", "_") + "]").css("left");
                    left = parseInt(left.substring(0, left.length - 2));
                    if(isLevel == 1){
                        item.css("top", "-180px").css("left", (left + 10) + "px");
                        item.rotate(5);
                    }
                    if(isLevel == 2){
                        item.css("top", "-380px").css("left", (left + 40) + "px");
                        item.rotate(10);
                    }
                    item.animate({
                        height: "toggle",
                        opacity: "toggle",
                        top: "toggle"
                    }, "fast");
                }
            }
            if(isLevel == 0){
                app.varGroup.setValue("dataValue", code);
                this.app.navCallSubmenu.update();
            }
            this.pnlImgList2.reflow();
        });
    },
  sevSelDatGroupCSuccess: function(inSender, inDeprecated) {
	  try {
        var countresult = this.sevSelDatGroupC.getCount();
        var count = 0;
        for(i = 0; i < countresult; i++) if(this.sevSelDatGroupC.getItem(i).getValue("mom") == null) count++;
        var vm_munu = [];
        var vm_slide = [];
        var pnl = [this.pnlImgList1, this.pnlImgList2];
        var pnllist;
        var vm_list = [0, 1, 4, 5, 2, 3];
        for(i = 0; i < count; i++){
            code = this.sevSelDatGroupC.getItem(vm_list[i]).getValue("code");
            (i < Math.ceil(count/2))? pnllist = pnl[0] : pnllist = pnl[1];
            imgPath = "menu" + code + ".png";
            vm_munu[i] = pnllist.createComponent(imgPath, "wm.Picture", {width:"275px", height:"204px", 
                source:"services/sevFileTransfer.download?method=getPhoto&id=" + code + "&base=DAT_GROUP_C&action=GROUP_IMG"});
            for(j = 0; j < countresult; j++){
                if(code == this.sevSelDatGroupC.getItem(j).getValue("mom")){
                    namecode = "menu" + this.sevSelDatGroupC.getItem(j).getValue("code") + ".png";
                    vm_slide[j] = pnllist.createComponent(namecode, "wm.Picture", {width:"275px", height:"204px", 
                        source:"services/sevFileTransfer.download?method=getPhoto&id=" + 
                        this.sevSelDatGroupC.getItem(j).getValue("code") + "&base=DAT_GROUP_C&action=GROUP_IMG"});
                    this.changpichover(vm_slide[j]);
                    this.changpichout(vm_slide[j]);
                    this.changpicClick(vm_slide[j], this.sevSelDatGroupC.getItem(j).getValue("code"));
                    vm_slide[j].setShowing(false);
                    $("div[id$=" + namecode.replace(".", "_") + "]").hide();
                }
            }
            this.changpichover(vm_munu[i]);
            this.changpichout(vm_munu[i]);
            this.changpicClick(vm_munu[i], code, vm_slide);
        }
        this.pnlImgList1.reflow();
        this.pnlImgList2.reflow();
	  } catch(e) {
		  console.error('ERROR IN sevSelDatGroupCSuccess: ' + e);
	  }
  },
  _end: 0
});