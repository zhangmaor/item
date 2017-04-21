
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://" +request.getServerName()+":" +request.getServerPort()+path+"/" ;
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title>e职多就业管理系统</title>
		<script src="/js/jquery.min.js"></script>
		<script src="/js/bootstrap.min.js"></script>
		<script src="/js/bootstrap-paginator.js"></script>
		<script src="/js/jquery.nouislider.js"></script>
		<link rel="stylesheet" type="text/css" href="/css/bootstrap.min.css"/>
		<link rel="stylesheet" type="text/css" href="/css/index.css" />
		<link rel="stylesheet" type="text/css" href="/fa/css/font-awesome.css" />
		<link rel="stylesheet" type="text/css" href="/css/font-awesome.css" />
		<link rel="stylesheet" type="text/css" href="/css/sxgl.css" />
		
	</head>
	
	<body>
		<div class="whole">
			<div class="header">
				<div class="container">
					<div class="font-hearder">
						欢迎回来，e智多信息网站!&nbsp;&nbsp;&nbsp;<i class="fa fa-unlock"><a href="#" style="color:#5AB0F9">&nbsp;&nbsp;登出</a></i>
					</div>
				</div>
			</div>
			
			<div class="center">
				<div class="left-center">
					<div class="left-center-1">
						<p style="font-size:18px;color:white;text-align: center;"><b>e智多就业管理</b></p>
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
						<div class="mokuai"><i class="fa fa-envelope"></i>&nbsp;&nbsp;&nbsp;企业管理</div>	
					</div>
					
					<div class="center-mokuai">
						<div class="mokuai" id="xxgl"><i class="fa fa-home"></i>&nbsp;&nbsp;&nbsp;学校管理</div>
					</div>
					
					<div class="center-mokuai">
						<div class="mokuai"><i class="fa fa-file"></i>&nbsp;&nbsp;&nbsp;文章管理</div>
					</div>
				</div>
				
				<div class="right-center">
					<div class="right-mokuai">
						<div class="practice" style="width: 18%;">
							<span id="gl">实习管理<i class="fa fa-angle-down"></i></span>&nbsp;
							<span style="float: right;display: none;" id="fb">发布实习岗位<i class="fa fa-angle-down"></i></span>
						</div>					
					</div>
					
					<div class="right-body" id="one">
						<div class="right-body-main">
							<div class="main-1">
								<span class="main-1-1">共发布实习11个</span>
								<span class="main-1-2">
									<span class="main-1-2-1">0个正在审核</span>
									<span class="main-1-2-1">3个正在招聘</span>
									<span class="main-1-2-1">0个下架</span>
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
								
							<div class="col-xs-4 text-center">
								<div class="btn" data-toggle="modal" data-target="#sxjl">
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
							
							<div class="col-xs-4 text-right">
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
								
								<tbody>
									<tr>
										<td class="text-center"><img src="img/QQ图片20170308195953.jpg" style="width: 20px;height: 20px;"></td>
										<td>文员</td>
										<td>张三</td>
										<td>11111111111</td>
										<td>男</td>
										<td>2014-11-16</td>
										<td>已报名</td>
									</tr>
								</tbody>
							</table>
						</div>
					</div>
					
					<!--
			
						二级菜单 发布界面
			
										-->	
					<div class="right-body" id="two" style="display: none;">
						<div class="right-body-main">
							<div class="main-1">
								<span class="main-1-1">岗位列表</span>			
							</div>
							<div style="width: 100%;line-height: 70px;">
							
								<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#add_sx">
								  	发布实习岗位
								</button>
							</div>
							<table class="table table-bordered">
								<thead>
									<th>单位/企业名</th>
									<th>工作岗位</th>
									<th>学历要求</th>							
									<th>招聘人数</th>
									<th>性别要求</th>
									<th>薪资</th>
									<th>状态</th>
									<th>操作</th>
								</thead>
								<tbody id="ssgw">
									<tr>
										<td>广州罗氏网络科技有限公司</td>
										<td>情感分析师</td>
										<td>本科</td>
										<td>1</td>
										<td>不限</td>
										<td>3k-5k</td>
										<td><span class="label label-success">在招</span></td>
										<td>
											<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#update_sx">修改</button>
											<button type="button" class="btn btn-danger" data-toggle="modal" data-target="#del_sx">删除</button>
										</td>
									</tr>
									<tr>
										<td>广州罗氏网络科技有限公司</td>
										<td>情感分析师</td>
										<td>本科</td>
										<td>1</td>
										<td>不限</td>
										<td>3k-5k</td>
										<td><span class="label label-warning">停招</span></td>
										<td>
											<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#update_sx">修改</button>
											<button type="button" class="btn btn-danger" data-toggle="modal" data-target="#del_sx">删除</button>
										</td>
									</tr>
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
		    					<img src="img/QQ图片20170308195953.jpg" style="width: 100%;height: 100%;border-radius: 50px;">
		    				</div>
		    			</td>
		    		</tr>
		    		<tr>
		    			<td>
		    				<span>13425520042JCH</span>&nbsp;
		    				<span>未实名认证</span>&nbsp;
		    			</td>
		    		</tr>
		    		<tr>
		    			<td>
		    				<span>女</span>&nbsp;
		    				<span>未知</span>&nbsp;
		    				<span>专科</span>&nbsp;
		    				<span>珠海</span>
		    			</td>
		    		</tr>
		    		<tr>
		    			<td>
		    				<span>国际贸易与实务</span>
		    			</td>
		    		</tr>
		    		<tr>
		    			<td>
		    				<span>13425520042</span>
		    				<span>790847005@qq.com</span>
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
		    				<span>2008年9-2011年6 实验中学 2011年9-2014 濠头中学 2014年9-至今 广东工商职业学院 专科-国际贸易与实务</span>
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
		        <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
		        <button type="button" class="btn btn-primary">录取</button>
		      </div>
		    </div>
		  </div>
		</div>
		
		<!--
        	
        	发布实习岗位 (模态框)Modal
        
       								 -->
		<div class="modal fade" id="add_sx" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" data-backdrop="static" data-keyboard="false">
		  <div class="modal-dialog" role="document" style="width: 50%;">
		    <div class="modal-content">
		      <div class="modal-header">
		        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
		        <h4 class="modal-title" id="myModalLabel">请填写发布信息</h4>
		      </div>
		      <div class="modal-body">
		    	<form action="" class="form-horizontal">
		    		<div class="form-group"> 
					  <label class="col-sm-3 control-label">单位/企业</label> 
					  <div class="col-sm-8"> 
					   <input type="text" class="form-control"  placeholder="输入单位或企业名称"> 
					  </div> 
					 </div> 
					 <div class="form-group"> 
					  <label class="col-sm-3 control-label">招聘岗位</label> 
					  <div class="col-sm-6"> 
					   <input type="text" class="form-control"  placeholder="输入招聘的岗位"> 
					  </div> 
					 </div> 
					 <div class="form-group"> 
					  <label class="col-sm-3 control-label">招聘人数</label> 
					  <div class="col-sm-5">
					   <input type="text" class="form-control"  placeholder="输入人数">  
					 </div>
					 </div>
					 <div class="form-group"> 
					  <label class="col-sm-3 control-label">薪资</label> 
					  <div class="col-sm-5"> 
					  	<input type="text" class="form-control"  placeholder="输入月薪">
					  </div> 
					 </div> 
					 <div class="form-group"> 
					  <label class="col-sm-3 control-label">性别要求</label> 
					  <div class="col-sm-5"> 
					   <select name="" class="form-control">
					   	<option value="0">不限</option>
					   	<option value="1">男</option>
					   	<option value="2">女</option>
					   </select>
					  </div> 
					 </div> 
					 <div class="form-group"> 
					  <label class="col-sm-3 control-label">学历要求</label> 
					  <div class="col-sm-5"> 
					   <select name="" class="form-control">
					   	<option value="0">不限</option>
					   	<option value="1">本科</option>
					   	<option value="2">大专</option>
					   	<option value="2">高职</option>
					   </select>
					  </div> 
					 </div>
					 <div class="form-group"> 
					  <label class="col-sm-3 control-label">地址</label> 
					  <div class="col-sm-5"> 
					   <input type="text" class="form-control" placeholder="输入工作地址">
					  </div> 
					 </div>
					 <div class="form-group"> 
					  <label class="col-sm-3 control-label">联系信息</label> 
					  <div class="col-sm-6"> 
					   <input type="text" class="form-control" placeholder="输入联系电话">
					  </div> 
					 </div>
		    	</form>
				
		      </div>
		      <div class="modal-footer">
		        <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
		        <button type="button" class="btn btn-primary">发布</button>
		      </div>
		    </div>
		  </div>
		</div>
		
		<!--
			
        	修改实习岗位 (模态框)Modal
        	
       								-->
		<div class="modal fade" id="update_sx" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" data-backdrop="static" data-keyboard="false">
		  <div class="modal-dialog" role="document">
		    <div class="modal-content">
		      <div class="modal-header">
		        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
		        <h4 class="modal-title" id="myModalLabel">修改实习岗位信息</h4>
		      </div>
		      <div class="modal-body">
				<form action="" class="form-horizontal">
		    		<div class="form-group"> 
					  <label class="col-sm-3 control-label">单位/企业</label> 
					  <div class="col-sm-8"> 
					   <input type="text" class="form-control"  placeholder="输入单位或企业名称"> 
					  </div> 
					 </div> 
					 <div class="form-group"> 
					  <label class="col-sm-3 control-label">招聘岗位</label> 
					  <div class="col-sm-6"> 
					   <input type="text" class="form-control"  placeholder="输入招聘的岗位"> 
					  </div> 
					 </div> 
					 <div class="form-group"> 
					  <label class="col-sm-3 control-label">招聘人数</label> 
					  <div class="col-sm-5">
					   <input type="text" class="form-control"  placeholder="输入人数">  
					 </div>
					 </div>
					 <div class="form-group"> 
					  <label class="col-sm-3 control-label">薪资</label> 
					  <div class="col-sm-5"> 
					  	<input type="text" class="form-control"  placeholder="输入月薪">
					  </div> 
					 </div> 
					 <div class="form-group"> 
					  <label class="col-sm-3 control-label">性别要求</label> 
					  <div class="col-sm-5"> 
					   <select name="" class="form-control">
					   	<option value="0">不限</option>
					   	<option value="1">男</option>
					   	<option value="2">女</option>
					   </select>
					  </div> 
					 </div> 
					 <div class="form-group"> 
					  <label class="col-sm-3 control-label">学历要求</label> 
					  <div class="col-sm-5"> 
					   <select name="" class="form-control">
					   	<option value="0">不限</option>
					   	<option value="1">本科</option>
					   	<option value="2">大专</option>
					   	<option value="2">中专</option>
					   </select>
					  </div> 
					 </div>
					 <div class="form-group"> 
					  <label class="col-sm-3 control-label">地址</label> 
					  <div class="col-sm-5"> 
					   <input type="text" class="form-control" placeholder="输入工作地址">
					  </div> 
					 </div>
					  <div class="form-group"> 
					  <label class="col-sm-3 control-label">联系信息</label> 
					  <div class="col-sm-6"> 
					   <input type="text" class="form-control" placeholder="输入联系电话">
					  </div> 
					 </div>
					 <div class="form-group"> 
					  <label class="col-sm-3 control-label">招聘状态</label> 
					  <div class="col-sm-6"> 
					   <select name="" class="form-control">
					   	<option value="0">在招</option>
					   	<option value="1">停招</option>
					   	
					   </select>
					  </div> 
					 </div>
		    	</form>
		      </div>
		      <div class="modal-footer">
		        <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
		        <button type="button" class="btn btn-primary">提交修改</button>
		      </div>
		    </div>
		  </div>
		</div>
		
		<!--
			
        	删除实习岗位 (模态框)Modal
        	
       								-->
		<div class="modal fade" id="del_sx" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" data-backdrop="static" data-keyboard="false">
		  <div class="modal-dialog" role="document">
		    <div class="modal-content">
		      <div class="modal-header">
		        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
		        <h4 class="modal-title" id="myModalLabel">操作提示</h4>
		      </div>
		      <div class="modal-body">
				是否删除该岗位
		      </div>
		      <div class="modal-footer">
		        <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
		        <button type="button" class="btn btn-danger">确定删除</button>
		      </div>
		    </div>
		  </div>
		</div>
		
	</body>

	<script>
        $(function(){

                $.ajax({
                    type: "get", //请求的方式，也有get请求
                    url: "<%=path%>/enret/ajaxGetAll", //请求地址，后台提供的,这里我在本地自己建立了个json的文件做例子
                    dataType: "json", //json格式，后台返回的数据为json格式的。
                    success: function(result){
                        var dataObj = result, //返回的result为json格式的数据
                            con = "";
                        $.each(dataObj, function(index, item){
                            con += "<tr>";
                            con += "<td>"+item.ezdEnmg.enmgName+"</td>";
                            con += "<td>"+item.ezdPostTwo.ptwoName+"</td>";
                            con += "<td>"+item.enretDemand+"</td>";
                            con += "<td>"+item.enretWantNum+"</td>";
                            con += "<td>"+item.enretWantNum+"</td>";
                            con += "<td>"+item.enretLwMoney+"-"+item.enretHgMoney+"</td>";
                            con += "<td><span class='label label-warning'>停招</span></td>";
                            con += "<td><button type='button' class='btn btn-primary' data-toggle='modal' data-target='#update_sx'>修改</button>"+
                            "<button type='button' class='btn btn-danger' data-toggle='modal' data-target='#del_sx'>删除</button></td>";
                            con += "</tr>";
                        });

                        $("#ssgw").html(con); //把内容入到这个div中即完成
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
				window.location.href="index";
			//	$(".right-center").load("sxgl.html .right-mokuai,#one,#two");
			});
			$("#qzgl").on("click",function(){
				$(".right-center").load("qzgl.jsp");
			});
			$("#xxgl").on("click",function(){
				$(".right-center").load("xxgl.jsp");
			});	
			$("#dzhgl").on("click",function(){
				$(".right-center").load("dzhgl.jsp");
			});
		})
		
		$(function(){
			$("#fbgw").click(function(){
				$("#one").css("display","none");
				$("#two").css("display","block");
				$("#fb").css("display","block");
			});
			$("#qzgl,#xxgl,#gl").click(function(){
				$("#one").css("display","block");
				$("#fb").css("display","none");
			});
		})
		
	</script>
</html>
