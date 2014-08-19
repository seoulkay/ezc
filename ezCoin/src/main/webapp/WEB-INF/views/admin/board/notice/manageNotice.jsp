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

</script>
</head>
<body>


      
       
       
<div class="main">
	<div class="main-inner">
		<div class="container">
		 <jsp:include page="../../common/navbar.jsp" /> 
			<div class="row">
                    <div class="col-lg-12">
                        <ol class="breadcrumb pull-right" style="font-size: 12px;">
						  <li>Main</li>
						  <li>게시물 관리</li>
						  <li><a href="/admin/board/notice/manageNotice.do">공지사항 관리</a></li>
						</ol>
          				<h4 class="sub-header"><span class="glyphicon glyphicon-asterisk"></span> <b>공지사항 관리</b></h4>
                    </div>
             </div>
             	<c:set var="boardType" value="Notice"/>
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
		</div>
	</div>
</div>
<!--         <div id="page-wrapper"> -->

<!--             <div class="container-fluid"> -->

<!--                 Page Heading -->

<!--                 <div class="row"> -->
<!--                     <div class="col-lg-3 col-md-6"> -->
<!--                         <div class="panel panel-primary"> -->
<!--                             <div class="panel-heading"> -->
<!--                                 <div class="row"> -->
<!--                                     <div class="col-xs-3"> -->
<!--                                         <i class="fa fa-comments fa-5x"></i> -->
<!--                                     </div> -->
<!--                                     <div class="col-xs-9 text-right"> -->
<!--                                         <div class="huge">26</div> -->
<!--                                         <div>New Comments!</div> -->
<!--                                     </div> -->
<!--                                 </div> -->
<!--                             </div> -->
<!--                             <a href="#"> -->
<!--                                 <div class="panel-footer"> -->
<!--                                     <span class="pull-left">View Details</span> -->
<!--                                     <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span> -->
<!--                                     <div class="clearfix"></div> -->
<!--                                 </div> -->
<!--                             </a> -->
<!--                         </div> -->
<!--                     </div> -->
<!--                     <div class="col-lg-3 col-md-6"> -->
<!--                         <div class="panel panel-green"> -->
<!--                             <div class="panel-heading"> -->
<!--                                 <div class="row"> -->
<!--                                     <div class="col-xs-3"> -->
<!--                                         <i class="fa fa-tasks fa-5x"></i> -->
<!--                                     </div> -->
<!--                                     <div class="col-xs-9 text-right"> -->
<!--                                         <div class="huge">12</div> -->
<!--                                         <div>New Tasks!</div> -->
<!--                                     </div> -->
<!--                                 </div> -->
<!--                             </div> -->
<!--                             <a href="#"> -->
<!--                                 <div class="panel-footer"> -->
<!--                                     <span class="pull-left">View Details</span> -->
<!--                                     <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span> -->
<!--                                     <div class="clearfix"></div> -->
<!--                                 </div> -->
<!--                             </a> -->
<!--                         </div> -->
<!--                     </div> -->
<!--                     <div class="col-lg-3 col-md-6"> -->
<!--                         <div class="panel panel-yellow"> -->
<!--                             <div class="panel-heading"> -->
<!--                                 <div class="row"> -->
<!--                                     <div class="col-xs-3"> -->
<!--                                         <i class="fa fa-shopping-cart fa-5x"></i> -->
<!--                                     </div> -->
<!--                                     <div class="col-xs-9 text-right"> -->
<!--                                         <div class="huge">124</div> -->
<!--                                         <div>New Orders!</div> -->
<!--                                     </div> -->
<!--                                 </div> -->
<!--                             </div> -->
<!--                             <a href="#"> -->
<!--                                 <div class="panel-footer"> -->
<!--                                     <span class="pull-left">View Details</span> -->
<!--                                     <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span> -->
<!--                                     <div class="clearfix"></div> -->
<!--                                 </div> -->
<!--                             </a> -->
<!--                         </div> -->
<!--                     </div> -->
<!--                     <div class="col-lg-3 col-md-6"> -->
<!--                         <div class="panel panel-red"> -->
<!--                             <div class="panel-heading"> -->
<!--                                 <div class="row"> -->
<!--                                     <div class="col-xs-3"> -->
<!--                                         <i class="fa fa-support fa-5x"></i> -->
<!--                                     </div> -->
<!--                                     <div class="col-xs-9 text-right"> -->
<!--                                         <div class="huge">13</div> -->
<!--                                         <div>Support Tickets!</div> -->
<!--                                     </div> -->
<!--                                 </div> -->
<!--                             </div> -->
<!--                             <a href="#"> -->
<!--                                 <div class="panel-footer"> -->
<!--                                     <span class="pull-left">View Details</span> -->
<!--                                     <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span> -->
<!--                                     <div class="clearfix"></div> -->
<!--                                 </div> -->
<!--                             </a> -->
<!--                         </div> -->
<!--                     </div> -->
<!--                 </div> -->
<!--                 /.row -->

<!--                 <div class="row"> -->
<!--                     <div class="col-lg-12"> -->
<!--                         <div class="panel panel-default"> -->
<!--                             <div class="panel-heading"> -->
<!--                                 <h3 class="panel-title"><i class="fa fa-bar-chart-o fa-fw"></i> Area Chart</h3> -->
<!--                             </div> -->
<!--                             <div class="panel-body"> -->
<!--                                 <div id="morris-area-chart"></div> -->
<!--                             </div> -->
<!--                         </div> -->
<!--                     </div> -->
<!--                 </div> -->
<!--                 /.row -->

<!--                 <div class="row"> -->
<!--                     <div class="col-lg-4"> -->
<!--                         <div class="panel panel-default"> -->
<!--                             <div class="panel-heading"> -->
<!--                                 <h3 class="panel-title"><i class="fa fa-long-arrow-right fa-fw"></i> Donut Chart</h3> -->
<!--                             </div> -->
<!--                             <div class="panel-body"> -->
<!--                                 <div id="morris-donut-chart"></div> -->
<!--                                 <div class="text-right"> -->
<!--                                     <a href="#">View Details <i class="fa fa-arrow-circle-right"></i></a> -->
<!--                                 </div> -->
<!--                             </div> -->
<!--                         </div> -->
<!--                     </div> -->
<!--                     <div class="col-lg-4"> -->
<!--                         <div class="panel panel-default"> -->
<!--                             <div class="panel-heading"> -->
<!--                                 <h3 class="panel-title"><i class="fa fa-clock-o fa-fw"></i> Tasks Panel</h3> -->
<!--                             </div> -->
<!--                             <div class="panel-body"> -->
<!--                                 <div class="list-group"> -->
<!--                                     <a href="#" class="list-group-item"> -->
<!--                                         <span class="badge">just now</span> -->
<!--                                         <i class="fa fa-fw fa-calendar"></i> Calendar updated -->
<!--                                     </a> -->
<!--                                     <a href="#" class="list-group-item"> -->
<!--                                         <span class="badge">4 minutes ago</span> -->
<!--                                         <i class="fa fa-fw fa-comment"></i> Commented on a post -->
<!--                                     </a> -->
<!--                                     <a href="#" class="list-group-item"> -->
<!--                                         <span class="badge">23 minutes ago</span> -->
<!--                                         <i class="fa fa-fw fa-truck"></i> Order 392 shipped -->
<!--                                     </a> -->
<!--                                     <a href="#" class="list-group-item"> -->
<!--                                         <span class="badge">46 minutes ago</span> -->
<!--                                         <i class="fa fa-fw fa-money"></i> Invoice 653 has been paid -->
<!--                                     </a> -->
<!--                                     <a href="#" class="list-group-item"> -->
<!--                                         <span class="badge">1 hour ago</span> -->
<!--                                         <i class="fa fa-fw fa-user"></i> A new user has been added -->
<!--                                     </a> -->
<!--                                     <a href="#" class="list-group-item"> -->
<!--                                         <span class="badge">2 hours ago</span> -->
<!--                                         <i class="fa fa-fw fa-check"></i> Completed task: "pick up dry cleaning" -->
<!--                                     </a> -->
<!--                                     <a href="#" class="list-group-item"> -->
<!--                                         <span class="badge">yesterday</span> -->
<!--                                         <i class="fa fa-fw fa-globe"></i> Saved the world -->
<!--                                     </a> -->
<!--                                     <a href="#" class="list-group-item"> -->
<!--                                         <span class="badge">two days ago</span> -->
<!--                                         <i class="fa fa-fw fa-check"></i> Completed task: "fix error on sales page" -->
<!--                                     </a> -->
<!--                                 </div> -->
<!--                                 <div class="text-right"> -->
<!--                                     <a href="#">View All Activity <i class="fa fa-arrow-circle-right"></i></a> -->
<!--                                 </div> -->
<!--                             </div> -->
<!--                         </div> -->
<!--                     </div> -->
<!--                     <div class="col-lg-4"> -->
<!--                         <div class="panel panel-default"> -->
<!--                             <div class="panel-heading"> -->
<!--                                 <h3 class="panel-title"><i class="fa fa-money fa-fw"></i> Transactions Panel</h3> -->
<!--                             </div> -->
<!--                             <div class="panel-body"> -->
<!--                                 <div class="table-responsive"> -->
<!--                                     <table class="table table-bordered table-hover table-striped"> -->
<!--                                         <thead> -->
<!--                                             <tr> -->
<!--                                                 <th>Order #</th> -->
<!--                                                 <th>Order Date</th> -->
<!--                                                 <th>Order Time</th> -->
<!--                                                 <th>Amount (USD)</th> -->
<!--                                             </tr> -->
<!--                                         </thead> -->
<!--                                         <tbody> -->
<!--                                             <tr> -->
<!--                                                 <td>3326</td> -->
<!--                                                 <td>10/21/2013</td> -->
<!--                                                 <td>3:29 PM</td> -->
<!--                                                 <td>$321.33</td> -->
<!--                                             </tr> -->
<!--                                             <tr> -->
<!--                                                 <td>3325</td> -->
<!--                                                 <td>10/21/2013</td> -->
<!--                                                 <td>3:20 PM</td> -->
<!--                                                 <td>$234.34</td> -->
<!--                                             </tr> -->
<!--                                             <tr> -->
<!--                                                 <td>3324</td> -->
<!--                                                 <td>10/21/2013</td> -->
<!--                                                 <td>3:03 PM</td> -->
<!--                                                 <td>$724.17</td> -->
<!--                                             </tr> -->
<!--                                             <tr> -->
<!--                                                 <td>3323</td> -->
<!--                                                 <td>10/21/2013</td> -->
<!--                                                 <td>3:00 PM</td> -->
<!--                                                 <td>$23.71</td> -->
<!--                                             </tr> -->
<!--                                             <tr> -->
<!--                                                 <td>3322</td> -->
<!--                                                 <td>10/21/2013</td> -->
<!--                                                 <td>2:49 PM</td> -->
<!--                                                 <td>$8345.23</td> -->
<!--                                             </tr> -->
<!--                                             <tr> -->
<!--                                                 <td>3321</td> -->
<!--                                                 <td>10/21/2013</td> -->
<!--                                                 <td>2:23 PM</td> -->
<!--                                                 <td>$245.12</td> -->
<!--                                             </tr> -->
<!--                                             <tr> -->
<!--                                                 <td>3320</td> -->
<!--                                                 <td>10/21/2013</td> -->
<!--                                                 <td>2:15 PM</td> -->
<!--                                                 <td>$5663.54</td> -->
<!--                                             </tr> -->
<!--                                             <tr> -->
<!--                                                 <td>3319</td> -->
<!--                                                 <td>10/21/2013</td> -->
<!--                                                 <td>2:13 PM</td> -->
<!--                                                 <td>$943.45</td> -->
<!--                                             </tr> -->
<!--                                         </tbody> -->
<!--                                     </table> -->
<!--                                 </div> -->
<!--                                 <div class="text-right"> -->
<!--                                     <a href="#">View All Transactions <i class="fa fa-arrow-circle-right"></i></a> -->
<!--                                 </div> -->
<!--                             </div> -->
<!--                         </div> -->
<!--                     </div> -->
<!--                 </div> -->
<!--                 /.row -->
<!-- 				<div class="row"> -->
<!--                     <div class="col-lg-12"> -->
<%--                  	 <jsp:include page="../../common/footer.jsp"></jsp:include> --%>
<!--                  	</div> -->
<!--                 </div> -->
<!--             </div> -->
<!--             /.container-fluid -->

<!--         </div> -->
<!--         /#page-wrapper -->

<!--     </div> -->
<!--     /#wrapper -->



<!--     Morris Charts JavaScript -->
<!--     <script src="/resources/js/plugins/morris/raphael.min.js"></script> -->
<!--     <script src="/resources/js/plugins/morris/morris.min.js"></script> -->
<!--     <script src="/resources/js/plugins/morris/morris-data.js"></script> -->

</body>
</html>