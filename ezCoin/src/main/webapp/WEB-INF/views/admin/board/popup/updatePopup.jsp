<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="/resources/jquery-ui-1.11.0.custom/jquery-ui.css" rel="stylesheet">
<link href="/resources/bootstrap-3.2.0-dist/css/bootstrap.min.css" rel="stylesheet">
<link href="/resources/bootstrap-3.2.0-dist/css/justified-nav.css" rel="stylesheet">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<script src="/resources/bootstrap-3.2.0-dist/js/bootstrap.min.js"></script>
<script src="/resources/js/common.js"></script>
<script src="/resources/jquery-ui-1.11.0.custom/jquery-ui.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>ezCoin title</title>
<script>
/**
 * 입력.
 */
function insertPopupBoard() {
	
	if(trim($('#subject').val()) == '') {
		alert("제목을 입력하세요.");
		$('#subject').focus();
		return;
	}

	

	if(trim($('#content').val()) == '') {
		alert("내용을 입력하세요.");
		$('#content').focus();
		return;
	}
	
	var isuse = $(':radio[name=isUseRadio]:checked').val();
	$('#useIs').val(isuse);
	
	if(trim($('#useIs').val()) == '') {
		alert("사용여부를 선택하세요.");
		return;
	}
	
	$('#content').val($("content").value);
	$('#form').attr("action","/admin/board/popup/updatePopupPro.do");
	$('#form').submit();
}

/**
 * 입력취소
 */
function cancel() {
	$('#form').attr("action","/admin/board/popup/managePopup.do");
	$('#form').submit();
}

/**
 * 사용여부 라디오 버튼 값 체크.
 */
 function isUseCheck() {
		var isuse = $(':radio[name=isUseRadio]:checked').val();
		$('#useIs').val(isuse);
	}

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
              monthAddresss: ['1월','2월','3월','4월','5월','6월',
              '7월','8월','9월','10월','11월','12월'],
              monthAddresssShort: ['1월','2월','3월','4월','5월','6월',
                                '7월','8월','9월','10월','11월','12월'],
              dayAddresss: ['일','월','화','수','목','금','토'],
              dayAddresssShort: ['일','월','화','수','목','금','토'],
              dayAddresssMin: ['일','월','화','수','목','금','토'],
              weekHeader: 'Wk',
              dateFormat: 'yy-mm-dd',
              firstDay: 0,
              isRTL: false,
              showMonthAfterYear: false,
              yearSuffix: '년'};
 	 		 $.datepicker.setDefaults($.datepicker.regional['ko']);
 			 $("#startDatePop").datepicker( "option", $.datepicker.regional[ "ko" ] );
 		     $("#startDatePop").datepicker({changeMonth: false, changeYear: false, showMonthAfterYear:false});
 		     $('#startDatePop').datepicker('option', {dateFormat: 'yy-mm-dd'});
 		     $("#endDatePop").datepicker( "option", $.datepicker.regional[ "ko" ] );
 		     $("#endDatePop").datepicker({changeMonth: false, changeYear: false, showMonthAfterYear:false});
 		     $('#endDatePop').datepicker('option', {dateFormat: 'yy-mm-dd'});
 		     $("#winDatePop").datepicker( "option", $.datepicker.regional[ "ko" ] );
		     $("#winDatePop").datepicker({changeMonth: false, changeYear: false, showMonthAfterYear:false});
		     $('#winDatePop').datepicker('option', {dateFormat: 'yy-mm-dd'});
 		     
 		 });

</script>
</head>
<body>


	<div class="container">
	<jsp:include page="../../common/navbar.jsp" />
			<div class="jumbotron">
			<div class="row">
			<ol class="breadcrumb pull-right" style="font-size: 12px;">
				  <li>Main</li>
				  <li>게시물 관리</li>
				  <li><a href="/admin/board/popup/managePopup.do">팝업 관리</a></li>
				  <li>팝업 수정</li>
			</ol>
          <h4 class="sub-header"><span class="glyphicon glyphicon-asterisk"></span> <b>팝업 수정</b></h4>
          </div>
       
  <form id="form" name="form" method="post">
     <input type="hidden" id="useIs" name="useIs"/>
     <input type="hidden" id="popupMngIdx" name="popupMngIdx" value="${vo.popupMngIdx}"/>  
     <input type="hidden" id="thumb" name="thumb" value="${vo.thumb}"/>  
             
     <input type="hidden" id="createId" name="createId" value="${vo.createId}"/>  
      
     <input type="hidden" id="hitcount" name="hitcount" value="${vo.hitcount}"/>  
     <input type="hidden" id="createDate" name="hitcount" value="${vo.createDate}"/>  
     
          <div class="table-responsive">
						<table class="table table-striped">
							<colgroup>
								<col width="30%" />
								<col width="70%" />

							</colgroup>

							
							<tr>
								<th>제목</th>
								<td><input type="text" name="subject" title="제목" style="width:100%" maxlength="256" id="subject" value="${vo.subject }"/></td>
							</tr>
							
							<tr>
								<th>시작일</th>
								<td>
								<input type="text" id="startDatePop" name="startDatePop" value="${vo.startDatePop }"/>
								<select name="startDateTime" id="startDateTime" title="분야">
									    <option value="${vo.startDateTime }">${vo.startDateTime }</option>
										
										<option value="1">1</option>
										<option value="2">2</option>
										<option value="3">3</option>
										<option value="4">4</option>
										<option value="5">5</option>
										<option value="6">6</option>
										<option value="7">7</option>
										<option value="8">8</option>
										<option value="9">9</option>
										<option value="10">10</option>
										<option value="11">11</option>
										<option value="12">12</option>
										<option value="13">13</option>
										<option value="14">14</option>
										<option value="15">15</option>
										<option value="16">16</option>
										<option value="17">17</option>
										<option value="18">18</option>
										<option value="19">19</option>
										<option value="20">20</option>
										<option value="21">21</option>
										<option value="22">22</option>
										<option value="23">23</option>
										<option value="24">24</option>
								</select> 시
								</td>
							</tr>
							<tr>
								<th>종료일</th>
								<td>
								<input type="text" id="endDatePop" name="endDatePop" value="${vo.endDatePop }"/>
								<select name="endDateTime" id="endDateTime" title="분야">
										<option value="${vo.endDateTime }">${vo.endDateTime }</option>
										
										<option value="1">1</option>
										<option value="2">2</option>
										<option value="3">3</option>
										<option value="4">4</option>
										<option value="5">5</option>
										<option value="6">6</option>
										<option value="7">7</option>
										<option value="8">8</option>
										<option value="9">9</option>
										<option value="10">10</option>
										<option value="11">11</option>
										<option value="12">12</option>
										<option value="13">13</option>
										<option value="14">14</option>
										<option value="15">15</option>
										<option value="16">16</option>
										<option value="17">17</option>
										<option value="18">18</option>
										<option value="19">19</option>
										<option value="20">20</option>
										<option value="21">21</option>
										<option value="22">22</option>
										<option value="23">23</option>
										<option value="24">24</option>
								</select> 시
								</td>
							</tr>
							<tr>
								<th>당첨자 발표일</th>
								<td>
								<input type="text" id="winDatePop" name="winDatePop" value="${vo.winDatePop }"/>
								<select name="winDateTime" id="winDateTime" title="분야">
										<option value="${vo.winDateTime }">${vo.winDateTime }</option>
										
										<option value="1">1</option>
										<option value="2">2</option>
										<option value="3">3</option>
										<option value="4">4</option>
										<option value="5">5</option>
										<option value="6">6</option>
										<option value="7">7</option>
										<option value="8">8</option>
										<option value="9">9</option>
										<option value="10">10</option>
										<option value="11">11</option>
										<option value="12">12</option>
										<option value="13">13</option>
										<option value="14">14</option>
										<option value="15">15</option>
										<option value="16">16</option>
										<option value="17">17</option>
										<option value="18">18</option>
										<option value="19">19</option>
										<option value="20">20</option>
										<option value="21">21</option>
										<option value="22">22</option>
										<option value="23">23</option>
										<option value="24">24</option>
								</select> 시
								</td>
							</tr>
							<tr>
								<th>이벤트 페이지 외부 링크</th>
								<td><input type="text" style="width:100%" name="eventPageExlink" value="${vo.eventPageExlink }"/></td>
							</tr>
							<tr>
								<th>썸네일</th>
								<td><input type="file" name="attatchFile" value="${vo.attatchFile }"/> ${vo.attatchFile }</td>
							</tr>
							
							<tr>
								<th>내용</th>
								<td><textarea name="content" rows="6" style="width:100%" id="content" onkeyup="javascript:checkTextAreaMax(this)">${vo.content }</textarea></td>
							</tr>
							<tr>
								<th>사용여부</th>
								<td>
								<c:choose>
								<c:when test="${vo.useIs == 1 }">
								<input type="radio" title="사용여부" id="isUseRadio" name="isUseRadio" value="1" onclick="javascript:isUseCheck()" checked="checked"/> 사용 
								<input type="radio" title="사용여부" id="isUseRadio" name="isUseRadio" value="0" onclick="javascript:isUseCheck()" /> 사용안함
							    </c:when>
							    <c:when test="${vo.useIs == 0 }">
								<input type="radio" title="사용여부" id="isUseRadio" name="isUseRadio" value="1" onclick="javascript:isUseCheck()" /> 사용 
								<input type="radio" title="사용여부" id="isUseRadio" name="isUseRadio" value="0" onclick="javascript:isUseCheck()" checked="checked"/> 사용안함
							    </c:when>
							    </c:choose>
							    </td>
							</tr>
							
							
</table>
</div>
</form>
						
						<div class="row pull-right">
								<a href="#" onclick="javascript:insertPopupBoard()" class="btn btn-info btn-xs"><span class="glyphicon glyphicon-pencil"></span> 등록</a>
								<a href="#" onclick="javascript:cancel()" class="btn btn-info btn-xs"><span class="glyphicon glyphicon-remove"></span> 취소</a>
						</div>
</div>
</div>



<jsp:include page="../../common/footer.jsp" />

</body>
</html>

