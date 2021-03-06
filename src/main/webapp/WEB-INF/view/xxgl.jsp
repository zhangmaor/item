<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
</head>
<body>
<div class="right-mokuai">
    <div class="practice">学校管理<i class="fa fa-angle-down"></i></div>
</div>
<div class="right-body ">
    <div class="right-body-main ">
        <div class="main-1">
            <span class="main-1-1">学校列表</span>

            <span class="main-1-2">
						<span class="main-1-2-1">0个正在审核</span>
					</span>
        </div>

        <div class="main-3">
            <ul class="pagination-lg page-list" lyid="page-list"></ul>
        </div>
        <div class="main-2">

            <from class="form-inline" role="from">
                <div class="form-group" style="margin-top: 10px;">

                    <label class="form-label">层次：</label>&nbsp;&nbsp;&nbsp;&nbsp;
                    <select class="form-control " style="width: 200px;" id="stuLevel">
                        <option value="0" selected>请选择</option>
                        <c:forEach items="${types}" var="a">
                            <option value="${a.schtypeId}">${a.schtypeName}</option>
                        </c:forEach>
                    </select>
                    <input class="form-control " id="stuTitle" type="text" placeholder="请填写学校名称" style="width:200px;" />
                    <div class="btn-group">
                        <button class="btn btn-primary" id="searchBtn">搜索</button>
                        <button class="btn btn-primary" id="resetBtn">清除选择</button>
                    </div>

                    <div class="btn-group">
                        <button type="button" class="btn btn-primary" id="addBtn" data-toggle="modal" data-target="#add_xx">添加</button>
                    </div>

                </div>
            </from>
        </div>
        <br>

        <div class="main-4" >
            <table class="table table-striped table-responsive" id="schmgContent">
                <tr>
                    <th>序号</th>
                    <th>学校名称</th>
                    <th>学校地址</th>
                    <th>学校层次</th>
                    <th>校招会场数</th>
                    <th>操作</th>
                </tr>

                   <c:forEach items="${shmgs}" var="mgs"  varStatus="s">
                        <tr>
                            <td>${s.index+1}</td>
                            <td>${mgs.schmgName}</td>
                            <td>${mgs.schmgAddress}</td>
                            <td>${mgs.schmgType.schtypeName}</td>
                            <td>${mgs.ezdBigrets.size()}</td>
                            <td>
                                <button class="btn btn-primary" data-toggle="modal" data-target="#update_xx" id="updateBtn" onclick="change(${mgs.schmgId})">修改</button>
                                <button class="btn btn-default" id="delectBtn" data-toggle="modal" data-target="#del_xx"  onclick="change(${mgs.schmgId})">删除</button>
                            </td>
                        </tr>
                   </c:forEach>

            </table>
        </div>

    </div>
</div>



<!-- 修改  模态框（Modal） -->
<div class="modal fade" id="update_xx" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" data-backdrop="static" data-keyboard="false">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title" id="myModalLabel"><b>学校信息修改</b></h4>
            </div>

            <div class="modal-body">

                <div class="form-group" style="margin-top: 10px;">
                    <label class="form-label">学校名称：</label>&nbsp;&nbsp;&nbsp;&nbsp;
                    <input class="form-control " id="schmgName" type="text" placeholder="请填写学校名称" style="width:200px;" />
                </div>

                <div class="form-group">
                    <label class="form-label">层次：</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <select class="form-control " style="width: 200px;" id="typeId">
                        <option value="0">请选择</option>
                        <c:forEach items="${types}" var="a">
                            <option value="${a.schtypeId}">${a.schtypeName}</option>
                        </c:forEach>
                    </select>
                </div>

                <div class="form-group"  style="margin-top: 10px;">
                    <label class="form-label">学校地址：</label>&nbsp;&nbsp;&nbsp;&nbsp;
                    <input class="form-control " id="schmgAddress" type="text" placeholder="请填写学校地址" style="width:200px;" />
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary" id="update" data-dismiss="modal">提交更改</button>
            </div>
        </div>
        <!-- /.modal-content -->
    </div>
    <!-- /.modal -->
</div>

<!-- 删除  模态框（Modal） -->
<div class="modal fade" id="del_xx" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" data-backdrop="static" data-keyboard="false">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title" id="myModalLabel"><b>操作提示</b></h4>
            </div>
            <div class="modal-body">确实选择要删除数据吗！</div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                <button type="button" class="btn btn-danger" data-dismiss="modal" id="delete">确定</button>
            </div>
        </div>
        <!-- /.modal-content -->
    </div>
    <!-- /.modal -->
</div>

</body>

<script type="text/javascript">


</script>
<script>
    $(function(){
        $("#addBtn").on("click",function(){
            $(".right-center").load("<%=request.getContextPath()%>/enret/xx_add");
        });
    })

    $(function() {
        //重置按钮事件
        $("#resetBtn").on("click", function() {

            $("#stuLevel").val("");
            $("#stuTitle").val("");
        });

        //按层次和名字搜索学校

        $("#searchBtn").click(function(){
            var cengci =  $("#stuLevel").val();
            var name =  $("#stuTitle").val();

            $.ajax({
                method:"POST",
                url:"${pageContext.request.contextPath}/bgSchmg/search",
                data:{"name" : name, "cengci" : cengci},
                success:function(data){

                    var html ="";
                    html += '<tr>';
                    html += '<th>序号</th>';
                    html += '<th>学校名称</th>';
                    html += '<th>学校地址</th>';
                    html += '<th>学校层次</th>';
                    html += '<th>校招会场数</th>';
                    html += '<th>操作</th>';
                    html += '</tr>';

                    $.each(data, function(index, content){
                      /*  console.log(index)*/
                        var i = index + 1;
                        html += "<tr> ";
                        html += "<td>" + i  +"</td>";
                        html += "<td>" +content.schmgName+"</td>";
                        html += "<td>" +content.schmgAddress+"</td>";
                        html += "<td>" +content.schmgType.schtypeName+"</td>";
                        html += "<td>" +content.ezdBigrets.length+"</td>";
                        html +=  "<td>";
                        html +=  '<button class="btn btn-primary" data-toggle="modal" data-target="#update_xx" id="updateBtn">修改</button>';
                        html +=  '<button class="btn btn-default" id="delectBtn" data-toggle="modal" data-target="">删除</button>';
                        html +=  "</td>";
                        html += "</tr>";
                    });
                    $("#schmgContent").html(html);
                },
                error:function(){
                    alert("error");
                }
            });
        });
    });
    function change(schmgId){
      $("#delete").val(schmgId);
      $("#update").val(schmgId);
    };

    $("#delete").click(function(){
        console.log($("#delete").val());
            $.ajax({
                type:"POTH",
                url:"${pageContext.request.contextPath}/bgSchmg/del/"+$("#delete").val(),
                success:function(data){
                    if(data){
                        alert("删除成功!!");
                    }else{
                        alert("系统繁忙请稍后重试!!");
                    }
                    $(".right-center").load("<%=request.getContextPath()%>/bgSchmg");
                }
            });
    });
    $("#update").click(function(){
        console.log($("#update").val()+$("#schmgName").val()+$("#typeId").val()+$("#schmgAddress").val());
        $.ajax({
            type:"POST",
            url:"${pageContext.request.contextPath}/bgSchmg/updateSchmg",
            data:{
                "schmgId": $("#update").val(),
                "schmgName" : $("#schmgName").val(),
                "typeId": $("#typeId").val(),
                "schmgAddress":$("#schmgAddress").val(),
            },

            success:function(data){
                if(data){
                    alert("修改成功!!");
                }else{
                    alert("系统繁忙请稍后重试!!");
                }
                $(".right-center").load("<%=request.getContextPath()%>/bgSchmg");
            }
        });
    });


</script>


</html>

