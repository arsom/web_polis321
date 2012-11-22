Search_p.widgets = {
	serStartApp: ["wm.ServiceVariable", {"autoUpdate":true,"operation":"selStartApp","service":"oracdgs9DB","startUpdate":true}, {"onSuccess":"serStartAppSuccess"}, {
		input: ["wm.ServiceInput", {"type":"selStartAppInputs"}, {}, {
			binding: ["wm.Binding", {}, {}, {
				wire: ["wm.Wire", {"expression":"(new Date().getFullYear() + 543) + \"\" + \"00\".substring(0, 2 - (new Date().getMonth() + 1 + \"\").length) + (new Date().getMonth() + 1 + \"\") + (new Date().getDate())","source":false,"targetProperty":"datenow"}, {}],
				wire1: ["wm.Wire", {"expression":"\"polis\"","targetProperty":"user"}, {}]
			}]
		}]
	}],
	serInsertLogNew: ["wm.ServiceVariable", {"operation":"insertLognew","service":"todb"}, {}, {
		input: ["wm.ServiceInput", {"type":"insertLognewInputs"}, {}, {
			binding: ["wm.Binding", {}, {}, {
				wire: ["wm.Wire", {"expression":"\"\"","targetProperty":"condition"}, {}],
				wire2: ["wm.Wire", {"expression":"\"\"","targetProperty":"ip"}, {}],
				wire3: ["wm.Wire", {"expression":"${serStartApp.seq}+1","source":false,"targetProperty":"seqno"}, {}],
				wire4: ["wm.Wire", {"expression":"\"polis\"","targetProperty":"userid"}, {}],
				wire5: ["wm.Wire", {"expression":"${app.varSource.dataValue}.replace(/,/g,\"\");","source":false,"targetProperty":"source"}, {}],
				wire6: ["wm.Wire", {"expression":"\"\"","targetProperty":"orgcode"}, {}],
				wire7: ["wm.Wire", {"expression":"(new Date().getFullYear() + 543) + \"\" + \"00\".substring(0, 2 - (new Date().getMonth() + 1 + \"\").length) + (new Date().getMonth() + 1 + \"\") + (new Date().getDate())","source":false,"targetProperty":"qrydate"}, {}],
				wire1: ["wm.Wire", {"expression":undefined,"source":"app.varGroup.dataValue","targetProperty":"group"}, {}],
				wire8: ["wm.Wire", {"expression":"15","source":false,"targetProperty":"logid"}, {}]
			}]
		}]
	}],
	layoutBox1: ["wm.Layout", {"height":"587px","horizontalAlign":"left","verticalAlign":"top","width":"812px"}, {}, {
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
							panel12: ["wm.Panel", {"height":"100%","horizontalAlign":"left","verticalAlign":"top","width":"100%"}, {}, {
								panel18: ["wm.Panel", {"height":"24px","horizontalAlign":"left","layoutKind":"left-to-right","verticalAlign":"bottom","width":"100%"}, {}, {
									picture7: ["wm.Picture", {"border":"0","height":"22px","source":"resources/images/logos/bulet_arrow.png","width":"38px"}, {}],
									label1: ["wm.Label", {"_classes":{"domNode":["wm_FontSizePx_14px"]},"border":"0","caption":"ระบุเงื่อนไขการค้นหา","padding":"4"}, {}]
								}],
								pageShowSearch: ["wm.PageContainer", {"border":"0","deferLoad":true}, {}]
							}],
							panel13: ["wm.Panel", {"height":"45px","horizontalAlign":"left","layoutKind":"left-to-right","verticalAlign":"top","width":"100%"}, {}, {
								panel14: ["wm.Panel", {"_classes":{"domNode":["pnlpic_btt_kadee"]},"height":"100%","horizontalAlign":"left","verticalAlign":"top","width":"101px"}, {}],
								panel17: ["wm.Panel", {"height":"100%","horizontalAlign":"left","verticalAlign":"top","width":"100%"}, {}],
								pnlsearch: ["wm.Panel", {"_classes":{"domNode":["pnlpic_btt_search"]},"height":"100%","horizontalAlign":"left","verticalAlign":"top","width":"101px"}, {}],
								pnlcancle: ["wm.Panel", {"_classes":{"domNode":["pnlpic_btt_cancel"]},"height":"100%","horizontalAlign":"left","verticalAlign":"top","width":"101px"}, {}]
							}]
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