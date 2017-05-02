<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="right-mokuai">
    <div class="practice" style="width: 18%;">
        <span id="dzh_gl">大招会管理<i class="fa fa-angle-down"></i></span>&nbsp;
        <span style="float: right;">添加大招会<i class="fa fa-angle-down"></i></span>
    </div>
</div>
<div class="right-body">
    <div class="right-body-main ">

        <form action="">
            <div class="row">
                <div class="col-xs-3 text-right">*大招会Logo：</div>
                <div class="col-xs-7">
                    <input type="file">
                </div>
            </div><br>
            <div class="row">
                <div class="col-xs-3 text-right">*大招会名称：</div>
                <div class="col-xs-7">
                    <input type="text" class="form-control">
                </div>
            </div><br>
            <div class="row">
                <div class="col-xs-3 text-right">*举办方：</div>
                <div class="col-xs-7">
                    <input type="text" class="form-control">
                </div>
            </div><br>
            <div class="row">
                <div class="col-xs-3 text-right">*举办地址：</div>
                <div class="col-xs-7">
                    <input type="text" class="form-control">
                </div>
            </div><br>
            <div class="row">
                <div class="col-xs-3 text-right">*举办时间：</div>
                <div class="col-xs-7">
                    <input type="text" class="form-control">
                </div>
            </div><br>
            <div class="row">
                <div class="col-xs-3 text-right">*招聘岗位：</div>
                <div class="col-xs-3">
                    <select name="" class="form-control">
                        <option value="">请选择</option>
                    </select>
                </div>
                <div class="col-xs-3">
                    <select name="" class="form-control">
                        <option value="">请选择</option>
                    </select>
                </div>
            </div><br>
            <div class="row">
                <div class="col-xs-3 text-right">*大招会详情：</div>
                <div class="col-xs-5">
                    <textarea style="width: 100%;height: 100px;"></textarea sty>
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
        $("#dzh_gl").on("click",function(){
            $(".right-center").load("<%=request.getContextPath()%>/enret/dzhgl");
        });
    })
</script>
</html>
