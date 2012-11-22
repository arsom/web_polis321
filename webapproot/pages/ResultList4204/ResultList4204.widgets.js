ResultList4204.widgets = {
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
				dojoGrid1: ["wm.DojoGrid", {"columns":[{"show":true,"id":"complainDate","title":"ComplainDate","width":"100%","displayType":"Text","noDelete":true,"align":"left","formatFunc":""},{"show":true,"id":"complainTime","title":"ComplainTime","width":"100%","displayType":"Text","noDelete":true,"align":"left","formatFunc":""},{"show":true,"id":"crimeNo","title":"CrimeNo","width":"80px","displayType":"Number","noDelete":true,"align":"right","formatFunc":""},{"show":true,"id":"crimeYear","title":"CrimeYear","width":"80px","displayType":"Number","noDelete":true,"align":"right","formatFunc":""},{"show":true,"id":"org","title":"Org","width":"100%","displayType":"Text","noDelete":true,"align":"left","formatFunc":""},{"show":true,"id":"orgCode","title":"OrgCode","width":"100%","displayType":"Text","noDelete":true,"align":"left","formatFunc":""},{"show":true,"id":"polisCode","title":"PolisCode","width":"100%","displayType":"Text","noDelete":true,"align":"left","formatFunc":""},{"show":true,"id":"polisName","title":"PolisName","width":"100%","displayType":"Text","noDelete":true,"align":"left","formatFunc":""}],"height":"100%","margin":"4"}, {"onSelectionChange":"app.navCallResult"}, {
					binding: ["wm.Binding", {}, {}, {
						wire: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetCrimeOther.returns","targetProperty":"dataSet"}, {}]
					}]
				}]
			}]
		}]
	}]
}