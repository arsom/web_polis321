ResultList2017.widgets = {
	layoutBox1: ["wm.Layout", {"height":"100%","horizontalAlign":"left","verticalAlign":"top","width":"100%"}, {}, {
		panel12: ["wm.Panel", {"height":"100%","horizontalAlign":"left","verticalAlign":"top","width":"100%"}, {}, {
			panel18: ["wm.Panel", {"height":"30px","horizontalAlign":"left","layoutKind":"left-to-right","verticalAlign":"top","width":"100%"}, {}, {
				picture7: ["wm.Picture", {"border":"0","height":"22px","source":"resources/images/logos/bulet_arrow.png","width":"38px"}, {}],
				label1: ["wm.Label", {"_classes":{"domNode":["wm_FontSizePx_14px"]},"border":"0","caption":"ข้อมูลอุบัติเหตุจราจร","padding":"4"}, {"onclick":"navCallResult"}],
				panel20: ["wm.Panel", {"height":"100%","horizontalAlign":"right","layoutKind":"left-to-right","padding":"0,18,0,0","verticalAlign":"middle","width":"100%"}, {}, {
					pnlNavigaleft: ["wm.Panel", {"height":"40px","horizontalAlign":"left","verticalAlign":"top","width":"36px"}, {}],
					pnlNavigaRight: ["wm.Panel", {"height":"40px","horizontalAlign":"left","verticalAlign":"top","width":"36px"}, {}]
				}]
			}],
			panel19: ["wm.Panel", {"height":"100%","horizontalAlign":"left","layoutKind":"left-to-right","padding":"0,18,18,18","verticalAlign":"top","width":"100%"}, {}, {
				dojoGrid1: ["wm.DojoGrid", {"columns":[{"id":"customField1","isCustomField":true,"expression":"","show":true,"width":"20px","title":"<input type='checkbox'>","align":"center","formatFunc":"dojoGrid1CustomField1Format"},{"id":"customField","isCustomField":true,"expression":"","show":true,"width":"100%","title":"เลขคดี จร./ปี","align":"center","formatFunc":"dojoGrid1CustomFieldFormat"},{"show":true,"id":"orgName","title":"หน่วยงาน","width":"200px","displayType":"Text","noDelete":true,"align":"center","formatFunc":""},{"show":true,"id":"name","title":"ชื่อ-สกุล","width":"100%","displayType":"Text","noDelete":true,"align":"center","formatFunc":""},{"show":true,"id":"sex","title":"เพศ","width":"30px","displayType":"Text","noDelete":true,"align":"center","formatFunc":""},{"show":true,"id":"carPerAge","title":"อายุ","width":"40px","displayType":"Text","noDelete":true,"align":"center","formatFunc":""},{"show":false,"id":"carPerCard","title":"CarPerCard","width":"100%","displayType":"Text","noDelete":true,"align":"left","formatFunc":""},{"show":true,"id":"nationName","title":"สัญชาติ","width":"50px","displayType":"Text","noDelete":true,"align":"center","formatFunc":""},{"show":true,"id":"driveSta","title":"สถานะ","width":"70px","displayType":"Text","noDelete":true,"align":"center","formatFunc":""},{"show":true,"id":"carPlate","title":"ทะเบียนรถ","width":"100px","displayType":"Text","noDelete":true,"align":"center","formatFunc":""},{"show":false,"id":"carSEQ","title":"CarSEQ","width":"100%","displayType":"Text","noDelete":true,"align":"left","formatFunc":""},{"show":false,"id":"cgtAccideCode","title":"CgtAccideCode","width":"100%","displayType":"Text","noDelete":true,"align":"left","formatFunc":""},{"show":false,"id":"cgtAccideYY","title":"CgtAccideYY","width":"100%","displayType":"Text","noDelete":true,"align":"left","formatFunc":""},{"show":false,"id":"orgCode","title":"OrgCode","width":"100%","displayType":"Text","noDelete":true,"align":"left","formatFunc":""}],"height":"100%","margin":"4"}, {}, {
					binding: ["wm.Binding", {}, {}, {
						wire: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleListGetAccidentCarList.returns","targetProperty":"dataSet"}, {}]
					}]
				}]
			}]
		}]
	}]
}