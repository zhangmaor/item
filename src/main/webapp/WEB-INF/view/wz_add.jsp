<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
    <script src="/js/utf8-jsp/ueditor.config.js"></script>
    <script src="/js/utf8-jsp/ueditor.all.js"></script>
    <script src="/js/utf8-jsp/lang/zh-cn/zh-cn.js"></script>
    <link rel="stylesheet" href="/js/utf8-jsp/themes/default/css/ueditor.css">
</head>
<style>
    .center{
        height: 1400px;
    }
</style>
<body>
<div class="right-mokuai">
    <div class="practice" style="width: 16%;">
        <span id="wz_gl">文章管理<i class="fa fa-angle-down"></i></span>
        <span style="float: right;">发布文章<i class="fa fa-angle-down"></i></span>
    </div>
</div>
<div class="right-body">
    <div class="right-body-main " style="height: 1200px;">
        <form action="">
            <div class="row">
                <div class="col-xs-2 text-right">*文章类型：</div>
                <div class="col-xs-8">
                    <select name="" class="form-control" >
                        <option value="">请选择</option>
                    </select>
                </div>
            </div><br>
            <div class="row">
                <div class="col-xs-2 text-right">*标题：</div>
                <div class="col-xs-8">
                    <input type="text" class="form-control">
                </div>
            </div><br>
            <div class="row">
                <div class="col-xs-2 text-right">*副标题(分享内容)：</div>
                <div class="col-xs-8">

                    <input type="text" class="form-control">

                </div>
            </div><br>
            <div class="row">
                <div class="col-xs-2 text-right">*作者：</div>
                <div class="col-xs-8">

                    <input type="text" class="form-control">

                </div>
            </div><br>
            <div class="row">
                <div class="col-xs-2 text-right">*作者邮箱：</div>
                <div class="col-xs-8">

                    <input type="text" class="form-control">

                </div>
            </div><br>
            <div class="row">
                <div class="col-xs-2 text-right">*关键字：</div>
                <div class="col-xs-8">

                    <input type="text" class="form-control">

                </div>
            </div><br>
            <div class="row">
                <div class="col-xs-2 text-right">*显示状态：</div>
                <div class="col-xs-2">

                    <input type="radio" name="state" value="1">是&nbsp;&nbsp;&nbsp;
                    <input type="radio" name="state" value="2">否

                </div>
            </div><br>
            <div class="row">
                <div class="col-xs-2 text-right">*外部链接：</div>
                <div class="col-xs-8">

                    <input type="text" class="form-control">

                </div>
            </div><br>
            <div class="row">
                <div class="col-xs-2 text-right">*标签：</div>
                <div class="col-xs-8">
                    <div class="input-group">
                        <input type="text" class="form-control">
                    </div>
                </div>
            </div><br>
            <div class="row">
                <div class="col-xs-2 text-right">*文章封面图：</div>
                <div class="col-xs-7">
                    <div class="input-group">
                        <input type="file">
                    </div>
                </div>
            </div><br>
            <div class="row">
                <div class="col-xs-2 text-right">*文章分享图：</div>
                <div class="col-xs-7">
                    <div class="input-group">
                        <input type="file">
                    </div>
                </div>
            </div><br>
            <div class="row">
                <div class="col-xs-2 text-right">*内容：</div>
                <div class="col-xs-7">
                    <div class="input-group">
                        <textarea id="myEditor" style="width:800px;height:300px;"></textarea>
                    </div>
                </div>
            </div><br>
            <div class="row text-center">
                <button type="button" class="btn btn-primary">提交</button>
            </div>


        </form>

    </div>
</div>
</body>
<script>
    var editor = new UE.ui.Editor();
    editor.render("myEditor");

</script>

<script>
    $(function(){
        $("#wz_gl").on("click",function(){
            $(".right-center").load("<%=request.getContextPath()%>/enret/dzhgl");
        });
    })
</script>
</html>
