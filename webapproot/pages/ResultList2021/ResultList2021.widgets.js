ResultList2021.widgets = {
	layoutBox1: ["wm.Layout", {"height":"100%","horizontalAlign":"left","verticalAlign":"top","width":"100%"}, {}, {
		panel12: ["wm.Panel", {"height":"100%","horizontalAlign":"left","verticalAlign":"top","width":"100%"}, {}, {
			panel18: ["wm.Panel", {"height":"30px","horizontalAlign":"left","layoutKind":"left-to-right","verticalAlign":"top","width":"100%"}, {}, {
				picture7: ["wm.Picture", {"border":"0","height":"22px","source":"resources/images/logos/bulet_arrow.png","width":"38px"}, {}],
				label1: ["wm.Label", {"_classes":{"domNode":["wm_FontSizePx_14px"]},"border":"0","caption":"ข้อมูลรถสกัดจับ","padding":"4"}, {"onclick":"navCallResult"}],
				panel20: ["wm.Panel", {"height":"100%","horizontalAlign":"right","layoutKind":"left-to-right","padding":"0,18,0,0","verticalAlign":"middle","width":"100%"}, {}, {
					pnlNavigaleft: ["wm.Panel", {"height":"40px","horizontalAlign":"left","verticalAlign":"top","width":"36px"}, {}],
					pnlNavigaRight: ["wm.Panel", {"height":"40px","horizontalAlign":"left","verticalAlign":"top","width":"36px"}, {}]
				}]
			}],
			panel19: ["wm.Panel", {"height":"100%","horizontalAlign":"left","layoutKind":"left-to-right","padding":"0,18,18,18","verticalAlign":"top","width":"100%"}, {}, {
				dojoGrid1: ["wm.DojoGrid", {"columns":[{"id":"customField","isCustomField":true,"expression":"","show":true,"width":"20px","title":"<input type='checkbox'>","align":"center","formatFunc":"dojoGrid1CustomFieldFormat"},{"show":true,"id":"orgName","title":"หน่วยงาน","width":"100%","displayType":"Text","noDelete":true,"align":"center","formatFunc":""},{"show":false,"id":"plate","title":"ทะเบียนรถ","width":"150px","displayType":"Text","noDelete":true,"align":"center","formatFunc":""},{"id":"customField1","isCustomField":true,"expression":"","show":true,"width":"150px","title":"ทะเบียนรถ","align":"center","formatFunc":"dojoGrid1CustomField1Format"},{"show":true,"id":"brandName","title":"ยี่ห้อ","width":"70px","displayType":"Text","noDelete":true,"align":"center","formatFunc":""},{"show":false,"id":"cancelFlag","title":"CancelFlag","width":"100%","displayType":"Text","noDelete":true,"align":"left","formatFunc":""},{"show":true,"id":"colorName","title":"สีรถ","width":"70px","displayType":"Text","noDelete":true,"align":"center","formatFunc":""},{"show":true,"id":"carModel","title":"รุ่นรถ","width":"70px","displayType":"Text","noDelete":true,"align":"center","formatFunc":""},{"show":false,"id":"orgCode","title":"OrgCode","width":"100%","displayType":"Text","noDelete":true,"align":"left","formatFunc":""},{"show":false,"id":"provName","title":"ProvName","width":"100%","displayType":"Text","noDelete":true,"align":"left","formatFunc":""},{"show":false,"id":"seizeCode","title":"SeizeCode","width":"100%","displayType":"Text","noDelete":true,"align":"left","formatFunc":""},{"show":true,"id":"seizeType","title":"สถานะ","width":"70px","displayType":"Text","noDelete":true,"align":"center","formatFunc":""},{"show":false,"id":"updDate","title":"UpdDate","width":"20px","displayType":"Text","noDelete":true,"align":"center","formatFunc":""}],"height":"100%","margin":"4"}, {}, {
					binding: ["wm.Binding", {}, {}, {
						wire: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleListGetInterceptList.returns","targetProperty":"dataSet"}, {}]
					}]
				}]
			}]
		}]
	}]
}