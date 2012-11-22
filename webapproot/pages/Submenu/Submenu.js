dojo.declare("Submenu", wm.Page, {
    selected: [],
    //group:"",
	start: function() {
		try {
            this.picHideOnLoad1.setShowing(false);
            this.picHideOnLoad2.setShowing(false);
            this.picHideOnLoad3.setShowing(false);
            this.clearSourceData();            
			
		} catch(e) {
			app.toastError(this.name + ".start() Failed: " + e.toString()); 
		}
	},
    clearSourceData: function(){
        this.selected = [];
    },
    changpichover: function(index){
        dojo.connect(index.domNode, "onmouseover", this, function(){
            name = index.name;
            index.setSource("services/sevFileTransfer.download?method=getPhoto&id=" + name + "&base=DAT_SOURCE_C&action=SOURCE_IMG_O");
            index.domNode.style.cursor = "pointer";
        });
    },
    changpichout: function(index, code){
        dojo.connect(index.domNode, "onmouseout", this, function(){
            var posit = this.selected.indexOf(code);
            if(posit >= 0){
                index.setSource("services/sevFileTransfer.download?method=getPhoto&id=" + name + "&base=DAT_SOURCE_C&action=SOURCE_IMG_A");
                return;
            }
            
            name = index.name;
            index.setSource("services/sevFileTransfer.download?method=getPhoto&id=" + name + "&base=DAT_SOURCE_C&action=SOURCE_IMG");
            index.domNode.style.cursor = "default";
        });
    },
    changpicClick: function(index, code, arrObj){
        dojo.connect(index, "onclick", this, function(){
            //alert(this.selected.indexOf(code));
            name = index.name;
            index.setSource("services/sevFileTransfer.download?method=getPhoto&id=" + name + "&base=DAT_SOURCE_C&action=SOURCE_IMG_A");
            var firstCode = this.selected[0];
            for(i=0;i<arrObj.length;i++){
                if(arrObj[i].name == firstCode){
                    firstObj = arrObj[i];
                }
            }
            var posit = this.selected.indexOf(code);
            if(posit >= 0){
                this.selected.splice(posit,1);
            }
            else if(this.selected.length >= 4){
                firstObj.setSource("services/sevFileTransfer.download?method=getPhoto&id=" + firstCode + "&base=DAT_SOURCE_C&action=SOURCE_IMG");
                this.selected.shift();
                this.selected.push(code);
                //alert("คุณได้เลือกแหล่งข้อมูลครบแล้ว");
//                $("<div title='คุณได้เลือกแหล่งข้อมูลครบแล้ว'>ขณะนี้คุณได้เลือกแหล่งข้อมูลครบ 4 อันแล้ว กรุณาเอาอันหนึ่งอันใดออก ถ้าต้องการเลือกใหม่</div>").dialog({
//                	resizable: false,
//        			height:150,
//                    width:380,
//        			modal: true,
//        			buttons: {
//        				"ตกลง": function() {
//        					$(this).dialog("close");
//        				}
//        			}
//        		});
            }
            else this.selected.push(code);
            
            app.varSource.setValue("dataValue", this.selected.toString());
            
        });
    },
	sevGetMathBycodeSuccess: function(inSender, inDeprecated) {
	  try {
            //this.group = app.varGroup.getValue('dataValue');
            //alert('group '+this.group);
            var count = this.sevGetMathBycode.getCount();
            var vm_munu = [];
            var pnl = [this.pnlImgList1, this.pnlImgList2, this.pnlImgList3];
            var pnllist;
            var ceil = Math.ceil(count/3);
            for(i = 0; i < count; i++){
                if(i < ceil) pnllist = pnl[0];
                else if(i < count - Math.floor((count - ceil)/2)) pnllist = pnl[1];
                else pnllist = pnl[2];
                
                imgPath = this.sevGetMathBycode.getItem(i).getValue("sourceCode");
                vm_munu[i] = pnllist.createComponent(imgPath, "wm.Picture", {width:"128px", height:"150px", 
                source:"services/sevFileTransfer.download?method=getPhoto&id=" + imgPath + "&base=DAT_SOURCE_C&action=SOURCE_IMG"});
                this.changpichover(vm_munu[i]);
                this.changpichout(vm_munu[i], this.sevGetMathBycode.getItem(i).getValue("sourceCode"));
                this.changpicClick(vm_munu[i], this.sevGetMathBycode.getItem(i).getValue("sourceCode"),vm_munu);
            }
            this.pnlImgList1.reflow();
            this.pnlImgList2.reflow();
            this.pnlImgList3.reflow();
		  
	  } catch(e) {
		  console.error('ERROR IN sevGetMathBycodeSuccess: ' + e); 
	  } 
  },
  _end: 0
});