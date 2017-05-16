<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html>
<head>
    <title>Title</title>
    <script src="/js/typeAndIndustry.js"></script>
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
        <form action="<%=request.getContextPath()%>/bgEnmg/add" method="post" enctype="multipart/form-data">
            <div class="row">
                <div class="col-xs-3 text-right">*企业Logo：</div>
                <div class="col-xs-7">
                    <input type="file" name="file" >
                </div>
            </div><br>
            <div class="row">
                <div class="col-xs-3 text-right">*企业名称：</div>
                <div class="col-xs-7">
                    <input type="text" name="enmgName"   class="form-control">
                </div>
            </div><br>
            <div class="row">
                <div class="col-xs-3 text-right">公司网址：</div>
                <div class="col-xs-7">
                    <input type="text" name="enmgDomain"   class="form-control">
                </div>
            </div><br>
            <div class="row">
                <div class="col-xs-3 text-right">*行业类型：</div>
                <div class="col-xs-6">
                    <select  id="IndustryList" name="enmgIndustry" class="form-control"></select>
                </div>
            </div><br>
            <div class="row">
                <div class="col-xs-3 text-right">*公司规模：</div>
                <div class="col-xs-1">
                    <input type="text" name="scaleMin" class="form-control">
                </div>
                <div class="col-xs-1" style="width: 5px;padding: 0;">-</div>
                <div class="col-xs-1">
                    <input type="text" name="scaleMax" class="form-control">
                </div>
            </div><br>
            <div class="row">
                <div class="col-xs-3 text-right">*企业类型：</div>
                <div class="col-xs-5">
                    <select id="typelist" class="form-control" name="enmgType"></select>
                </div>
            </div><br>
            <div class="row">
                <div class="col-xs-3 text-right">*联系人：</div>
                <div class="col-xs-5">
                    <input type="text" class="form-control" name="enmgUser" />
                </div>
            </div><br>
            <div class="row">
                <div class="col-xs-3 text-right">*联系方式：</div>
                <div class="col-xs-5">
                    <input  class="form-control" name="enmgWcontact"/>
                </div>
            </div><br>
            <div class="row">
                <div class="col-xs-3 text-right">*公司地址：</div>
                <div class="col-xs-6">
                    <input type="text" name="enmgAddress" class="form-control">
                </div>
            </div><br>
            <div class="row">
                <div class="col-xs-3 text-right">*公司成立时间：</div>
                <div class="col-xs-6">
                    <input type="date" name="createTime" class="form-control">
                </div>
            </div><br>
            <div class="row">
                <div class="col-xs-3 text-right">*公司介绍：</div>
                <div class="col-xs-5">
                    <textarea name="enmgDetail" style="width: 500px;height: 150px;"></textarea>
                </div>
            </div>
            <img src="">
            <div class="row text-center">
                <button type="submit" class="btn btn-primary">提交</button>
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
        getIndustryList();
        getEnType();
    });

</script>
<c:if test="${addEnmgResult==0}">
    <script type="text/javascript">
        alert("添加失败！！");
        new w
    </script>
    <%
        session.removeAttribute("addEnmgResult");
    %>
</c:if>
</html>
