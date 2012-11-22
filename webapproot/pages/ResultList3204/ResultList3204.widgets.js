ResultList3204.widgets = {
	layoutBox1: ["wm.Layout", {"height":"100%","horizontalAlign":"left","verticalAlign":"top","width":"100%"}, {}, {
		panel12: ["wm.Panel", {"height":"100%","horizontalAlign":"left","verticalAlign":"top","width":"100%"}, {}, {
			panel18: ["wm.Panel", {"height":"30px","horizontalAlign":"left","layoutKind":"left-to-right","verticalAlign":"top","width":"100%"}, {}, {
				picture7: ["wm.Picture", {"border":"0","height":"22px","source":"resources/images/logos/bulet_arrow.png","width":"38px"}, {}],
				label1: ["wm.Label", {"_classes":{"domNode":["wm_FontSizePx_14px"]},"border":"0","caption":"ข้อมูลคดีอาญา","padding":"4"}, {"onclick":"navCallResult"}],
				panel20: ["wm.Panel", {"height":"100%","horizontalAlign":"right","layoutKind":"left-to-right","padding":"0,18,0,0","verticalAlign":"middle","width":"100%"}, {}, {
					pnlNavigaleft: ["wm.Panel", {"height":"40px","horizontalAlign":"left","verticalAlign":"top","width":"36px"}, {}],
					pnlNavigaRight: ["wm.Panel", {"height":"40px","horizontalAlign":"left","verticalAlign":"top","width":"36px"}, {}]
				}]
			}],
			panel19: ["wm.Panel", {"height":"100%","horizontalAlign":"left","layoutKind":"left-to-right","padding":"0,18,18,18","verticalAlign":"top","width":"100%"}, {}, {
				dojoGrid1: ["wm.DojoGrid", {"columns":[{"show":false,"id":"crimeNo","title":"CrimeNo","width":"80px","displayType":"Number","noDelete":true,"align":"right","formatFunc":""},{"show":false,"id":"crimeYear","title":"CrimeYear","width":"80px","displayType":"Number","noDelete":true,"align":"right","formatFunc":""},{"id":"customField1","isCustomField":true,"expression":"","show":true,"width":"20px","title":"<input type='checkbox'>","align":"center","formatFunc":"dojoGrid1CustomField1Format"},{"id":"customField","isCustomField":true,"expression":"","show":true,"width":"100px","title":"เลขคดี/ปี","align":"center","formatFunc":"dojoGrid1CustomFieldFormat"},{"show":true,"id":"orgName","title":"สน.เจ้าของคดี","width":"100%","displayType":"Text","noDelete":true,"align":"center","formatFunc":""},{"show":true,"id":"groupDesc","title":"กลุ่มอาวุธ","width":"100px","displayType":"Text","noDelete":true,"align":"center","formatFunc":""},{"show":false,"id":"orgCode","title":"OrgCode","width":"100%","displayType":"Text","noDelete":true,"align":"left","formatFunc":""},{"show":false,"id":"ownCode","title":"OwnCode","width":"100%","displayType":"Text","noDelete":true,"align":"left","formatFunc":""},{"show":true,"id":"typeDesc","title":"ประเภทอาวุธ","width":"100px","displayType":"Text","noDelete":true,"align":"center","formatFunc":""},{"id":"customField2","isCustomField":true,"expression":"","show":true,"width":"100px","title":"ชนิดอาวุธ","align":"center"},{"show":true,"id":"ownName","title":"เจ้าของอาวุธ","width":"120px","displayType":"Text","noDelete":true,"align":"center","formatFunc":""},{"show":false,"id":"weaponGroup","title":"WeaponGroup","width":"100%","displayType":"Text","noDelete":true,"align":"left","formatFunc":""},{"show":false,"id":"weaponSEQ","title":"WeaponSEQ","width":"100%","displayType":"Text","noDelete":true,"align":"left","formatFunc":""},{"show":false,"id":"weaponType","title":"WeaponType","width":"100%","displayType":"Text","noDelete":true,"align":"left","formatFunc":""}],"height":"100%","localizationStructure":{},"margin":"4"}, {"onSelectionChange":"app.navCallResult"}, {
					binding: ["wm.Binding", {}, {}, {
						wire: ["wm.Wire", {"expression":undefined,"source":"app.wsWeaponListGetCrimeList.returns","targetProperty":"dataSet"}, {}]
					}]
				}]
			}]
		}]
	}]
}