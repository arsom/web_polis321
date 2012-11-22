Main.widgets = {
	sevSelDatGroupC: ["wm.ServiceVariable", {"autoUpdate":true,"operation":"selDatGroupC","service":"oracdgs9DB","startUpdate":true}, {"onSuccess":"sevSelDatGroupCSuccess"}, {
		input: ["wm.ServiceInput", {"type":"selDatGroupCInputs"}, {}]
	}],
	layoutBox1: ["wm.Layout", {"height":"531px","horizontalAlign":"left","verticalAlign":"top","width":"898px"}, {}, {
		pnlbody: ["wm.Panel", {"height":"100%","horizontalAlign":"center","verticalAlign":"top","width":"100%"}, {}, {
			pageContainer1: ["wm.PageContainer", {"border":"0","deferLoad":true,"height":"211px","pageName":"Web_polis_header","width":"982px"}, {}],
			panel1: ["wm.Panel", {"height":"100%","horizontalAlign":"left","verticalAlign":"top","width":"100%"}, {}, {
				pnlImgList1: ["wm.Panel", {"height":"50%","horizontalAlign":"center","layoutKind":"left-to-right","minHeight":200,"verticalAlign":"bottom","width":"100%"}, {}, {
					picHideOnLoad1: ["wm.Picture", {"border":"0","height":"150px","source":"services/sevFileTransfer.download?method=getPhoto&id=10&base=DAT_GROUP_C&action=GROUP_IMG","width":"275px"}, {}]
				}],
				pnlImgList2: ["wm.Panel", {"height":"50%","horizontalAlign":"center","layoutKind":"left-to-right","minHeight":200,"verticalAlign":"bottom","width":"100%"}, {}, {
					picHideOnLoad2: ["wm.Picture", {"border":"0","height":"150px","source":"services/sevFileTransfer.download?method=getPhoto&id=10&base=DAT_GROUP_C&action=GROUP_IMG","width":"275px"}, {}]
				}]
			}],
			pageContainer2: ["wm.PageContainer", {"border":"0","deferLoad":true,"height":"24px","pageName":"Web_polis_footer","width":"840px"}, {}]
		}]
	}]
}