<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="right-mokuai">
    <div class="practice" style="width: 16%;">
        <span id="qy_gl">企业管理<i class="fa fa-angle-down"></i></span>&nbsp;
        <span style="float: right;">企业建档<i class="fa fa-angle-down"></i></span>
    </div>
</div>
<div class="right-body ">
    <div class="right-body-main ">
        <form action="">
            <div class="row">
                <div class="col-xs-3 text-right">*企业名称：</div>
                <div class="col-xs-7">
                    <input type="text" class="form-control">
                </div>
            </div><br>
            <div class="row">
                <div class="col-xs-3 text-right">*行业类型：</div>
                <div class="col-xs-6">
                    <input type="text" class="form-control">
                </div>
            </div><br>
            <div class="row">
                <div class="col-xs-3 text-right">*公司人数：</div>
                <div class="col-xs-1">
                    <input type="text" class="form-control">
                </div>
                <div class="col-xs-1" style="width: 5px;padding: 0;">-</div>
                <div class="col-xs-1">
                    <input type="text" class="form-control">
                </div>
            </div><br>
            <div class="row">
                <div class="col-xs-3 text-right">*企业类型：</div>
                <div class="col-xs-5">
                    <input type="text" class="form-control">
                </div>
            </div><br>
            <div class="row">
                <div class="col-xs-3 text-right">*公司地址：</div>
                <div class="col-xs-6">
                    <input type="text" class="form-control">
                </div>
            </div><br>
            <div class="row">
                <div class="col-xs-3 text-right">*在招职位：</div>
                <div class="col-xs-5">
                    <input type="text" class="form-control">
                </div>
            </div><br>
            <div class="row">
                <div class="col-xs-3 text-right">*公司介绍：</div>
                <div class="col-xs-5">
                    <textarea style="width: 500px;height: 150px;"></textarea>
                </div>
            </div>
            <div class="row text-center">
                <button type="button" class="btn btn-primary">提交</button>
            </div>
        </form>
    </div>
</div>
</body>
<script>
    $(function(){
        $("#qy_gl").on("click",function(){
            $(".right-center").load("<%=request.getContextPath()%>/enret/qygl");
        });
    })
</script>
</html>
