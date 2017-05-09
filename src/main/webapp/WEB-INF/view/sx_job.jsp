<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/4/25
  Time: 19:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<div class="right-mokuai">
    <div class="practice" style="width: 18%;">
        <span id="sx_gl">实习管理<i class="fa fa-angle-down"></i></span>&nbsp;
        <span style="float: right;" id="fb">发布实习岗位<i class="fa fa-angle-down"></i></span>
    </div>
</div>

<div class="right-body">
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
            <th>招聘类型</th>
            <th>薪资</th>
            <th>状态</th>
            <th>操作</th>
            </thead>
            <tbody id="ssgw">
            <%--数据显示--%>
            </tbody>
        </table>


    </div>
</div>


<!--

        	发布实习岗位 (模态框)Modal

       								 -->
<div class="modal fade" id="add_sx" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" data-backdrop="static"
     data-keyboard="false">
    <div class="modal-dialog" role="document" style="width: 50%;">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                        aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalLabel">请填写发布信息</h4>
            </div>
            <div class="modal-body">
                <form action="">
                    <div class="row">
                        <div class="col-xs-3 text-right">单位/企业</div>
                        <div class="col-xs-8">
                            <div class="input-group" style="width: 100%;">
                                <select name="" class="form-control" id="qy">
                                    <option value="">请选择</option>
                                </select>
                            </div>
                        </div>
                    </div>
                    <br>
                    <div class="row">
                        <div class="col-xs-3 text-right">招聘岗位</div>
                        <div class="col-xs-3">
                            <div class="input-group" style="width: 100%;">
                                <select name="" class="form-control" id="yjgw" onchange="gradeChange()">
                                    <option value="">请选择</option>
                                </select>
                            </div>
                        </div>
                        <div class="col-xs-4">
                            <div class="input-group">
                                <select name="" class="form-control" id="ejgw">
                                    <option value="">请选择</option>
                                </select>
                            </div>
                        </div>
                    </div>
                    <br>
                    <div class="row">
                        <div class="col-xs-3 text-right">薪资</div>
                        <div class="col-xs-3" style="padding-right: 0;">
                            <div class="input-group">
                                <input type="text" class="form-control" id="zdgz" placeholder="最低工资"
                                       aria-describedby="basic-addon1">
                                <span class="input-group-addon" id="basic-addon1">k</span>

                            </div>
                        </div>
                        <div class="col-xs-1 text-center" style="padding: 0;line-height: 35px;">
                            ~
                        </div>
                        <div class="col-xs-3" style="padding: 0;">
                            <div class="input-group">
                                <input type="text" class="form-control" id="zggz" placeholder="最高工资"
                                       aria-describedby="basic-addon2">
                                <span class="input-group-addon" id="basic-addon2">k</span>
                            </div>
                        </div>
                    </div>
                    <br>
                    <div class="row">
                        <div class="col-xs-3 text-right">员工福利</div>
                        <div class="col-xs-4">
                            <div class="input-group">
                                <input type="text" id="ygfl" class="form-control" placeholder="">
                            </div>
                        </div>
                    </div>
                    <br>
                    <div class="row">
                        <div class="col-xs-3 text-right">招聘人数</div>
                        <div class="col-xs-3">
                            <div class="input-group">
                                <input type="text" id="zprs" class="form-control" placeholder="招聘人数">
                            </div>
                        </div>
                    </div>
                    <br>
                    <div class="row">
                        <div class="col-xs-3 text-right">性别要求</div>
                        <div class="col-xs-7">
                            <div class="input-group">
                                <select name="" class="form-control">
                                    <option value="0">不限</option>
                                    <option value="1">男</option>
                                    <option value="2">女</option>
                                </select>
                            </div>
                        </div>
                    </div>
                    <br>
                    <div class="row">
                        <div class="col-xs-3 text-right">学历要求</div>
                        <div class="col-xs-7">
                            <div class="input-group">
                                <select name="" id="xlyq" class="form-control">
                                    <option value="0">不限</option>
                                    <option value="3">本科</option>
                                    <option value="2">大专</option>
                                    <option value="1">高职</option>
                                </select>
                            </div>
                        </div>
                    </div>
                    <br>
                    <div class="row">
                        <div class="col-xs-3 text-right">工作要求</div>
                        <div class="col-xs-7">
                            <div class="input-group">
                                <input type="text" id="gzyq" class="form-control" placeholder="输入工作要求">
                            </div>
                        </div>
                    </div>
                </form>


            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                <button type="button" class="btn btn-primary" onclick="publish()">发布</button>
            </div>
        </div>
    </div>
</div>

<!--

    修改实习岗位 (模态框)Modal

                               -->
<div class="modal fade" id="update_sx" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" data-backdrop="static"
     data-keyboard="false">
    <div class="modal-dialog" role="document" style="width: 40%">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                        aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalLabel">修改实习岗位信息</h4>
            </div>
            <div class="modal-body">
                <form action="">
                    <div class="row">
                        <div class="col-xs-3 text-right">单位/企业</div>
                        <div class="col-xs-8">
                            <div class="input-group" style="width: 100%;">
                                <select name="" class="form-control" id="xgqy">
                                    <option value="">请选择</option>
                                </select>
                            </div>
                        </div>
                    </div>
                    <br>
                    <div class="row">
                        <div class="col-xs-3 text-right">招聘岗位</div>
                        <div class="col-xs-3">
                            <div class="input-group" style="width: 100%;">
                                <select name="" class="form-control" id="xgyjgw" onchange="gradeChanges()">
                                    <option value="">请选择</option>
                                </select>
                            </div>
                        </div>
                        <div class="col-xs-4">
                            <div class="input-group">
                                <select name="" class="form-control" id="xgejgw">
                                    <option value="">请选择</option>
                                </select>
                            </div>
                        </div>
                    </div>
                    <br>
                    <div class="row">
                        <div class="col-xs-3 text-right">薪资</div>
                        <div class="col-xs-3" style="padding-right: 0;">
                            <div class="input-group">
                                <input type="text" class="form-control" placeholder="最低工资" id="zdxz"
                                       aria-describedby="basic-addon1">
                                <span class="input-group-addon" id="basic-addon1">k</span>

                            </div>
                        </div>
                        <div class="col-xs-1 text-center" style="padding: 0;line-height: 35px;">
                            ~
                        </div>
                        <div class="col-xs-3" style="padding: 0;">
                            <div class="input-group">
                                <input type="text" class="form-control" placeholder="最高工资" id="zgxz"
                                       aria-describedby="basic-addon2">
                                <span class="input-group-addon" id="basic-addon2">k</span>
                            </div>
                        </div>
                    </div>
                    <br>

                    <div class="row">
                        <div class="col-xs-3 text-right">员工福利</div>
                        <div class="col-xs-4">
                            <div class="input-group">
                                <input type="text" id="fl" class="form-control" placeholder="">
                            </div>
                        </div>
                    </div>
                    <br>

                    <div class="row">
                        <div class="col-xs-3 text-right">招聘人数</div>
                        <div class="col-xs-3">
                            <div class="input-group">
                                <input type="text" class="form-control" id="number" placeholder="招聘人数">
                            </div>
                        </div>
                    </div>
                    <br>
                    <div class="row">
                        <div class="col-xs-3 text-right">性别要求</div>
                        <div class="col-xs-7">
                            <div class="input-group">
                                <select name="" class="form-control">
                                    <option value="0">不限</option>
                                    <option value="1">男</option>
                                    <option value="2">女</option>
                                </select>
                            </div>
                        </div>
                    </div>
                    <br>
                    <div class="row">
                        <div class="col-xs-3 text-right">学历要求</div>
                        <div class="col-xs-7">
                            <div class="input-group">
                                <select name="" id="xl" class="form-control">
                                    <option value="0">不限</option>
                                    <option value="3">本科</option>
                                    <option value="2">大专</option>
                                    <option value="1">高职</option>
                                </select>
                            </div>
                        </div>
                    </div>
                    <br>
                    <div class="row">
                        <div class="col-xs-3 text-right">工作要求</div>
                        <div class="col-xs-7">
                            <div class="input-group">
                                <input type="text" class="form-control" id="gz" placeholder="输入工作要求">
                            </div>
                        </div>
                    </div>
                    <br>
                    <div class="row">
                        <div class="col-xs-3 text-right">招聘状态</div>
                        <div class="col-xs-7">
                            <div class="input-group">
                                <select name="" class="form-control">
                                    <option value="0">在招</option>
                                    <option value="1">停招</option>
                                </select>
                            </div>
                        </div>
                    </div>
                </form>

            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                <button type="button" class="btn btn-primary" id="tjxg" onclick="tjxg()">提交修改</button>
            </div>
        </div>
    </div>
</div>

<!--

    删除实习岗位 (模态框)Modal

                               -->
<div class="modal fade" id="del_sx" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" data-backdrop="static"
     data-keyboard="false">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                        aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalLabel">操作提示</h4>
            </div>
            <div class="modal-body">
                是否删除该岗位
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                <button type="button" onclick="qdsc()" id="qdsc" class="btn btn-danger">确定删除</button>
            </div>
        </div>
    </div>
</div>


</body>

<script>
    ss();
    var a = document.getElementById("qdsc");
    function ss() {
        $.ajax({
            type: "post", //请求的方式，也有get请求
            url: "<%=request.getContextPath()%>/enret/ajaxGetEnretTypeAll", //请求地址，后台提供的,这里我在本地自己建立了个json的文件做例子
            data: "retTypeId=" + 1,
            dataType: "json", //json格式，后台返回的数据为json格式的。
            success: function (result) {
                var dataObj = result, //返回的result为json格式的数据
                    con = "";
                    console.log(dataObj);
                $.each(dataObj, function (index, item) {
                   if(item.ezdEnmg!=null) {
                       var type =  item.enretType ==1?"实习":"全职";

                       con += "<tr>";
                       con += "<td>" + item.ezdEnmg.enmgName + "</td>";
                       con += "<td>" + item.ezdPostTwo.ptwoName + "</td>";
                       con += "<td>" + item.enretDemand + "</td>";
                       con += "<td>" + item.enretWantNum + "</td>";
                       con += "<td>" + type+ "</td>";
                       con += "<td>" + item.enretLwMoney + "K~" + item.enretHgMoney + "K</td>";
                       con += "<td><span class='label label-warning'>在招</span></td>";
                       con += "<td><button type='button' class='btn btn-primary' onclick='xg(this)' value='" + item.enretId + "' data-toggle='modal' data-target='#update_sx'>修改</button>" +
                           "<button type='button' value='" + item.enretId + "' class='btn btn-danger' onclick='a.value=this.value' data-toggle='modal' data-target='#del_sx'>删除</button></td>";
                       con += "</tr>";
                   }
                });
                $("#ssgw").html(con); //把内容入到这个div中即完成
            }
        })
    }

    $(function () {

        $("#sx_gl").on("click", function () {
            window.location.href = "index";
        });
    })
</script>

<%--修改--%>
<script>
    function xg(id) {
        $("#tjxg").val(id.value);
        $.ajax({
            type: "post", //请求的方式，也有get请求
            url: "<%=request.getContextPath()%>/enret/ajaxGetEzdEnretAll", //请求地址，后台提供的,这里我在本地自己建立了个json的文件做例子
            data: "enretId=" + id.value,
            dataType: "json", //json格式，后台返回的数据为json格式的。
            success: function (result) {
                console.log(result);
                $("#xgqy").val(result.nretEnmg);
                $("#xgyjgw").val(result.enretPostOne);/*
                $("#xgejgw").val(result.enretPostTwo);*/
            }
        })
    }
</script>

<%--修改实习岗位--%>
<script>
    function tjxg() {
        $.ajax({
            type: "post", //请求的方式，也有get请求
            url: "<%=request.getContextPath()%>/enret/update", //请求地址，后台提供的,这里我在本地自己建立了个json的文件做例子
            data: {
                "enretId"      : $("#tjxg").val(),
                "enretPostOne": $("#xgyjgw").val() == "" ? 0  : $("#xgyjgw").val(),
                "enretPostTwo": $("#xgejgw").val() == "" ? 0  : $("#xgejgw").val(),
                "enretLwMoney": $("#zdxz").val() == "" ? 0    : $("#zdxz").val(),
                "enretHgMoney": $("#zgxz").val() == "" ? 0    : $("#zgxz").val(),
                "enretWantNum": $("#number").val() == "" ? 0  : $("#number").val(),
                "enretDemand" : $("#xl").val() + "" + $("#gz").val(),
                "endretEdu" : $("#xl").val() ,
                "enretPg"     : $("#fl").val() == "" ? null : $("#fl").val(),
                "enretStatus" : 1
            },
            dataType: "json", //json格式，后台返回的数据为json格式的。
            success: function (result) {
                if (result) {
                    $("#update_sx").modal("hide");
                    ss();
                }

            }
        })
    }

</script>

<%--级联出所有企业--%>
<script>
    $(function () {
        $.ajax({
            type: "get", //请求的方式，也有get请求
            url: "<%=request.getContextPath()%>/bgEnmg/enmg", //请求地址，后台提供的,这里我在本地自己建立了个json的文件做例子
            dataType: "json", //json格式，后台返回的数据为json格式的。
            success: function (result) {
                var dataObj = result, //返回的result为json格式的数据
                    con = "";
                //console.log(dataObj);
                con += "<option>请选择</option>";
                $.each(dataObj, function (index, item) {

                    con += "<option value='" + item.enmgId + "'>" + item.enmgName + "</option>";
                });

                $("#qy,#xgqy").html(con); //把内容入到这个div中即完成
            }
        })
    })
</script>

<%--一级岗位级联--%>
<script>
    $(function () {
        $.ajax({
            type: "get", //请求的方式，也有get请求
            url: "<%=request.getContextPath()%>/post/ajaxFindPostOne", //请求地址，后台提供的,这里我在本地自己建立了个json的文件做例子
            dataType: "json", //json格式，后台返回的数据为json格式的。
            success: function (result) {
                var dataObj = result, //返回的result为json格式的数据
                    con = "";
                //console.log(dataObj);
                con += "<option>请选择</option>";
                $.each(dataObj, function (index, item) {
                    con += "<option value='" + item.poneId + "' id='" + item.poneId + "'>" + item.poneName + "</option>";
                });

                $("#yjgw").html(con); //把内容入到这个div中即完成
            }
        })
    })
</script>

<%--二级岗位级联--%>
<script>
    function gradeChange() {
        $.ajax({
            type: "get", //请求的方式，也有get请求
            url: "<%=request.getContextPath()%>/post/ajaxGetPostTwo", //请求地址，后台提供的,这里我在本地自己建立了个json的文件做例子
            data: "pone_id=" + $("#yjgw").val(),
            dataType: "json", //json格式，后台返回的数据为json格式的。
            success: function (result) {
                var dataObj = result, //返回的result为json格式的数据
                    con = "";
                //console.log(dataObj);
                $.each(dataObj, function (index, item) {

                    con += "<option value='" + item.ptwoId + "'>" + item.ptwoName + "</option>";
                });

                $("#ejgw").html(con); //把内容入到这个div中即完成
            }
        })
    }
</script>


<%--修改一级岗位级联--%>
<script>
    $(function() {
        $.ajax({
            type: "get", //请求的方式，也有get请求
            url: "<%=request.getContextPath()%>/post/ajaxFindPostOne", //请求地址，后台提供的,这里我在本地自己建立了个json的文件做例子
            dataType: "json", //json格式，后台返回的数据为json格式的。
            success: function (result) {
                var dataObj = result, //返回的result为json格式的数据
                    con = "";
                //console.log(dataObj);
                con += "<option>请选择</option>";
                $.each(dataObj, function (index, item) {

                    con += "<option value='" + item.poneId + "' id='" + item.poneId + "'>" + item.poneName + "</option>";
                });

                $("#xgyjgw").html(con); //把内容入到这个div中即完成
            }
        })
    })
</script>
<%--修改二级岗位级联--%>
<script>
    function gradeChanges() {
        $.ajax({
            type: "get", //请求的方式，也有get请求
            url: "<%=request.getContextPath()%>/post/ajaxGetPostTwo", //请求地址，后台提供的,这里我在本地自己建立了个json的文件做例子
            data: "pone_id=" + $("#xgyjgw").val(),
            dataType: "json", //json格式，后台返回的数据为json格式的。
            success: function (result) {
                var dataObj = result, //返回的result为json格式的数据
                    con = "";
                //console.log(dataObj);
                $.each(dataObj, function (index, item) {

                    con += "<option value='" + item.ptwoId + "'>" + item.ptwoName + "</option>";
                });

                $("#xgejgw").html(con); //把内容入到这个div中即完成
            }
        })
    }
</script>

<%--发布实习岗位异步请求--%>
<script>
    function publish() {
        $.ajax({
            type: "post", //请求的方式，也有get请求
            url: "<%=request.getContextPath()%>/enret/insert", //请求地址，后台提供的,这里我在本地自己建立了个json的文件做例子
            data: {
                "nretEnmg": $("#qy").val(),
                "enretType": 1,
                "enretPostOne": $("#yjgw").val(),
                "enretPostTwo": $("#ejgw").val(),
                "enretLwMoney": $("#zdgz").val(),
                "enretHgMoney": $("#zggz").val(),
                "enretEdu":$("#xlyq").val(),
                "enretWantNum": $("#zprs").val(),
                "enretDemand": $("#xlyq").val() + "," + $("#gzyq").val(),
                "enretPg": $("#ygfl").val(),
                "enretStatus": 1
            },
            dataType: "json", //json格式，后台返回的数据为json格式的。
            success: function (result) {
                if (result) {
                    $("#add_sx").modal("hide");
                    ss();
                }
            }
        })
    }
</script>

<%--删除实习岗位--%>
<script>

    function qdsc() {
        $.ajax({
            type: "post", //请求的方式，也有get请求
            url: "<%=request.getContextPath()%>/enret/delete", //请求地址，后台提供的,这里我在本地自己建立了个json的文件做例子
            data: "enretId=" + $("#qdsc").val(),
            dataType: "json", //json格式，后台返回的数据为json格式的。
            success: function (result) {
                if (result) {
                    $("#del_sx").modal("hide");
                    ss();
                }
            }
        })
    }
</script>

</html>
