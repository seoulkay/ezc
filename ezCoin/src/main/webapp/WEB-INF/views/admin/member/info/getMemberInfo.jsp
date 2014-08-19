<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="/resources/bootstrap-3.2.0-dist/css/bootstrap.min.css" rel="stylesheet">
<link href="/resources/bootstrap-3.2.0-dist/css/justified-nav.css" rel="stylesheet">
<script src="/resources/js/common.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<script src="/resources/bootstrap-3.2.0-dist/js/bootstrap.min.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>ezCoin title</title>
<script>
/**
 * 입력.
 */
function updateMemberBoard() {
	
	$('#form').attr("action","/admin/member/info/updateMemberPro.do");
	$('#form').submit();
}

/**
 * 입력취소 창 닫기
 */
function cancel() {
	self.opener = self;
	self.close();
}

/**
 * 사용여부 라디오 버튼 값 체크.
 */
 function isUseCheck(type) {
		var isuse = $(':radio[name='+type+'Radio]:checked').val();
		$('#'+type).val(isuse);
	}



</script>
</head>
<body>

<div class="jumbotron">
	<div class="container">
	
	<div class="row">
	<ul class="nav nav-pills">
		  <li class="active"><a href="/admin/member/info/updateMember.do?memberIdx=${param.memberIdx}">일반정보</a></li>
		  <li><a href="/admin/member/info/getMemberWalletInfo.do?memberIdx=${param.memberIdx}">지갑정보</a></li>
	</ul>

	</div>
			<div class="row">
          <h4 class="sub-header"><span class="glyphicon glyphicon-asterisk"></span> <b>회원 정보 조회</b></h4>
          </div>
       
  <form id="form" name="form" method="post">
     
     
    
     <input type="hidden" id="memberIdx" name="memberIdx" value="${vo.memberIdx}"/>    

   
          <div class="table-responsive">
						<table class="table table-striped">
							<colgroup>
								<col width="20%" />
								<col width="80%" />

							</colgroup>

							<tr>
								<th>아이디</th>
								<td><input type="text" name="memberId" title="아이디" style="width:100%" maxlength="256" id="memberId" value="${vo.memberId }"/></td>
							</tr>
							<tr>
								<th>KRW 보유량</th>
								<td><input type="text" name="memberKrw" title="krw" style="width:100%" maxlength="256" id="memberKrw" value="${vo.memberKrw }"/></td>
							</tr>
							<tr>
								<th>BTC 보유량</th>
								<td><input type="text" name="memberBtc" title="btc" style="width:100%" maxlength="256" id="memberBtc" value="${vo.memberBtc }"/></td>
							</tr>
							<tr>
								<th>오류현황/상태</th>
								<td><input type="text" name="memberError" title="오류현황/상태" style="width:100%" maxlength="256" id="memberError" value="${vo.memberError }"/></td>
							</tr>
							<tr>
								<th>비밀번호 힌트</th>
								<td><input type="text" name="memberPassHint" title="비밀번호 힌트" style="width:100%" maxlength="256" id="memberPassHint" value="${vo.memberPassHint }"/></td>
							</tr>
							<tr>
								<th>이름</th>
								<td><input type="text" name="memberName" title="이름" style="width:100%" maxlength="256" id="memberName" value="${vo.memberName }"/></td>
							</tr>
							<tr>
								<th>닉네임 (별명)</th>
								<td><input type="text" name="memberNick" title="닉네임 (별명)" style="width:100%" maxlength="256" id="memberNick" value="${vo.memberNick }"/></td>
							</tr>
							<tr>
								<th>전자메일 주소</th>
								<td><input type="text" name="memberEmail" title="전자메일 주소" style="width:100%" maxlength="256" id="memberEmail" value="${vo.memberEmail }"/></td>
							</tr>
							<tr>
								<th>SMS 수신 거부</th>
								<td>
								<c:choose>
								<c:when test="${vo.memberSmsUse == 1}">
								<input type="hidden" id="memberSmsUse" name="memberSmsUse" value="1"/>
								<input type="radio" title="수신여부" id="memberSmsUseRadio" name="memberSmsUseRadio" value="1" onclick="javascript:isUseCheck('memberSmsUse')" checked="checked"/> 필요함 
								<input type="radio" title="수신여부" id="memberSmsUseRadio" name="memberSmsUseRadio" value="0" onclick="javascript:isUseCheck('memberSmsUse')" /> 필요 없음
							    </c:when>
							    <c:when test="${vo.memberSmsUse == 0}">
							    <input type="hidden" id="memberSmsUse" name="memberSmsUse" value="0"/>
								<input type="radio" title="수신여부" id="memberSmsUseRadio" name="memberSmsUseRadio" value="1" onclick="javascript:isUseCheck('memberSmsUse')" /> 필요함
								<input type="radio" title="수신여부" id="memberSmsUseRadio" name="memberSmsUseRadio" value="0" onclick="javascript:isUseCheck('memberSmsUse')" checked="checked"/> 필요없음
							    </c:when>
							    </c:choose>
							    </td>
							</tr>
							<tr>
								<th>Email 수신 거부</th>
								<td>
								<c:choose>
								<c:when test="${vo.memberEmailUse == 1 }">
								<input type="hidden" id="memberEmailUse" name="memberEmailUse" value="1"/>
								<input type="radio" title="수신여부" id="memberEmailUseRadio" name="memberEmailUseRadio" value="1" onclick="javascript:isUseCheck('memberEmailUse')" checked="checked"/> 필요함 
								<input type="radio" title="수신여부" id="memberEmailUseRadio" name="memberEmailUseRadio" value="0" onclick="javascript:isUseCheck('memberEmailUse')" /> 필요 없음
							    </c:when>
							    <c:when test="${vo.memberEmailUse == 0 }">
							    <input type="hidden" id="memberEmailUse" name="memberEmailUse" value="0"/>
								<input type="radio" title="수신여부" id="memberEmailUseRadio" name="memberEmailUseRadio" value="1" onclick="javascript:isUseCheck('memberEmailUse')" /> 필요함
								<input type="radio" title="수신여부" id="memberEmailUseRadio" name="memberEmailUseRadio" value="0" onclick="javascript:isUseCheck('memberEmailUse')" checked="checked"/> 필요없음
							    </c:when>
							    </c:choose>
							    </td>
							</tr>
							<tr>
								<th>생년월일</th>
								<td><input type="text" name="memberBirth" title="생년월일" style="width:100%" maxlength="256" id="memberBirth" value="${vo.memberBirth }"/></td>
							</tr>
							<tr>
								<th>성별</th>
								<td><input type="text" name="memberGender" title="성별" style="width:100%" maxlength="256" id="memberGender" value="${vo.memberGender }"/></td>
							</tr>
							<tr>
								<th>주소</th>
								<td><input type="text" name="memberAddress" title="주소" style="width:100%" maxlength="256" id="memberAddress" value="${vo.memberAddress }"/></td>
							</tr>
							<tr>
								<th>전화번호</th>
								<td><input type="text" name="memberHomePhone" title="전화번호" style="width:100%" maxlength="256" id="memberHomePhone" value="${vo.memberHomePhone }"/></td>
							</tr>
							<tr>
								<th>핸드폰번호</th>
								<td><input type="text" name="memberCellPhone" title="핸드폰번호" style="width:100%" maxlength="256" id="memberCellPhone" value="${vo.memberCellPhone }"/></td>
							</tr>
							<tr>
								<th>지갑(어카운트)</th>
								<td><input type="text" name="memberWallet" title="지갑(어카운트)" style="width:100%" maxlength="256" id="memberWallet" value="${vo.memberWallet }"/></td>
							</tr>
							<tr>
								<th>인증현황</th>
								<td><input type="text" name="memberAuthStatus" title="인증현황" style="width:100%" maxlength="256" id="memberAuthStatus" value="${vo.memberAuthStatus }"/></td>
							</tr>
							<tr>
								<th>자동결재</th>
								<td>
								<c:choose>
								<c:when test="${vo.memberAutoPay == 1 }">
								 <input type="hidden" id="memberAutoPay" name="memberAutoPay" value="1"/>
								<input type="radio" title="수신여부" id="memberAutoPayRadio" name="memberAutoPayUseRadio" value="1" onclick="javascript:isUseCheck('memberAutoPay')" checked="checked"/> 사용 
								<input type="radio" title="수신여부" id="memberAutoPayRadio" name="memberAutoPayUseRadio" value="0" onclick="javascript:isUseCheck('memberAutoPay')" /> 사용안함
							    </c:when>
							    <c:when test="${vo.memberAutoPay == 0 }">
							     <input type="hidden" id="memberAutoPay" name="memberAutoPay" value="0"/>
								<input type="radio" title="수신여부" id="memberAutoPayRadio" name="memberAutoPayRadio" value="1" onclick="javascript:isUseCheck('memberAutoPay')" /> 사용
								<input type="radio" title="수신여부" id="memberAutoPayRadio" name="memberAutoPayRadio" value="0" onclick="javascript:isUseCheck('memberAutoPay')" checked="checked"/> 사용안함
							    </c:when>
							    </c:choose>
							    </td>
							</tr>
							<tr>
								<th>자동결재리스트</th>
								<td><textarea name="memberAutoPayList" rows="6" style="width:100%" id="memberAutoPayList" onkeyup="javascript:checkTextAreaMax(this)">${vo.memberAutoPayList }</textarea></td>
							</tr>
							
</table>
</div>
</form>
						
						<div class="row pull-right">
								<a href="#" onclick="javascript:updateMemberBoard()" class="btn btn-info btn-xs"><span class="glyphicon glyphicon-pencil"></span> 등록</a>
								<a href="#" onclick="javascript:cancel()" class="btn btn-info btn-xs"><span class="glyphicon glyphicon-remove"></span> 취소</a>
						</div>
			</div>
</div>

 <jsp:include page="../../common/footer.jsp" />

</body>
</html>

