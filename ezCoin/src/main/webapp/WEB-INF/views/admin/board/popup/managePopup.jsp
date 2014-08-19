<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="/resources/bootstrap-3.2.0-dist/css/bootstrap.min.css" rel="stylesheet">
<link href="/resources/bootstrap-3.2.0-dist/css/justified-nav.css" rel="stylesheet">
<link href="/resources/jquery-ui-1.11.0.custom/jquery-ui.css" rel="stylesheet">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<script src="/resources/bootstrap-3.2.0-dist/js/bootstrap.min.js"></script>
<script src="/resources/jquery-ui-1.11.0.custom/jquery-ui.js"></script>
<script src="/resources/js/common.js"></script>
<script src="/resources/js/calendar.js"></script>
<script>
/**
 * 검색
 */
function getSearchPopupList() {
	$('#searchForm').attr("action", "/admin/board/popup/searchPopupPro.do");
	$('#searchForm').submit();
}


/**
 * 수정 이동.
 */
function updatePopup(PopupMngIdx) {
	$('#popupMngIdx').val(PopupMngIdx);
	$('#form').attr("action", "/admin/board/popup/updatePopup.do");
	$('#form').submit();
}



/**
 * 삭제.
 */
function deletePopup(Popup_idx) {
	if(confirm("게시물을 삭제 하시겠습니까?")) {
		$('#popupMngIdx').val(Popup_idx);
		$('#form').attr("action", "/admin/board/popup/deletePopupPro.do");
		$('#form').submit();
	} else {
		alert("취소 되었습니다.");
	}
}

</script>




<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>ezCoin title</title>
</head>
<body>


	<div class="container">
         
      <jsp:include page="../../common/navbar.jsp" />
		
			
			<div class="row">
			<div class="col-lg-12">
			<ol class="breadcrumb pull-right" style="font-size: 12px;">
				  <li>Main</li>
				  <li>게시물 관리</li>
				  <li><a href="/admin/board/popup/managePopup.do">팝업 관리</a></li>
			</ol>
          <h4 class="sub-header"><span class="glyphicon glyphicon-asterisk"></span> <b>팝업 관리</b></h4>
          </div>
       		</div>
         
          <div class="row">
          <c:set var="boardType" value="Popup"/> 
<div class="col-lg-12 well">
<form action="#" id="searchForm" method="get" class="form-inline text-center" role="form">
	<div class="form-group">
		<label class="sr-only" for="searchWord"></label>
		<input type="text" id="searchWord" name="searchWord" class="form-control input-sm" placeholder="검색어를 넣어주세요" value="${param.searchWord }"></input>
	</div>
	<div class="form-group">
		<label class="sr-only" for="startDate"></label>
		<input type="text" placeholder="검색시작일" id="datePicker1" name="startDate" class="form-control input-sm" value="${param.startDate }" /> 
	</div>
	<div class="form-group">
	<div class="input-group">
		<label class="sr-only" for="endDate"></label>
		<div class="input-group-addon"><span class="glyphicon glyphicon-chevron-right"></span></div>
		<input type="text" placeholder="검색종료일" id="datePicker2" name="endDate" class="form-control input-sm" value="${param.endDate }"/>
	</div>
	</div>
	<a class="btn btn-sm btn-info" onclick="javascript:getSearch${boardType}List()"><span class="glyphicon glyphicon-search"></span> 검색</a>           	    
</form>
</div>
</div>
          <div class="row">
          <div class="col-lg-12">
          <form id="form" method="post">
          <input type="hidden" id="popupMngIdx" name="popupMngIdx"/>
          <small><span class="glyphicon glyphicon-list"></span> 검색결과 : <span style="color: red">${cnt}</span> 건</small>
          <span class="pull-right"><a href="/admin/board/popup/createPopup.do" class="btn btn-info btn-xs"><span class="glyphicon glyphicon-pencil"></span> 팝업등록</a></span>
          
          <div class="table-responsive">
            <table class="table table-striped text-center">
            <colgroup>
            <col width="10%"/>
            <col width=""/>
            <col width="20%"/>
            <col width="15%"/>
            <col width="10%"/>
            <col width="10%"/>
            <col width="7%"/>
            </colgroup>
              <thead>       
                <tr>
                  <th class="text-center">No</th>
                  <th class="text-center">팝업명</th>
                  <th class="text-center">요약</th>
                  <th class="text-center">등록일</th>
                  <th class="text-center">사용여부</th>
                  <th class="text-center">팝업보기</th>
                  <th class="text-center">삭제</th>
                </tr>
              </thead>
              <tbody>
              		<c:if test="${fn:length(PopupList) == 0}">
              		<tr>
              			<td colspan="7" style="text-align: center">게시글이 없습니다.</td>
              		</tr>
              		</c:if>
                    <c:if test="${fn:length(PopupList) > 0}">                		

						<c:forEach var="PopupList" items="${PopupList}" varStatus="status">
			                 <tr>
			                     <td><c:out value="${PopupList.popupMngIdx }" /></td>
			                     <td>
<%-- 			                     <a href="javascript:moveBoardDetail('${PopupList.board_idx }')"> --%>
<%-- 			                     <c:set var="searchTxt" value="${extractBoardVO.search_txt }" />												 --%>
<%-- 								 <c:set var="replaceTxt"><strong style="color: red;">${searchTxt}</strong></c:set> --%>
<%-- 								 <c:out value="${fn:replace(extractBoardList.board_name, searchTxt, replaceTxt)}" escapeXml="false" /></a></td> --%>
								 <a href="javascript:updatePopup('${PopupList.popupMngIdx }')" ><c:out value="${PopupList.subject }"/></a>
								 </td>
			                     <td>
			                     
			                     <c:if test="${fn:length(PopupList.content) >=10}">
			                     ${fn:substring(PopupList.content,0,10)}...
			                     </c:if>
			                     <c:if test="${fn:length(PopupList.content) < 10}">
			                     ${PopupList.content }
			                     </c:if>
			                     <td>
			                     <fmt:formatDate value="${PopupList.createDate }"  type="both" pattern="yyyy-MM-dd"/>
			                     </td>
			                     
			                     <td style="text-align: center">
			                     <c:if test="${PopupList.useIs == 1}">
			                     <span class="glyphicon glyphicon-ok-circle" style="color: green"></span>
			                     </c:if>
			                     <c:if test="${PopupList.useIs == 0}">
			                     <span class="glyphicon glyphicon-ban-circle" style="color: red"></span>
			                     </c:if>
			                     </td>
			                     <td>
			                     <a href="http://${PopupList.eventPageExlink }" onclick="window.open(this.href, 'abcdefg', ''); return false;" class="btn btn-xs btn-primary">보기</a>
			                     </td>
			                     <td><a href="javascript:deletePopup('${PopupList.popupMngIdx }')" class="btn btn-warning btn-xs">삭제</a>
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
					</div>
									
        	

<jsp:include page="../../common/footer.jsp"></jsp:include>
</body>
</html>