(function($){
    var d_showDatepicker = $.datepicker._showDatepicker;
    var d_selectDay = $.datepicker._selectDay;
    var d_selectDate = $.datepicker._selectDate;
    var d_attachDatepicker = $.datepicker._attachDatepicker;
    var d_adjustInstDate = $.datepicker._adjustInstDate;
    var d_inlineDatepicker = $.datepicker._inlineDatepicker;
    var d_setDate = $.datepicker._setDate;
    var d_updateDatepicker = $.datepicker._updateDatepicker;
    var d_generateHTML = $.datepicker._generateHTML;
    var d_generateMonthYearHeader = $.datepicker._generateMonthYearHeader;

    //Insert default parameter to datepicker
    $.extend($.datepicker._defaults, {
        isBE:false,
        autoConversionField:true
    });

    $.extend($.datepicker, {
        _attachBE: function () {
            $.extend($.datepicker._defaults, {
                 beforeShow : function(){  }
            });
        },

        _selectDate: function(id, dateStr){
			console.log("_selectDate");
            d_selectDate.apply(this,arguments);
        },

        _attachDatepicker: function(target, settings) {
			console.log("_attachDatepicker");
            d_attachDatepicker.apply(this,arguments);
            var autoConvert =  (typeof(settings.autoConversionField) !== 'undefined' && settings.autoConversionField != null) ? settings.autoConversionField : true;
            var _isBE = (typeof(settings.isBE) !== 'undefined' && settings.isBE != null) ? settings.isBE : false;
            var _isInput = $(target).is("input")
            if(autoConvert == true && _isBE == true && _isInput == true){  //Only for input for now
                $.datepicker._attachConversion(target);
            }
        },


        _attachConversion : function(target){
			console.log("_attachConversion");
            var _name = $(target).attr('name');
            var _id = $(target).attr('id');
            var convertId = _id +"_convert";
            $(target).parent().append('<input type="hidden" rel="'+_id+'" id="'+convertId+'" name="'+_name+'" />');
            $(target).attr('name',convertId);
        },

        _selectDay: function(id, month, year, td) {
            console.log("_selectDay");
            var target = $(id);
		        if ($(td).hasClass(this._unselectableClass) || this._isDisabledDatepicker(target[0])) {
			    return;
		    }

            var _inst = this._getInst(target[0]);
            var _isBE = (typeof(_inst.settings.isBE) !== 'undefined' && _inst.settings.isBE != null) ? _inst.settings.isBE : false;
            var autoConvert = (typeof(_inst.settings.autoConversionField) !== 'undefined' && _inst.settings.autoConversionField != null) ? _inst.settings.autoConversionField : true;
            var d_year = $.datepicker._convertToCe(year);

            if(_isBE == true  ){ //Fire only when isBE
                year = $.datepicker._convertToBe(year);
            }

            d_selectDay.apply(this,arguments);
            _inst.currentYear = $.datepicker._convertToCe(_inst.currentYear);
           _inst.drawYear = $.datepicker._convertToCe(_inst.drawYear);
           _inst.selectedYear = $.datepicker._convertToCe(_inst.selectedYear);
            if(autoConvert == true && _isBE == true){
                var childName = target.attr('name');
                var childId = '#' + childName;
                var childValue = this._formatDate(_inst,_inst.currentDay, _inst.currentMonth, d_year);
                $(childId).val(childValue);
            }
        },

        _showDatepicker : function(input){
			console.log("_showDatepicker");
            var _inst = $.datepicker._getInst(this);
            var _isBE = $.datepicker._isBE(_inst);
			if(jQuery.timepicker && _isBE == true){
				var tp_inst = $.datepicker._get(_inst, 'timepicker');
				if(tp_inst){
					var tp_updateDateTime = tp_inst._updateDateTime;
					$.extend(_inst.settings.timepicker,{
						_updateDateTime : function(dp_inst){
							dp_inst = _inst || dp_inst,
							dp_inst.selectedYear = $.datepicker._convertToBe(dp_inst.selectedYear);
							tp_updateDateTime.apply(this,arguments);
							dp_inst.selectedYear = $.datepicker._convertToCe(dp_inst.selectedYear);

						}
					});
				}
			}

            if(_isBE == true){
                $.datepicker._SetBEDisplay(_inst);
            }
            d_showDatepicker.apply(this,arguments);
        },

        _inlineDatepicker: function(target, inst) {
			console.log("_inlineDatepicker");
            d_inlineDatepicker.apply(this,arguments);
        },

        _generateMonthYearHeader: function(inst, drawMonth, drawYear, minDate, maxDate,
			secondary, monthNames, monthNamesShort) {
			console.log("_generateMonthYearHeader");
            var _isBE = $.datepicker._isBE(inst);
            if(_isBE == true){
                drawYear = $.datepicker._convertToBe(drawYear);
            }
            return d_generateMonthYearHeader.apply(this,arguments);
        },
        _updateDatepicker: function(inst) {
			console.log("_updateDatepicker");
            var _inst = inst;
            var _isBE = (typeof(_inst.settings.isBE) !== 'undefined' && _inst.settings.isBE != null) ? _inst.settings.isBE : false;
            d_updateDatepicker.apply(this,arguments);

            if(_isBE == true){
                $.datepicker._SetBEDisplay(_inst);
            }
        },

        _setDate: function(inst, date, noChange) {
			console.log("_setDate");
            d_setDate.apply(this,arguments);            
        },

        _generateHTML: function(inst) {
			console.log("_generateHTML");
            var _isBE = (typeof(inst.settings.isBE) !== 'undefined' && inst.settings.isBE != null) ? inst.settings.isBE : false;
            if(_isBE){
                if(inst.currentYear != 0){	
                    inst.currentYear = $.datepicker._convertToCe(inst.currentYear);
                }
            }
            var result =  d_generateHTML.apply(this,arguments);
            if(_isBE){
                inst.currentYear = $.datepicker._convertToCe(inst.currentYear);
                inst.drawYear = $.datepicker._convertToCe(inst.drawYear);
                inst.selectedYear = $.datepicker._convertToCe(inst.selectedYear);
            }
            return result;
        },

        _SetBEDisplay: function(inst){
			console.log("_SetBEDisplay");
            var _inst = inst;
            var element = _inst.inline == true ? _inst.dpDiv : _inst.dpDiv[0];
            var drawYear = _inst.drawYear;
			
            if(drawYear == 0){
                drawYear = _inst.currentYear;
            }
            drawYear = $.datepicker._convertToCe(drawYear);
            var selectedYear = _inst.selectedYear = _inst.currentYear = _inst.drawYear = $.datepicker._convertToCe(inst.selectedYear);
           
            if(selectedYear == 0){
                selectedYear = new Date().getFullYear();
            }
            var yF =  $(element).find( '.ui-datepicker-year' );
			var domEl = $(yF).get(0);				
			
			if(!domEl){
				return false;
			}
			
			if(typeof(domEl.tagName) !== 'undefined' && domEl.tagName != null){
				switch(domEl.tagName){
					case "SELECT" :  //Change all value
							$(domEl).children('option').each(function(){
								$(this).text($.datepicker._convertToBe($(this).val()));
								var _year = $(this).val();
								if(_year == drawYear){
									$(this).attr('selected','selected');
								}

							});
					break;
					case "SPAN" :
					break;
					default :
					break;
				}
			}
		
        },

        _isBE : function (inst){
			console.log("_isBE");
			try{ //<-- User Custom
				var _isBE = (typeof(inst.settings.isBE) !== 'undefined' && inst.settings.isBE != null) ? inst.settings.isBE : false;
				return _isBE;
			}catch(e){ //<-- User Custom
				return false;  //<--User Custom
			} //<--User Custom
        },

        _convertToBe : function(year){
			console.log("_convertToBe");
			var result;
            if((parseInt(year) - 543) < 1900  ){
                result =  parseInt(year) + 543;
            }else{
                result = year;
            }
			return result;
        },

        _convertToCe : function(year){
			console.log("_convertToCe");
            if((parseInt(year) - 543) >= 1900  ){
                return parseInt(year) - 543;
            }else{
                return year;
            }
        }
    });

})(jQuery); 