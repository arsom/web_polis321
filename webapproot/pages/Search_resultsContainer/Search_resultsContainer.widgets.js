Search_resultsContainer.widgets = {
	navCallResult: ["wm.NavigationCall", {"operation":"gotoDialogPage"}, {}, {
		input: ["wm.ServiceInput", {"type":"gotoDialogPageInputs"}, {}, {
			binding: ["wm.Binding", {}, {}, {
				wire: ["wm.Wire", {"expression":"\"Container_CallResult\"","targetProperty":"pageName"}, {}],
				wire2: ["wm.Wire", {"expression":"true","targetProperty":"hideControls"}, {}],
				wire3: ["wm.Wire", {"expression":"\"1000px\"","targetProperty":"width"}, {}],
				wire1: ["wm.Wire", {"expression":"\"575px\"","targetProperty":"height"}, {}]
			}]
		}]
	}],
	layoutBox1: ["wm.Layout", {"height":"100%","horizontalAlign":"left","verticalAlign":"top","width":"100%"}, {}, {
		pnlbody: ["wm.Panel", {"height":"100%","horizontalAlign":"center","verticalAlign":"top","width":"100%"}, {}, {
			pageContainer1: ["wm.PageContainer", {"border":"0","deferLoad":true,"height":"211px","pageName":"Web_polis_header","width":"982px"}, {}],
			panel1: ["wm.Panel", {"height":"100%","horizontalAlign":"center","verticalAlign":"top","width":"100%"}, {}, {
				panel2: ["wm.Panel", {"height":"314px","horizontalAlign":"left","verticalAlign":"top","width":"980px"}, {}, {
					panel4: ["wm.Panel", {"height":"31px","horizontalAlign":"left","layoutKind":"left-to-right","verticalAlign":"top","width":"100%"}, {}, {
						picture1: ["wm.Picture", {"border":"0","height":"100%","source":"resources/images/logos/tb1.png","width":"34px"}, {}],
						panel7: ["wm.Panel", {"height":"100%","horizontalAlign":"left","verticalAlign":"top","width":"100%"}, {}],
						picture2: ["wm.Picture", {"border":"0","height":"100%","source":"resources/images/logos/tb3.png","width":"34px"}, {}]
					}],
					panel5: ["wm.Panel", {"height":"100%","horizontalAlign":"left","layoutKind":"left-to-right","verticalAlign":"top","width":"100%"}, {}, {
						panel9: ["wm.Panel", {"height":"100%","horizontalAlign":"left","verticalAlign":"top","width":"34px"}, {}, {
							picture5: ["wm.Picture", {"border":"0","height":"242px","source":"resources/images/logos/tb4_img.png","width":"100%"}, {}]
						}],
						panel11: ["wm.Panel", {"height":"100%","horizontalAlign":"left","verticalAlign":"top","width":"100%"}, {}, {
							pageContainer4: ["wm.PageContainer", {"border":"0","deferLoad":true,"pageName":"ResultList2004"}, {}]
						}],
						panel10: ["wm.Panel", {"height":"100%","horizontalAlign":"left","verticalAlign":"top","width":"34px"}, {}, {
							picture6: ["wm.Picture", {"border":"0","height":"242px","source":"resources/images/logos/tb6_img.png","width":"100%"}, {}]
						}]
					}]
				}],
				pageContainer3: ["wm.PageContainer", {"border":"0","deferLoad":true,"height":"211px","pageName":"Web_polis_menu_footer"}, {}]
			}],
			pageContainer2: ["wm.PageContainer", {"border":"0","deferLoad":true,"height":"24px","pageName":"Web_polis_footer","width":"840px"}, {}]
		}]
	}]
}