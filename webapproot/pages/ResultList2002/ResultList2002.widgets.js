ResultList2002.widgets = {
	layoutBox1: ["wm.Layout", {"height":"100%","horizontalAlign":"left","verticalAlign":"top","width":"966px"}, {}, {
		panel12: ["wm.Panel", {"height":"100%","horizontalAlign":"left","verticalAlign":"top","width":"100%"}, {}, {
			panel18: ["wm.Panel", {"height":"30px","horizontalAlign":"left","layoutKind":"left-to-right","verticalAlign":"top","width":"100%"}, {}, {
				picture7: ["wm.Picture", {"border":"0","height":"22px","source":"resources/images/logos/bulet_arrow.png","width":"38px"}, {}],
				label1: ["wm.Label", {"_classes":{"domNode":["wm_FontSizePx_14px"]},"border":"0","caption":"ข้อมูลบุคคลท้องถิ่น","padding":"4"}, {"onclick":"navCallResult"}],
				panel20: ["wm.Panel", {"height":"100%","horizontalAlign":"right","layoutKind":"left-to-right","padding":"0,18,0,0","verticalAlign":"middle","width":"100%"}, {}, {
					pnlNavigaleft: ["wm.Panel", {"height":"40px","horizontalAlign":"left","verticalAlign":"top","width":"36px"}, {}],
					pnlNavigaRight: ["wm.Panel", {"height":"40px","horizontalAlign":"left","verticalAlign":"top","width":"36px"}, {}]
				}]
			}],
			panel19: ["wm.Panel", {"height":"100%","horizontalAlign":"left","layoutKind":"left-to-right","padding":"0,18,18,18","verticalAlign":"top","width":"100%"}, {}, {
				dojoGrid1: ["wm.DojoGrid", {"columns":[{"id":"customField","isCustomField":true,"expression":"","show":true,"width":"20px","formatFunc":"dojoGrid1CustomFieldFormat","align":"center","title":" <input type='checkbox'>"},{"show":true,"id":"plate","title":"ทะเบียนรถยนต์","width":"120px","displayType":"Text","noDelete":true,"align":"center","formatFunc":""},{"show":true,"id":"provDesc","title":"จังหวัด","width":"100%","displayType":"Text","noDelete":true,"align":"center","formatFunc":""},{"show":true,"id":"brandDesc","title":"ยี่ห้อ","width":"70px","displayType":"Text","noDelete":true,"align":"center","formatFunc":""},{"show":true,"id":"perId","title":"เลขประจำตัวประชาชน","width":"140px","displayType":"Text","noDelete":true,"align":"center","formatFunc":""},{"show":true,"id":"name","title":"ชื่อ-สกุลเจ้าของรถ","width":"120px","displayType":"Text","noDelete":true,"align":"center","formatFunc":""},{"show":true,"id":"sex","title":"เพศ","width":"40px","displayType":"Text","noDelete":true,"align":"center","formatFunc":""},{"show":true,"id":"grpDesc","title":"กลุ่มบุคคล","width":"100%","displayType":"Text","noDelete":true,"align":"center","formatFunc":""},{"show":false,"id":"orgCde","title":"OrgCde","width":"100%","displayType":"Text","noDelete":true,"align":"center","formatFunc":""},{"show":true,"id":"orgName","title":"หน่วยงาน","width":"120px","displayType":"Text","noDelete":true,"align":"center","formatFunc":""},{"show":false,"id":"perCde","title":"PerCde","width":"100%","displayType":"Text","noDelete":true,"align":"center","formatFunc":""},{"show":false,"id":"serialNo","title":"SerialNo","width":"100%","displayType":"Text","noDelete":true,"align":"center","formatFunc":""}],"height":"100%","localizationStructure":{},"margin":"4"}, {"onSelectionChange":"app.navCallResult"}, {
					binding: ["wm.Binding", {}, {}, {
						wire: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleListGetPersonList.returns","targetProperty":"dataSet"}, {}]
					}]
				}]
			}]
		}]
	}]
}