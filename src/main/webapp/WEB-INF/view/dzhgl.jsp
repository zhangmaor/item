<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="right-mokuai">
    <div class="practice">
        <span>大招会管理<i class="fa fa-angle-down"></i></span>&nbsp;
    </div>
</div>
<div class="right-body">
    <div class="right-body-main ">
        <div class="main-1">
            <span class="main-1-1">大招会列表</span>
        </div>
        <div style="line-height: 50px;">
            <div class="col-xs-3" style="padding: 0;">
                <button class="btn btn-primary" id="dzh_add">添加大招会</button>
            </div>

        </div>
        <table class="table" id="bigretList">
            <thead>
            <th>大招会名称</th>
            <th>举办方</th>
            <th>举办地址</th>
            <th>举办时间</th>
            <th>报名人数</th>
            <th>招聘岗位</th>
            <th>状态</th>
            <th>操作</th>
            </thead>
            <tbody>
            <tr>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>
                    <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#sel_user">报名用户</button>
                    <button type="button" class="btn btn-warning" data-toggle="modal" data-target="#up_dzh">修改</button>
                    <button type="button" class="btn btn-danger" data-toggle="modal" data-target="#del_dzh">删除</button>
                </td>

            </tr>

            </tbody>
        </table>
    </div>
</div>

<!--
    报名用户列表
-->
<div class="modal fade" id="sel_user" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" data-backdrop="static" data-keyboard="false">
    <div class="modal-dialog" role="document" style="width: 50%">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalLabel">报名用户列表</h4>
            </div>
            <div class="modal-body">
                <table class="table" id="userList">
                    <thead>
                    <th>姓名</th>
                    <th>电话</th>
                    <th>性别</th>
                    <th>报名时间</th>
                    </thead>
                    <tbody>
                    <tr>
                        <td>1</td>
                        <td>1</td>
                        <td>1</td>
                        <td>1</td>
                    </tr>
                    </tbody>
                </table>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
            </div>
        </div>
    </div>
</div>

<!--
    修改大招会
-->
<div class="modal fade" id="up_dzh" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" data-backdrop="static" data-keyboard="false">
    <div class="modal-dialog" role="document" style="width: 40%;">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalLabel">操作提示</h4>
            </div>
            <div class="modal-body">
                <form action="">
                    <div class="row">
                        <div class="col-xs-3 text-right">*大招会标题：</div>
                        <div class="col-xs-7">
                            <input type="text" id="bigretTitle" class="form-control">
                        </div>
                    </div><br>
                    <div class="row">
                        <div class="col-xs-3 text-right">*举办方：</div>
                        <div class="col-xs-6">
                            <input type="text"id="enmgIdd" class="form-control"><input type="text" id="enmgId" hidden />
                        </div>
                    </div><br>
                    <div class="row">
                        <div class="col-xs-3 text-right">*举办学校：</div>
                        <div class="col-xs-5">
                            <input type="text" id="bigretAddressS" class="form-control"><input type="text" id="bigretAddress" hidden>
                        </div>
                    </div><br>
                    <div class="row">
                        <div class="col-xs-3 text-right">*举办时间：</div>
                        <div class="col-xs-5">
                            <input type="text" id="btime" class="form-control">
                        </div>
                    </div><br>
                    <div class="row">
                        <div class="col-xs-3 text-right">*招聘岗位：</div>
                        <div class="col-xs-6">
                            原岗位：<input type="text" id="yPostTwo" class="form-control">
                            <input type="text" id="postTwoId" hidden  >
                            可选岗位：<select id="postTwo">
                                        <option>请选择</option>
                                        <option>请选择</option>
                                        <option>请选择</option>
                                    </select>
                        </div>
                    </div><br />
                    <div class="row">
                    <div class="col-xs-3 text-right">*招聘详情：</div>
                    <div class="col-xs-7">
                        <textarea class="form-control" id="bigretDetail"></textarea>
                    </div>
                </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" id="qupdate" class="btn btn-default" data-dismiss="modal">取消</button>
                <button type="button" id="updates" class="btn btn-warning">确定修改</button>
            </div>
        </div>
    </div>
</div>

<!--
    删除大招会
-->
<div class="modal fade" id="del_dzh" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" data-backdrop="static" data-keyboard="false">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalLabel">操作提示</h4>
            </div>
            <div class="modal-body" >
                是否删除大招会
            </div>
            <div class="modal-footer">
                <button type="button" id="qdel" class="btn btn-default"data-dismiss="modal">取消</button>
                <button type="button" id="del" class="btn btn-danger" >确定删除</button>
            </div>
        </div>
    </div>
</div>
</body>
<script type="text/javascript">
    $(function(){
        $("#dzh_add").on("click",function(){
            $(".right-center").load("<%=request.getContextPath()%>/enret/dzh_add");
        });
    })
    /*渲染页面*/
    function ajaxDisplay() {
        $.ajax({
            url: "<%=request.getContextPath()%>/bg/bigret",
            method: "get",
            dateType: "text",
            success: function (list) {
                var list2 = JSON.parse(list);
                //console.log(list);
                console.log(list2);
                var html = "";
                html += "<thead>";
                html += "<th>大招会标题</th>";
                html += "<th>举办方</th>";
                html += " <th>举办地址</th>";
                html += "<th>举办时间</th>";
                html += "<th>报名人数</th>";
                html += " <th>招聘岗位</th>";
                html += " <th>状态</th>";
                html += " <th>操作</th>";
                html += "</thead>";
                var del = document.getElementById("del");
                $.each(list2, function (i, a) {

                    html += "<tr>";
                    if (a.bigretLogo != null && a.bigretLogo != "logoDefault") {
                        html += "<td><img src='" + a.bigretLogo + "' width='30px' height='30px'/><br />" + a.bigretTitle + "</td>";

                    } else {
                        html += "<td>" + a.bigretTitle + "</td>";
                    }
                    html += "<td>" + a.bigretEnmg.enmgName + "</td>";
                    html += "<td>" + a.ezdSchmg.schmgAddress + "</td>";
                    html += "<td>" + a.bigretTime + "</td>";
                    if (a.ezdErlbigrets.length == 1 && a.ezdErlbigrets[0].erlbigretId == 0) {
                        html += "<td>0</td>";
                    } else {
                        html += "<td>" + a.ezdErlbigrets.length + "</td>";
                    }
                    html += "<td>" + a.ezdPostTwo.ptwoName + "</td>";
                    html += "<td>" + a.bigretStatus.newsStatusName + "</td>";
                    html += '<td><button type="button" value="' + a.bigretId + '" onclick="displayUserList(this.value)" class="btn btn-primary" data-toggle="modal" data-target="#sel_user">报名用户</button>' +
                        '<button type="button" value="' + a.bigretId + '" onclick="update(this.value)" class="btn btn-warning" data-toggle="modal" data-target="#up_dzh">修改</button>' +
                        '<button type="button" value="' + a.bigretId + '" onclick="del.value =this.value " class="btn btn-danger" data-toggle="modal" data-target="#del_dzh">删除</button></td>';
                    html += "</tr>";
                })
                $("#bigretList").html(html);
            },
            error: function (errors) {
                console.log(erorrs);
            }
        });
    }
    ajaxDisplay();
    /*删除操作*/
    $("#del").click(function(){
        var status = 4;
        var id = $(this).val();
        $("#qdel").click();
        $.ajax({
           url : "<%=request.getContextPath()%>/bg/update",
            data :{
               "status" : status,
                "id" : id
            },
            method : "post",
            dataType : "text",
            success :function(data){
                if(data=="true" || data==true){
                    alert("删除成功");
                    ajaxDisplay();
                }else{
                    alert("删除失败");
                }
            }
        });
    })
    /**
     * 修改数据
      * @param value
     */
    function update(value) {
        $("#updates").attr("value",value);
         $.ajax({
             url: "<%=request.getContextPath()%>/bg/bigretDetail",
             method: "get",
             data :{"id" :value},
             dataType: "text",
             success: function (data) {
                 var list = JSON.parse(data);
                 console.log(list);
                        $("#bigretTitle").attr("value",list.bigretTitle);
                        $("#enmgId").attr("value",list.enmgId);
                        $("#enmgIdd").attr("value",list.bigretEnmg.enmgName);
                        $("#bigretAddress").attr("value",list.bigretAddress);
                        $("#bigretAddressS").attr("value",list.ezdSchmg.schmgName);
                        $("#btime").attr("value",new Date(list.bigretTime).toLocaleString());
                        $("#yPostTwo").attr("value",list.ezdPostTwo.ptwoName);
                        $("#postTwoId").attr("value",list.postTwo);
//                        $("#bigretDetail").attr("html",list.bigretDetail);
                        document.getElementById("bigretDetail").innerHTML = list.bigretDetail;
                        var pone_id = list.postOne;
                 $.ajax({
                     method : "get",
                     url :"<%=request.getContextPath()%>/post/ajaxGetPostTwo",
                     data :{"pone_id":pone_id},
                     dataType : "json",
                     success : function(tow){
                         var html2 = "";
                         html2 +="<option value=0>请选择</option>";
                         $.each(tow,function(j,twoa){
                             html2 += "<option value='"+twoa.ptwoId+"'>"+twoa.ptwoName+"</option>";
                         });
                         $("#postTwo").html(html2);
                     },
                     error:function(a){
                         console.log(a);
                     }
                 }) ;
             },
         });
     }

     function displayUserList(value){
        var bigretId = value;
        $.ajax({
            url : "<%=request.getContextPath()%>/bg/getErlbigret",
            data : {"bigretId":bigretId},
            method : "get",
            dataType : "text",
            success : function(data){
                var userList = JSON.parse(data);
                console.log(userList);
                html ="";
                if(userList.length>0) {
                    html += "<thead>";
                    html += "<th>姓名</th>";
                    html += "<th>电话</th>";
                    html += "<th>性别</th>";
                    html += "<th>报名时间</th>";
                    html += "</thead>";

                    $.each(userList, function (i, list) {
                        html += "<tr>";
                        html += "<td>" + list.erlbigretUser.umgName + "</td>";
                        html += "<td>" + list.erlbigretUser.umgUser.userPhone + "</td>";
                        html += "<td>" + list.erlbigretUser.umgSex + "</td>";
                        html += "<td>" + new Date(list.erlbigretTime).toLocaleString() + "</td>";
                    });
                }else{
                    html +="<h1><i>还没有人报名</i></h1>";
                }
                $("#userList").html(html);

            }
        });
     }
     /*确定修改*/
     $("#updates").click(function(){

         var id = $("#updates").val();
         var bigretTitle = $("#bigretTitle").val();
         var enmgId = $("#enmgId").val();
         var bigretAddress = $("#bigretAddress").val();
         var btime = $("#btime").val();
         var postTwo;
         if($("#postTwo").val()==0 || $("#postTwo").val()=="0"){
             postTwo = $("#postTwoId").val();
         }else{
             postTwo = $("#postTwo").val();
         }
         var bigretDetail = document.getElementById("bigretDetail").innerHTML ;
         $("#qupdate").click();
         $.ajax({
             url :"<%=request.getContextPath()%>/bg/actionUpdate",
             method : "post",
             data :{
                 "id" : id,
                "bigretTitle" :bigretTitle,
                 "enmgId" : enmgId,
                 "bigretAddress" : bigretAddress,
                 "btime" : btime,
                 "postTwo" : postTwo,
                 "bigretDetail" :bigretDetail,
             },
             dataType : "text",
             success : function(data){
                    console.log("data="+data);
                    if(data==true || data =="true"){
                        ajaxDisplay();
                        alert("数据修改成功！！");
                    }else{
                        alert("信息修改失败！！");
                    }

             }
         });
     });
</script>
    <c:if test="${redreticPoin==1}">
    <script type="text/javascript">
       $(function(){
           alert("添加成功！！");
       })


<%
    session.removeAttribute("redreticPoin");
%>
</c:if>
</script>

<c:if test="${redreticPoin==0}">
    <script type="text/javascript">
        $(function(){
            $("#dzh_add").click();
        })
    </script>
</c:if>
</html>
