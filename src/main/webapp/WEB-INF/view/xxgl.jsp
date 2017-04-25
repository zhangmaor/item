<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/4/23
  Time: 20:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" type="text/css" href="/css/button.css"/>
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
                        <option value="0">请选择</option>
                        <option value="本科">本科</option>
                        <option value="大专">大专</option>
                        <option value="高职">高职</option>
                    </select>
                    <input class="form-control " id="stuTitle" type="text" placeholder="请填写学校名称" style="width:200px;" />
                    <div class="btn-group">
                        <button class="btn btn-default button button-primary button-rounded button-small" id="searchBtn" style="background-color: #D88C47; color: white;padding: 0 15px;">搜索</button>
                        <button class="btn btn-default button button-primary button-rounded button-small" id="resetBtn" style="background-color: #ED5565; color: white;padding: 0 15px;">清除选择</button>
                    </div>




                    <div class="btn-group">
                        <button type="button" class="btn btn-primary button button-primary button-rounded button-small" id="searchBtn"
                                data-toggle="modal" data-target="#add_xx" style="background-color: #07A94B; color:white;padding: 0 15px; float: right;">添加</button>
                    </div>

                </div>
            </from>
        </div>
        <br>
        <div class="main-4">
            <table class="table table-striped table-responsive">
                <tr>
                    <th>序号</th>
                    <th>学校名称</th>
                    <th>学校地址</th>
                    <th>学校层次</th>
                    <th>校招会场数</th>
                    <th>操作</th>
                </tr>

                <tbody id="for">
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>
                    <button class="btn btn-default button button-primary button-rounded button-small" data-toggle="modal" data-target="#update_xx" id="updateBtn" style="background-color: #1B8CF2;color: white;padding: 0 15px;margin-right: 10px;">修改</button>
                    <button class="btn btn-default button button-primary button-rounded button-small" id="delectBtn" data-toggle="modal" data-target="#del_xx"   style="background-color: #F7160E; color: white;padding: 0 15px;" >删除</button>
                </td>
                </tbody>

            </table>
        </div>

    </div>
</div>

<!-- 添加学校 模态框（Modal） -->
<div class="modal fade" id="add_xx" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" data-backdrop="static" data-keyboard="false">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title" id="myModalLabel"><b>添加学校</b></h4>
            </div>
            <div class="modal-body">
                <div class="form-group">
                    <label class="form-label">层次：</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <select class="form-control " style="width: 200px;" id="addLevel">
                        <option value="0">请选择</option>
                        <option value="本科">本科</option>
                        <option value="大专">大专</option>
                        <option value="高职">高职</option>
                    </select>
                </div>
                <div class="form-group" style="margin-top: 10px;">
                    <label class="form-label">学校名称：</label>&nbsp;&nbsp;&nbsp;&nbsp;
                    <input class="form-control " id="addName" type="text" placeholder="请填写学校名称" style="width:200px;" />
                </div>
                <div class="form-group"  style="margin-top: 10px;">
                    <label class="form-label">学校地址：</label>&nbsp;&nbsp;&nbsp;&nbsp;
                    <input class="form-control " id="addAdress" type="text" placeholder="请填写学校地址" style="width:200px;" />

                </div>
                <div class="form-group"  style="margin-top: 10px;">
                    <label class="form-label">校招会场数：</label>
                    <input class="form-control " id="addNumber" type="text" placeholder="请填写数字" style="width:200px;" />

                </div>


            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary">提交</button>
            </div>
        </div>
        <!-- /.modal-content -->
    </div>
    <!-- /.modal -->
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
                <div class="form-group">
                    <label class="form-label">层次：</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <select class="form-control " style="width: 200px;" id="addLevel">
                        <option value="0">请选择</option>
                        <option value="本科">本科</option>
                        <option value="大专">大专</option>
                        <option value="高职">高职</option>
                    </select>
                </div>
                <div class="form-group" style="margin-top: 10px;">
                    <label class="form-label">学校名称：</label>&nbsp;&nbsp;&nbsp;&nbsp;
                    <input class="form-control " id="addName" type="text" placeholder="请填写学校名称" style="width:200px;" />
                </div>
                <div class="form-group"  style="margin-top: 10px;">
                    <label class="form-label">学校地址：</label>&nbsp;&nbsp;&nbsp;&nbsp;
                    <input class="form-control " id="addAdress" type="text" placeholder="请填写学校地址" style="width:200px;" />

                </div>
                <div class="form-group"  style="margin-top: 10px;">
                    <label class="form-label">校招会场数：</label>
                    <input class="form-control " id="addNumber" type="text" placeholder="请填写数字" style="width:200px;" />

                </div>

            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary">提交更改</button>
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
                <button type="button" class="btn btn-danger">确定</button>
            </div>
        </div>
        <!-- /.modal-content -->
    </div>
    <!-- /.modal -->
</div>

</body>

<script type="text/javascript">
    $(function() {
        //重置按钮事件
        $("#resetBtn").on("click", function() {
            $("#stuLevel").val("");
            $("#stuTitle").val("");
        });
    });
</script>



</html>
