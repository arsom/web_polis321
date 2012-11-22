Web_polis_header.widgets = {
	layoutBox1: ["wm.Layout", {"height":"100%","horizontalAlign":"left","verticalAlign":"top","width":"100%"}, {}, {
		body: ["wm.Panel", {"height":"100%","horizontalAlign":"center","verticalAlign":"top","width":"100%"}, {}, {
			panel4: ["wm.Panel", {"height":"209px","horizontalAlign":"center","verticalAlign":"top","width":"980px"}, {}, {
				picture1: ["wm.Picture", {"border":"0","height":"100%","source":"resources/images/logos/header.png","width":"100%"}, {}],
				panel2: ["wm.Panel", {"height":"54px","horizontalAlign":"left","layoutKind":"left-to-right","verticalAlign":"top","width":"840px"}, {}, {
					picture2: ["wm.Picture", {"border":"0","height":"100%","source":"resources/images/logos/bar_front.png","width":"12px"}, {}],
					menu: ["wm.Panel", {"height":"100%","horizontalAlign":"left","layoutKind":"left-to-right","verticalAlign":"top","width":"100%"}, {}, {
						panel3: ["wm.Panel", {"height":"100%","horizontalAlign":"left","layoutKind":"left-to-right","verticalAlign":"bottom","width":"100%"}, {}, {
							label2: ["wm.Label", {"_classes":{"domNode":["bar_menu","bar_menu_separt_right"]},"align":"center","border":"0","caption":"กลุ่มข้อมูล","height":"50px","padding":"","width":"106px"}, {"onclick":"app.navCallMain"}],
							label3: ["wm.Label", {"_classes":{"domNode":["bar_menu","bar_menu_separt_right"]},"align":"center","border":"0","caption":"เงื่อนไข","height":"50px","padding":"","width":"85px"}, {"onclick":"app.navCallSearchP"}],
							label4: ["wm.Label", {"_classes":{"domNode":["bar_menu","bar_menu_separt_right"]},"align":"center","border":"0","caption":"แหล่งข้อมูล","height":"50px","padding":"","width":"117px"}, {"onclick":"app.navCallSubmenu"}]
						}],
						panel1: ["wm.Panel", {"fitToContentWidth":true,"height":"100%","horizontalAlign":"left","verticalAlign":"bottom","width":"66px"}, {}, {
							label1: ["wm.Label", {"_classes":{"domNode":["bar_menu","bar_menu_separt_left"]},"align":"center","border":"0","caption":"ออก","height":"50px","padding":"4","width":"66px"}, {}]
						}]
					}],
					picture3: ["wm.Picture", {"border":"0","height":"100%","source":"resources/images/logos/bar_back.png","width":"12px"}, {}]
				}]
			}]
		}]
	}]
}