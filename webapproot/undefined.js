dojo.declare("web_polis321", wm.Application, {
	"dialogAnimationTime": 350, 
	"disableDirtyEditorTracking": false, 
	"i18n": false, 
	"main": "Main", 
	"projectSubVersion": "Alpha12", 
	"projectVersion": 1, 
	"saveCounter": 3592, 
	"studioVersion": "6.4.6GA", 
	"theme": "wm_default", 
	"toastPosition": "br",
	"widgets": {
		silkIconList: ["wm.ImageList", {"colCount":39,"height":16,"iconCount":90,"url":"lib/images/silkIcons/silk.png","width":16}, {}], 
		navCallMain: ["wm.NavigationCall", {"operation":"gotoPage"}, {}, {
			input: ["wm.ServiceInput", {"type":"gotoPageInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":"\"Main\"","targetProperty":"pageName"}, {}]
				}]
			}]
		}], 
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
		navCallSearchP: ["wm.NavigationCall", {"operation":"gotoPage"}, {}, {
			input: ["wm.ServiceInput", {"type":"gotoPageInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":"\"Search_p\"","targetProperty":"pageName"}, {}]
				}]
			}]
		}], 
		navCallSearchResult: ["wm.NavigationCall", {"operation":"gotoPage"}, {}, {
			input: ["wm.ServiceInput", {"type":"gotoPageInputs"}, {}]
		}], 
		navCallSubmenu: ["wm.NavigationCall", {"operation":"gotoPage"}, {}, {
			input: ["wm.ServiceInput", {"type":"gotoPageInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":"\"Submenu\"","targetProperty":"pageName"}, {}]
				}]
			}]
		}], 
		varGroup: ["wm.Variable", {"type":"StringData"}, {}], 
		varSelSource: ["wm.Variable", {}, {}], 
		varSource: ["wm.Variable", {"isList":true,"json":"[]","type":"StringData"}, {}, {
			binding: ["wm.Binding", {}, {}, {
				wire: ["wm.Wire", {"expression":"\"\"","targetProperty":"dataValue"}, {}]
			}]
		}], 
		wsAssetDetailGetLostAssetAccessories: ["wm.ServiceVariable", {"operation":"getLostAssetAccessories","service":"WebServiceDetailAssetService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getLostAssetAccessoriesInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"app.wsAssetListGetLostAsseetListAccessories.returns.caseNo","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"app.wsAssetListGetLostAsseetListAccessories.returns.caseY","targetProperty":"parameters.arg1"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"app.wsAssetListGetLostAsseetListAccessories.returns.caseOff","targetProperty":"parameters.arg2"}, {}],
					wire3: ["wm.Wire", {"expression":undefined,"source":"app.wsAssetListGetLostAsseetListAccessories.returns.astId","targetProperty":"parameters.arg3"}, {}]
				}]
			}]
		}], 
		wsAssetDetailGetLostAssetAccessoriesDetail: ["wm.ServiceVariable", {"operation":"getLostAssetAccessoriesDetail","service":"WebServiceDetailAssetService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getLostAssetAccessoriesDetailInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"app.wsAssetDetailGetLostAssetAccessories.returns.caseNo","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"app.wsAssetDetailGetLostAssetAccessories.returns.caseY","targetProperty":"parameters.arg1"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"app.wsAssetDetailGetLostAssetAccessories.returns.caseOff","targetProperty":"parameters.arg2"}, {}],
					wire3: ["wm.Wire", {"expression":undefined,"source":"app.wsAssetDetailGetLostAssetAccessories.returns.astId","targetProperty":"parameters.arg3"}, {}]
				}]
			}]
		}], 
		wsAssetDetailGetLostAssetElec: ["wm.ServiceVariable", {"operation":"getLostAssetElec","service":"WebServiceDetailAssetService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getLostAssetElecInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"app.wsAssetListGetLostAssetListElec.returns.caseNo","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"app.wsAssetListGetLostAssetListElec.returns.caseY","targetProperty":"parameters.arg1"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"app.wsAssetListGetLostAssetListElec.returns.caseOff","targetProperty":"parameters.arg2"}, {}],
					wire3: ["wm.Wire", {"expression":undefined,"source":"app.wsAssetListGetLostAssetListElec.returns.astId","targetProperty":"parameters.arg3"}, {}]
				}]
			}]
		}], 
		wsAssetDetailGetLostAssetElecBrand: ["wm.ServiceVariable", {"operation":"getLostAssetElecBrand","service":"WebServiceDetailAssetService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getLostAssetElecBrandInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"app.wsAssetDetailGetLostAssetElecCharacter.returns.astType","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"app.wsAssetDetailGetLostAssetElecCharacter.returns.astBrand","targetProperty":"parameters.arg2"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"app.wsAssetDetailGetLostAssetElecCharacter.returns.astGroup","targetProperty":"parameters.arg1"}, {}]
				}]
			}]
		}], 
		wsAssetDetailGetLostAssetElecCharacter: ["wm.ServiceVariable", {"operation":"getLostAssetElecCharacter","service":"WebServiceDetailAssetService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getLostAssetElecCharacterInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"app.wsAssetDetailGetLostAssetElec.returns.caseNo","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"app.wsAssetDetailGetLostAssetElec.returns.caseY","targetProperty":"parameters.arg1"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"app.wsAssetDetailGetLostAssetElec.returns.caseOff","targetProperty":"parameters.arg2"}, {}],
					wire3: ["wm.Wire", {"expression":undefined,"source":"app.wsAssetDetailGetLostAssetElec.returns.astId","targetProperty":"parameters.arg3"}, {}]
				}]
			}]
		}], 
		wsAssetDetailGetLostAssetGun: ["wm.ServiceVariable", {"operation":"getLostAssetGun","service":"WebServiceDetailAssetService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getLostAssetGunInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"app.wsAssetListGetLostAssetListGun.returns.caseNo","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"app.wsAssetListGetLostAssetListGun.returns.caseY","targetProperty":"parameters.arg1"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"app.wsAssetListGetLostAssetListGun.returns.caseOff","targetProperty":"parameters.arg2"}, {}],
					wire3: ["wm.Wire", {"expression":undefined,"source":"app.wsAssetListGetLostAssetListGun.returns.astId","targetProperty":"parameters.arg3"}, {}]
				}]
			}]
		}], 
		wsAssetDetailGetLostAssetGunBrand: ["wm.ServiceVariable", {"operation":"getLostAssetGunBrand","service":"WebServiceDetailAssetService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getLostAssetGunBrandInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"app.wsAssetDetailGetLostAssetGunDetail.returns.cctMakerCode","targetProperty":"parameters.arg0"}, {}]
				}]
			}]
		}], 
		wsAssetDetailGetLostAssetGunDetail: ["wm.ServiceVariable", {"operation":"getLostAssetGunDetail","service":"WebServiceDetailAssetService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getLostAssetGunDetailInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"app.wsAssetDetailGetLostAssetGun.returns.caseNo","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"app.wsAssetDetailGetLostAssetGun.returns.caseY","targetProperty":"parameters.arg1"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"app.wsAssetDetailGetLostAssetGun.returns.caseOff","targetProperty":"parameters.arg2"}, {}],
					wire3: ["wm.Wire", {"expression":undefined,"source":"app.wsAssetDetailGetLostAssetGun.returns.astId","targetProperty":"parameters.arg3"}, {}]
				}]
			}]
		}], 
		wsAssetDetailGetLostAssetUnknows: ["wm.ServiceVariable", {"operation":"getLostAssetUnknows","service":"WebServiceDetailAssetService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getLostAssetUnknowsInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"app.wsAssetListGetLostAssetListUnknowPrice.returns.caseNo","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"app.wsAssetListGetLostAssetListUnknowPrice.returns.caseY","targetProperty":"parameters.arg1"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"app.wsAssetListGetLostAssetListUnknowPrice.returns.caseOff","targetProperty":"parameters.arg2"}, {}],
					wire3: ["wm.Wire", {"expression":undefined,"source":"app.wsAssetListGetLostAssetListUnknowPrice.returns.astId","targetProperty":"parameters.arg3"}, {}]
				}]
			}]
		}], 
		wsAssetDetailGetLostAssetUnknowsDetail: ["wm.ServiceVariable", {"operation":"getLostAssetUnknowsDetail","service":"WebServiceDetailAssetService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getLostAssetUnknowsDetailInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"app.wsAssetDetailGetLostAssetUnknows.returns.caseNo","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"app.wsAssetDetailGetLostAssetUnknows.returns.caseY","targetProperty":"parameters.arg1"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"app.wsAssetDetailGetLostAssetUnknows.returns.caseOff","targetProperty":"parameters.arg2"}, {}],
					wire3: ["wm.Wire", {"expression":undefined,"source":"app.wsAssetDetailGetLostAssetUnknows.returns.astId","targetProperty":"parameters.arg3"}, {}]
				}]
			}]
		}], 
		wsAssetListGetLostAsseetListAccessories: ["wm.ServiceVariable", {"operation":"getLostAsseetListAccessories","service":"WebServiceListAssetService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getLostAsseetListAccessoriesInputs"}, {}]
		}], 
		wsAssetListGetLostAssetListElec: ["wm.ServiceVariable", {"operation":"getLostAssetListElec","service":"WebServiceListAssetService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getLostAssetListElecInputs"}, {}]
		}], 
		wsAssetListGetLostAssetListGun: ["wm.ServiceVariable", {"operation":"getLostAssetListGun","service":"WebServiceListAssetService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getLostAssetListGunInputs"}, {}]
		}], 
		wsAssetListGetLostAssetListUnknowPrice: ["wm.ServiceVariable", {"operation":"getLostAssetListUnknowPrice","service":"WebServiceListAssetService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getLostAssetListUnknowPriceInputs"}, {}]
		}], 
		wsLawsuitDetailGetCarLost: ["wm.ServiceVariable", {"operation":"getCarLost","service":"WebServiceDetailLawsuitService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getCarLostInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetLostCar.returns.caseNo","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetLostCar.returns.caseY","targetProperty":"parameters.arg1"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetLostCar.returns.caseOff","targetProperty":"parameters.arg2"}, {}],
					wire3: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetLostCar.returns.carSEQ","targetProperty":"parameters.arg3"}, {}]
				}]
			}]
		}], 
		wsLawsuitDetailGetCarLostColor: ["wm.ServiceVariable", {"operation":"getCarLostColor","service":"WebServiceDetailLawsuitService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getCarLostColorInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetLostCar.returns.caseNo","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetLostCar.returns.caseY","targetProperty":"parameters.arg1"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetLostCar.returns.caseOff","targetProperty":"parameters.arg2"}, {}],
					wire3: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetLostCar.returns.carSEQ","targetProperty":"parameters.arg3"}, {}]
				}]
			}]
		}], 
		wsLawsuitDetailGetCrime: ["wm.ServiceVariable", {"operation":"getCrime","service":"WebServiceDetailLawsuitService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getCrimeInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetCrime.returns.orgCode","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetCrime.returns.crimeNo","targetProperty":"parameters.arg1"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetCrime.returns.crimeYear","targetProperty":"parameters.arg2"}, {}]
				}]
			}]
		}], 
		wsLawsuitDetailGetCrimeComplainant: ["wm.ServiceVariable", {"operation":"getCrimeComplainant","service":"WebServiceDetailLawsuitService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getCrimeComplainantInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetCrimeOther.returns.orgCode","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetCrimeOther.returns.crimeNo","targetProperty":"parameters.arg1"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetCrimeOther.returns.crimeYear","targetProperty":"parameters.arg2"}, {}]
				}]
			}]
		}], 
		wsLawsuitDetailGetCrimeOffender: ["wm.ServiceVariable", {"operation":"getCrimeOffender","service":"WebServiceDetailLawsuitService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getCrimeOffenderInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetCrimeOther.returns.orgCode","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetCrimeOther.returns.crimeNo","targetProperty":"parameters.arg1"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetCrimeOther.returns.crimeYear","targetProperty":"parameters.arg2"}, {}]
				}]
			}]
		}], 
		wsLawsuitDetailGetCrimeOther: ["wm.ServiceVariable", {"operation":"getCrimeOther","service":"WebServiceDetailLawsuitService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getCrimeOtherInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetCrimeOther.returns.orgCode","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetCrimeOther.returns.crimeNo","targetProperty":"parameters.arg1"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetCrimeOther.returns.crimeYear","targetProperty":"parameters.arg2"}, {}]
				}]
			}]
		}], 
		wsLawsuitDetailGetLostAsset: ["wm.ServiceVariable", {"operation":"getLostAsset","service":"WebServiceDetailLawsuitService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getLostAssetInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetLostAsset.returns.caseNo","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetLostAsset.returns.caseY","targetProperty":"parameters.arg1"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetLostAsset.returns.caseOff","targetProperty":"parameters.arg2"}, {}],
					wire3: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetLostAsset.returns.astId","targetProperty":"parameters.arg3"}, {}]
				}]
			}]
		}], 
		wsLawsuitDetailGetLostAssetDetail: ["wm.ServiceVariable", {"operation":"getLostAssetDetail","service":"WebServiceDetailLawsuitService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getLostAssetDetailInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetLostAsset.returns.caseNo","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetLostAsset.returns.caseY","targetProperty":"parameters.arg1"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetLostAsset.returns.caseOff","targetProperty":"parameters.arg2"}, {}],
					wire3: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetLostAsset.returns.astId","targetProperty":"parameters.arg3"}, {}]
				}]
			}]
		}], 
		wsLawsuitDetailGetLostCarCrime: ["wm.ServiceVariable", {"operation":"getLostCarCrime","service":"WebServiceDetailLawsuitService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getLostCarCrimeInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetLostCarCrime.returns.crimeNo","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetLostCarCrime.returns.crimeYear","targetProperty":"parameters.arg1"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetLostCarCrime.returns.orgCode","targetProperty":"parameters.arg2"}, {}],
					wire3: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetLostCarCrime.returns.vehicleNo","targetProperty":"parameters.arg3"}, {}]
				}]
			}]
		}], 
		wsLawsuitDetailGetLostMan: ["wm.ServiceVariable", {"operation":"getLostMan","service":"WebServiceDetailLawsuitService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getLostManInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetLostMan.returns.lostNo","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetLostMan.returns.lostY","targetProperty":"parameters.arg1"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetLostMan.returns.lostOff","targetProperty":"parameters.arg2"}, {}]
				}]
			}]
		}], 
		wsLawsuitDetailGetOjHis: ["wm.ServiceVariable", {"operation":"getOjHis","service":"WebServiceDetailLawsuitService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getOjHisInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetOjHis.returns.cardId","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetOjHis.returns.cardType","targetProperty":"parameters.arg1"}, {}]
				}]
			}]
		}], 
		wsLawsuitDetailGetOjHisAcquitted: ["wm.ServiceVariable", {"operation":"getOjHisAcquitted","service":"WebServiceDetailLawsuitService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getOjHisAcquittedInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetOjHis.returns.cardId","targetProperty":"parameters.arg0"}, {}]
				}]
			}]
		}], 
		wsLawsuitDetailGetOjHisJudgments: ["wm.ServiceVariable", {"operation":"getOjHisJudgments","service":"WebServiceDetailLawsuitService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getOjHisJudgmentsInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetOjHis.returns.cardId","targetProperty":"parameters.arg0"}, {}]
				}]
			}]
		}], 
		wsLawsuitDetailGetPlanHisName: ["wm.ServiceVariable", {"operation":"getPlanHisName","service":"WebServiceDetailLawsuitService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getPlanHisNameInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetPlanHis.returns.cardId","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetPlanHis.returns.cardType","targetProperty":"parameters.arg1"}, {}]
				}]
			}]
		}], 
		wsLawsuitDetailGetPlanHisOtherName: ["wm.ServiceVariable", {"operation":"getPlanHisOtherName","service":"WebServiceDetailLawsuitService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getPlanHisOtherNameInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetPlanHis.returns.cardId","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetPlanHis.returns.cardType","targetProperty":"parameters.arg1"}, {}]
				}]
			}]
		}], 
		wsLawsuitDetailGetPlanHisSpouse: ["wm.ServiceVariable", {"operation":"getPlanHisSpouse","service":"WebServiceDetailLawsuitService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getPlanHisSpouseInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetPlanHis.returns.cardId","targetProperty":"parameters.arg0"}, {}]
				}]
			}]
		}], 
		wsLawsuitDetailGetWanHisCrime: ["wm.ServiceVariable", {"operation":"getWanHisCrime","service":"WebServiceDetailLawsuitService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getWanHisCrimeInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetWanHisCrime.returns.orgCode","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetWanHisCrime.returns.crimeNo","targetProperty":"parameters.arg1"}, {}],
					wire3: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetWanHisCrime.returns.offenderNo","targetProperty":"parameters.arg3"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetWanHisCrime.returns.crimeYear","targetProperty":"parameters.arg2"}, {}]
				}]
			}]
		}], 
		wsLawsuitDetailGetWanHisDownload: ["wm.ServiceVariable", {"operation":"getWanHisDownload","service":"WebServiceDetailLawsuitService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getWanHisDownloadInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetWanHisCrime.returns.orgCode","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetWanHisCrime.returns.crimeNo","targetProperty":"parameters.arg1"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetWanHisCrime.returns.crimeYear","targetProperty":"parameters.arg2"}, {}],
					wire3: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetWanHisCrime.returns.offenderNo","targetProperty":"parameters.arg3"}, {}]
				}]
			}]
		}], 
		wsLawsuitDetailGetWanHisDownloadTraf: ["wm.ServiceVariable", {"operation":"getWanHisDownloadTraf","service":"WebServiceDetailLawsuitService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getWanHisDownloadTrafInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetWanHisTraf.returns.orgCode","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetWanHisTraf.returns.cgtAccideCode","targetProperty":"parameters.arg1"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetWanHisTraf.returns.cgtAccideYY","targetProperty":"parameters.arg2"}, {}],
					wire3: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetWanHisTraf.returns.carSEQ","targetProperty":"parameters.arg3"}, {}]
				}]
			}]
		}], 
		wsLawsuitDetailGetWanHisEducation: ["wm.ServiceVariable", {"operation":"getWanHisEducation","service":"WebServiceDetailLawsuitService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getWanHisEducationInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetWanHis.returns.cardId","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetWanHis.returns.cardType","targetProperty":"parameters.arg1"}, {}]
				}]
			}]
		}], 
		wsLawsuitDetailGetWanHisEducationStatus: ["wm.ServiceVariable", {"operation":"getWanHisEducateStatus","service":"WebServiceDetailLawsuitService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getWanHisEducateStatusInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetWanHis.returns.cardId","targetProperty":"parameters.arg0"}, {}]
				}]
			}]
		}], 
		wsLawsuitDetailGetWanHisProv: ["wm.ServiceVariable", {"operation":"getWanHisProv","service":"WebServiceDetailLawsuitService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getWanHisProvInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetWanHisCrime.returns.orgCode","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetWanHisCrime.returns.crimeNo","targetProperty":"parameters.arg1"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetWanHisCrime.returns.crimeYear","targetProperty":"parameters.arg2"}, {}],
					wire3: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetWanHisCrime.returns.offenderNo","targetProperty":"parameters.arg3"}, {}]
				}]
			}]
		}], 
		wsLawsuitDetailGetWanHisProvince: ["wm.ServiceVariable", {"operation":"getWanHisProvince","service":"WebServiceDetailLawsuitService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getWanHisProvinceInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetWanHisTraf.returns.orgCode","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetWanHisTraf.returns.cgtAccideYY","targetProperty":"parameters.arg1"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetWanHisTraf.returns.cgtAccideCode","targetProperty":"parameters.arg2"}, {}]
				}]
			}]
		}], 
		wsLawsuitDetailGetWanHisTraffic: ["wm.ServiceVariable", {"operation":"getWanHisTraffic","service":"WebServiceDetailLawsuitService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getWanHisTrafficInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetWanHisTraf.returns.orgCode","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetWanHisTraf.returns.cgtAccideYY","targetProperty":"parameters.arg1"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetWanHisTraf.returns.carSEQ","targetProperty":"parameters.arg2"}, {}],
					wire3: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetWanHisTraf.returns.cgtAccideCode","targetProperty":"parameters.arg3"}, {}]
				}]
			}]
		}], 
		wsLawsuitListGetCrime: ["wm.ServiceVariable", {"operation":"getCrimeList","service":"WebServiceListLawsuitService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getCrimeListInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"[polis41].text1.dataValue","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"[polis41].text1.dataValue","targetProperty":"parameters.arg1"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"[polis41].text6.dataValue","targetProperty":"parameters.arg2"}, {}],
					wire3: ["wm.Wire", {"expression":undefined,"source":"[polis41].text7.dataValue","targetProperty":"parameters.arg3"}, {}],
					wire4: ["wm.Wire", {"expression":undefined,"source":"[polis41].jquerydatepicker1.dataValue","targetProperty":"parameters.arg4"}, {}],
					wire5: ["wm.Wire", {"expression":undefined,"source":"[polis41].jquerydatepicker1.dataValue","targetProperty":"parameters.arg5"}, {}],
					wire6: ["wm.Wire", {"expression":undefined,"source":"[polis41].text3.dataValue","targetProperty":"parameters.arg6"}, {}],
					wire7: ["wm.Wire", {"expression":undefined,"source":"[polis41].text4.dataValue","targetProperty":"parameters.arg7"}, {}]
				}]
			}]
		}], 
		wsLawsuitListGetCrimeOther: ["wm.ServiceVariable", {"operation":"getCrimeListOther","service":"WebServiceListLawsuitService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getCrimeListOtherInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"[polis42].text1.dataValue","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"[polis42].text2.dataValue","targetProperty":"parameters.arg1"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"[polis42].text15.dataValue","targetProperty":"parameters.arg2"}, {}],
					wire3: ["wm.Wire", {"expression":undefined,"source":"[polis42].jquerydatepicker1.dataValue","targetProperty":"parameters.arg3"}, {}],
					wire4: ["wm.Wire", {"expression":undefined,"source":"[polis42].jquerydatepicker4.dataValue","targetProperty":"parameters.arg4"}, {}],
					wire5: ["wm.Wire", {"expression":undefined,"source":"[polis42].text5.dataValue","targetProperty":"parameters.arg5"}, {}],
					wire6: ["wm.Wire", {"expression":undefined,"source":"[polis42].text9.dataValue","targetProperty":"parameters.arg6"}, {}],
					wire7: ["wm.Wire", {"expression":undefined,"source":"[polis42].jquerydatepicker2.dataValue","targetProperty":"parameters.arg7"}, {}],
					wire8: ["wm.Wire", {"expression":undefined,"source":"[polis42].jquerydatepicker5.dataValue","targetProperty":"parameters.arg8"}, {}],
					wire9: ["wm.Wire", {"expression":undefined,"source":"[polis42].text6.dataValue","targetProperty":"parameters.arg9"}, {}],
					wire10: ["wm.Wire", {"expression":undefined,"source":"[polis42].text10.dataValue","targetProperty":"parameters.arg10"}, {}],
					wire11: ["wm.Wire", {"expression":undefined,"source":"[polis42].text11.dataValue","targetProperty":"parameters.arg11"}, {}],
					wire12: ["wm.Wire", {"expression":undefined,"source":"[polis42].text17.dataValue","targetProperty":"parameters.arg12"}, {}],
					wire13: ["wm.Wire", {"expression":undefined,"source":"[polis42].text13.dataValue","targetProperty":"parameters.arg15"}, {}],
					wire14: ["wm.Wire", {"expression":undefined,"source":"[polis42].text19.dataValue","targetProperty":"parameters.arg16"}, {}],
					wire15: ["wm.Wire", {"expression":undefined,"source":"[polis42].text20.dataValue","targetProperty":"parameters.arg17"}, {}],
					wire16: ["wm.Wire", {"expression":undefined,"source":"[polis42].text22.dataValue","targetProperty":"parameters.arg18"}, {}],
					wire17: ["wm.Wire", {"expression":undefined,"source":"[polis42].text24.dataValue","targetProperty":"parameters.arg19"}, {}],
					wire18: ["wm.Wire", {"expression":undefined,"source":"[polis42].text26.dataValue","targetProperty":"parameters.arg20"}, {}],
					wire19: ["wm.Wire", {"expression":undefined,"source":"[polis42].text28.dataValue","targetProperty":"parameters.arg21"}, {}],
					wire20: ["wm.Wire", {"expression":undefined,"source":"[polis42].text29.dataValue","targetProperty":"parameters.arg22"}, {}],
					wire21: ["wm.Wire", {"expression":undefined,"source":"[polis42].text30.dataValue","targetProperty":"parameters.arg23"}, {}],
					wire22: ["wm.Wire", {"expression":undefined,"source":"[polis42].text31.dataValue","targetProperty":"parameters.arg24"}, {}],
					wire23: ["wm.Wire", {"expression":undefined,"source":"[polis42].text32.dataValue","targetProperty":"parameters.arg25"}, {}],
					wire24: ["wm.Wire", {"expression":undefined,"source":"[polis42].text33.dataValue","targetProperty":"parameters.arg26"}, {}],
					wire25: ["wm.Wire", {"expression":"\"\"","source":false,"targetProperty":"parameters.arg13"}, {}],
					wire26: ["wm.Wire", {"expression":"\"\"","source":false,"targetProperty":"parameters.arg14"}, {}]
				}]
			}]
		}], 
		wsLawsuitListGetLostAsset: ["wm.ServiceVariable", {"operation":"getLostAssetList","service":"WebServiceListLawsuitService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getLostAssetListInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"[polis42].text1.dataValue","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"[polis42].text2.dataValue","targetProperty":"parameters.arg1"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"[polis42].text15.dataValue","targetProperty":"parameters.arg2"}, {}],
					wire3: ["wm.Wire", {"expression":undefined,"source":"[polis42].jquerydatepicker2.dataValue","targetProperty":"parameters.arg3"}, {}],
					wire4: ["wm.Wire", {"expression":undefined,"source":"[polis42].jquerydatepicker5.dataValue","targetProperty":"parameters.arg4"}, {}],
					wire5: ["wm.Wire", {"expression":undefined,"source":"[polis42].text6.dataValue","targetProperty":"parameters.arg5"}, {}],
					wire6: ["wm.Wire", {"expression":undefined,"source":"[polis42].text10.dataValue","targetProperty":"parameters.arg6"}, {}]
				}]
			}]
		}], 
		wsLawsuitListGetLostCar: ["wm.ServiceVariable", {"operation":"getLostCarList","service":"WebServiceListLawsuitService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getLostCarListInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"[polis42].text1.dataValue","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"[polis42].text2.dataValue","targetProperty":"parameters.arg1"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"[polis42].text15.dataValue","targetProperty":"parameters.arg2"}, {}]
				}]
			}]
		}], 
		wsLawsuitListGetLostCarCrime: ["wm.ServiceVariable", {"operation":"getLostCarListCrime","service":"WebServiceListLawsuitService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getLostCarListCrimeInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"[polis42].text1.dataValue","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"[polis42].text2.dataValue","targetProperty":"parameters.arg1"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"[polis42].text15.dataValue","targetProperty":"parameters.arg2"}, {}],
					wire3: ["wm.Wire", {"expression":"\"1\"","source":false,"targetProperty":"parameters.arg3"}, {}]
				}]
			}]
		}], 
		wsLawsuitListGetLostMan: ["wm.ServiceVariable", {"operation":"getLostManList","service":"WebServiceListLawsuitService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getLostManListInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"[polis42].text15.dataValue","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"[polis42].jquerydatepicker1.dataValue","targetProperty":"parameters.arg1"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"[polis42].jquerydatepicker4.dataValue","targetProperty":"parameters.arg2"}, {}],
					wire3: ["wm.Wire", {"expression":undefined,"source":"[polis42].text5.dataValue","targetProperty":"parameters.arg3"}, {}],
					wire4: ["wm.Wire", {"expression":undefined,"source":"[polis42].text9.dataValue","targetProperty":"parameters.arg4"}, {}],
					wire5: ["wm.Wire", {"expression":undefined,"source":"[polis42].jquerydatepicker2.dataValue","targetProperty":"parameters.arg5"}, {}],
					wire6: ["wm.Wire", {"expression":undefined,"source":"[polis42].jquerydatepicker5.dataValue","targetProperty":"parameters.arg6"}, {}],
					wire7: ["wm.Wire", {"expression":undefined,"source":"[polis42].text6.dataValue","targetProperty":"parameters.arg7"}, {}],
					wire8: ["wm.Wire", {"expression":undefined,"source":"[polis42].text10.dataValue","targetProperty":"parameters.arg8"}, {}],
					wire9: ["wm.Wire", {"expression":undefined,"source":"[polis42].text11.dataValue","targetProperty":"parameters.arg9"}, {}]
				}]
			}]
		}], 
		wsLawsuitListGetOjHis: ["wm.ServiceVariable", {"operation":"getOjHisList","service":"WebServiceListLawsuitService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getOjHisListInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":"\"O\"","source":false,"targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"[polis42].text15.dataValue","targetProperty":"parameters.arg1"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"[polis42].text3.dataValue","targetProperty":"parameters.arg2"}, {}],
					wire3: ["wm.Wire", {"expression":undefined,"source":"[polis42].text4.dataValue","targetProperty":"parameters.arg3"}, {}],
					wire4: ["wm.Wire", {"expression":undefined,"source":"[polis42].text7.dataValue","targetProperty":"parameters.arg4"}, {}],
					wire5: ["wm.Wire", {"expression":undefined,"source":"[polis42].text8.dataValue","targetProperty":"parameters.arg5"}, {}],
					wire6: ["wm.Wire", {"expression":undefined,"source":"[polis42].jquerydatepicker3.dataValue","targetProperty":"parameters.arg6"}, {}],
					wire7: ["wm.Wire", {"expression":undefined,"source":"[polis42].jquerydatepicker6.dataValue","targetProperty":"parameters.arg7"}, {}],
					wire8: ["wm.Wire", {"expression":undefined,"source":"[polis42].text19.dataValue","targetProperty":"parameters.arg8"}, {}],
					wire9: ["wm.Wire", {"expression":undefined,"source":"[polis42].text17.dataValue","targetProperty":"parameters.arg12"}, {}],
					wire10: ["wm.Wire", {"expression":"\"\"","source":false,"targetProperty":"parameters.arg13"}, {}],
					wire11: ["wm.Wire", {"expression":"\"\"","source":false,"targetProperty":"parameters.arg14"}, {}],
					wire12: ["wm.Wire", {"expression":"\"\"","source":false,"targetProperty":"parameters.arg9"}, {}],
					wire13: ["wm.Wire", {"expression":"\"\"","source":false,"targetProperty":"parameters.arg10"}, {}],
					wire14: ["wm.Wire", {"expression":"\"\"","source":false,"targetProperty":"parameters.arg11"}, {}]
				}]
			}]
		}], 
		wsLawsuitListGetPlanHis: ["wm.ServiceVariable", {"operation":"getPlanHisList","service":"WebServiceListLawsuitService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getPlanHisListInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"[polis42].text1.dataValue","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"[polis42].text2.dataValue","targetProperty":"parameters.arg1"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"[polis42].text15.dataValue","targetProperty":"parameters.arg2"}, {}],
					wire3: ["wm.Wire", {"expression":undefined,"source":"[polis42].text17.dataValue","targetProperty":"parameters.arg3"}, {}],
					wire4: ["wm.Wire", {"expression":"\"\"","source":false,"targetProperty":"parameters.arg4"}, {}],
					wire5: ["wm.Wire", {"expression":"\"\"","source":false,"targetProperty":"parameters.arg5"}, {}],
					wire6: ["wm.Wire", {"expression":undefined,"source":"[polis42].text13.dataValue","targetProperty":"parameters.arg6"}, {}],
					wire7: ["wm.Wire", {"expression":"\"P\"","source":false,"targetProperty":"parameters.arg7"}, {}]
				}]
			}]
		}], 
		wsLawsuitListGetWanHis: ["wm.ServiceVariable", {"operation":"getWanHisList","service":"WebServiceListLawsuitService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getWanHisListInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"[polis42].text1.dataValue","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"[polis42].text2.dataValue","targetProperty":"parameters.arg1"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"[polis42].text15.dataValue","targetProperty":"parameters.arg2"}, {}],
					wire3: ["wm.Wire", {"expression":undefined,"source":"[polis42].jquerydatepicker2.dataValue","targetProperty":"parameters.arg3"}, {}],
					wire4: ["wm.Wire", {"expression":undefined,"source":"[polis42].jquerydatepicker5.dataValue","targetProperty":"parameters.arg4"}, {}],
					wire5: ["wm.Wire", {"expression":undefined,"source":"[polis42].text6.dataValue","targetProperty":"parameters.arg5"}, {}],
					wire6: ["wm.Wire", {"expression":undefined,"source":"[polis42].text10.dataValue","targetProperty":"parameters.arg6"}, {}],
					wire7: ["wm.Wire", {"expression":undefined,"source":"[polis42].text17.dataValue","targetProperty":"parameters.arg7"}, {}],
					wire8: ["wm.Wire", {"expression":"\"\"","source":false,"targetProperty":"parameters.arg8"}, {}],
					wire9: ["wm.Wire", {"expression":"\"\"","source":false,"targetProperty":"parameters.arg9"}, {}],
					wire10: ["wm.Wire", {"expression":undefined,"source":"[polis42].text13.dataValue","targetProperty":"parameters.arg10"}, {}]
				}]
			}]
		}], 
		wsLawsuitListGetWanHisCrime: ["wm.ServiceVariable", {"operation":"getWanHisListCrime","service":"WebServiceListLawsuitService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getWanHisListCrimeInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"[polis42].text1.dataValue","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"[polis42].text2.dataValue","targetProperty":"parameters.arg1"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"[polis42].text15.dataValue","targetProperty":"parameters.arg2"}, {}],
					wire3: ["wm.Wire", {"expression":undefined,"source":"[polis42].jquerydatepicker2.dataValue","targetProperty":"parameters.arg3"}, {}],
					wire4: ["wm.Wire", {"expression":undefined,"source":"[polis42].jquerydatepicker5.dataValue","targetProperty":"parameters.arg4"}, {}],
					wire5: ["wm.Wire", {"expression":undefined,"source":"[polis42].text6.dataValue","targetProperty":"parameters.arg5"}, {}],
					wire6: ["wm.Wire", {"expression":undefined,"source":"[polis42].text10.dataValue","targetProperty":"parameters.arg6"}, {}],
					wire7: ["wm.Wire", {"expression":undefined,"source":"[polis42].text13.dataValue","targetProperty":"parameters.arg7"}, {}],
					wire8: ["wm.Wire", {"expression":undefined,"source":"[polis42].text17.dataValue","targetProperty":"parameters.arg8"}, {}],
					wire9: ["wm.Wire", {"expression":"\"\"","source":false,"targetProperty":"parameters.arg9"}, {}],
					wire10: ["wm.Wire", {"expression":"\"\"","source":false,"targetProperty":"parameters.arg10"}, {}]
				}]
			}]
		}], 
		wsLawsuitListGetWanHisTraf: ["wm.ServiceVariable", {"operation":"getWanHisListTraf","service":"WebServiceListLawsuitService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getWanHisListTrafInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"[polis42].text1.dataValue","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"[polis42].text2.dataValue","targetProperty":"parameters.arg1"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"[polis42].text15.dataValue","targetProperty":"parameters.arg2"}, {}],
					wire3: ["wm.Wire", {"expression":undefined,"source":"[polis42].jquerydatepicker2.dataValue","targetProperty":"parameters.arg3"}, {}],
					wire4: ["wm.Wire", {"expression":undefined,"source":"[polis42].jquerydatepicker5.dataValue","targetProperty":"parameters.arg4"}, {}],
					wire5: ["wm.Wire", {"expression":undefined,"source":"[polis42].text6.dataValue","targetProperty":"parameters.arg5"}, {}],
					wire6: ["wm.Wire", {"expression":undefined,"source":"[polis42].text10.dataValue","targetProperty":"parameters.arg6"}, {}]
				}]
			}]
		}], 
		wsLawsutDetailGetPlanHis: ["wm.ServiceVariable", {"operation":"getPlanHis","service":"WebServiceDetailLawsuitService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getPlanHisInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetPlanHis.returns.cardId","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"app.wsLawsuitListGetPlanHis.returns.cardType","targetProperty":"parameters.arg1"}, {}]
				}]
			}]
		}], 
		wsLocationDetailGetPerson: ["wm.ServiceVariable", {"operation":"getPerson","service":"WebServiceDetailLocationService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getPersonInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"[resultList6002].dojoGrid1.selectedItem.perCde","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"[resultList6002].dojoGrid1.selectedItem.orgCde","targetProperty":"parameters.arg1"}, {}]
				}]
			}]
		}], 
		wsLocationDetailGetPersonOffender: ["wm.ServiceVariable", {"operation":"getpersonOffender","service":"WebServiceDetailLocationService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getpersonOffenderInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"[resultList6002].dojoGrid1.selectedItem.perCde","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"[resultList6002].dojoGrid1.selectedItem.orgCde","targetProperty":"parameters.arg1"}, {}]
				}]
			}]
		}], 
		wsLocationDetailGetPersonVInfor: ["wm.ServiceVariable", {"operation":"getPersonVInfor","service":"WebServiceDetailLocationService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getPersonVInforInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"[resultList6002].dojoGrid1.selectedItem.perCde","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"[resultList6002].dojoGrid1.selectedItem.orgCde","targetProperty":"parameters.arg1"}, {}]
				}]
			}]
		}], 
		wsLocationDetailGetPlace: ["wm.ServiceVariable", {"operation":"getPlace","service":"WebServiceDetailLocationService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getPlaceInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"[resultList6003].dojoGrid1.selectedItem.placeCde","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"[resultList6003].dojoGrid1.selectedItem.orgCde","targetProperty":"parameters.arg1"}, {}]
				}]
			}]
		}], 
		wsLocationDetailGetPlaceHisCase: ["wm.ServiceVariable", {"operation":"getPlaceHisCase","service":"WebServiceDetailLocationService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getPlaceHisCaseInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"[resultList6003].dojoGrid1.selectedItem.placeCde","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"[resultList6003].dojoGrid1.selectedItem.orgCde","targetProperty":"parameters.arg1"}, {}]
				}]
			}]
		}], 
		wsLocationDetailGetPlaceInvol: ["wm.ServiceVariable", {"operation":"getPlacePeopleInvol","service":"WebServiceDetailLocationService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getPlacePeopleInvolInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"[resultList6003].dojoGrid1.selectedItem.placeCde","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"[resultList6003].dojoGrid1.selectedItem.orgCde","targetProperty":"parameters.arg1"}, {}]
				}]
			}]
		}], 
		wsLocationDetailGetPlaceTypePerson: ["wm.ServiceVariable", {"operation":"getPlaceTypePerson","service":"WebServiceDetailLocationService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getPlaceTypePersonInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"[resultList6003].dojoGrid1.selectedItem.placeType","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"[resultList6003].dojoGrid1.selectedItem.placeSubtype","targetProperty":"parameters.arg1"}, {}]
				}]
			}]
		}], 
		wsLocationListGetPerson: ["wm.ServiceVariable", {"operation":"getPersonList","service":"WebServiceListLocationService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getPersonListInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"[polis60].text10.dataValue","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"[polis60].text2.dataValue","targetProperty":"parameters.arg1"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"[polis60].text13.dataValue","targetProperty":"parameters.arg2"}, {}],
					wire3: ["wm.Wire", {"expression":undefined,"source":"[polis60].text11.dataValue","targetProperty":"parameters.arg3"}, {}],
					wire4: ["wm.Wire", {"expression":undefined,"source":"[polis60].text12.dataValue","targetProperty":"parameters.arg4"}, {}],
					wire5: ["wm.Wire", {"expression":undefined,"source":"[polis60].text14.dataValue","targetProperty":"parameters.arg5"}, {}]
				}]
			}]
		}], 
		wsLocationListGetPlace: ["wm.ServiceVariable", {"operation":"getPlaceList","service":"WebServiceListLocationService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getPlaceListInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"[polis60].text10.dataValue","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"[polis60].text6.dataValue","targetProperty":"parameters.arg2"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"[polis60].text9.dataValue","targetProperty":"parameters.arg3"}, {}],
					wire3: ["wm.Wire", {"expression":undefined,"source":"[polis60].text1.dataValue","targetProperty":"parameters.arg4"}, {}],
					wire4: ["wm.Wire", {"expression":undefined,"source":"[polis60].text2.dataValue","targetProperty":"parameters.arg5"}, {}],
					wire5: ["wm.Wire", {"expression":undefined,"source":"[polis60].text13.dataValue","targetProperty":"parameters.arg6"}, {}],
					wire6: ["wm.Wire", {"expression":undefined,"source":"[polis60].text11.dataValue","targetProperty":"parameters.arg7"}, {}],
					wire7: ["wm.Wire", {"expression":undefined,"source":"[polis60].text12.dataValue","targetProperty":"parameters.arg8"}, {}],
					wire8: ["wm.Wire", {"expression":undefined,"source":"[polis60].text14.dataValue","targetProperty":"parameters.arg9"}, {}],
					wire9: ["wm.Wire", {"expression":undefined,"source":"[polis60].selectMenu1.selectedItem.dataValue","targetProperty":"parameters.arg1"}, {}]
				}]
			}]
		}], 
		wsVehicleDetailGetAccNation: ["wm.ServiceVariable", {"operation":"getAccNation","service":"WebServiceDetailVehicleService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getAccNationInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleDetailGetAccidentCar.returns.cgtAccideCode","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleDetailGetAccidentCar.returns.cgtAccideYY","targetProperty":"parameters.arg1"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleDetailGetAccidentCar.returns.orgCode","targetProperty":"parameters.arg2"}, {}],
					wire3: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleDetailGetAccidentCar.returns.carSEQ","targetProperty":"parameters.arg3"}, {}]
				}]
			}]
		}], 
		wsVehicleDetailGetAccidentCar: ["wm.ServiceVariable", {"operation":"getAccidentCar","service":"WebServiceDetailVehicleService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getAccidentCarInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleListGetAccidentCarList.returns.cgtAccideCode","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleListGetAccidentCarList.returns.cgtAccideYY","targetProperty":"parameters.arg1"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleListGetAccidentCarList.returns.orgCode","targetProperty":"parameters.arg2"}, {}],
					wire3: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleListGetAccidentCarList.returns.carSEQ","targetProperty":"parameters.arg3"}, {}]
				}]
			}]
		}], 
		wsVehicleDetailGetCarByKey: ["wm.ServiceVariable", {"operation":"getCarByKey","service":"WebServiceDetailVehicleService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getCarByKeyInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleListGetCarList.returns.c01Plate1","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleListGetCarList.returns.c01Plate2","targetProperty":"parameters.arg1"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleListGetCarList.returns.c01OffProve","targetProperty":"parameters.arg2"}, {}],
					wire3: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleListGetCarList.returns.c01BrandCar","targetProperty":"parameters.arg3"}, {}]
				}]
			}]
		}], 
		wsVehicleDetailGetCarByKeyColor: ["wm.ServiceVariable", {"operation":"getCarByKeyColor","service":"WebServiceDetailVehicleService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getCarByKeyColorInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleListGetCarList.returns.c01Plate1","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleListGetCarList.returns.c01Plate2","targetProperty":"parameters.arg1"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleListGetCarList.returns.c01OffProve","targetProperty":"parameters.arg2"}, {}],
					wire3: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleListGetCarList.returns.c01BrandCar","targetProperty":"parameters.arg3"}, {}]
				}]
			}]
		}], 
		wsVehicleDetailGetConfiscate: ["wm.ServiceVariable", {"operation":"getConfiscate","service":"WebServiceDetailVehicleService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getConfiscateInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleListGetConfiscateList.returns.orgCode","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleListGetConfiscateList.returns.seizeCode","targetProperty":"parameters.arg1"}, {}]
				}]
			}]
		}], 
		wsVehicleDetailGetCrime: ["wm.ServiceVariable", {"operation":"getCrime","service":"WebServiceDetailVehicleService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getCrimeInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"[resultList2004].dojoGrid1.selectedItem.orgCode","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"[resultList2004].dojoGrid1.selectedItem.crimeNo","targetProperty":"parameters.arg1"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"[resultList2004].dojoGrid1.selectedItem.crimeYear","targetProperty":"parameters.arg2"}, {}],
					wire3: ["wm.Wire", {"expression":undefined,"source":"[resultList2004].dojoGrid1.selectedItem.vehicleNo","targetProperty":"parameters.arg3"}, {}]
				}]
			}]
		}], 
		wsVehicleDetailGetCrimeEXT: ["wm.ServiceVariable", {"operation":"getCrimeEXT","service":"WebServiceDetailVehicleService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getCrimeEXTInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"[resultList2004].dojoGrid1.selectedItem.orgCode","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"[resultList2004].dojoGrid1.selectedItem.crimeNo","targetProperty":"parameters.arg1"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"[resultList2004].dojoGrid1.selectedItem.crimeYear","targetProperty":"parameters.arg2"}, {}],
					wire3: ["wm.Wire", {"expression":undefined,"source":"[resultList2004].dojoGrid1.selectedItem.vehicleNo","targetProperty":"parameters.arg3"}, {}]
				}]
			}]
		}], 
		wsVehicleDetailGetIntercept: ["wm.ServiceVariable", {"operation":"getIntercept","service":"WebServiceDetailVehicleService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getInterceptInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleListGetInterceptList.returns.orgCode","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleListGetInterceptList.returns.seizeCode","targetProperty":"parameters.arg1"}, {}]
				}]
			}]
		}], 
		wsVehicleDetailGetLostCar: ["wm.ServiceVariable", {"operation":"getLostCar","service":"WebServiceDetailVehicleService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getLostCarInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleListGetLostCarList.returns.caseNo","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleListGetLostCarList.returns.caseY","targetProperty":"parameters.arg1"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleListGetLostCarList.returns.caseOff","targetProperty":"parameters.arg2"}, {}],
					wire3: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleListGetLostCarList.returns.carSEQ","targetProperty":"parameters.arg3"}, {}]
				}]
			}]
		}], 
		wsVehicleDetailGetLostCarColor: ["wm.ServiceVariable", {"operation":"getLostCarColor","service":"WebServiceDetailVehicleService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getLostCarColorInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleDetailGetLostCar.returns.caseNo","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleDetailGetLostCar.returns.caseY","targetProperty":"parameters.arg1"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleDetailGetLostCar.returns.caseOff","targetProperty":"parameters.arg2"}, {}],
					wire3: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleDetailGetLostCar.returns.carSEQ","targetProperty":"parameters.arg3"}, {}]
				}]
			}]
		}], 
		wsVehicleDetailGetLostCarPenalty: ["wm.ServiceVariable", {"operation":"getLostCarPenalty","service":"WebServiceDetailVehicleService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getLostCarPenaltyInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleListGetLostCarList2.returns.crimeNo","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleListGetLostCarList2.returns.crimeYear","targetProperty":"parameters.arg1"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleListGetLostCarList2.returns.orgCode","targetProperty":"parameters.arg2"}, {}],
					wire3: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleListGetLostCarList2.returns.vehicleNo","targetProperty":"parameters.arg3"}, {}]
				}]
			}]
		}], 
		wsVehicleDetailGetPerson: ["wm.ServiceVariable", {"operation":"getPerson","service":"WebServiceDetailVehicleService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getPersonInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleListGetPersonList.returns.perCde","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleListGetPersonList.returns.orgCde","targetProperty":"parameters.arg1"}, {}]
				}]
			}]
		}], 
		wsVehicleDetailGetPersonCRIME: ["wm.ServiceVariable", {"operation":"getPersonCRIME","service":"WebServiceDetailVehicleService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getPersonCRIMEInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleListGetPersonList.returns.perCde","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleListGetPersonList.returns.orgCde","targetProperty":"parameters.arg1"}, {}]
				}]
			}]
		}], 
		wsVehicleDetailGetPersonVEHICLE: ["wm.ServiceVariable", {"operation":"getPersonVEHICLE","service":"WebServiceDetailVehicleService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getPersonVEHICLEInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleListGetPersonList.returns.perCde","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleListGetPersonList.returns.orgCde","targetProperty":"parameters.arg1"}, {}]
				}]
			}]
		}], 
		wsVehicleDetailGetTicketMBV: ["wm.ServiceVariable", {"operation":"getTicketMBV","service":"WebServiceDetailVehicleService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getTicketMBVInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleDetailGetTickets.returns.perId","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleDetailGetTickets.returns.stationCode","targetProperty":"parameters.arg1"}, {}]
				}]
			}]
		}], 
		wsVehicleDetailGetTickets: ["wm.ServiceVariable", {"operation":"getTickets","service":"WebServiceDetailVehicleService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getTicketsInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleListGetTicketList.returns.bookPre","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleListGetTicketList.returns.bookNo","targetProperty":"parameters.arg1"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleListGetTicketList.returns.pageNo","targetProperty":"parameters.arg2"}, {}],
					wire3: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleListGetTicketList.returns.orderYear","targetProperty":"parameters.arg3"}, {}],
					wire4: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleListGetTicketList.returns.refNo","targetProperty":"parameters.arg4"}, {}]
				}]
			}]
		}], 
		wsVehicleDetailGetTrcByKey: ["wm.ServiceVariable", {"operation":"getTrcByKey","service":"WebServiceDetailVehicleService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getTrcByKeyInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleListGetTrcList.returns.trc01OffProv","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleListGetTrcList.returns.trc01OffBr","targetProperty":"parameters.arg1"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleListGetTrcList.returns.trc01Plate","targetProperty":"parameters.arg2"}, {}]
				}]
			}]
		}], 
		wsVehicleDetailGetTrcByKeyColor: ["wm.ServiceVariable", {"operation":"getTrcByKeyColor","service":"WebServiceDetailVehicleService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getTrcByKeyColorInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleDetailGetTrcByKey.returns.trc01OffProv","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleDetailGetTrcByKey.returns.trc01OffBr","targetProperty":"parameters.arg1"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"app.wsVehicleDetailGetTrcByKey.returns.trc01Plate","targetProperty":"parameters.arg2"}, {}]
				}]
			}]
		}], 
		wsVehicleListGetAccidentCarList: ["wm.ServiceVariable", {"operation":"getAccidentCarList","service":"WebServiceListVehicleService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getAccidentCarListInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"[polis20].text3.dataValue","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"[polis20].text4.dataValue","targetProperty":"parameters.arg1"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"[polis20].text5.dataValue","targetProperty":"parameters.arg2"}, {}],
					wire3: ["wm.Wire", {"expression":undefined,"source":"[polis20].text6.dataValue","targetProperty":"parameters.arg3"}, {}],
					wire4: ["wm.Wire", {"expression":undefined,"source":"[polis20].text8.dataValue","targetProperty":"parameters.arg4"}, {}]
				}]
			}]
		}], 
		wsVehicleListGetCarList: ["wm.ServiceVariable", {"operation":"getCarList","service":"WebServiceListVehicleService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getCarListInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"[polis20].text2.dataValue","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"[polis20].text3.dataValue","targetProperty":"parameters.arg1"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"[polis20].text4.dataValue","targetProperty":"parameters.arg2"}, {}],
					wire3: ["wm.Wire", {"expression":undefined,"source":"[polis20].text5.dataValue","targetProperty":"parameters.arg3"}, {}],
					wire4: ["wm.Wire", {"expression":undefined,"source":"[polis20].text6.dataValue","targetProperty":"parameters.arg4"}, {}],
					wire5: ["wm.Wire", {"expression":undefined,"source":"[polis20].text8.dataValue","targetProperty":"parameters.arg5"}, {}],
					wire6: ["wm.Wire", {"expression":undefined,"source":"[polis20].text7.dataValue","targetProperty":"parameters.arg6"}, {}],
					wire7: ["wm.Wire", {"expression":undefined,"source":"[polis20].text9.dataValue","targetProperty":"parameters.arg7"}, {}]
				}]
			}]
		}], 
		wsVehicleListGetConfiscateList: ["wm.ServiceVariable", {"operation":"getConfiscateList","service":"WebServiceListVehicleService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getConfiscateListInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"[polis20].text3.dataValue","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"[polis20].text4.dataValue","targetProperty":"parameters.arg1"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"[polis20].text5.dataValue","targetProperty":"parameters.arg2"}, {}],
					wire3: ["wm.Wire", {"expression":undefined,"source":"[polis20].text6.dataValue","targetProperty":"parameters.arg3"}, {}],
					wire4: ["wm.Wire", {"expression":undefined,"source":"[polis20].text8.dataValue","targetProperty":"parameters.arg4"}, {}],
					wire5: ["wm.Wire", {"expression":undefined,"source":"[polis20].text7.dataValue","targetProperty":"parameters.arg5"}, {}],
					wire6: ["wm.Wire", {"expression":undefined,"source":"[polis20].text9.dataValue","targetProperty":"parameters.arg6"}, {}],
					wire7: ["wm.Wire", {"expression":"\"2\"","targetProperty":"parameters.arg7"}, {}]
				}]
			}]
		}], 
		wsVehicleListGetCrimeList: ["wm.ServiceVariable", {"operation":"getCrimeList","service":"WebServiceListVehicleService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getCrimeListInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire1: ["wm.Wire", {"expression":undefined,"source":"[polis20].text1.dataValue","targetProperty":"parameters.arg1"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"[polis20].text3.dataValue","targetProperty":"parameters.arg2"}, {}],
					wire3: ["wm.Wire", {"expression":undefined,"source":"[polis20].text4.dataValue","targetProperty":"parameters.arg3"}, {}],
					wire4: ["wm.Wire", {"expression":undefined,"source":"[polis20].text5.dataValue","targetProperty":"parameters.arg4"}, {}],
					wire5: ["wm.Wire", {"expression":undefined,"source":"[polis20].text6.dataValue","targetProperty":"parameters.arg5"}, {}],
					wire6: ["wm.Wire", {"expression":undefined,"source":"[polis20].text8.dataValue","targetProperty":"parameters.arg6"}, {}],
					wire7: ["wm.Wire", {"expression":undefined,"source":"[polis20].largeTextArea1.dataValue","targetProperty":"parameters.arg7"}, {}],
					wire8: ["wm.Wire", {"expression":undefined,"source":"[polis20].text2.dataValue","targetProperty":"parameters.arg8"}, {}],
					wire9: ["wm.Wire", {"expression":undefined,"source":"[polis20].text7.dataValue","targetProperty":"parameters.arg9"}, {}],
					wire10: ["wm.Wire", {"expression":undefined,"source":"[polis20].text9.dataValue","targetProperty":"parameters.arg10"}, {}],
					wire: ["wm.Wire", {"expression":"\"\"","targetProperty":"parameters.arg0"}, {}]
				}]
			}]
		}], 
		wsVehicleListGetInterceptList: ["wm.ServiceVariable", {"operation":"getInterceptList","service":"WebServiceListVehicleService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getInterceptListInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"[polis20].text3.dataValue","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"[polis20].text4.dataValue","targetProperty":"parameters.arg1"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"[polis20].text5.dataValue","targetProperty":"parameters.arg2"}, {}],
					wire3: ["wm.Wire", {"expression":undefined,"source":"[polis20].text6.dataValue","targetProperty":"parameters.arg3"}, {}],
					wire4: ["wm.Wire", {"expression":undefined,"source":"[polis20].text8.dataValue","targetProperty":"parameters.arg4"}, {}],
					wire5: ["wm.Wire", {"expression":undefined,"source":"[polis20].text7.dataValue","targetProperty":"parameters.arg5"}, {}],
					wire6: ["wm.Wire", {"expression":undefined,"source":"[polis20].text9.dataValue","targetProperty":"parameters.arg6"}, {}],
					wire7: ["wm.Wire", {"expression":"\"1\"","targetProperty":"parameters.arg7"}, {}]
				}]
			}]
		}], 
		wsVehicleListGetLostCarList: ["wm.ServiceVariable", {"operation":"getLostCarList","service":"WebServiceListVehicleService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getLostCarListInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"[polis20].text1.dataValue","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"[polis20].text2.dataValue","targetProperty":"parameters.arg1"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"[polis20].text3.dataValue","targetProperty":"parameters.arg2"}, {}],
					wire3: ["wm.Wire", {"expression":undefined,"source":"[polis20].text4.dataValue","targetProperty":"parameters.arg3"}, {}],
					wire4: ["wm.Wire", {"expression":undefined,"source":"[polis20].text5.dataValue","targetProperty":"parameters.arg4"}, {}],
					wire5: ["wm.Wire", {"expression":undefined,"source":"[polis20].text6.dataValue","targetProperty":"parameters.arg5"}, {}],
					wire6: ["wm.Wire", {"expression":undefined,"source":"[polis20].text7.dataValue","targetProperty":"parameters.arg6"}, {}],
					wire7: ["wm.Wire", {"expression":undefined,"source":"[polis20].text9.dataValue","targetProperty":"parameters.arg7"}, {}]
				}]
			}]
		}], 
		wsVehicleListGetLostCarList2: ["wm.ServiceVariable", {"operation":"getLostCarList2","service":"WebServiceListVehicleService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getLostCarList2Inputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"[polis20].text2.dataValue","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"[polis20].text3.dataValue","targetProperty":"parameters.arg1"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"[polis20].text4.dataValue","targetProperty":"parameters.arg2"}, {}],
					wire3: ["wm.Wire", {"expression":undefined,"source":"[polis20].text5.dataValue","targetProperty":"parameters.arg3"}, {}],
					wire4: ["wm.Wire", {"expression":undefined,"source":"[polis20].text6.dataValue","targetProperty":"parameters.arg4"}, {}],
					wire5: ["wm.Wire", {"expression":undefined,"source":"[polis20].text7.dataValue","targetProperty":"parameters.arg5"}, {}],
					wire6: ["wm.Wire", {"expression":undefined,"source":"[polis20].text9.dataValue","targetProperty":"parameters.arg6"}, {}],
					wire7: ["wm.Wire", {"expression":"\"1\"","targetProperty":"parameters.arg7"}, {}]
				}]
			}]
		}], 
		wsVehicleListGetPersonList: ["wm.ServiceVariable", {"operation":"getPersonList","service":"WebServiceListVehicleService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getPersonListInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire1: ["wm.Wire", {"expression":undefined,"source":"[polis20].text3.dataValue","targetProperty":"parameters.arg1"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"[polis20].text4.dataValue","targetProperty":"parameters.arg2"}, {}],
					wire3: ["wm.Wire", {"expression":undefined,"source":"[polis20].text5.dataValue","targetProperty":"parameters.arg3"}, {}],
					wire4: ["wm.Wire", {"expression":undefined,"source":"[polis20].text6.dataValue","targetProperty":"parameters.arg4"}, {}],
					wire5: ["wm.Wire", {"expression":undefined,"source":"[polis20].text8.dataValue","targetProperty":"parameters.arg5"}, {}],
					wire6: ["wm.Wire", {"expression":undefined,"source":"[polis20].largeTextArea1.dataValue","targetProperty":"parameters.arg6"}, {}]
				}]
			}]
		}], 
		wsVehicleListGetTicketList: ["wm.ServiceVariable", {"operation":"getTicketList","service":"WebServiceListVehicleService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getTicketListInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire3: ["wm.Wire", {"expression":undefined,"source":"[polis20].text6.dataValue","targetProperty":"parameters.arg3"}, {}],
					wire: ["wm.Wire", {"expression":undefined,"source":"[polis20].text3.dataValue","targetProperty":"parameters.arg0"}, {}],
					wire4: ["wm.Wire", {"expression":undefined,"source":"[polis20].text8.dataValue","targetProperty":"parameters.arg4"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"[polis20].text5.dataValue","targetProperty":"parameters.arg2"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"[polis20].text4.dataValue","targetProperty":"parameters.arg1"}, {}]
				}]
			}]
		}], 
		wsVehicleListGetTrcList: ["wm.ServiceVariable", {"operation":"getTrcList","service":"WebServiceListVehicleService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getTrcListInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"[polis20].text3.dataValue","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"[polis20].text4.dataValue","targetProperty":"parameters.arg1"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"[polis20].text5.dataValue","targetProperty":"parameters.arg2"}, {}],
					wire3: ["wm.Wire", {"expression":undefined,"source":"[polis20].text6.dataValue","targetProperty":"parameters.arg3"}, {}],
					wire4: ["wm.Wire", {"expression":undefined,"source":"[polis20].text7.dataValue","targetProperty":"parameters.arg4"}, {}],
					wire5: ["wm.Wire", {"expression":undefined,"source":"[polis20].text9.dataValue","targetProperty":"parameters.arg5"}, {}]
				}]
			}]
		}], 
		wsWeaponDetailGetCrime: ["wm.ServiceVariable", {"operation":"getCrime","service":"WebServiceDetailWeapon"}, {}, {
			input: ["wm.ServiceInput", {"type":"getCrimeInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"app.wsWeaponListGetCrimeList.returns.weaponGroup","targetProperty":"parameters.weaponGroup"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"app.wsWeaponListGetCrimeList.returns.orgCode","targetProperty":"parameters.orgCode"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"app.wsWeaponListGetCrimeList.returns.crimeYear","targetProperty":"parameters.crimeYear"}, {}],
					wire3: ["wm.Wire", {"expression":undefined,"source":"app.wsWeaponListGetCrimeList.returns.crimeNo","targetProperty":"parameters.crimeNO"}, {}],
					wire4: ["wm.Wire", {"expression":undefined,"source":"app.wsWeaponListGetCrimeList.returns.weaponSEQ","targetProperty":"parameters.weaponSEQ"}, {}]
				}]
			}]
		}], 
		wsWeaponDetailGetCrimeGun: ["wm.ServiceVariable", {"operation":"getCrimeGun","service":"WebServiceDetailWeapon"}, {}, {
			input: ["wm.ServiceInput", {"type":"getCrimeGunInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"app.wsWeaponListGetCrimeListGun.returns.crimeNO","targetProperty":"parameters.crimeNo"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"app.wsWeaponListGetCrimeListGun.returns.crimeYear","targetProperty":"parameters.crimeYear"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"app.wsWeaponListGetCrimeListGun.returns.orgCode","targetProperty":"parameters.orgCode"}, {}]
				}]
			}]
		}], 
		wsWeaponDetailGetCrimeGunOwner: ["wm.ServiceVariable", {"operation":"getCrimeGunOwner","service":"WebServiceDetailWeapon"}, {}, {
			input: ["wm.ServiceInput", {"type":"getCrimeGunOwnerInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"app.wsWeaponDetailGetCrimeGun.returns.ownCode","targetProperty":"parameters.complainerNO"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"app.wsWeaponListGetCrimeListGun.returns.orgCode","targetProperty":"parameters.orgCode"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"app.wsWeaponListGetCrimeListGun.returns.crimeYear","targetProperty":"parameters.crimeYear"}, {}],
					wire3: ["wm.Wire", {"expression":undefined,"source":"app.wsWeaponListGetCrimeListGun.returns.crimeNO","targetProperty":"parameters.crimeNo"}, {}]
				}]
			}]
		}], 
		wsWeaponDetailGetCrimeOwner: ["wm.ServiceVariable", {"operation":"getCrimeOwner","service":"WebServiceDetailWeapon"}, {}, {
			input: ["wm.ServiceInput", {"type":"getCrimeOwnerInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"app.wsWeaponListGetCrimeList.returns.crimeNo","targetProperty":"parameters.crimeNo"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"app.wsWeaponListGetCrimeList.returns.crimeYear","targetProperty":"parameters.crimeYear"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"app.wsWeaponListGetCrimeList.returns.ownCode","targetProperty":"parameters.offenderNO"}, {}],
					wire3: ["wm.Wire", {"expression":undefined,"source":"app.wsWeaponListGetCrimeList.returns.orgCode","targetProperty":"parameters.orgCode"}, {}]
				}]
			}]
		}], 
		wsWeaponDetailGetLostAsset: ["wm.ServiceVariable", {"operation":"getLostAsset","service":"WebServiceDetailWeapon"}, {}, {
			input: ["wm.ServiceInput", {"type":"getLostAssetInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"app.wsWeaponListGetLostAssetList.returns.astId","targetProperty":"parameters.astId"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"app.wsWeaponListGetLostAssetList.returns.caseOff","targetProperty":"parameters.caseOff"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"app.wsWeaponListGetLostAssetList.returns.caseY","targetProperty":"parameters.caseY"}, {}],
					wire3: ["wm.Wire", {"expression":undefined,"source":"app.wsWeaponListGetLostAssetList.returns.caseNo","targetProperty":"parameters.caseNo"}, {}]
				}]
			}]
		}], 
		wsWeaponDetailGetLostAsset2: ["wm.ServiceVariable", {"operation":"getLostAsset2","service":"WebServiceDetailWeapon"}, {}, {
			input: ["wm.ServiceInput", {"type":"getLostAsset2Inputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"app.wsWeaponListGetLostAssetList.returns.astId","targetProperty":"parameters.astId"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"app.wsWeaponListGetLostAssetList.returns.caseOff","targetProperty":"parameters.caseOff"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"app.wsWeaponListGetLostAssetList.returns.caseY","targetProperty":"parameters.caseY"}, {}],
					wire3: ["wm.Wire", {"expression":undefined,"source":"app.wsWeaponListGetLostAssetList.returns.caseNo","targetProperty":"parameters.caseNo"}, {}]
				}]
			}]
		}], 
		wsWeaponDetailGetLostAssetBrand: ["wm.ServiceVariable", {"operation":"getLostAssetBrand","service":"WebServiceDetailWeapon"}, {}, {
			input: ["wm.ServiceInput", {"type":"getLostAssetBrandInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"app.wsWeaponDetailGetLostAsset2.returns.astBrand","targetProperty":"parameters.brandCode"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"app.wsWeaponDetailGetLostAsset2.returns.astType","targetProperty":"parameters.typeCode"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"app.wsWeaponDetailGetLostAsset2.returns.astGroup","targetProperty":"parameters.typeGroup"}, {}]
				}]
			}]
		}], 
		wsWeaponDetailGetLostAssetMaker: ["wm.ServiceVariable", {"operation":"getLostAssetMaker","service":"WebServiceDetailWeapon"}, {}, {
			input: ["wm.ServiceInput", {"type":"getLostAssetMakerInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"app.wsWeaponDetailGetLostAsset2.returns.cctMakerCode","targetProperty":"parameters.cctMakerCode"}, {}]
				}]
			}]
		}], 
		wsWeaponDetailGetPerson: ["wm.ServiceVariable", {"operation":"getPerson","service":"WebServiceDetailWeapon"}, {}, {
			input: ["wm.ServiceInput", {"type":"getPersonInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"app.wsWeaponListGetPersonList.returns.orgCde","targetProperty":"parameters.orgCde"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"app.wsWeaponListGetPersonList.returns.perCde","targetProperty":"parameters.perCde"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"app.wsWeaponListGetPersonList.returns.serialNo","targetProperty":"parameters.serialNo"}, {}]
				}]
			}]
		}], 
		wsWeaponDetailGetPlanHis: ["wm.ServiceVariable", {"operation":"getPlanHis","service":"WebServiceDetailWeapon"}, {}, {
			input: ["wm.ServiceInput", {"type":"getPlanHisInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"app.wsWeaponListGetPlanHisList.returns.caseNo","targetProperty":"parameters.caseNO"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"app.wsWeaponListGetPlanHisList.returns.caseOff","targetProperty":"parameters.caseOff"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"app.wsWeaponListGetPlanHisList.returns.caseY","targetProperty":"parameters.caseY"}, {}],
					wire3: ["wm.Wire", {"expression":undefined,"source":"app.wsWeaponListGetPlanHisList.returns.cplanNo","targetProperty":"parameters.cplanNo"}, {}]
				}]
			}]
		}], 
		wsWeaponDetailGetPlanHisHow: ["wm.ServiceVariable", {"operation":"getPlanHisHow","service":"WebServiceDetailWeapon"}, {}, {
			input: ["wm.ServiceInput", {"type":"getPlanHisHowInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"app.wsWeaponListGetPlanHisList.returns.caseNo","targetProperty":"parameters.caseNo"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"app.wsWeaponListGetPlanHisList.returns.caseY","targetProperty":"parameters.caseY"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"app.wsWeaponListGetPlanHisList.returns.caseOff","targetProperty":"parameters.caseOff"}, {}],
					wire3: ["wm.Wire", {"expression":undefined,"source":"app.wsWeaponListGetPlanHisList.returns.cplanNo","targetProperty":"parameters.cplanNo"}, {}]
				}]
			}]
		}], 
		wsWeaponListGetCrimeList: ["wm.ServiceVariable", {"operation":"getCrimeList","service":"WebServiceListWeaponService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getCrimeListInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"[polis32].text17.dataValue","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"[polis32].text17.dataValue","targetProperty":"parameters.arg1"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"[polis32].text19.dataValue","targetProperty":"parameters.arg2"}, {}]
				}]
			}]
		}], 
		wsWeaponListGetCrimeList2: ["wm.ServiceVariable", {"operation":"getCrimeList2","service":"WebServiceListWeaponService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getCrimeList2Inputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"[polis32].text21.dataValue","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"[polis32].largeTextArea1.dataValue","targetProperty":"parameters.arg1"}, {}]
				}]
			}]
		}], 
		wsWeaponListGetCrimeListGun: ["wm.ServiceVariable", {"operation":"getCrimeListGun","service":"WebServiceListWeaponService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getCrimeListGunInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"[polis31].text4.dataValue","targetProperty":"parameters.arg0"}, {}]
				}]
			}]
		}], 
		wsWeaponListGetLostAssetList: ["wm.ServiceVariable", {"operation":"getLostAssetList","service":"WebServiceListWeaponService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getLostAssetListInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":"\"A\"","source":false,"targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"[polis31].text4.dataValue","targetProperty":"parameters.arg1"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"[polis31].text6.dataValue","targetProperty":"parameters.arg2"}, {}],
					wire3: ["wm.Wire", {"expression":undefined,"source":"[polis31].text17.dataValue","targetProperty":"parameters.arg3"}, {}],
					wire4: ["wm.Wire", {"expression":undefined,"source":"[polis31].text29.dataValue","targetProperty":"parameters.arg4"}, {}],
					wire5: ["wm.Wire", {"expression":undefined,"source":"[polis31].text19.dataValue","targetProperty":"parameters.arg5"}, {}],
					wire6: ["wm.Wire", {"expression":undefined,"source":"[polis31].text31.dataValue","targetProperty":"parameters.arg6"}, {}],
					wire7: ["wm.Wire", {"expression":undefined,"source":"[polis31].text8.dataValue","targetProperty":"parameters.arg7"}, {}]
				}]
			}]
		}], 
		wsWeaponListGetPersonList: ["wm.ServiceVariable", {"operation":"getPersonList","service":"WebServiceListWeaponService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getPersonListInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"[polis32].text17.dataValue","targetProperty":"parameters.arg0"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"[polis32].text19.dataValue","targetProperty":"parameters.arg1"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"[polis32].largeTextArea1.dataValue","targetProperty":"parameters.arg2"}, {}]
				}]
			}]
		}], 
		wsWeaponListGetPlanHisList: ["wm.ServiceVariable", {"operation":"getPlanHisList","service":"WebServiceListWeaponService"}, {}, {
			input: ["wm.ServiceInput", {"type":"getPlanHisListInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"[polis31].text6.dataValue","targetProperty":"parameters.arg0"}, {}]
				}]
			}]
		}]
	},
	_end: 0
});

web_polis321.extend({

	_end: 0
});