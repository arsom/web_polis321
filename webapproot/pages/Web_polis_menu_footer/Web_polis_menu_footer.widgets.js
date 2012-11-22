Web_polis_menu_footer.widgets = {
	serStartApp: ["wm.ServiceVariable", {"autoUpdate":true,"operation":"selStartApp","service":"oracdgs9DB","startUpdate":true}, {"onSuccess":"serStartAppSuccess"}, {
		input: ["wm.ServiceInput", {"type":"selStartAppInputs"}, {}, {
			binding: ["wm.Binding", {}, {}, {
				wire: ["wm.Wire", {"expression":"(new Date().getFullYear() + 543) + \"\" + \"00\".substring(0, 2 - (new Date().getMonth() + 1 + \"\").length) + (new Date().getMonth() + 1 + \"\") + (new Date().getDate())","source":false,"targetProperty":"datenow"}, {}],
				wire1: ["wm.Wire", {"expression":"\"polis\"","targetProperty":"user"}, {}]
			}]
		}]
	}],
	layoutBox1: ["wm.Layout", {"height":"100%","horizontalAlign":"left","verticalAlign":"top","width":"100%"}, {}, {
		pnlbodyfooter: ["wm.Panel", {"height":"100%","horizontalAlign":"center","verticalAlign":"top","width":"100%"}, {}, {
			panel1: ["wm.Panel", {"height":"100%","horizontalAlign":"center","verticalAlign":"top","width":"100%"}, {}, {
				panel2: ["wm.Panel", {"height":"31px","horizontalAlign":"center","verticalAlign":"top","width":"980px"}, {}, {
					panel6: ["wm.Panel", {"height":"31px","horizontalAlign":"left","layoutKind":"left-to-right","verticalAlign":"top","width":"100%"}, {}, {
						picture3: ["wm.Picture", {"border":"0","height":"100%","source":"resources/images/logos/tb7.png","width":"34px"}, {}],
						panel8: ["wm.Panel", {"height":"100%","horizontalAlign":"center","layoutKind":"left-to-right","verticalAlign":"top","width":"100%"}, {}, {
							panel51: ["wm.Panel", {"height":"100%","horizontalAlign":"left","verticalAlign":"top","width":"230px"}, {}],
							pnlpointer: ["wm.Panel", {"fitToContentWidth":true,"height":"100%","horizontalAlign":"center","layoutKind":"left-to-right","verticalAlign":"top","width":"140px"}, {}, {
								pnliconpointer: ["wm.Panel", {"height":"100%","horizontalAlign":"left","verticalAlign":"top","width":"140px"}, {}]
							}]
						}],
						picture4: ["wm.Picture", {"border":"0","height":"100%","source":"resources/images/logos/tb9.png","width":"34px"}, {}]
					}]
				}],
				pnlImgList: ["wm.Panel", {"height":"180px","horizontalAlign":"center","layoutKind":"left-to-right","verticalAlign":"bottom","width":"100%"}, {}, {
					picture8: ["wm.Picture", {"border":"0","height":"172px","width":"230px"}, {}, {
						binding: ["wm.Binding", {}, {}, {
							wire: ["wm.Wire", {"expression":"\"services/sevFileTransfer.download?method=getPhoto&id=\" + ${app.varGroup.dataValue} + \"&base=DAT_GROUP_C&action=GROUP_IMG_S\"","source":false,"targetProperty":"source"}, {}]
						}]
					}],
					pnlicon: ["wm.Panel", {"fitToContentWidth":true,"height":"100%","horizontalAlign":"center","verticalAlign":"top","width":"140px"}, {}, {
						pnlshowresult: ["wm.Panel", {"height":"100%","horizontalAlign":"center","layoutKind":"left-to-right","verticalAlign":"top","width":"100%"}, {}, {
							pnliconresult: ["wm.Panel", {"height":"100%","horizontalAlign":"center","verticalAlign":"bottom","width":"140px"}, {}, {
								lblresult: ["wm.Label", {"_classes":{"domNode":["wm_FontColor_White"]},"align":"center","border":"0","caption":"1","height":"20px","padding":"4","width":"60px"}, {}]
							}]
						}],
						pnliconpic: ["wm.Panel", {"height":"150px","horizontalAlign":"center","layoutKind":"left-to-right","verticalAlign":"top","width":"100%"}, {}, {
							picicon: ["wm.Picture", {"border":"0","height":"150px","showing":false,"source":"resources/images/logos/icon01.png","width":"140px"}, {}]
						}]
					}]
				}]
			}]
		}]
	}]
}