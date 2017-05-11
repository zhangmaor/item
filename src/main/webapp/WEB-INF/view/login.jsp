<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>



<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
	</head>
	<style type="text/css">
		*{
			margin: 0;
			padding: 0;
		}
		#height{
			width: 100%;
			
		}
		#top{
			width: 100%;
			height: 35%;
			background: linear-gradient(#1B8CF2, white); 
		}
		
		#bottom{
			width: 100%;
			height: 35%;
			background: linear-gradient(white, #1B8CF2); 
			position: absolute;
			bottom: 0;
		}
		#content{
			width: 40%;
			height: 40%;
			background: white;
			position: fixed;
			margin: auto;
			top: 0; 
			left: 0; 
			bottom: 0; 
			right: 0;
			border: 10px solid #CDD3D7;
			border-radius: 20px;
			text-align: center;
			z-index: 1;
		}
		#content div{
			width: 100%;
		}
		#div1{
			height: 80%;
		}
		#div2{
			height: 20%;
		}
		#div1 input{
			width: 45%;
			height: 20%;
			margin-top: 3%;
			font-size: 100%;
		}
		#div2 input{
			width: 45%;
			height: 70%;
			font-size: 100%;
		}
		input{
			background: #CDD3D7;
			border: 0;
			border-radius: 5px;
			
		}
		#login{
			background: #1B8CF2;
			color: white;
			font-size: 20px;
		}
		#user,#password:focus{
			border: 0px;
			border-radius: 5px solid blue;
		}
		#login:focus{
			border: 0px;
			border-radius: 0px;
		}
		
	</style>
	<body>
		<div id="height">
			<div id="top"></div>
			<form:form action="${pageContext.request.contextPath}/login" method="post">
			<div id="content">
				<p>${message}</p>
				<div id="div1">
					账号：<input type="text" placeholder="请输入账号" name="userPhone" /><form:errors path="userPhone" element="p" /><br>
					密码：<input type="password" placeholder="请输入密码" name="userPwd" /><form:errors path="userPwd" element="p" />
				</div>
				<div id="div2">
					<input type="submit" value="登录" id="login" />
				</div>
			</div>
			</form:form>
			<div id="bottom"></div>
		</div>
		
	</body>
	<script type="text/javascript">
		boxheight(); //执行函数
		function boxheight(){ //函数：获取尺寸
		    //获取浏览器窗口高度
		    var winHeight=0;
		    if (window.innerHeight)
		        winHeight = window.innerHeight;
		    else if ((document.body) && (document.body.clientHeight))
		        winHeight = document.body.clientHeight;
		    //通过Document对body进行检测，获取浏览器可视化高度
		    if (document.documentElement && document.documentElement.clientHeight)
		        winHeight = document.documentElement.clientHeight;
		    //DIV高度为浏览器窗口高度
		    document.getElementById("height").style.height= winHeight +"px";
		 
		}
		    window.onresize=boxheight; //窗口或框架被调整大小时执
		    
	//	document.body.style.overflow='hidden';
	</script>
</html>
