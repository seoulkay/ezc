<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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