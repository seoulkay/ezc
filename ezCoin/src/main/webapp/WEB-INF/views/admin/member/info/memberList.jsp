<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="/resources/bootstrap-3.2.0-dist/css/bootstrap.min.css" rel="stylesheet">
<!-- <link href="/resources/bootstrap-3.2.0-dist/css/justified-nav.css" rel="stylesheet"> -->
<link href="/resources/jquery-ui-1.11.0.custom/jquery-ui.css" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>ezCoin title</title>
	<title>ezCoin title</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<script src="/resources/bootstrap-3.2.0-dist/js/bootstrap.min.js"></script>
<script src="/resources/jquery-ui-1.11.0.custom/jquery-ui.js"></script>
<script src="/resources/js/common.js"></script>
<script src="/resources/js/calendar.js"></script>

<script>
/**
 * 검색
 */
function getSearchMemberList() {
	$('#searchForm').attr("action", "/admin/member/info/searchMemberListPro.do");
	$('#searchForm').submit();
}


/**
 * 수정 이동.
 */
function updateMember(memberIdx) {
	$('#memberIdx').val(memberIdx);
	$('#form').attr("action", "/admin/member/info/updateMember.do");
	$('#form').submit();
}



/**
 * 삭제.
 */
function deleteMember(memberidx) {
	if(confirm("회원을 탈퇴 시키시겠습니까?")) {
		$('#memberIdx').val(memberidx);
		$('#form').attr("action", "/admin/member/info/deleteMemberPro.do");
		$('#form').submit();
	} else {
		alert("취소 되었습니다.");
	}
}

/**
 * 팝업띄우기
 */

function popupFullScreen(url, title) {
	var userAgent = navigator.userAgent.toLowerCase();
	 
	var browser = {
	  msie    : /msie/.test( userAgent ) && !/opera/.test( userAgent ),
	  safari  : /webkit/.test( userAgent ),
	  firefox : /mozilla/.test( userAgent ) && !/(compatible|webkit)/.test( userAgent ),
	  opera   : /opera/.test( userAgent )
	};   
	
	/*var title = "Full Screen";*/
	var title = "fullScreen";
	
	if(browser.msie) {
		var IEversion = parseFloat(navigator.appVersion.split("MSIE")[1].split(";")[0].split(" ").join(""));
		if(IEversion == 8) {
			var params = [
			              'height=960',
			              'width=1280',
			              'toolbar=no',
			              'titlebar=yes',
			              'location=no',
			              'directories=yes',
			              'status=yes',
			              'menubar=no',
			              'scrollbars=no',
			              'resizable=yes'
			          ].join(',');
			window.open(url, title, params);
		} else {
			window.open(url, '_blank');
		}
	} else {
		window.open(url, '_blank');
	}
}
</script>
</head>
<body>

		<div class="container">
		 <jsp:include page="../../common/navbar.jsp" /> 
			<div class="row">
                    <div class="col-lg-12">
                        <ol class="breadcrumb pull-right" style="font-size: 12px;">
						  <li>Main</li>
						  <li>회원 관리</li>
						  <li><a href="/admin/member/info/memberList.do">회원 목록</a></li>
						</ol>
          				<h4 class="sub-header"><span class="glyphicon glyphicon-asterisk"></span> <b>회원 목록</b></h4>
                    </div>
             </div>
             	<c:set var="boardType" value="Member"/>
						<div class="row">
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
         			<input type="hidden" id="memberIdx" name="memberIdx"/>
         			<small><span class="glyphicon glyphicon-list"></span> 검색결과 : <span style="color: red">${cnt}</span> 건</small>
          			
         			<div class="table-responsive">
			            <table class="table table-striped text-center">
			            <colgroup>
			            <col width="10%"/>
			            <col width="20%"/>
			            <col width=""/>
			            <col width="15%"/>
			            <col width="10%"/>
			            <col width="7%"/>
			            </colgroup>
			              <thead>       
			                <tr>
			                  <th class="text-center">No</th>
			                  <th class="text-center">이름</th>
			                  <th class="text-center">이메일</th>
			                  <th class="text-center">등록일</th>
			                  <th class="text-center">아이디</th>
			                  <th class="text-center">탈퇴</th>
			                </tr>
			              </thead>
			              <tbody>
			              		<c:if test="${fn:length(memberList) == 0}">
			              		<tr>
			              			<td colspan="6" style="text-align: center">회원이 없습니다.</td>
			              		</tr>
			              		</c:if>
			                    <c:if test="${fn:length(memberList) > 0}">                		
			
									<c:forEach var="memberList" items="${memberList}" varStatus="status">
						                 <tr>
						                     <td><c:out value="${memberList.memberIdx }" /></td>
						                     <td>
			<%-- 			                     <a href="javascript:moveBoardDetail('${noticeList.board_idx }')"> --%>
			<%-- 			                     <c:set var="searchTxt" value="${extractBoardVO.search_txt }" />												 --%>
			<%-- 								 <c:set var="replaceTxt"><strong style="color: red;">${searchTxt}</strong></c:set> --%>
			<%-- 								 <c:out value="${fn:replace(extractBoardList.board_name, searchTxt, replaceTxt)}" escapeXml="false" /></a></td> --%>
											 <a href="javascript:popupFullScreen('/admin/member/info/updateMember.do?memberIdx=${memberList.memberIdx }','')" ><c:out value="${memberList.memberName }"/></a>
											 </td>
						                     <td><a href="mailto:${memberList.memberEmail }">${memberList.memberEmail }</a></td>
						                     <td>
						                     <fmt:formatDate value="${memberList.regDate }"  type="both" pattern="yyyy-MM-dd"/>
						                     </td>
						                     <td>
						                     ${memberList.memberId }
						                     </td>
						                     <td><a href="javascript:deleteMember('${memberList.memberIdx }')" class="btn btn-warning btn-xs">탈퇴</a>
						                     </td>
						                     
						                 </tr>
			
						            </c:forEach>
						        </c:if>	
			              </tbody>
           			 </table>
           
            <jsp:include page="bPager.jsp"></jsp:include>
            		
						</div>
						
						</form>
					</div>
									
        	  	</div>
        	  	
        	  	<jsp:include page="../../common/footer.jsp"></jsp:include>
		</div>

</body>
</html>