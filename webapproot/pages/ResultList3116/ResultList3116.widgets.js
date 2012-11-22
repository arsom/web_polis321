ResultList3116.widgets = {
	layoutBox1: ["wm.Layout", {"height":"100%","horizontalAlign":"left","verticalAlign":"top","width":"100%"}, {}, {
		panel12: ["wm.Panel", {"height":"100%","horizontalAlign":"left","verticalAlign":"top","width":"100%"}, {}, {
			panel18: ["wm.Panel", {"height":"30px","horizontalAlign":"left","layoutKind":"left-to-right","verticalAlign":"top","width":"100%"}, {}, {
				picture7: ["wm.Picture", {"border":"0","height":"22px","source":"resources/images/logos/bulet_arrow.png","width":"38px"}, {}],
				label1: ["wm.Label", {"_classes":{"domNode":["wm_FontSizePx_14px"]},"border":"0","caption":"ข้อมูลทรัพย์หาย","padding":"4"}, {"onclick":"navCallResult"}],
				panel20: ["wm.Panel", {"height":"100%","horizontalAlign":"right","layoutKind":"left-to-right","padding":"0,18,0,0","verticalAlign":"middle","width":"100%"}, {}, {
					pnlNavigaleft: ["wm.Panel", {"height":"40px","horizontalAlign":"left","verticalAlign":"top","width":"36px"}, {}],
					pnlNavigaRight: ["wm.Panel", {"height":"40px","horizontalAlign":"left","verticalAlign":"top","width":"36px"}, {}]
				}]
			}],
			panel19: ["wm.Panel", {"height":"100%","horizontalAlign":"left","layoutKind":"left-to-right","padding":"0,18,18,18","verticalAlign":"top","width":"100%"}, {}, {
				dojoGrid1: ["wm.DojoGrid", {"columns":[{"id":"customField","isCustomField":true,"expression":"","show":true,"width":"20px","title":"<input type='checkbox'>","align":"center","formatFunc":"dojoGrid1CustomFieldFormat"},{"show":false,"id":"astId","title":"AstId","width":"100%","displayType":"Text","noDelete":true,"align":"left","formatFunc":""},{"show":true,"id":"astNO","title":"หมายเลขปืน","width":"100px","displayType":"Text","noDelete":true,"align":"center","formatFunc":""},{"show":false,"id":"astSEQ","title":"AstSEQ","width":"80px","displayType":"Number","noDelete":true,"align":"right","formatFunc":""},{"show":false,"id":"caseNo","title":"CaseNo","width":"80px","displayType":"Number","noDelete":true,"align":"right","formatFunc":""},{"show":false,"id":"caseOff","title":"CaseOff","width":"100%","displayType":"Text","noDelete":true,"align":"left","formatFunc":""},{"show":false,"id":"caseY","title":"CaseY","width":"80px","displayType":"Number","noDelete":true,"align":"right","formatFunc":""},{"show":true,"id":"gunNo","title":"เครื่องหมายทะเบียนปืน","width":"100%","displayType":"Text","noDelete":true,"align":"center","formatFunc":""},{"show":true,"id":"stypeName","title":"ชนิดปืน","width":"70px","displayType":"Text","noDelete":true,"align":"center","formatFunc":""},{"show":true,"id":"makerName","title":"ยี่ห้อ/ผู้ผลิต","width":"100px","displayType":"Text","noDelete":true,"align":"center","formatFunc":""},{"id":"customField1","isCustomField":true,"expression":"","show":true,"width":"100px","title":"เลขที่คดี/ปี","align":"center","formatFunc":"dojoGrid1CustomField1Format"},{"show":true,"id":"orgName","title":"สน./สภอ.เจ้าของคดี","width":"100%","displayType":"Text","noDelete":true,"align":"center","formatFunc":""},{"show":true,"id":"lname","title":"เจ้าของ","width":"120px","displayType":"Text","noDelete":true,"align":"center","formatFunc":""}],"height":"100%","localizationStructure":{},"margin":"4"}, {"onSelectionChange":"app.navCallResult"}, {
					binding: ["wm.Binding", {}, {}, {
						wire: ["wm.Wire", {"expression":undefined,"source":"app.wsWeaponListGetLostAssetList.returns","targetProperty":"dataSet"}, {}]
					}]
				}]
			}]
		}]
	}]
}