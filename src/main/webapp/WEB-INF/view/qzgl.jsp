<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/4/20
  Time: 14:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="right-mokuai">
    <div class="practice" style="width: 18%;">
        <span id="gl">全职管理<i class="fa fa-angle-down"></i></span>&nbsp;
    </div>
</div>

<div class="right-body" >
    <div class="right-body-main">
        <div class="main-1">
            <span class="main-1-1">共发布全职12个</span>

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
                    <li class="text-left"><strong>刷新全职岗位</strong></li>
                    <li class="text-left">上次刷新为&nbsp;2016-10-30&nbsp;18:30</li>
                </div>
            </div>
        </div>

        <div class="col-xs-4 text-center" >
            <div class="btn" data-toggle="modal" data-target="#qzjl" id="tankuang">
                <div class="pull-left">
                    <i class="icon-eye-open"></i>
                </div>
                <div class="pull-right">
                    <li class="text-left pull-left"><strong>录用应聘者</strong></li>
                    <li class="pull-right" style="color: #8BCE5C;"><strong>●&nbsp;收到新的简历</strong>&nbsp;&nbsp;</li>
                    <br>
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
                    <li class="text-left"><strong>发布全职岗位</strong></li>
                    <li class="text-left small">今天还可以发布5个岗位</li>

                </div>
            </div>
        </div>

        <p style="color: #858A98;">全职列表</p>
        <table class="table-hover" id="sxlb">
            <thead>
            <th></th>
            <th>全职岗位</th>
            <th>姓名</th>
            <th>电话</th>
            <th>性别</th>
            <th>报名时间</th>
            <th>状态</th>
            </thead>
            <tbody id="sxbm">
            <%--显示数据--%>
            </tbody>
        </table>
    </div>
</div>


<!-- 全职简历 (模态框)Modal -->
<div class="modal fade" id="qzjl" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" data-backdrop="static" data-keyboard="false">
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
                <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                <button type="button" class="btn btn-primary">录取</button>
            </div>
        </div>
    </div>
</div>



</body>

<script>
    $(function () {
        $.ajax({
            type: "post", //请求的方式，也有get请求
            url: "<%=request.getContextPath()%>/enret/ajaxGetEnretTypeAll", //请求地址，后台提供的,这里我在本地自己建立了个json的文件做例子
            data: "retTypeId=" + 2,
            dataType: "json", //json格式，后台返回的数据为json格式的。
            success: function (result) {
                var dataObj = result, //返回的result为json格式的数据
                    con = "";
                $.each(dataObj, function (index, item) {
                    //console.log(item);
                    $.each(item.ezdErlenrets, function (index1, item1) {
                        //console.log(item1);
                        con += "<tr onclick='qzinfo("+item1.ezdUmg.umgId+")'>";
                        con += "<td><img src='/img/qq.jpg' style='width: 20px;height: 20px;'></td>";
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
            }
        })
    })
</script>

<script type="text/javascript">
    $(function(){
        $("#fbgw").on("click",function(){
            $(".right-center").load("<%=request.getContextPath()%>/enret/qz_job");
        });
    })
</script>

<script>
    function qzinfo(umgId){
        console.log("this is umgId="+umgId);


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
</script>


</html>
