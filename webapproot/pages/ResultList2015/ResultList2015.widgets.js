ResultList2015.widgets = {
	liveVariable1: ["wm.LiveVariable", {"liveSource":""}, {}],
	layoutBox1: ["wm.Layout", {"height":"100%","horizontalAlign":"left","verticalAlign":"top","width":"100%"}, {}, {
		panel12: ["wm.Panel", {"height":"100%","horizontalAlign":"left","verticalAlign":"top","width":"100%"}, {}, {
			panel18: ["wm.Panel", {"height":"30px","horizontalAlign":"left","layoutKind":"left-to-right","verticalAlign":"top","width":"100%"}, {}, {
				picture7: ["wm.Picture", {"border":"0","height":"22px","source":"resources/images/logos/bulet_arrow.png","width":"38px"}, {}],
				label1: ["wm.Label", {"_classes":{"domNode":["wm_FontSizePx_14px"]},"border":"0","caption":"ข้อมูลรถหาย","padding":"4"}, {"onclick":"navCallResult"}],
				panel20: ["wm.Panel", {"height":"100%","horizontalAlign":"right","layoutKind":"left-to-right","padding":"0,18,0,0","verticalAlign":"middle","width":"100%"}, {}, {
					pnlNavigaleft: ["wm.Panel", {"height":"40px","horizontalAlign":"left","verticalAlign":"top","width":"36px"}, {}],
					pnlNavigaRight: ["wm.Panel", {"height":"40px","horizontalAlign":"left","verticalAlign":"top","width":"36px"}, {}]
				}]
			}],
			panel19: ["wm.Panel", {"height":"100%","horizontalAlign":"left","layoutKind":"left-to-right","padding":"0,18,18,18","verticalAlign":"top","width":"100%"}, {}, {
				dojoGrid1: ["wm.DojoGrid", {"columns":[{"show":false,"id":"name","title":"Name","width":"100%","displayType":"Text","noDelete":true,"align":"left","formatFunc":""},{"id":"customField2","isCustomField":true,"expression":"","show":true,"width":"20px","title":"<input type='checkbox'>","align":"center","formatFunc":"dojoGrid1CustomField2Format"},{"show":true,"id":"org","title":"สน.เจ้าของคดี","width":"100%","displayType":"Text","noDelete":true,"align":"center","formatFunc":""},{"id":"customField","isCustomField":true,"expression":"","show":true,"width":"100%","title":"เลขที่คดี/ปี","align":"center","formatFunc":"dojoGrid1CustomFieldFormat"},{"show":true,"id":"police","title":"พนักงานสอบสวน","width":"100%","displayType":"Text","noDelete":true,"align":"center","formatFunc":""},{"show":true,"id":"carPlate","title":"ทะเบียนรถ","width":"100%","displayType":"Text","noDelete":true,"align":"center","formatFunc":""},{"show":true,"id":"provDesc","title":"จังหวัด","width":"100%","displayType":"Text","noDelete":true,"align":"center","formatFunc":""},{"show":true,"id":"brandDesc","title":"ยี่ห้อ","width":"100%","displayType":"Text","noDelete":true,"align":"center","formatFunc":""},{"show":false,"id":"carId","title":"CarId","width":"100%","displayType":"Text","noDelete":true,"align":"left","formatFunc":""},{"show":true,"id":"carNumbody","title":"เลขตัวถัง","width":"100%","displayType":"Text","noDelete":true,"align":"center","formatFunc":""},{"show":false,"id":"carSEQ","title":"CarSEQ","width":"80px","displayType":"Number","noDelete":true,"align":"right","formatFunc":""},{"show":false,"id":"caseNo","title":"CaseNo","width":"80px","displayType":"Number","noDelete":true,"align":"right","formatFunc":""},{"show":false,"id":"caseOff","title":"CaseOff","width":"100%","displayType":"Text","noDelete":true,"align":"left","formatFunc":""},{"show":false,"id":"caseY","title":"CaseY","width":"80px","displayType":"Number","noDelete":true,"align":"right","formatFunc":""},{"id":"customField1","isCustomField":true,"expression":"","show":true,"width":"100%","title":"แหล่งข้อมูล","align":"center"}],"height":"100%","margin":"4"}, {}, {
					binding: ["wm.Binding", {}, {}, {
						wire: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleListGetLostCarList.returns","targetProperty":"dataSet"}, {}]
					}]
				}]
			}]
		}]
	}]
}