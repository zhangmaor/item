<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="right-mokuai">
    <div class="practice" style="width: 16%;">
        <span id="xx_gl">学校管理<i class="fa fa-angle-down"></i></span>&nbsp;
        <span style="float: right;">添加学校<i c  lass="fa fa-angle-down"></i></span>
    </div>
</div>
<div class="right-body ">

    <div class="right-body-main ">

        <form id="addSchmg" action="${pageContext.request.contextPath}/bgSchmg/addSchmg" method="POST" enctype="multipart/form-data">
            <div class="row">
                <div class="col-xs-3 text-right">*学校logo：</div>
                <div class="col-xs-7">
                    <input type="file"  name="file" >
                </div>
            </div><br>

            <div class="row">
                <div class="col-xs-3 text-right">*学校名称：</div>
                <div class="col-xs-7">
                    <input type="text" class="form-control" name="schmgName">
                </div>
            </div><br>

            <div class="row">
                <div class="col-xs-3 text-right">*学校层次：</div>
                <div class="col-xs-6">
                    <select class="form-control" name="typeId">
                        <option value="0">请选择</option>
                            <c:forEach items="${types}" var="a">
                            <option value="${a.schtypeId}">${a.schtypeName}</option>
                        </c:forEach>
                    </select>
                </div>
            </div><br>

            <div class="row">
                <div class="col-xs-3 text-right">*学校地址：</div>
                <div class="col-xs-5">
                    <input type="text" class="form-control" name="schmgAddress">
                </div>
            </div><br>

            <div class="row">
                <div class="col-xs-3 text-right">*学校网址：</div>
                <div class="col-xs-5">
                    <input type="text" class="form-control" name="schmgDomain">
                </div>
            </div><br>
            <div class="row">
                <div class="col-xs-3 text-right">*学校成立时间：</div>
                <div class="col-xs-5">
                    <input type="date" class="form-control" name="schmgCretime">
                </div>
            </div><br>

            <div class="row">
                <div class="col-xs-3 text-right">*学校详情：</div>
                <div class="col-xs-5">
                    <textarea class="form-control" name="schmgMg"></textarea>
                </div>
            </div><br>

            <div class="row text-center">
                <input type="submit" class="btn btn-primary" id="submitSchmg" value="提交"/>
            </div>


        </form>
    </div>
</div>

</body>
<script>
    $(function(){
        $("#xx_gl").on("click",function(){
            $(".right-center").load("<%=request.getContextPath()%>/bgSchmg");
        });
    });


    /* //添加学校信息
    $("#submitSchmg").on("click", function(){


     var frmparam = $("form").serialize();
        console.log(frmparam);
        $.ajax({
            type:"POST",
            url:"${pageContext.request.contextPath}/bgSchmg/addSchmg",
            data: frmparam ,
            success:function(date){
                alert(date);
                $(".right-center").load("<%=request.getContextPath()%>/bgSchmg");
             },
            error:function(){
                alert("error");
            }
        });*/
   // });
</script>
</html>
