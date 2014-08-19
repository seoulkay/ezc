<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="/resources/bootstrap-3.2.0-dist/css/bootstrap.min.css" rel="stylesheet">
<link href="/resources/bootstrap-3.2.0-dist/css/justified-nav.css" rel="stylesheet">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<script src="/resources/bootstrap-3.2.0-dist/js/bootstrap.min.js"></script>
<script src="/resources/js/common.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>ezCoin title</title>
<script>
/**
 * 입력.
 */
function insertNoticeBoard() {
	
	if(trim($('#subject').val()) == '') {
		alert("제목을 입력하세요.");
		$('#subject').focus();
		return;
	}

	if(trim($('#genre_idx').val()) == '') {
		alert("유형 명을 선택하세요.");
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
	
	$('#form').attr("action","/admin/board/notice/updateNoticePro.do");
	$('#form').submit();
}

/**
 * 입력취소
 */
function cancel() {
	$('#form').attr("action","/admin/board/notice/manageNotice.do");
	$('#form').submit();
}

/**
 * 사용여부 라디오 버튼 값 체크.
 */
 function isUseCheck() {
		var isuse = $(':radio[name=isUseRadio]:checked').val();
		$('#useIs').val(isuse);
	}



</script>
</head>
<body>


	<div class="container">
	<jsp:include page="../../common/navbar.jsp"></jsp:include>
			<div class="jumbotron" >
			<div class="row">
			<ol class="breadcrumb pull-right" style="font-size: 12px;">
				  <li>Main</li>
				  <li>게시물 관리</li>
				  <li><a href="/admin/board/notice/manageNotice.do">공지사항 관리</a></li>
				  <li>공지사항 수정</li>
			</ol>
          <h4 class="sub-header"><span class="glyphicon glyphicon-asterisk"></span> <b>공지사항 수정</b></h4>
          </div>
       
  <form id="form" name="form" method="post">
     <input type="hidden" id="useIs" name="useIs"/>
     <input type="hidden" id="noticeMngIdx" name="noticeMngIdx" value="${vo.noticeMngIdx}"/>  
     <input type="hidden" id="thumb" name="thumb" value="${vo.thumb}"/>  
     <input type="hidden" id="attatchFile" name="attatchFile" value="${vo.attatchFile}"/>         
     <input type="hidden" id="createId" name="createId" value="${vo.createId}"/>  
     <input type="hidden" id="replyIs" name="replyIs" value="${vo.replyIs}"/>  
     <input type="hidden" id="hitcount" name="hitcount" value="${vo.hitcount}"/>  
     
          <div class="table-responsive">
						<table class="table table-striped">
							<colgroup>
								<col width="20%" />
								<col width="80%" />

							</colgroup>

							<tr>
								<th>제목</th>
								<td><input type="text" name="subject" title="제목" style="width:100%" maxlength="256" id="subject" value="${vo.subject }"/></td>
							</tr>
							<tr>
								<th>분야</th>
								<td>
								<select name="genreIdx" id="genre_idx" title="분야">
										<option value="${vo.genreIdx }">${vo.genreIdx }</option>
										<option value="1">1</option>
										<option value="2">2</option>
										<option value="3">3</option>
										<option value="4">4</option>
										<option value="5">5</option>
										<option value="6">6</option>
										<option value="7">7</option>
										<option value="8">8</option>
								</select> 
									</td>
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
								<a href="#" onclick="javascript:insertNoticeBoard()" class="btn btn-info btn-xs"><span class="glyphicon glyphicon-pencil"></span> 등록</a>
								<a href="#" onclick="javascript:cancel()" class="btn btn-info btn-xs"><span class="glyphicon glyphicon-remove"></span> 취소</a>
						</div>
</div>
</div>

<jsp:include page="../../common/footer.jsp"></jsp:include>

</body>
</html>

