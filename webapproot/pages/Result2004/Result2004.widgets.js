Result2004.widgets = {
	layoutBox1: ["wm.Layout", {"height":"100%","horizontalAlign":"left","verticalAlign":"top","width":"100%"}, {}, {
		pnlresult: ["wm.Panel", {"disabled":true,"height":"435px","horizontalAlign":"center","layoutKind":"left-to-right","verticalAlign":"top","width":"100%"}, {}, {
			panel2: ["wm.Panel", {"disabled":true,"height":"437px","horizontalAlign":"left","verticalAlign":"top","width":"884px"}, {}, {
				panel3: ["wm.Panel", {"disabled":true,"height":"34px","horizontalAlign":"left","layoutKind":"left-to-right","margin":"5","verticalAlign":"top","width":"100%"}, {}, {
					label2: ["wm.Label", {"align":"right","border":"0","caption":"เลขคดี","padding":"4","width":"130px"}, {}],
					lblresult1: ["wm.Label", {"align":"center","border":"0,0,1,0","padding":"4","width":"63px"}, {}, {
						binding: ["wm.Binding", {}, {}, {
							wire: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleDetailGetCrime.returns.crimeNo1","targetProperty":"caption"}, {}]
						}]
					}],
					label4: ["wm.Label", {"border":"0","caption":"/ปี","padding":"4","width":"27px"}, {}],
					lblresult2: ["wm.Label", {"align":"center","border":"0,0,1,0","padding":"4","width":"67px"}, {}, {
						binding: ["wm.Binding", {}, {}, {
							wire: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleDetailGetCrime.returns.crimeYear1","targetProperty":"caption"}, {}]
						}]
					}]
				}],
				panel4: ["wm.Panel", {"disabled":true,"height":"34px","horizontalAlign":"left","layoutKind":"left-to-right","margin":"5","verticalAlign":"top","width":"100%"}, {}, {
					label6: ["wm.Label", {"align":"right","border":"0","caption":"เลขประจำตัวผู้ครอบครอง","padding":"4","width":"130px"}, {}],
					lblresult3: ["wm.Label", {"align":"center","border":"0,0,1,0","padding":"4","width":"170px"}, {}, {
						binding: ["wm.Binding", {}, {}, {
							wire: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleDetailGetCrimeEXT.returns.occPId","targetProperty":"caption"}, {}]
						}]
					}],
					label8: ["wm.Label", {"align":"right","border":"0","caption":"ชื่อผู้ครอบครอง","padding":"4","width":"85px"}, {}],
					lblresult4: ["wm.Label", {"align":"center","border":"0,0,1,0","padding":"4","width":"71px"}, {}, {
						binding: ["wm.Binding", {}, {}, {
							wire: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleDetailGetCrimeEXT.returns.occTitle","targetProperty":"caption"}, {}]
						}]
					}],
					lblresult5: ["wm.Label", {"align":"center","border":"0,0,1,0","padding":"4","width":"140px"}, {}, {
						binding: ["wm.Binding", {}, {}, {
							wire: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleDetailGetCrimeEXT.returns.occFName","targetProperty":"caption"}, {}]
						}]
					}],
					label11: ["wm.Label", {"align":"right","border":"0","caption":"สกุลผู้ครอบครอง","padding":"4","width":"95px"}, {}],
					lblresult6: ["wm.Label", {"align":"center","border":"0,0,1,0","padding":"4","width":"143px"}, {}, {
						binding: ["wm.Binding", {}, {}, {
							wire: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleDetailGetCrimeEXT.returns.occLName","targetProperty":"caption"}, {}]
						}]
					}]
				}],
				panel5: ["wm.Panel", {"disabled":true,"height":"34px","horizontalAlign":"left","layoutKind":"left-to-right","margin":"5","verticalAlign":"top","width":"100%"}, {}, {
					label13: ["wm.Label", {"align":"right","border":"0","caption":"วัน/เดือน/ปีเกิด","padding":"4","width":"130px"}, {}],
					lblresult7: ["wm.Label", {"align":"center","border":"0,0,1,0","display":"Date","padding":"4","width":"98px"}, {}, {
						binding: ["wm.Binding", {}, {}, {
							wire: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleDetailGetCrimeEXT.returns.occDate","targetProperty":"caption"}, {}]
						}],
						format: ["wm.DateFormatter", {}, {}]
					}],
					label15: ["wm.Label", {"align":"right","border":"0","caption":"วันที่ครอบครอง","padding":"4","width":"110px"}, {}],
					lblresult8: ["wm.Label", {"align":"center","border":"0,0,1,0","padding":"4","width":"100px"}, {}, {
						binding: ["wm.Binding", {}, {}, {
							wire: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleDetailGetCrimeEXT.returns.occDOBDate","targetProperty":"caption"}, {}]
						}]
					}],
					label17: ["wm.Label", {"align":"right","border":"0","caption":"วันที่เสียภาษีล่าสุด","padding":"4","width":"90px"}, {}],
					lblresult9: ["wm.Label", {"align":"center","border":"0,0,1,0","caption":"","padding":"4","width":"106px"}, {}]
				}],
				panel6: ["wm.Panel", {"disabled":true,"height":"34px","horizontalAlign":"left","layoutKind":"left-to-right","margin":"5","verticalAlign":"top","width":"100%"}, {}, {
					label19: ["wm.Label", {"align":"right","border":"0","caption":"ชนิดรถ","padding":"4","width":"130px"}, {}],
					lblresult10: ["wm.Label", {"align":"center","border":"0,0,1,0","caption":"","padding":"4","width":"53px"}, {}],
					label7: ["wm.Label", {"border":"0","caption":"","padding":"4","width":"18px"}, {}],
					lblresult11: ["wm.Label", {"align":"center","border":"0,0,1,0","caption":"","padding":"4","width":"100px"}, {}],
					label1: ["wm.Label", {"align":"right","border":"0","caption":"ประเภทรถ","padding":"4","width":"60px"}, {}],
					radioButton1: ["wm.RadioButton", {"caption":"ส่วนบุคคล","captionAlign":"left","captionPosition":"right","disabled":true,"displayValue":"","width":"83px"}, {}],
					radioButton2: ["wm.RadioButton", {"caption":"รับจ้าง","captionAlign":"left","captionPosition":"right","disabled":true,"displayValue":"","width":"64px"}, {}],
					radioButton3: ["wm.RadioButton", {"caption":"เช่า","captionAlign":"left","captionPosition":"right","disabled":true,"displayValue":"","width":"48px"}, {}],
					radioButton4: ["wm.RadioButton", {"caption":"โดยสารประจำทาง","captionAlign":"left","captionPosition":"right","disabled":true,"displayValue":""}, {}],
					radioButton5: ["wm.RadioButton", {"caption":"ของราชการ/รัฐวิสากิจ","captionAlign":"left","captionPosition":"right","captionSize":"120px","disabled":true,"displayValue":"","width":"132px"}, {}],
					radioButton6: ["wm.RadioButton", {"caption":"อื่นๆ","captionAlign":"left","captionPosition":"right","captionSize":"80px","disabled":true,"displayValue":"","width":"80px"}, {}]
				}],
				panel7: ["wm.Panel", {"disabled":true,"height":"34px","horizontalAlign":"left","layoutKind":"left-to-right","margin":"5","verticalAlign":"top","width":"100%"}, {}, {
					label21: ["wm.Label", {"align":"right","border":"0","caption":"ทะเบียนรถ","padding":"4","width":"130px"}, {}],
					lblresult12: ["wm.Label", {"align":"center","border":"0,0,1,0","caption":"","padding":"4","width":"53px"}, {}],
					label23: ["wm.Label", {"align":"center","border":"0","caption":"/","padding":"4","width":"20px"}, {}],
					lblresult13: ["wm.Label", {"align":"center","border":"0,0,1,0","caption":"","padding":"4","width":"58px"}, {}],
					label25: ["wm.Label", {"align":"right","border":"0","caption":"จังหวัด","padding":"4","width":"80px"}, {}],
					lblresult14: ["wm.Label", {"align":"center","border":"0,0,1,0","caption":"","padding":"4","width":"55px"}, {}],
					label5: ["wm.Label", {"border":"0","caption":"","padding":"4","width":"18px"}, {}],
					lblresult15: ["wm.Label", {"align":"center","border":"0,0,1,0","caption":"","padding":"4","width":"100px"}, {}],
					label29: ["wm.Label", {"align":"right","border":"0","caption":"ยี่ห้อ","padding":"4","width":"80px"}, {}],
					lblresult16: ["wm.Label", {"align":"center","border":"0,0,1,0","padding":"4","width":"55px"}, {}, {
						binding: ["wm.Binding", {}, {}, {
							wire: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleDetailGetCrime.returns.vehicleBnameCode","targetProperty":"caption"}, {}]
						}]
					}],
					label3: ["wm.Label", {"border":"0","caption":"","padding":"4","width":"18px"}, {}],
					lblresult17: ["wm.Label", {"align":"center","border":"0,0,1,0","padding":"4","width":"100px"}, {}, {
						binding: ["wm.Binding", {}, {}, {
							wire: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleDetailGetCrime.returns.brandDesc","targetProperty":"caption"}, {}]
						}]
					}]
				}],
				panel8: ["wm.Panel", {"disabled":true,"height":"34px","horizontalAlign":"left","layoutKind":"left-to-right","margin":"5","verticalAlign":"top","width":"100%"}, {}, {
					label32: ["wm.Label", {"align":"right","border":"0","caption":"รุ่น","padding":"4","width":"130px"}, {}],
					lblresult18: ["wm.Label", {"align":"center","border":"0,0,1,0","caption":"","padding":"4","width":"170px"}, {}],
					label34: ["wm.Label", {"align":"right","border":"0","caption":"สีรถ","padding":"4","width":"42px"}, {}],
					lblresult19: ["wm.Label", {"align":"center","border":"0,0,1,0","caption":"","padding":"4","width":"58px"}, {}],
					label9: ["wm.Label", {"border":"0","caption":"","padding":"4","width":"18px"}, {}],
					lblresult20: ["wm.Label", {"align":"center","border":"0,0,1,0","caption":"","padding":"4","width":"100px"}, {}]
				}],
				panel9: ["wm.Panel", {"disabled":true,"height":"36px","horizontalAlign":"left","layoutKind":"left-to-right","margin":"5","verticalAlign":"top","width":"884px"}, {}, {
					label37: ["wm.Label", {"align":"right","border":"0","caption":"วัน/เดือน/ปีที่จดทะเบียน","padding":"4","width":"130px"}, {}],
					lblresult21: ["wm.Label", {"align":"center","border":"0,0,1,0","caption":"","padding":"4","width":"104px"}, {}],
					label39: ["wm.Label", {"align":"right","border":"0","caption":"ลักษณะรถ","padding":"4","width":"108px"}, {}],
					lblresult22: ["wm.Label", {"align":"center","border":"0,0,1,0","caption":"","padding":"4","width":"102px"}, {}],
					label41: ["wm.Label", {"align":"right","border":"0","caption":"ชนิดเชื้อเพลิง","padding":"4","width":"121px"}, {}],
					lblresult23: ["wm.Label", {"align":"center","border":"0,0,1,0","caption":"","padding":"4","width":"100px"}, {}]
				}],
				panel10: ["wm.Panel", {"disabled":true,"height":"34px","horizontalAlign":"left","layoutKind":"left-to-right","margin":"5","verticalAlign":"top","width":"100%"}, {}, {
					label43: ["wm.Label", {"align":"right","border":"0","caption":"เลขตัวรถ","padding":"4","width":"130px"}, {}],
					lblresult24: ["wm.Label", {"align":"center","border":"0,0,1,0","padding":"4","width":"153px"}, {}, {
						binding: ["wm.Binding", {}, {}, {
							wire: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleDetailGetCrimeEXT.returns.numBody","targetProperty":"caption"}, {}]
						}]
					}],
					label45: ["wm.Label", {"align":"right","border":"0","caption":"เลขเครื่อง","padding":"4","width":"60px"}, {}],
					lblresult25: ["wm.Label", {"align":"center","border":"0,0,1,0","padding":"4","width":"153px"}, {}, {
						binding: ["wm.Binding", {}, {}, {
							wire: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleDetailGetCrimeEXT.returns.numEng","targetProperty":"caption"}, {}]
						}]
					}],
					label47: ["wm.Label", {"align":"right","border":"0","caption":"ขนาดเครื่องยน","padding":"4","width":"100px"}, {}],
					lblresult26: ["wm.Label", {"align":"center","border":"0,0,1,0","padding":"4"}, {}, {
						binding: ["wm.Binding", {}, {}, {
							wire: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleDetailGetCrimeEXT.returns.sizeCar","targetProperty":"caption"}, {}]
						}]
					}]
				}],
				panel11: ["wm.Panel", {"disabled":true,"height":"34px","horizontalAlign":"left","layoutKind":"left-to-right","margin":"5","verticalAlign":"top","width":"100%"}, {}, {
					label49: ["wm.Label", {"align":"right","border":"0","caption":"กระบอกสูบ","padding":"4","width":"130px"}, {}],
					lblresult27: ["wm.Label", {"align":"center","border":"0,0,1,0","caption":"","padding":"4","width":"89px"}, {}],
					label51: ["wm.Label", {"align":"right","border":"0","caption":"ซีซี","padding":"4","width":"50px"}, {}],
					lblresult29: ["wm.Label", {"align":"center","border":"0,0,1,0","padding":"4","width":"77px"}, {}, {
						binding: ["wm.Binding", {}, {}, {
							wire: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleDetailGetCrimeEXT.returns.cc","targetProperty":"caption"}, {}]
						}]
					}],
					label10: ["wm.Label", {"border":"0","caption":"","padding":"4","width":"18px"}, {}],
					lblresult28: ["wm.Label", {"align":"center","border":"0,0,1,0","padding":"4","width":"170px"}, {}, {
						binding: ["wm.Binding", {}, {}, {
							wire: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleDetailGetCrimeEXT.returns.whlDesc","targetProperty":"caption"}, {}]
						}]
					}],
					label54: ["wm.Label", {"align":"right","border":"0","caption":"ราคาประเมิน","padding":"4","width":"100px"}, {}],
					lblresult30: ["wm.Label", {"align":"center","border":"0,0,1,0","padding":"4"}, {}, {
						binding: ["wm.Binding", {}, {}, {
							wire: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleDetailGetCrimeEXT.returns.price","targetProperty":"caption"}, {}]
						}]
					}]
				}],
				panel12: ["wm.Panel", {"disabled":true,"height":"34px","horizontalAlign":"left","layoutKind":"left-to-right","margin":"5","verticalAlign":"top","width":"100%"}, {}, {
					label56: ["wm.Label", {"align":"right","border":"0","caption":"สนง.ขนส่งจังหวัด","padding":"4","width":"130px"}, {}],
					lblresult31: ["wm.Label", {"align":"center","border":"0,0,1,0","padding":"4","width":"170px"}, {}, {
						binding: ["wm.Binding", {}, {}, {
							wire: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleDetailGetCrimeEXT.returns.offProvName","targetProperty":"caption"}, {}]
						}]
					}],
					label58: ["wm.Label", {"align":"right","border":"0","caption":"สนง.ขนส่งสาขา","padding":"4","width":"85px"}, {}],
					lblresult32: ["wm.Label", {"align":"center","border":"0,0,1,0","padding":"4","width":"115px"}, {}, {
						binding: ["wm.Binding", {}, {}, {
							wire: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleDetailGetCrimeEXT.returns.offBrName","targetProperty":"caption"}, {}]
						}]
					}]
				}],
				panel13: ["wm.Panel", {"disabled":true,"height":"34px","horizontalAlign":"left","layoutKind":"left-to-right","margin":"5","verticalAlign":"top","width":"100%"}, {}, {
					label60: ["wm.Label", {"align":"right","border":"0","caption":"ทะเบียนรถเดิม","padding":"4","width":"130px"}, {}],
					lblresult33: ["wm.Label", {"align":"center","border":"0,0,1,0","caption":"","padding":"4","width":"70px"}, {}],
					label62: ["wm.Label", {"align":"center","border":"0","caption":"/","padding":"4","width":"20px"}, {}],
					lblresult34: ["wm.Label", {"align":"center","border":"0,0,1,0","caption":"","padding":"4","width":"64px"}, {}],
					label64: ["wm.Label", {"align":"right","border":"0","caption":"จังหวัดเดิม","padding":"4","width":"60px"}, {}],
					lblresult35: ["wm.Label", {"align":"center","border":"0,0,1,0","caption":"","padding":"4","width":"58px"}, {}],
					lblresult36: ["wm.Label", {"align":"center","border":"0,0,1,0","caption":"","padding":"4","width":"100px"}, {}]
				}]
			}]
		}]
	}]
}