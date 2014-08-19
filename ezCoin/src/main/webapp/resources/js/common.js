/**
 * 공백 제거
 * 
 * @param str
 * @return
 */
function trim(str){ 
	str = str.replace(/(^\s*)|(\s*$)/g, "");
	return str; 
}

/**
 * TextArea Maxlength 체크.
 * @param obj
 */
function checkTextAreaMax(obj) {
	var message;
	var tempMessage = "";
	var totalString = obj.value;
	var maxlengthAttr = obj.getAttribute ? parseInt(obj.getAttribute("maxlength")) : "";
	maxlength = maxlengthAttr * 2;
	var textareaLength = obj.value.length;

	if (textareaLength == 0) {
		totalString = maxlengthAttr * 2;
	} else {
		for ( var i = 0; i < textareaLength; i++) {
			message = totalString.charAt(i);
			if (escape(message).length > 4) {
				maxlength -= 2;
			} else {
				maxlength--;
			}
			if (maxlength <= 0) {
				alert("총 영문 " + (maxlengthAttr * 2) + "자 한글 " + maxlengthAttr + "자 까지 적을 수 있습니다.");
				obj.value = tempMessage;
				break;
			} else {
				tempMessage += message;
			}
		}//end for
	}
}


