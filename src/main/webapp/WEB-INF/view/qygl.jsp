
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib  uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="css/qygl.css"/>
    <script src="/js/typeAndIndustry.js"></script>
</head>
<body>
<div class="right-mokuai">
    <div class="practice">
        <span>企业管理<i class="fa fa-angle-down"></i></span>&nbsp;
    </div>
</div>
<div class="right-body">
    <div class="right-body-main ">
        <div class="main-1">
            <span class="main-1-1">企业列表</span>
            <span class="main-1-2">
								<span class="main-1-2-1">0个正在审核</span>
						</span>
        </div>

        <div class="article-list">
            <div style="line-height: 50px;width: 100%;">
                <div class="pull-left">
                    <button type="button" id="addEnmg" class="btn btn-primary" onclick="qy_load()">企业建档</button>
                </div>
                <div class="pull-right">

                </div>

            </div>
            <table class="table table-bordered table-striped" id="enmgList">
                <tr>
                    <th>企业名字</th>
                    <th>行业类型</th>
                    <th>公司人数</th>
                    <th>企业类型</th>
                    <th>公司地址</th>
                    <th>联系方式</th>
                    <th>操作</th>
                </tr>
                <tbody id="tbody2">
                <tr>
                    <td>互联网服务有限公司</td>
                    <td>贸易/物流/交通/运输</td>
                    <td><span>100</span>-<span>200</span></td>
                    <td>私营/股份制公司</td>
                    <td>杭州市</td>
                    <td>软件开发</td>
                    <td>
                        <button class="btn btn-info" data-toggle="modal" data-target="#qy_details">公司介绍</button>
                        <button class="btn btn-primary" data-toggle="modal" data-target="#qy_update">编辑</button>
                        <button class="btn btn-danger" data-toggle="modal" data-target="#qy_del">删除</button>
                    </td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>

</div>

<!-- 公司介绍   -->
<div class="modal fade" id="qy_details" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"  data-backdrop="static" data-keyboard="false">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    &times;
                </button>
                <h4 class="modal-title" id="myModalLabel">
                    互联网服务有限公司
                </h4>
            </div>
            <div class="modal-body">
                杭州互联网金融服务有限公司获浙江省政府批准成立于2014年11月，是浙江省首批拥有互联网金融服务行业资质的企业，公司专业从事金融理财、投融资类等多元化互联网金融服务。

            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭
                </button>

            </div>
        </div>
        <!-- /.modal-content -->
    </div>
    <!-- /.modal -->
</div>

<!--企业编辑按钮-->
<div class="modal fade" id="qy_update" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"  data-backdrop="static" data-keyboard="false">
    <div class="modal-dialog" style="width: 40%;">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    &times;
                </button>
                <h4 class="modal-title" id="myModalLabel">
                    更改企业信息
                </h4>
            </div>
            <div class="modal-body">
                <form action="">
                    <div class="row">
                        <div class="col-xs-2 text-right">*企业名称：</div>
                        <div class="col-xs-8">
                            <input type="text" id="enmgName" class="form-control">
                        </div>
                    </div><br>
                    <div class="row">
                        <div class="col-xs-2 text-right">*行业类型：</div>
                        <div class="col-xs-6">
                            <input type="text" id="enmgIndustryName"  class="form-control">
                            <input type="text" id="enmgIndustry" hidden />
                            <select id="IndustryList">
                            <option>选择</option>
                        </select>
                        </div>
                    </div><br>
                    <div class="row">
                        <div class="col-xs-2 text-right">*公司人数：</div>
                        <div class="col-xs-2">
                            <input type="text" id="enmgScaleMin" style="width: 60px" class="form-control">
                        </div>
                        <div class="col-xs-1" style="width: 5px;padding: 0;">——</div>
                        <div class="col-xs-2">
                            <input type="text" id="enmgScaleMax"style="width: 60px" class="form-control">
                        </div>
                    </div><br>
                    <div class="row">
                        <div class="col-xs-2 text-right">*企业类型：</div>
                        <div class="col-xs-6">
                            <input type="text" id="enmgTypeName" class="form-control">
                            <input type="text" id="enmgType" hidden />
                            <select id="typelist">
                                <option>选择</option>
                            </select>
                        </div>
                    </div><br>
                    <div class="row">
                        <div class="col-xs-2 text-right">*公司地址：</div>
                        <div class="col-xs-8">
                            <input type="text" id="enmgAddress" class="form-control">
                        </div>
                    </div><br>
                    <div class="row">
                        <div class="col-xs-2 text-right">*联系人：</div>
                        <div class="col-xs-5">
                            <input type="text" id="enmgUser" class="form-control">
                        </div>
                    </div><br>
                    <div class="row">
                        <div class="col-xs-2 text-right">*联系方式：</div>
                        <div class="col-xs-5">
                            <input type="text" id="enmgWcontact" class="form-control">
                        </div>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" id="qgetUp" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" id="getUp" class="btn btn-primary">
                    提交更改
                </button>
            </div>
        </div>
        <!-- /.modal-content -->
    </div>
    <!-- /.modal -->
</div>


<div class="modal fade" id="qy_del" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" data-backdrop="static" data-keyboard="false">
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
                <button type="button" id="qdel" class="btn btn-default" data-dismiss="modal">取消</button>
                <button type="button" id="del" class="btn btn-danger">确定删除</button>
            </div>
        </div>
    </div>
</div>
</body>
<script type="text/javascript">
    function qy_load(){
        $(".right-center").load("<%=request.getContextPath()%>/enret/qy_add");
    }
    /*渲染页面*/
    function displayEnmgList(){
        $.ajax({
            url : "<%=request.getContextPath()%>/bgEnmg/enmg",
            dataType : "text",
            method : "get",
            success :function(dataList){
                var html = "";
                var data = JSON.parse(dataList);
                console.log(data);

                html +="<tr>";
                html +="<th>企业名字</th>";
                html +="<th>行业类型</th>";
                html +="<th>公司人数</th>";
                html +="<th>企业类型</th>";
                html +="<th>公司地址</th>";
                html +="<th>联系方式</th>";
                html +="<th>操作</th>";
                html +="</tr>";
                $.each(data ,function(i,list){
                   html +="<tr>";
                   html +="<td>"+list.enmgName+"</td>";
                   html +="<td>"+list.ezdEntype.enTypeNmae+"</td>";
                   html +="<td>"+list.enmgScale+"</td>";
                   html +="<td>"+list.ezdIndustry.inName+"</td>";
                   html +="<td>"+list.enmgAddress+"</td>";
                   html +="<td>"+list.enmgWcontact+"("+list.enmgUser+")</td>";
                   html +='<td>' +
                       '' +
                       '<button class="btn btn-info" value="'+list.enmgId+'" data-toggle="modal" data-target="#qy_details">公司介绍</button>' +
                       '<button class="btn btn-primary" value="'+list.enmgId+'" id="update" onclick="update(this.value)" data-toggle="modal" data-target="#qy_update">编辑</button>' +
                       '<button class="btn btn-danger" value="'+list.enmgId+'" onclick="delEnmg(this.value)" data-toggle="modal" data-target="#qy_del">删除</button>' +
                       '</td>';
                });
                $("#enmgList").html(html);
            }
        });
    }
    displayEnmgList();
    /*点击修改时调用的函数*/
    function update(value){
        var id = value;
        document.getElementById("getUp").value = value;
        $.ajax({
            url : "<%=request.getContextPath()%>/bgEnmg/getEnmg?id=1",
            data : {"id" :id},
            dataType : "json",
            method : "get",
            success : function(data){
                console.log(data);
                var enmgScale = data.enmgScale;
                var scales =[];
                    scales= enmgScale.split("-");

                console.log("分组之后："+scales[1]);
                $("#enmgName").attr("value",data.enmgName);
                $("#enmgTypeName").attr("value",data.ezdEntype.enTypeNmae);
                $("#enmgType").attr("value",data.enmgType);
                $("#enmgIndustryName").attr("value",data.ezdIndustry.inName);
                $("#enmgIndustry").attr("value",data.enmgIndustry);
                $("#enmgScaleMin").attr("value",scales[0]);
                $("#enmgScaleMax").attr("value",scales[1]);
                $("#enmgAddress").attr("value",data.enmgAddress);
                $("#enmgUser").attr("value",data.enmgUser);
                $("#enmgWcontact").attr("value",data.enmgWcontact);
                   /*显示全部的一级行业*/
                    getIndustryList();
                    /*显示全部的企业类型*/
                    getEnType();

                }
        });
    }
    function delEnmg(value){
        document.getElementById("del").value = value;
    }
    $("#del").click(function(){
        $("#qdel").click();
        var id = $("#del").val();
        //alert(id);
        $.ajax({
            url : "<%=request.getContextPath()%>/bgEnmg/del",
            data : {"id":$("#del").val()},
            dataType : "text",
            method : "get",
            success : function(data){
                console.log(data);
                if(data == "true" || data == true){
                    alert("该企业已经成功被删除");
                    displayEnmgList();
                }else{
                    alert("删除失败");
                }

            },
            error : function (errors) {
                console.log(errors);
            }
        })
    })
    $("#getUp").click(function(){
        var enmgId = $("#getUp").val();
        var enmgName = $("#enmgName").val();
        var enmgUser = $("#enmgUser").val();
        var enmgWcontact = $("#enmgWcontact").val();
        var enmgAddress = $("#enmgAddress").val();
        var enmgType;
        if($("#typelist").val()==0 || $("#typelist").val()=="0"){
            enmgType = $("#enmgType").val();
        }else{
            enmgType = $("#typelist").val();
        }
        var enmgIndustry;
        if($("#IndustryList").val()== 0 || $("#IndustryList").val()== "0"){
            enmgIndustry = $("#enmgIndustry").val();
        }else{
            enmgIndustry = $("#IndustryList").val();
        }
        $.ajax({
            url : "<%=request.getContextPath()%>/bgEnmg/update",
            data : {
                "enmgId" : enmgId,
                "enmgName" : enmgName,
                "enmgUser" : enmgUser,
                "enmgWcontact" : enmgWcontact,
                "enmgAddress" : enmgAddress,
                "enmgType" : enmgType,
                "enmgIndustry" : enmgIndustry
            },
            dataType : "text",
            method : "post",
            success : function(data){
                if(data=="true" || data == true){
                    $("#qgetUp").click();
                    alert("修改成功");
                    displayEnmgList();
                }else{
                    alert("修改失败");
                }
            }
        })
    });
</script>


<c:if test="${addEnmgResult==1}">
    <script type="text/javascript">
        $(function(){
            alert("添加成功！！");
        });
    </script>
    <%
        session.removeAttribute("addEnmgResult");
    %>
</c:if>
<c:if test="${addEnmgResult==0}">
    <script type="text/javascript">
        $(function(){

            $("#addEnmg").click();
        });
    </script>
</c:if>
</html>
