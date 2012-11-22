ResultList3104.widgets = {
	layoutBox1: ["wm.Layout", {"height":"100%","horizontalAlign":"left","lock":true,"verticalAlign":"top","width":"100%"}, {}, {
		panel12: ["wm.Panel", {"height":"100%","horizontalAlign":"left","verticalAlign":"top","width":"100%"}, {}, {
			panel18: ["wm.Panel", {"height":"30px","horizontalAlign":"left","layoutKind":"left-to-right","verticalAlign":"top","width":"100%"}, {}, {
				picture7: ["wm.Picture", {"border":"0","height":"22px","source":"resources/images/logos/bulet_arrow.png","width":"38px"}, {}],
				label1: ["wm.Label", {"_classes":{"domNode":["wm_FontSizePx_14px"]},"border":"0","caption":"ข้อมูลปืน-คดีอาญา","padding":"4"}, {"onclick":"navCallResult"}],
				panel20: ["wm.Panel", {"height":"100%","horizontalAlign":"right","layoutKind":"left-to-right","padding":"0,18,0,0","verticalAlign":"middle","width":"100%"}, {}, {
					pnlNavigaleft: ["wm.Panel", {"height":"40px","horizontalAlign":"left","verticalAlign":"top","width":"36px"}, {}],
					pnlNavigaRight: ["wm.Panel", {"height":"40px","horizontalAlign":"left","verticalAlign":"top","width":"36px"}, {}]
				}]
			}],
			panel19: ["wm.Panel", {"height":"100%","horizontalAlign":"left","layoutKind":"left-to-right","padding":"0,18,18,18","verticalAlign":"top","width":"100%"}, {}, {
				dojoGrid1: ["wm.DojoGrid", {"columns":[{"id":"customField1","isCustomField":true,"expression":"","show":true,"width":"20px","title":"<input type='checkbox'>","align":"center","formatFunc":"dojoGrid1CustomField1Format"},{"id":"customField","isCustomField":true,"expression":"","show":true,"width":"100%","title":"เลขที่คดี/ปี","align":"center","formatFunc":"dojoGrid1CustomFieldFormat"},{"show":true,"id":"orgName","title":"หน่วยงานเจ้าของคดี","width":"200px","displayType":"Text","noDelete":true,"align":"center","formatFunc":""},{"show":false,"id":"crimeNO","title":"CrimeNO","width":"80px","displayType":"Number","noDelete":true,"align":"right","formatFunc":""},{"show":false,"id":"crimeYear","title":"CrimeYear","width":"80px","displayType":"Number","noDelete":true,"align":"right","formatFunc":""},{"show":true,"id":"licence","title":"เครื่องหมายทะเบียนปืน","width":"100%","displayType":"Text","noDelete":true,"align":"center","formatFunc":""},{"show":false,"id":"orgCode","title":"OrgCode","width":"100%","displayType":"Text","noDelete":true,"align":"left","formatFunc":""},{"show":false,"id":"sizeWeapon","title":"SizeWeapon","width":"100%","displayType":"Text","noDelete":true,"align":"left","formatFunc":""},{"show":true,"id":"weaponName","title":"ประเภทปืน","width":"100px","displayType":"Text","noDelete":true,"align":"center","formatFunc":""},{"show":true,"id":"brand","title":"ยี่ห้อ","width":"80px","displayType":"Text","noDelete":true,"align":"center","formatFunc":""},{"show":false,"id":"weaponSEQ","title":"WeaponSEQ","width":"100%","displayType":"Text","noDelete":true,"align":"left","formatFunc":""}],"height":"100%","margin":"4"}, {"onSelectionChange":"app.navCallResult","onSelectionChange1":"dojoGrid1SelectionChange1"}, {
					binding: ["wm.Binding", {}, {}, {
						wire: ["wm.Wire", {"expression":undefined,"source":"app.wsWeaponListGetCrimeListGun.returns","targetProperty":"dataSet"}, {}]
					}]
				}]
			}]
		}]
	}]
}