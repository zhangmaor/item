<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
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

        <form id="formAction" action="/bg/actionInsert" method="post" enctype="multipart/form-data">
            <div class="row">
                <div class="col-xs-3 text-right">*大招会Logo：</div>
                <div class="col-xs-7">
                    <input type="file" name="file" id="bigretLogo">
                </div>
            </div><br>
            <div class="row">
                <div class="col-xs-3 text-right">*大招会标题：</div>
                <div class="col-xs-7">
                    <input type="text" name="bigretTitle" id="bigretTitle" class="form-control">
                </div>
            </div><br>
            <div class="row">
                <div class="col-xs-3 text-right">*举办方：</div>
                <div class="col-xs-7">
                    <select id="enmgName" name="enmgId" class="form-control" >

                    </select>
                </div>
            </div><br>
            <div class="row">
                <div class="col-xs-3 text-right">*举办学校：</div>
                <div class="col-xs-7">
                    <select  id="schmgName" name="bigretAddress" class="form-control">

                    </select>
                </div>
            </div><br>
            <div class="row">
                <div class="col-xs-3 text-right">*举办时间：</div>
                <div class="col-xs-7">
                    <input type="date" name="btime" id="bigretTime" class="form-control">
                </div>
            </div><br>
            <div class="row">
                <div class="col-xs-3 text-right">*招聘岗位：</div>
                <div class="col-xs-3">
                    <select name="postOne" id="postOne"  class="form-control">
                        <option value="">请选择</option>
                    </select>
                </div>
                <div class="col-xs-3">
                    <select name="postTwo" id="postTwo" class="form-control">
                        <option value="">请选择</option>
                    </select>
                </div>
            </div><br>
            <div class="row">
                <div class="col-xs-3 text-right">*大招会详情：</div>
                <div class="col-xs-5">
                    <textarea style="width: 100%;height: 100px;" name="bigretDetail" id="bigretDetail"></textarea sty>
                </div>
            </div>

            <div class="row text-center">
                <button type="submit" id="submitbtn" class="btn btn-primary">提交</button>
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
        /*获取二级岗位*/
        function getPostTwo(){
            var pone_id = $("#postOne").val();

            $.ajax({
                method : "get",
                url :"<%=request.getContextPath()%>/post/ajaxGetPostTwo",
                data :{"pone_id":pone_id},
                dataType : "json",

                success : function(tow){
                    var html2 = "";
                    $.each(tow,function(j,twoa){
                        html2 += "<option value='"+twoa.ptwoId+"'>"+twoa.ptwoName+"</option>";
                    });
                    $("#postTwo").html(html2);
                },
                error:function(a){
                    console.log(a);
                }
            }) ;
        }

        $.ajax({
            url:"<%=request.getContextPath()%>/post/ajaxFindPostOne",
            dataType:"json",
            method:"get",
            success:function(a){
                console.log(a);
                var html = "";
                $.each(a,function(i,list){
                    html +="<option value='"+list.poneId+"'>"+list.poneName+"</option>";
                });
                $("#postOne").html(html);
                getPostTwo();
            }
        });
        $("#postOne").change(function(){
            getPostTwo();
        });
        /*获取全部的企业*/
        $.ajax({
            url :"<%=request.getContextPath()%>/bg/getAllEnmg",
            dataType :"text",
            method :"get",
            success :function(enmgList){
                console.log();
                var html = "";
                var enmgs = JSON.parse(enmgList);
                $.each(enmgs,function(i,e){
                   html +="<option value='"+e.enmgId+"'>"+e.enmgName+"</option>";
                });
                $("#enmgName").html(html);
            }
        });
        /*获取全部的学校*/
        $.ajax({
            url :"<%=request.getContextPath()%>/bg/getAllSch",
            dataType :"text",
            method : "get",
            success : function(schmgList){
                var html ="";
                var schems = JSON.parse(schmgList);
                $.each(schems,function(i,s){
                   html +="<option value='"+s.schmgId+"'>"+s.schmgName+"</option>"
                });
                $("#schmgName").html(html);
            }
        });
    });
       // new MultipartFile
       //var a = new File;

    <%--$("#submitbtn").click(function(){--%>
        <%--var bigretTitle = $("#bigretTitle");--%>
        <%--var btime = $("#bigretTime");--%>
        <%--var file = $("#bigretLogo").val();--%>
        <%--var postOne = $("#postOne").val();--%>
        <%--var postTwo = $("#postTwo").val();--%>
        <%--var bigretDetail = $("#bigretDetail").val();--%>
        <%--var bigretAddress = $("#schmgName").val();--%>
        <%--var enmgId = $("#enmgName").val();--%>
       <%--$.ajax({--%>
           <%--url : "<%=request.getContextPath()%>/bg/actionInsert",--%>
           <%--method : "post",--%>
           <%--dataType : "text",--%>
           <%--data :{--%>
               <%--"bigretTitle":bigretTitle,--%>
                <%--"btime" :btime,--%>
               <%--"file" : file,--%>
               <%--"postOne" : postOne,--%>
               <%--"postTwo" : postTwo,--%>
               <%--"bigretDetail" :bigretDetail,--%>
               <%--"bigretAddress" :bigretAddress ,--%>
               <%--"enmgId":enmgId--%>
           <%--},--%>
           <%--success:function(a){--%>
               <%--console.log("结果是="+a);--%>
           <%--}--%>
       <%--});--%>
    <%--});--%>



</script>
<c:if test="${redreticPoin==0}">
    <script type="text/javascript">
        alert("添加失败！！kadfgdikas ");

    </script>
    <%
        session.removeAttribute("redreticPoin");
    %>
</c:if>
</html>
