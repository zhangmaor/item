
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="css/qygl.css"/>
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
                    <button type="button" class="btn btn-primary" onclick="qy_load()">企业建档</button>
                </div>
                <div class="pull-right">

                </div>

            </div>
            <table class="table table-bordered table-striped">
                <tr>
                    <th>企业名字</th>
                    <th>行业类型</th>
                    <th>公司人数</th>
                    <th>企业类型</th>
                    <th>公司地址</th>
                    <th>在招职位</th>
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
                            <input type="text" class="form-control">
                        </div>
                    </div><br>
                    <div class="row">
                        <div class="col-xs-2 text-right">*行业类型：</div>
                        <div class="col-xs-6">
                            <input type="text" class="form-control">
                        </div>
                    </div><br>
                    <div class="row">
                        <div class="col-xs-2 text-right">*公司人数：</div>
                        <div class="col-xs-2">
                            <input type="text" class="form-control">
                        </div>
                        <div class="col-xs-1" style="width: 5px;padding: 0;">-</div>
                        <div class="col-xs-2">
                            <input type="text" class="form-control">
                        </div>
                    </div><br>
                    <div class="row">
                        <div class="col-xs-2 text-right">*企业类型：</div>
                        <div class="col-xs-6">
                            <input type="text" class="form-control">
                        </div>
                    </div><br>
                    <div class="row">
                        <div class="col-xs-2 text-right">*公司地址：</div>
                        <div class="col-xs-8">
                            <input type="text" class="form-control">
                        </div>
                    </div><br>
                    <div class="row">
                        <div class="col-xs-2 text-right">*在招职位：</div>
                        <div class="col-xs-5">
                            <input type="text" class="form-control">
                        </div>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary">
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
                <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                <button type="button" class="btn btn-danger">确定删除</button>
            </div>
        </div>
    </div>
</div>
</body>
<script type="text/javascript">
    function qy_load(){
        $(".right-center").load("<%=request.getContextPath()%>/enret/qy_add");
    }
</script>
</html>
