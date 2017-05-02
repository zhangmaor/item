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
                <%--bigretTitle--%>

            </tr>
         <%--  <c:if test="${bigret!=null}">
            <c:forEach items="${bigret}" var="list">
                <tr>
                    <td>${list.bigretTitle}</td>
                    <td>${bigretEnmg.enmgName}</td>
                    <td>${ezdSchmg.schmgAddress}</td>
                    <td>${bigretTime}</td>
                    <td>${ezdErlbigrets.size()}</td>
                    <td>${ezdPostTwo.ptwoName}</td>
                    <td>${bigretStatus.newsStatusName}</td>
                    <td>
                        <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#sel_user">报名用户</button>
                        <button type="button" class="btn btn-warning" data-toggle="modal" data-target="#up_dzh">修改</button>
                        <button type="button" class="btn btn-danger" data-toggle="modal" data-target="#del_dzh">删除</button>
                    </td>
                </tr>
            </c:forEach>
           </c:if>
            <c:if test="${bigret==null}">
                <h1>aaaaa</h1>
            </c:if>--%>
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
                <table class="table">
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
                        <div class="col-xs-3 text-right">*大招会名称：</div>
                        <div class="col-xs-7">
                            <input type="text" class="form-control">
                        </div>
                    </div><br>
                    <div class="row">
                        <div class="col-xs-3 text-right">*举办方：</div>
                        <div class="col-xs-6">
                            <input type="text" class="form-control">
                        </div>
                    </div><br>
                    <div class="row">
                        <div class="col-xs-3 text-right">*举办地址：</div>
                        <div class="col-xs-5">
                            <input type="text" class="form-control">
                        </div>
                    </div><br>
                    <div class="row">
                        <div class="col-xs-3 text-right">*举办时间：</div>
                        <div class="col-xs-5">
                            <input type="text" class="form-control">
                        </div>
                    </div><br>
                    <div class="row">
                        <div class="col-xs-3 text-right">*招聘岗位：</div>
                        <div class="col-xs-6">
                            <input type="text" class="form-control">
                        </div>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                <button type="button" class="btn btn-warning">确定修改</button>
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
            <div class="modal-body">
                是否删除大招会
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                <button type="button" class="btn btn-danger">确定删除</button>
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
    $.ajax({
        url:"<%=request.getContextPath()%>/bg/bigret",
        method:"get",
        dateType:"json",
        success:function(list){
            console.log(list)
            var html ="";
//            bigretEnmg.enmgName
//            ezdSchmg.schmgAddress
//            bigretTime
//            ezdErlbigrets.size()
//            ezdPostTwo.ptwoName
//            bigretStatus.newsStatusName
            $.each(list,function(i,a){
                    html +="<tr>";
                    html +="<td>"+a.bigretTitle+"</td>";
                    html +="<td>"+a.bigretEnmg.enmgName+"</td>";
                    html +="<td>"+a.ezdSchmg.schmgAddress+"</td>";
                    html +="<td>"+a.bigretTime+"</td>";
                    html +="<td>"+a.ezdErlbigrets.length+"</td>";
                    html +="<td>"+a.ezdPostTwo.ptwoName+"</td>";
                    html +="<td>"+a. bigretStatus.newsStatusName+"</td>";
                    html +='<td><button type="button" class="btn btn-primary" data-toggle="modal" data-target="#sel_user">报名用户</button><button type="button" class="btn btn-warning" data-toggle="modal" data-target="#up_dzh">修改</button><button type="button" class="btn btn-danger" data-toggle="modal" data-target="#del_dzh">删除</button></td>';
                    html +="</tr>";
            })
            $("#bigretList").html(html);
        },
        error:function(errors){
            console.log(erorrs);
        }
    });
</script>
</html>
