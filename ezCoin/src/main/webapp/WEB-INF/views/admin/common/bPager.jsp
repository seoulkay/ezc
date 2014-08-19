<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

			<div class="text-center">
            		
            			<fmt:formatNumber var= "chapter" maxFractionDigits="0" value= " ${(((page-1) div 10)-(((page-1) div 10)%1)) * 10}" />
						<c:if test="${param.searchWord == null && param.startDate == null && param.endDate == null}">
						
					
						<ul class="pagination">
							
							<li><a href="/admin/board/${bPath }/manage${bType }.do?page=${1}">처음</a></li>
							<c:if test="${(chapter-2) > 0}">
							<li><a href="/admin/board/${bPath}/manage${bType}.do?page=${chapter}">&laquo;</a></li>
							</c:if>
							<c:forEach begin="${chapter+1 }" end="${chapter+10}" step="1" var="a" varStatus="i">
							<c:if test="${i.index<=pageNum }">	
								<c:if test="${i.index == page}">
								<li class="active"><a href="/admin/board/${bPath}/manage${bType}.do?page=${i.index }">${i.index }</a></li>
								</c:if>
								<c:if test="${i.index != page}">
								<li><a href="/admin/board/${bPath}/manage${bType}.do?page=${i.index }">${i.index }</a></li>
								</c:if>
							</c:if>
							</c:forEach>
							<c:if test="${chapter+10 < pageNum }">
							<li><a href="/admin/board/${bPath}/manage${bType}.do?page=${chapter+11}">&raquo;</a></li>
							</c:if>
							<li><a href="/admin/board/${bPath}/manage${bType}.do?page=${pageNum}">마지막</a></li>
						</ul>		
						</c:if>
						<c:if test="${param.searchWord != null || param.startDate != null || param.endDate != null}">
						<ul class="pagination">
						
							<li><a href="/admin/board/${bPath}/search${bType}Pro.do?searchWord=${param.searchWord }&startDate=${param.startDate }&endDate=${param.endDate }&page=${1}">처음</a></li>
							<c:if test="${(chapter-2) > 0}">
							<li><a href="/admin/board/${bPath}/search${bType}Pro.do?searchWord=${param.searchWord }&startDate=${param.startDate }&endDate=${param.endDate }&page=${chapter}">&laquo;</a></li>
							</c:if>
							<c:forEach begin="${chapter+1 }" end="${chapter+10}" step="1" var="a" varStatus="i">
							<c:if test="${i.index<=pageNum }">	
							<c:if test="${i.index == page}">
							<li class="active"><a href="/admin/board/${bPath}/search${bType}Pro.do?searchWord=${param.searchWord }&startDate=${param.startDate }&endDate=${param.endDate }&page=${i.index }">${i.index }</a></li>
							</c:if>
							<c:if test="${i.index != page}">
							<li><a href="/admin/board/${bPath}/search${bType}Pro.do?searchWord=${param.searchWord }&startDate=${param.startDate }&endDate=${param.endDate }&page=${i.index }">${i.index }</a></li>
							</c:if>
							</c:if>
							</c:forEach>
							<c:if test="${chapter+10 < pageNum }">
							<li><a href="/admin/board/${bPath}/search${bType}Pro.do?searchWord=${param.searchWord }&startDate=${param.startDate }&endDate=${param.endDate }&page=${chapter+11 }">&raquo;</a></li>
							</c:if>
							<li><a href="/admin/board/${bPath}/search${bType}Pro.do?searchWord=${param.searchWord }&startDate=${param.startDate }&endDate=${param.endDate }&page=${pageNum }">마지막</a></li>
						</ul>	
						</c:if>
						
						
						</div>
