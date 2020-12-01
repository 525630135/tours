<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix='fmt' uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<base href="<%=basePath%>">
<html>
<head>
 <title>新闻列表</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <!-------------jquery库-------------->
  	<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
  	<!-- Bootstrap -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript" src="js/bootstrap.min.js"></script>
    <!-------------Amazeui--------------->
    <script type="text/javascript" src="js/amazeui.js"></script>
    <link rel="stylesheet" type="text/css" href="css/amazeui.css">
    <!------------核心样式-------------->
    <link rel="stylesheet" type="text/css" href="css/style.css"> 
</head>
<body>
    <!--引入页面头部head.html-->
	<%@ include file="/WEB-INF/jsp/commons/head.jsp"%>
	
	<!------------------子页框架-------------------->
<div id="sub_from">
    <div class="cw1200">
		<div class="w810 fl">
			<!------------------公共盒子-------------------->
			<div class="public_box bg1">
				<div class="public_title">
					<div class="fl"><img src="images/from_title_left.png"/></div>
					<div class="con">
						<div class="lamp_ico"><img src="images/lamp_ico.png"/></div>
						<div class="name"><img src="images/f_t_news_list.png"/></div>
					</div>
					<div class="fr"><img src="images/from_title_right.png"/></div>
					<div class="clear"></div>
				</div>
				<!------------------列表分类-------------------->
				<!-- <div id="list_sort">
					<ul>
						<li></li>
					</ul>
				</div> -->
				<!------------------新闻列表-------------------->
				<div id="news_list">
					<ul>
					<c:forEach items="${pageInfo.list}" var="information" varStatus="id">
					    <li>
							<!-- <div class="date"><p>22</p><span>12月</span></div> -->
							<div class="pic"><a href="${pageContext.request.contextPath}/information/getInformation?id=${information.id}"><img class="scale-effect" src="/pic/${information.pic}"/></a></div>
							<div class="con">
								<h3>${information.title}</h3>
							<p>发布时间：<fmt:formatDate value="${information.ptime}" pattern="yyyy-MM-dd HH:mm:ss"/><a href="${pageContext.request.contextPath}/information/getInformation?id=${information.id}">详细信息</a></p>
							</div>
							<div class="share">
								<div class="bdsharebuttonbox">
									<a href="#" class="bds_more" data-cmd="more"></a>
								</div>
								<script>window._bd_share_config={"common":{"bdSnsKey":{},"bdText":"","bdMini":"2","bdMiniList":false,"bdPic":"","bdStyle":"0","bdSize":"16"},"share":{}};with(document)0[(getElementsByTagName('head')[0]||body).appendChild(createElement('script')).src='http://bdimg.share.baidu.com/static/api/js/share.js?v=89860593.js?cdnversion='+~(-new Date()/36e5)];</script>
							</div>
							<div class="clear"></div>
						</li>
					</c:forEach>
					</ul>
				</div>
				
			</div>
	
		</div>
		
			<div style="position:absolute;right:30px;bottom:200px;margin-right:50px;">
		   <ul class="pagination pagination-lg">
			   <li><a href="${pageContext.request.contextPath}/information/getALLInformations?page=1">首页</a></li>
			   <!--是否有上一页-->
			   <c:if test="${pageInfo.hasPreviousPage}">
				   <li><a href="${pageContext.request.contextPath}/information/getALLInformations?page=${pageInfo.pageNum-1}">&laquo;</a></li>
			   </c:if>

			   <%-- <c:forEach items="${pageInfo.navigatepageNums}" var="page_Num">
                    <li><a href="#">${page_Num}</a></li>
                </c:forEach>--%>
			   <c:forEach items="${pageInfo.navigatepageNums}" var="page_Num">
				   <!--判断是不是当前页 如果是当前页码 显示高亮-->
				   <c:if test="${page_Num==pageInfo.pageNum}">
					   <li class="active"><a href="#">${page_Num}</a></li>
				   </c:if>
				   <c:if test="${page_Num!=pageInfo.pageNum}">
					   <!--发送请求-->
					   <li><a href="${pageContext.request.contextPath}/information/getALLInformations?page=${page_Num}">${page_Num}</a></li>
				   </c:if>
			   </c:forEach>
			   <!--是否有下一页-->
			   <c:if test="${pageInfo.hasNextPage}">
				   <li><a href="${pageContext.request.contextPath}/information/getALLInformations?page=${pageInfo.pageNum+1}">&raquo;</a></li>
			   </c:if>
			   <li><a href="${pageContext.request.contextPath}/information/getALLInformations?page=${pageInfo.pages}">末页</a></li>
			</ul>
		</div>
		
		<div class="w380 fr">
			<!--引入侧边页面side.jsp-->
	<%@ include file="/WEB-INF/jsp/commons/newslist_side.jsp"%>
	<!--引入尾部-->
	<%@ include file="/WEB-INF/jsp/commons/foot.jsp"%>
</body>
</html>