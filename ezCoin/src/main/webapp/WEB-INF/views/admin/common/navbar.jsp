<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<script>
window.onload = function() {
	var sessionAdminId = document.getElementById("topAdminId").value;
	if(sessionAdminId == '') {
		document.location.href="/admin/login/adminLogin.do";
	} 
};
</script>

	<div class="row" style="margin: 6px;">
		<div class="col-lg-6">
			<img src="/resources/img/ezCoin.png" alt="logo" class="img-rounded" height="30px">
		</div>
		<div style="float: right; padding:5px;" class="col-lg-6">
			Today ${serverTime } ${sessionScope.adminName } 님 <a href="">HOME</a> | <a href="">정보변경</a> | <a href="/admin/login/adminLogoutPro.do">로그아웃</a>
			<form name="frmTop" id="frmTop" method="post">
				<input type="hidden" name="topAdminId" id="topAdminId" value="${sessionScope.adminId}"/>
				<input type="hidden" name="topAuth" id="topAuth" value="${sessionScope.adminAuth}"/>
			</form>
		</div>
	</div>

    <!-- Static navbar -->
 
      <div class="navbar navbar-inverse" role="navigation">
      	
        <div class="container-fluid">
          <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
              <span class="sr-only">Toggle navigation</span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="/admin/main/adminMain.do">Admin Main</a>
          </div>
          <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
              <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown"><span class="glyphicon glyphicon-user"></span> 회원 관리</a>
                <ul class="dropdown-menu" role="menu">
                  <li><a href="/admin/member/info/memberList.do">회원 리스트</a></li>
                </ul>
              </li>
              <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown"><span class="glyphicon glyphicon-list-alt"></span> 게시물 관리</a>
                <ul class="dropdown-menu" role="menu">
                  <li><a href="/admin/board/popup/managePopup.do">팝업 관리</a></li>
                  <li><a href="/admin/board/notice/manageNotice.do">공지사항 관리</a></li>
                  <li><a href="/admin/board/FAQ/manageFAQ.do">FAQ 관리</a></li>
                  <li><a href="/admin/board/QNA/manageQNA.do">ezCoin에 바란다 관리</a></li>
                </ul>
              </li>
            
            <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown"><span class="glyphicon glyphicon-refresh"></span> 거래 관리</a>
                <ul class="dropdown-menu" role="menu">
                  <li><a href="/admin/tx/transaction/manageTx.do">거래 현황</a></li>
                  <li><a href="/admin/tx/wallet/manageWallet.do">전자 지갑 관리</a></li>
                  <li><a href="/admin/tx/KRW/manageKRWInput.do">원화 입급 관리</a></li>
                  <li><a href="/admin/tx/KRW/manageKRWOutput.do">원화 출급 관리</a></li>
                  <li class="divider"></li>
                  <li><a href="/admin/tx/autotx/manageAutoTx.do">자동 이체 사이트 관리</a></li>
                  <li><a href="/admin/tx/autotx/getAutoTx.do">자동 이체 이력 관리</a></li>
                </ul>
              </li>
              <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown"><span class="glyphicon glyphicon-cog"></span> 시스템 현황</a>
                <ul class="dropdown-menu" role="menu">
                  <li><a href="#">시스템 로그 관리</a></li>
                  <li><a href="#">시스템 운영 현황</a></li>
                  <li><a href="#">디스크 상태</a></li>
                  <li><a href="#">백업 상태</a></li>
                  <li class="divider"></li>
                  <li><a href="#">관리자 관리</a></li>
                </ul>
              </li>
              <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown"><span class="glyphicon glyphicon-envelope"></span> 알림 관리</a>
                <ul class="dropdown-menu" role="menu">
                  <li><a href="#">SMS 관리</a></li>
                  <li><a href="#">E-mail 관리</a></li>
                </ul>
              </li>
              <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown"><span class="glyphicon glyphicon-globe"></span> Open API</a>
                <ul class="dropdown-menu" role="menu">
                  <li><a href="#">Action</a></li>
                  <li><a href="#">Another action</a></li>
                  <li><a href="#">Something else here</a></li>
                  <li class="divider"></li>
                  <li class="dropdown-header">Nav header</li>
                  <li><a href="#">Separated link</a></li>
                  <li><a href="#">One more separated link</a></li>
                </ul>
              </li>
              <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown"><span class="glyphicon glyphicon-credit-card"></span> PG 관리</a>
                <ul class="dropdown-menu" role="menu">
                  <li><a href="#">Action</a></li>
                  <li><a href="#">Another action</a></li>
                  <li><a href="#">Something else here</a></li>
                  <li class="divider"></li>
                  <li class="dropdown-header">Nav header</li>
                  <li><a href="#">Separated link</a></li>
                  <li><a href="#">One more separated link</a></li>
                </ul>
              </li>
              </ul>
          </div><!--/.nav-collapse -->
        </div><!--/.container-fluid -->
      </div>
