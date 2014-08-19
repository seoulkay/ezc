<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="/resources/bootstrap-3.2.0-dist/css/bootstrap.min.css" rel="stylesheet">
<link href="/resources/bootstrap-3.2.0-dist/css/justified-nav.css" rel="stylesheet">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<script src="/resources/bootstrap-3.2.0-dist/js/bootstrap.min.js"></script>
<script src="/resources/js/common.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ezCoin title</title>
<style type="text/css">
/*
 * Globals
 */
.form-signin {
  max-width: 330px;
  padding: 15px;
  margin: 0 auto;
}
.form-signin .form-signin-heading,
.form-signin .checkbox {
  margin-bottom: 10px;
}
.form-signin .checkbox {
  font-weight: normal;
}
.form-signin .form-control {
  position: relative;
  height: auto;
  -webkit-box-sizing: border-box;
     -moz-box-sizing: border-box;
          box-sizing: border-box;
  padding: 10px;
  font-size: 16px;
}
.form-signin .form-control:focus {
  z-index: 2;
}
.form-signin input[type="email"] {
  margin-bottom: -1px;
  border-bottom-right-radius: 0;
  border-bottom-left-radius: 0;
}
.form-signin input[type="password"] {
  margin-bottom: 10px;
  border-top-left-radius: 0;
  border-top-right-radius: 0;
}
/* Links */
a,
a:focus,
a:hover {
  color: #fff;
}

/* Custom default button */
.btn-default,
.btn-default:hover,
.btn-default:focus {
  color: #333;
  text-shadow: none; /* Prevent inheritence from `body` */
  background-color: #fff;
  border: 1px solid #fff;
}


/*
 * Base structure
 */

html,
body {
  height: 100%;
  background-color: #333;
}
body {
  color: #fff;
  text-align: center;
  text-shadow: 0 1px 3px rgba(0,0,0,.5);
}

/* Extra markup and styles for table-esque vertical and horizontal centering */
.site-wrapper {
  display: table;
  width: 100%;
  height: 100%; /* For at least Firefox */
  min-height: 100%;
  -webkit-box-shadow: inset 0 0 100px rgba(0,0,0,.5);
          box-shadow: inset 0 0 100px rgba(0,0,0,.5);
}
.site-wrapper-inner {
  display: table-cell;
  vertical-align: top;
}
.cover-container {
  margin-right: auto;
  margin-left: auto;
}

/* Padding for spacing */
.inner {
  padding: 30px;
}


/*
 * Header
 */
.masthead-brand {
  margin-top: 10px;
  margin-bottom: 10px;
}

.masthead-nav > li {
  display: inline-block;
}
.masthead-nav > li + li {
  margin-left: 20px;
}
.masthead-nav > li > a {
  padding-right: 0;
  padding-left: 0;
  font-size: 16px;
  font-weight: bold;
  color: #fff; /* IE8 proofing */
  color: rgba(255,255,255,.75);
  border-bottom: 2px solid transparent;
}
.masthead-nav > li > a:hover,
.masthead-nav > li > a:focus {
  background-color: transparent;
  border-bottom-color: #a9a9a9;
  border-bottom-color: rgba(255,255,255,.25);
}
.masthead-nav > .active > a,
.masthead-nav > .active > a:hover,
.masthead-nav > .active > a:focus {
  color: #fff;
  border-bottom-color: #fff;
}

@media (min-width: 768px) {
  .masthead-brand {
    float: left;
  }
  .masthead-nav {
    float: right;
  }
}


/*
 * Cover
 */

.cover {
  padding: 0 20px;
}
.cover .btn-lg {
  padding: 10px 20px;
  font-weight: bold;
}


/*
 * Footer
 */

.mastfoot {
  color: #999; /* IE8 proofing */
  color: rgba(255,255,255,.5);
}


/*
 * Affix and center
 */

@media (min-width: 768px) {
  /* Pull out the header and footer */
  .masthead {
    position: fixed;
    top: 0;
  }
  .mastfoot {
    position: fixed;
    bottom: 0;
  }
  /* Start the vertical centering */
  .site-wrapper-inner {
    vertical-align: middle;
  }
  /* Handle the widths */
  .masthead,
  .mastfoot,
  .cover-container {
    width: 100%; /* Must be percentage or pixels for horizontal alignment */
  }
}

@media (min-width: 992px) {
  .masthead,
  .mastfoot,
  .cover-container {
    width: 700px;
  }
}

</style>
<script>




function confirmSave(checkbox)
{
 var isRemember;

 if(checkbox.checked)
 {
 isRemember = confirm("이 PC에 로그인 정보를 저장하시겠습니까? PC방등의 공공장소에서는 개인정보가 유출될 수 있으니 주의해주십시오.");
  if(!isRemember)
   checkbox.checked = false;
 }
}

function setsave(name, value, expiredays)
{
 var today = new Date();
 today.setDate( today.getDate() + expiredays );
 document.cookie = name + "=" + escape( value ) + "; path=/; expires=" + today.toGMTString() + ";"
}

function saveLogin(id)
{
 if(id != "")
 {
  // userid 쿠키에 id 값을 7일간 저장
  setsave("adminId", id, 7);
 }else{
  // userid 쿠키 삭제
  setsave("adminId", id, -1);
 }
}

function getLogin()
{
 // userid 쿠키에서 id 값을 가져온다.
 var cook = document.cookie + ";";
 var idx = cook.indexOf("adminId", 0);
 var val = "";

 if(idx != -1)
 {
  cook = cook.substring(idx, cook.length);
  begin = cook.indexOf("=", 0) + 1;
  end = cook.indexOf(";", begin);
  val = unescape( cook.substring(begin, end) );
 }

 // 가져온 쿠키값이 있으면
 if(val!= "")
 {
  document.frm.adminId.value = val;
  document.frm.idcheck.checked = true;
 }
}


</script>
</head>

<body onLoad="getLogin()">

<div class="site-wrapper">

      <div class="site-wrapper-inner">

        <div class="cover-container">

          <div class="masthead clearfix">
            <div class="inner">
              <img src="/resources/img/ezCoin.png" alt="logo" class="img-rounded pull-left" height="40px">
            </div>
          </div>

          <div class="inner cover">
            <form class="form-signin" role="form" action="/admin/login/adminLoginPro.do" method="post" name="frm">
        <h3 class="form-signin-heading">이지코인 관리자 페이지</h3>
        <input type="text" class="form-control" placeholder="아이디" name="adminId" required autofocus>
        <input type="password" class="form-control" placeholder="패스워드" name="adminPass" id="adminPass" required>
        <div class="checkbox">
          <label>
            <input type="checkbox" value="remember-me" onClick="confirmSave(this)" name="idcheck">아이디 기억하기
          </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit" id="adminSubmit">로그인</button>
      </form>
          </div>

          <div class="mastfoot">
            <div class="inner">
              <jsp:include page="../common/footer.jsp"></jsp:include>
            </div>
          </div>

        </div>

      </div>

    </div>


</body>
<script>
document.getElementById('adminSubmit').onclick = function(){
	if(frm.idcheck.checked){
		saveLogin(frm.adminId.value);
	}
	else {
		saveLogin('');
	}	
		return true;
};
</script>
</html>