ResultList6003.widgets = {
	layoutBox1: ["wm.Layout", {"height":"100%","horizontalAlign":"left","verticalAlign":"top","width":"100%"}, {}, {
		panel12: ["wm.Panel", {"height":"100%","horizontalAlign":"left","verticalAlign":"top","width":"100%"}, {}, {
			panel18: ["wm.Panel", {"height":"30px","horizontalAlign":"left","layoutKind":"left-to-right","verticalAlign":"top","width":"100%"}, {}, {
				picture7: ["wm.Picture", {"border":"0","height":"22px","source":"resources/images/logos/bulet_arrow.png","width":"38px"}, {}],
				label1: ["wm.Label", {"_classes":{"domNode":["wm_FontSizePx_14px"]},"border":"0","caption":"ข้อมูลสถานที่ท้องถิ่น","padding":"4"}, {"onclick":"navCallResult"}],
				panel20: ["wm.Panel", {"height":"100%","horizontalAlign":"right","layoutKind":"left-to-right","padding":"0,18,0,0","verticalAlign":"middle","width":"100%"}, {}, {
					pnlNavigaleft: ["wm.Panel", {"height":"40px","horizontalAlign":"left","verticalAlign":"top","width":"36px"}, {}],
					pnlNavigaRight: ["wm.Panel", {"height":"40px","horizontalAlign":"left","verticalAlign":"top","width":"36px"}, {}]
				}]
			}],
			panel19: ["wm.Panel", {"height":"100%","horizontalAlign":"left","layoutKind":"left-to-right","padding":"0,18,18,18","verticalAlign":"top","width":"100%"}, {}, {
				dojoGrid1: ["wm.DojoGrid", {"columns":[{"id":"customField1","isCustomField":true,"expression":"","show":true,"width":"20px","title":"<input type='checkbox'>","align":"center","formatFunc":"dojoGrid1CustomField1Format"},{"show":false,"id":"birthDte","title":"BirthDte","width":"100%","displayType":"Text","noDelete":true,"align":"left","formatFunc":""},{"show":false,"id":"firstTnme","title":"FirstTnme","width":"100%","displayType":"Text","noDelete":true,"align":"left","formatFunc":""},{"show":false,"id":"lastTnme","title":"LastTnme","width":"100%","displayType":"Text","noDelete":true,"align":"left","formatFunc":""},{"show":false,"id":"natCde","title":"NatCde","width":"100%","displayType":"Text","noDelete":true,"align":"left","formatFunc":""},{"show":true,"id":"natName","title":"สัญชาติ","width":"100%","displayType":"Text","noDelete":true,"align":"center","formatFunc":""},{"show":true,"id":"org","title":"หน่วยงาน","width":"100%","displayType":"Text","noDelete":true,"align":"center","formatFunc":""},{"show":false,"id":"orgCde","title":"OrgCde","width":"100%","displayType":"Text","noDelete":true,"align":"left","formatFunc":""},{"show":false,"id":"placeCde","title":"PlaceCde","width":"100%","displayType":"Text","noDelete":true,"align":"left","formatFunc":""},{"show":true,"id":"placeGrp","title":"กลุ่มสถานที่หลัก","width":"100%","displayType":"Text","noDelete":true,"align":"center","formatFunc":""},{"show":true,"id":"placeNme","title":"ชื่อสถานที่","width":"100%","displayType":"Text","noDelete":true,"align":"center","formatFunc":""},{"show":true,"id":"placeSubname","title":"ชนิดสถานที่","width":"100%","displayType":"Text","noDelete":true,"align":"center","formatFunc":""},{"show":false,"id":"placeSubtype","title":"PlaceSubtype","width":"100%","displayType":"Text","noDelete":true,"align":"left","formatFunc":""},{"show":false,"id":"placeType","title":"PlaceType","width":"100%","displayType":"Text","noDelete":true,"align":"left","formatFunc":""},{"show":true,"id":"placeTypeName","title":"ประเภทสถานที่","width":"100%","displayType":"Text","noDelete":true,"align":"left","formatFunc":""},{"show":true,"id":"sex","title":"เพศ","width":"100%","displayType":"Text","noDelete":true,"align":"center","formatFunc":""},{"id":"customField","isCustomField":true,"expression":"","show":true,"width":"100%","title":"ชื่อเจ้าของสถานที่","align":"center"}],"height":"100%","margin":"4"}, {}, {
					binding: ["wm.Binding", {}, {}, {
						wire: ["wm.Wire", {"expression":undefined,"source":"app.wsLocationListGetPlace.returns","targetProperty":"dataSet"}, {}]
					}]
				}]
			}]
		}]
	}]
}