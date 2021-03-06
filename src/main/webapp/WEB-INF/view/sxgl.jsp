<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title>e职多就业管理系统</title>

		<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
		<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
		<script src="${pageContext.request.contextPath}/js/bootstrap-paginator.js"></script>
		<script src="${pageContext.request.contextPath}/js/jquery.nouislider.js"></script>
		<script src="/js/getEnretCount.js" type="text/javascript"></script>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.min.css"/>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/index.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/fa/css/font-awesome.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/font-awesome.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/sxgl.css" />
	</head>
	
	<body>
		<div class="whole">
			<div class="header">
				<div class="container">
					<div class="font-hearder">
						欢迎回来，e职多就业管理系统&nbsp;&nbsp;&nbsp;<i class="fa fa-unlock"><a href="${pageContext.request.contextPath}/login/logout" style="color:#5AB0F9">&nbsp;&nbsp;登出</a></i>
					</div>
				</div>
			</div>
			
			<div class="center">
				<div class="left-center">
					<div class="left-center-1">
						<p style="font-size:18px;color:white;text-align: center;"><b>e职多就业管理</b></p>
					</div>
					
					<div class="center-mokuai">
						<div class="mokuai mokuai-active" id="sxgl"><i class="fa fa-comment"></i>&nbsp;&nbsp;&nbsp;实习管理</div>
					</div>
					
					<div class="center-mokuai">
						<div class="mokuai" id="qzgl"><i class="fa fa-commenting"></i>&nbsp;&nbsp;&nbsp;全职管理</div>
					</div>
					
					<div class="center-mokuai">
						<div class="mokuai" id="dzhgl"><i class="fa fa-clock-o"></i>&nbsp;&nbsp;&nbsp;大招会管理</div>
					</div>
					
					<div class="center-mokuai">

						<div class="mokuai" id="qygl"><i class="fa fa-envelope"></i>&nbsp;&nbsp;&nbsp;企业管理</div>
					</div>
					
					<div class="center-mokuai">
						<div class="mokuai" id="xxgl"><i class="fa fa-home"></i>&nbsp;&nbsp;&nbsp;学校管理</div>
					</div>
					
					<div class="center-mokuai">
						<div class="mokuai" id="wzgl"><i class="fa fa-file"></i>&nbsp;&nbsp;&nbsp;文章管理</div>
					</div>
				</div>
				
				<div class="right-center">
					<div class="right-mokuai">
						<div class="practice" style="width: 18%;">
							<span id="gl">实习管理<i class="fa fa-angle-down"></i></span>&nbsp;

						</div>					
					</div>
					
					<div class="right-body" id="one">
						<div class="right-body-main">
							<div class="main-1">
								<span class="main-1-1">共发布实习<font id="counts">11</font>个</span>
								<span class="main-1-2">
									<span class="main-1-2-1"><font id="sh">1</font>个正在审核</span>
									<span class="main-1-2-1"><font id="ks">3</font>个正在招聘</span>
									<span class="main-1-2-1"><font id="xj">1</font>个下架</span>
								</span>
							</div>
							
							
							<div class="col-xs-4 text-left">
								<div class="btn">
									<div class="pull-left">
										<i class="icon-refresh"></i>
									</div>
									<div class="pull-right">
										<li class="text-left"><strong>刷新实习岗位</strong></li>
										<li class="text-left">上次刷新为&nbsp;2016-10-30&nbsp;18:30</li>
									</div>
								</div>
							</div>
								
							<div class="col-xs-4 text-center" >
								<div class="btn"  data-toggle='modal' data-target='#sxjl' id="tankuang">
									<div class="pull-left">
										<i class="icon-eye-open"></i>
									</div>
									<div class="pull-right">
										<li class="text-left pull-left"><strong>录用实习学生</strong></li>
										<li class="pull-right" style="color: #8BCE5C;"><strong>●&nbsp;收到新的简历</strong>&nbsp;&nbsp;</li><br>
										<li class="text-left">共收到1201份简历</li>	
									</div>
								</div>	
							</div>
							
							<div class="col-xs-4 text-right" >
								<div class="btn" id="fbgw">
									<div class="pull-left">
										<i class="icon-arrow-up"></i>
									</div>
									<div class="pull-right">
										<li class="text-left"><strong>发布实习岗位</strong></li>
										<li class="text-left small">今天还可以发布5个岗位</li>
									</div>
								</div>
							</div>
							
							<p style="color: #858A98;">实习学生列表</p>
							<table id="sxlb">
								<thead>
					            	<th></th>
									<th>实习岗位</th>
									<th>姓名<i class="icon-angle-down"></i></th>
									<th>电话<i class="icon-angle-down"></i></th>
									<th>性别<i class="icon-angle-down"></i></th>
									<th>报名时间<i class="icon-angle-down"></i></th>
									<th>状态<i class="icon-angle-down"></i></th>
					            </thead>
								
								<tbody id="sxbm">
									<%--显示数据--%>
								</tbody>
							</table>
						</div>
					</div>

				</div>
			</div>
		</div>
		<!-- 
			
			实习简历 (模态框)Modal
								
								-->
		<div class="modal fade" id="sxjl" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" data-backdrop="static" data-keyboard="false">
		  <div class="modal-dialog" role="document" style="width: 40%;">
		    <div class="modal-content">
		     
		        <!--<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;&times;</span></button>-->
		    	<div id="xxx"><button type="button" class="close" data-dismiss="modal">&times;</button></div>
		  
		      <div class="modal-body">
		        <table id="lqsx" cellpadding="0" cellspacing="0" class="table">
					<tr>
		    			<td>
		    				<div style="width: 60px; height: 60px;margin: auto;">
		    					<img src="${pageContext.request.contextPath}/img/logo.png" style="width: 100%;height: 100%;border-radius: 50px;" id="uphoto"/>
		    				</div>
		    			</td>
		    		</tr>
		    		<tr>
		    			<td>
		    				<span id="uname">13425520042JCH</span>&nbsp;
		    				<span id="ustatus">未实名认证</span>&nbsp;
		    			</td>
		    		</tr>
		    		<tr>
		    			<td>
		    				<span id="usex">女</span>&nbsp;
		    				<span id="uschool">未知</span>&nbsp;
		    				<span id="udegree">专科</span>&nbsp;
		    				<span id="uaddress">珠海</span>
		    			</td>
		    		</tr>
		    		<tr>
		    			<td>
		    				<span id="umajor">国际贸易与实务</span>
		    			</td>
		    		</tr>
		    		<tr>
		    			<td>
		    				<span id="uphone">13425520042</span>
		    				<span id="uemail">790847005@qq.com</span>
		    			</td>
		    		</tr>
		    		<tr>
		    			<td>
		    				<span>教育经历</span>
		    				<hr  style="border:1px dashed #E7EAEC;margin: 0;padding: 0;">
		    			</td>
		    		</tr>
		    		<tr>
		    			<td class="text-left">
		    				<span id="ueducation">2008年9-2011年6 实验中学 2011年9-2014 濠头中学 2014年9-至今 广东工商职业学院 专科-国际贸易与实务</span>
		    			</td>
		    		</tr>
		    		<tr>
		    			<td>
		    				<span>职业统计</span>
		    				<hr style="border:1px dashed #E7EAEC;padding: 0;margin: 0;">
		    			</td>
		    		</tr>
		    		<tr>
		    			<td>
		    				<table cellspacing="0" cellpadding="0" class="table table-bordered">
		    					<tr style="background: #F9F9F9;">
		    						<td>总报名次数</td>
		    						<td>取消次数</td>
		    						<td>被录用次数</td>
		    						<td>用户解约</td>
		    						<td>企业解约</td>
		    						<td>已完成</td>
		    					</tr>
		    					<tr>
		    						<td>0</td>
		    						<td>0</td>
		    						<td>0</td>
		    						<td>0</td>
		    						<td>0</td>
		    						<td>0</td>
		    					</tr>
		    				</table>
		    			</td>
		    		</tr>
	    		</table>
		    </div>
			  <div class="modal-footer">
		        <button type="button" id="qaccepted" class="btn btn-default" data-dismiss="modal">取消</button>
		        <button type="button" id="accepted" class="btn btn-primary">录取</button>
		      </div>
		    </div>
		  </div>
		</div>
		

	</body>

	<script>
        $(function(){
            $.ajax({
                type: "post", //请求的方式，也有get请求
                url: "<%=request.getContextPath()%>/enret/ajaxGetEnretTypeAll", //请求地址，后台提供的,这里我在本地自己建立了个json的文件做例子
                data:"retTypeId="+1,
                dataType: "text", //json格式，后台返回的数据为json格式的。
                success: function(result){
                    var dataObj = JSON.parse(result); //返回的result为json格式的数据
                        con = "";
                    console.log(dataObj);

                    $.each(dataObj, function(index, item){
                        $.each(item.ezdErlenrets, function(index1, item1) {
                            var umgId =item1.ezdUmg.umgId ;
                            var erlenretId = item1.erlenretId;
                           /* console.log("id++++"+umgId)*/
                            var status = item1.erlenretStatus;
                            console.log(item1);
                            con += "<tr onclick='info("+umgId+","+erlenretId+","+status+")'>";
                            con += "<td><img src='${pageContext.request.contextPath}/img/userDefault.png' style='width: 20px;height: 20px;'></td>";
                            con += "<td>" + item1.ezdEnret.ezdPostTwo.ptwoName + "</td>";
                            con += "<td>" + item1.ezdUmg.umgName + "</td>";
                            con += "<td>" + item1.ezdUmg.umgUser.userPhone + "</td>";
                            con += "<td>" + item1.ezdUmg.umgSex + "</td>";
                            con += "<td>" + new Date(item1.rettime).toLocaleDateString() + "</td>";
                            con += "<td>" + item1.ezdRestatus.restatusName + "</td>";
                            con += "</tr>";
                        });
                    });
                    $("#sxbm").html(con); //把内容入到这个div中即完成
                },
				error : function(data){
                    console.log("出错="+data);
				}
            })
        })
	</script>
	
	<script type="text/javascript">
		
		$(function(){

			$(".mokuai").click(function(){
				$(".mokuai").removeClass("mokuai-active");
				$(this).addClass("mokuai-active");
			});
		});
		
		$(function(){
			$("#sxgl").on("click",function(){
				window.location.href="/bg/index";
			//	$(".right-center").load("sxgl.html .right-mokuai,#one,#two");
			});
            $("#fbgw").on("click",function(){
               
                $(".right-center").load("<%=request.getContextPath()%>/enret/sx_job");
            });
			$("#qzgl").on("click",function(){
               
				$(".right-center").load("<%=request.getContextPath()%>/enret/qzgl");
			});
			$("#xxgl").on("click",function(){
               
				$(".right-center").load("<%=request.getContextPath()%>/bgSchmg");
			});
            $("#wzgl").on("click",function(){

                $(".right-center").load("<%=request.getContextPath()%>/enret/wzgl");
            });
            $("#dzhgl").on("click",function(){

                $(".right-center").load("<%=request.getContextPath()%>/enret/dzhgl");
            });
            $("#qygl").on("click",function(){
                $(".right-center").load("<%=request.getContextPath()%>/enret/qygl");
            });


            var a = <%=session.getAttribute("status")%> == 666;

            if(a){
                <%session.removeAttribute("status");%>
                alert("asdfas");
                $("#xxgl").click();
            }
		})
		


	</script>
<script>
	$(function () {
       // $("#sh").html();
		getCount(1,1,$("#ks"));
		getCount(1,2,$("#xj"));
        getCount(1,3,$("#sh"));

        getResultCount(1,$("#counts"));
    });

</script>

	<%--获取最近报名用户的信息--%>
	<script>
        function info(umgId,erlenretId,status){
            console.log("this is erlenretId="+erlenretId);
			if(status==3){
                $("#accepted").val(-1);
                $("#accepted").attr("disabled","disabled");
			}
            $("#accepted").val(erlenretId);

           $.ajax({
                type: "GET", //请求的方式，也有get请求
                url: "<%=request.getContextPath()%>/enret/ajaxGetUmg/"+umgId, //请求地址，后台提供的,根据用户的ID查询用户信息
                dataType: "json", //json格式，后台返回的数据为json格式的。
                success: function(result){
                   console.log(result);
                    $("#uname").text(result.umgName);
                    $("#usex").text(result.umgSex);
                    $("#umajor").text(result.umgMajor);
                    $("#udegree").text(result.umgDegree);
                    $("#uschool").text(result.umgSchool);
                    $("#ueducation").text(result.umgEducation);
                    $("#ustatus").text(result.umgStatus==0?'未实名':'已实名' );
                    $("#uaddress").text(result.umgAddress);
                    $("#uphone").text(result.umgUser.userPhone);
                    $("#uemail").text(result.umgEmail);
                    $("#uphoto").attr("src","${pageContext.request.contextPath}/img/"+result.umgPhoto);

					$("#tankuang").click();
                },
			   error:function(){
                    alert("error");
			   }
            });
        }
        $("#accepted").click(function(){
            $("#qaccepted").click();
            $.ajax({
                url : "<%=request.getContextPath()%>/enret/accepted",
				data : {
                    "erlenretId" : $("#accepted").val(),
					"status" : 3
				},
				method : "get",
				dataType : "text",
				success : function(datas){

                    if(datas==true || datas == "true"){
                        alert("已成功录取，并发送消息");
					}else{
                        alert("服务器繁忙，请重试");
					}
				}
			})
		})
	</script>
	<c:if test="${redreticPoin!=null}">
		<script type="text/javascript">
			$(function () {
                $("#dzhgl").click();
            })
	</script>
	</c:if>
	<c:if test="${addEnmgResult!=null}">
		<script type="text/javascript">
			$(function () {
                $("#qygl").click();
            })
		</script>
	</c:if>
<c:if test="${articleResult!=null}">
	<script>
		$(function () {
            $("#wzgl").click();
        })
	</script>
</c:if>
</html>
