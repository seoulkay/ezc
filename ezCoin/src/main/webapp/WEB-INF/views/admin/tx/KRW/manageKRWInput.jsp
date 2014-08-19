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
<script src="/resources/js/common.js"></script>
<script src="/resources/js/calendar.js"></script>
<script>
/**
 * 검색
 */
function getSearchList() {
	$('#searchForm').attr("action", "/admin/tx/KRW/searchKRWInputPro.do");
	$('#searchForm').submit();
}


</script>
<link href="/resources/bootstrap-3.2.0-dist/css/bootstrap.min.css" rel="stylesheet">
<link href="/resources/bootstrap-3.2.0-dist/css/justified-nav.css" rel="stylesheet">
<link href="/resources/jquery-ui-1.11.0.custom/jquery-ui.css" rel="stylesheet">



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
				  <li><a href="/admin/main/adminMain.do">Main</a></li>
				  <li>거래 관리</li>
				  <li><a href="/admin/tx/manageKRWInput.do">원화 입급 관리</a></li>
			</ol>
          <h4 class="sub-header"><span class="glyphicon glyphicon-asterisk"></span> <b>원화 입급 관리</b></h4>
          </div>
         </div>

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
	<a class="btn btn-sm btn-info" onclick="javascript:getSearchList()"><span class="glyphicon glyphicon-search"></span> 검색</a>           	    
</form>
</div>
</div>       
          <div class="row">
          <div class="col-lg-12">
          <form id="form" method="post">
          
          <small><span class="glyphicon glyphicon-list"></span> 검색결과 : <span style="color: red">${cnt}</span> 건</small>
          
          <div class="table-responsive">
            <table class="table table-striped text-center">
            <colgroup>
            <col width="10%"/>
            <col width="8%"/>
            <col width="15%"/>
            <col width="15%"/>
            <col width="15%"/>
            <col width=""/>
            <col width="10%"/>
            </colgroup>
              <thead>       
                <tr>
                  <th class="text-center">거래코드</th>
                  <th class="text-center">아이디</th>
                  <th class="text-center">요청시간</th>
                  <th class="text-center">처리시간</th>
                  <th class="text-center">입금액</th>
                  <th class="text-center">담당자</th>
                  <th class="text-center">충전</th>
                </tr>
              </thead>
              <tbody>
              		<c:if test="${fn:length(vo) == 0}">
              		<tr>
              			<td colspan="7" style="text-align: center">거래가 없습니다.</td>
              		</tr>
              		</c:if>
                    <c:if test="${fn:length(vo) > 0}">                		

						<c:forEach var="vo" items="${vo}" varStatus="status">
			                 
			                 <tr>
			                 
			                     <td><c:out value="${vo.krwRequestIdx }" /></td>
			                     <td><a href="/admin/member/info/updateMember.do?memberIdx=${vo.memberIdx }" target="_blank"><c:out value="${vo.memberId }" /></a></td>
			                     <td>
			                     <fmt:formatDate value="${vo.krwRequestDatetime }"  type="both" pattern="yyyy-MM-dd hh:mm"/>
			                     </td>
			                     <td>
			                     <fmt:formatDate value="${vo.krwRequestResponseDatetime }"  type="both" pattern="yyyy-MM-dd hh:mm"/>
			                     </td>
			                     <td><c:out value="${vo.krwRequestKrw }" /></td>
			                     <td><c:out value="${vo.krwRequestResponseId }" /></td>
			                     <td><a href="/admin/tx/KRW/updateKRWInput.do?krwRequestIdx=${vo.krwRequestIdx }&memberIdx=${vo.memberIdx }&inputKrw=${vo.krwRequestKrw }&sessionId=${sessionScope.adminId }" class="btn btn-danger btn-xs">충전 </a></td>	                     
			                 </tr>
			            </c:forEach>
			        </c:if>	
              </tbody>
            </table>
            		<jsp:include page="../../member/info/bPager.jsp"></jsp:include>
						</div>
						
						</form>
					</div>
				</div>
			</div>
					
									

       <jsp:include page="../../common/footer.jsp" />  	 
 
			
</body>
</html>