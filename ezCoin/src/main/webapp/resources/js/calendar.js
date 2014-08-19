/**
 * 
 */


/**
 * 달력.
 */
 $(function()
		 {
	 		 $.datepicker.regional['ko'] = {
             closeText: '닫기',
             prevText: '이전달',
             nextText: '다음달',
             currentText: '오늘',
             monthNames: ['1월','2월','3월','4월','5월','6월',
             '7월','8월','9월','10월','11월','12월'],
             monthNamesShort: ['1월','2월','3월','4월','5월','6월',
                               '7월','8월','9월','10월','11월','12월'],
             dayNames: ['일','월','화','수','목','금','토'],
             dayNamesShort: ['일','월','화','수','목','금','토'],
             dayNamesMin: ['일','월','화','수','목','금','토'],
             weekHeader: 'Wk',
             dateFormat: 'yy-mm-dd',
             firstDay: 0,
             isRTL: false,
             showMonthAfterYear: false,
             yearSuffix: '년'};
	 		 $.datepicker.setDefaults($.datepicker.regional['ko']);
			 $("#datePicker1").datepicker( "option", $.datepicker.regional[ "ko" ] );
		     $("#datePicker1").datepicker({changeMonth: false, changeYear: false, showMonthAfterYear:false});
		     $('#datePicker1').datepicker('option', {dateFormat: 'yy-mm-dd'});
		     $("#datePicker2").datepicker( "option", $.datepicker.regional[ "ko" ] );
		     $("#datePicker2").datepicker({changeMonth: false, changeYear: false, showMonthAfterYear:false});
		     $('#datePicker2').datepicker('option', {dateFormat: 'yy-mm-dd'});
		     
		 });
 
 function calendar() {
		var today = new Date();
		var year = today.getFullYear();
		var month = today.getMonth() + 1;
		var day = today.getDate();
		var week_start = new Date(year, month - 1, 1).getDay();
		var day_max = get_day_max(year, month - 1);
		var i = 0;
		var j = 0;
		var html = "<div class='calendar_box'><div class='calendar_title B'>"
				+ year + "-" + get_number_str(month) + "-" + get_number_str(day)
				+ "</div>";
		while (j < day_max) {
			if (i < week_start) {
				html += "<div class='calendar_text'>·</div>";
			} else {
				if (i % 7 == 0)
					font_color = " RED";
				else if (i % 7 == 6)
					font_color = " BLUE";
				else
					font_color = "";
				if (day == (j + 1))
					font_weight = " B";
				else
					font_weight = "";
				html += "<div class='calendar_text" + font_color + font_weight
						+ "'>" + (j + 1) + "</div>";
				j++;
			}
			i++;
		}
		while (i % 7 !== 0) {
			html += "<div class='calendar_text'>·</div>";
			i++;
		}
		html += "<div class='calendar_tail'></div></div>";
		return html;
	}
	function get_day_max(year, month) {
		var i = 29, cday;
		while (i < 32) {
			cday = new Date(year, month, i);
			if (cday.getFullYear() != year || cday.getMonth() != month)
				break;
			i++;
		}
		return i - 1;
	}
	function get_number_str(num) {
		if (num < 10)
			num = '0' + num;
		return num;
	}