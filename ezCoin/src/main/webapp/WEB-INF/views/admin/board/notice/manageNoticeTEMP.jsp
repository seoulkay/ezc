<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<script src="/resources/bootstrap-3.2.0-dist/js/bootstrap.min.js"></script>
<script src="/resources/jquery-ui-1.11.0.custom/jquery-ui.js"></script>
<link href="/resources/bootstrap-3.2.0-dist/css/bootstrap.min.css" rel="stylesheet">
<!-- <link href="/resources/bootstrap-3.2.0-dist/css/justified-nav.css" rel="stylesheet"> -->
<link href="/resources/jquery-ui-1.11.0.custom/jquery-ui.css" rel="stylesheet">

<script>
/**
 * 검색
 */
function getSearchNoticeList() {
	$('#searchForm').attr("action", "/admin/board/notice/searchNoticePro.do");
	$('#searchForm').submit();
}


/**
 * 수정 이동.
 */
function updateNotice(noticeMngIdx) {
	$('#noticeMngIdx').val(noticeMngIdx);
	$('#form').attr("action", "/admin/board/notice/updateNotice.do");
	$('#form').submit();
}



/**
 * 삭제.
 */
function deleteNotice(notice_idx) {
	if(confirm("게시물을 삭제 하시겠습니까?")) {
		$('#noticeMngIdx').val(notice_idx);
		$('#form').attr("action", "/admin/board/notice/deleteNoticePro.do");
		$('#form').submit();
	} else {
		alert("취소 되었습니다.");
	}
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
 
</script>



<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>ezCoin title</title>
</head>
<body>



	<div class="container">
	<jsp:include page="../../common/navbar.jsp" />	
			<div class="jumbotron">
			
			<div class="row">
			<ol class="breadcrumb pull-right" style="font-size: 12px;">
				  <li>Main</li>
				  <li>게시물 관리</li>
				  <li><a href="/admin/board/notice/manageNotice.do">공지사항 관리</a></li>
			</ol>
          <h4 class="sub-header"><span class="glyphicon glyphicon-asterisk"></span> <b>공지사항 관리</b></h4>
          </div>
       
          <div class="well well-sm text-center">
          	<form action="#" id="searchForm" method="get" class="form-inline">
        		<input type="text" id="searchWord" name="searchWord" class="form-control input-sm" placeholder="검색어를 넣어주세요" value="${param.searchWord }"></input>
          		<input type="text" placeholder="검색시작일" id="datePicker1" name="startDate" class="form-control input-sm" value="${param.startDate }" /> 
          		<span class="glyphicon glyphicon-chevron-right"></span>
          		<input type="text" placeholder="검색종료일" id="datePicker2" name="endDate" class="form-control input-sm" value="${param.endDate }"/>
          		<a class="btn btn-sm btn-info" onclick="javascript:getSearchNoticeList()"><span class="glyphicon glyphicon-search"></span> 검색</a>       
          	    
          	</form>
          </div>
          <form id="form" method="post">
          <input type="hidden" id="noticeMngIdx" name="noticeMngIdx"/>
          <small><span class="glyphicon glyphicon-list"></span> 검색결과 : <span style="color: red">${cnt}</span> 건</small>
          <span class="pull-right"><a href="/admin/board/notice/createNotice.do" class="btn btn-info btn-xs"><span class="glyphicon glyphicon-pencil"></span> 공지사항등록</a></span>
          <div class="table-responsive">
            <table class="table table-striped text-center">
            <colgroup>
            <col width="10%"/>
            <col width=""/>
            <col width="10%"/>
            <col width="15%"/>
            <col width="10%"/>
            <col width="7%"/>
            </colgroup>
              <thead>       
                <tr>
                  <th class="text-center">No</th>
                  <th class="text-center">게시물명</th>
                  <th class="text-center">등록자</th>
                  <th class="text-center">등록일</th>
                  <th class="text-center">사용여부</th>
                  <th class="text-center">삭제</th>
                </tr>
              </thead>
              <tbody>
              		<c:if test="${fn:length(noticeList) == 0}">
              		<tr>
              			<td colspan="6" style="text-align: center">게시글이 없습니다.</td>
              		</tr>
              		</c:if>
                    <c:if test="${fn:length(noticeList) > 0}">                		

						<c:forEach var="noticeList" items="${noticeList}" varStatus="status">
			                 <tr>
			                     <td><c:out value="${noticeList.noticeMngIdx }" /></td>
			                     <td>
<%-- 			                     <a href="javascript:moveBoardDetail('${noticeList.board_idx }')"> --%>
<%-- 			                     <c:set var="searchTxt" value="${extractBoardVO.search_txt }" />												 --%>
<%-- 								 <c:set var="replaceTxt"><strong style="color: red;">${searchTxt}</strong></c:set> --%>
<%-- 								 <c:out value="${fn:replace(extractBoardList.board_name, searchTxt, replaceTxt)}" escapeXml="false" /></a></td> --%>
								 <a href="javascript:updateNotice('${noticeList.noticeMngIdx }')" ><c:out value="${noticeList.subject }"/></a>
								 </td>
			                     <td>${noticeList.createId }</td>
			                     <td>
			                     <fmt:formatDate value="${noticeList.createDate }"  type="both" pattern="yyyy-MM-dd"/>
			                     </td>
			                     <td style="text-align: center">
			                     <c:if test="${noticeList.useIs == 1}">
			                     <span class="glyphicon glyphicon-ok-circle" style="color: green"></span>
			                     </c:if>
			                     <c:if test="${noticeList.useIs == 0}">
			                     <span class="glyphicon glyphicon-ban-circle" style="color: red"></span>
			                     </c:if>
			                     </td>
			                     <td><a href="javascript:deleteNotice('${noticeList.noticeMngIdx }')" class="btn btn-warning btn-xs">삭제</a>
			                     </td>
			                     
			                 </tr>

			            </c:forEach>
			        </c:if>	
              </tbody>
            </table>
            <jsp:include page="../../common/bPager.jsp"></jsp:include>
            		
						</div>
						
						</form>
					</div>
									
        	  	</div>
         	 
  <jsp:include page="../../common/footer.jsp"></jsp:include>

<!-- wrapper -->
</body>
</html>