<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/4/23
  Time: 20:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" type="text/css" href="/css/dzh.css"/>


</head>
<body>
<div class="right-mokuai">
    <div class="practice" >
        <span>文章管理<i class="fa fa-angle-down"></i></span>

    </div>
</div>

<div class="right-body">
    <div class="right-body-main ">
        <div class="main-1">
            <span class="main-1-1">文章列表</span>

            <span class="main-1-2">
							<span class="main-1-2-1">0个正在审核</span>
						<span class="main-1-2-1">3个正在招聘</span>
						<span class="main-1-2-1">0个下架</span>
						</span>
        </div>

        <div class="article-list">
            <!--分页-->
            <ul class="pagination" id="pageLimit">

            </ul>
            <div class="article-list-1">
							<span class="article-list-1-bigType">
								<b>类型：</b>
								<select name="" class="article-list-1-type">
									<option value="">请选择</option>
								</select>
							</span>
                <span class="article-list-1-search">
								<input type="text" name="" id="title" class="article-list-1-search-1"  placeholder="请输入：标题、作者"/>
								<button id="searchBtn1" type="button" onclick="search()" class="btn btn-warning">搜索</button>
								<button id="searchBtn2" type="button" onclick="clearSearch()" class="btn btn-danger">消除搜索</button>
							</span>

                <div class="searchRadio">
								<span>

									<i class='input_style radio_bg radio_bg_check'><input type="radio" name="hot" onclick="qb()" value="全部"></i>

									全部&nbsp;&nbsp;&nbsp;&nbsp;
								</span>
                    <span>
									<i class='input_style radio_bg'><input type="radio" name="hot" onclick="xs()" value="显示"></i>
									显示&nbsp;&nbsp;&nbsp;&nbsp;
								</span>
                    <span>
									<i class='input_style radio_bg'><input type="radio" name="hot" onclick="yc()" value="隐藏"></i>
									隐藏
								</span>
                </div>
                <div id="searchAdd">
                    <button id="searchBtn3" type="button" class="btn btn-warning" href="#tabAdd" aria-controls="tabAdd" data-toggle="tab" onclick="wz_load()">
                        添加
                    </button>
                </div>
            </div>

            <table class="table table-bordered table-striped">
                <tr>
                    <th>#</th>
                    <th class="thWhite">标题</th>
                    <th>外部链接</th>
                    <th>作者</th>
                    <th>文章类型</th>
                    <th class="thWhite">添加时间</th>
                    <th class="thWhite">排序</th>
                    <th class="thWhite">阅读数量</th>
                    <th class="thWhite">点赞数量</th>
                    <th class="thWhite">评论数量</th>
                    <th>显示状态</th>
                    <th>操作</th>
                </tr>
                <tbody id="tbody">
                <tr>
                    <td>1</td>
                    <td>这是一个很厉害的标题，很厉害的标题，厉害的标题，标题</td>
                    <td></td>
                    <td>帅哥</td>
                    <td>软件开发</td>
                    <td>2017-4-10 11:00</td>
                    <td>1</td>
                    <td>1</td>
                    <td>1</td>
                    <td>1</td>
                    <td>
                        <div class="miniDiv">
                            显示
                        </div>
                    </td>
                    <td>
                        <button class="btn btn-warning btn-xs" id="btnHidden">隐藏</button>
                        <button class="btn btn-info btn-xs" id="btnEdit" data-toggle="modal" data-target="#edit">编辑</button>
                        <button class="btn btn-primary btn-xs" id="btnDetails">详情</button>
                        <button class="btn btn-danger btn-xs" id="btnDelete">删除</button>
                    </td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>

    <!--编辑按钮-->
    <div class="modal fade" id="edit" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" data-backdrop="static" data-keyboard="false">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                        &times;
                    </button>
                    <h4 class="modal-title" id="myModalLabel">
                        更改大招会信息
                    </h4>
                </div>
                <div class="modal-body">
                    <form action="" style="text-align: center;">
                        <p>标 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 题：<input type="text" id="" value="" /></p>
                        <p>外部链接：<input type="text" id="" value="" /></p>
                        <p>作 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 者：<input type="text" id="" value="" /></p>
                        <p>文章类型：<input type="text" id="" value="" /></p>
                        <p>显示状态：<input type="text" id="" value="" /></p>
                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭
                    </button>
                    <button type="button" class="btn btn-primary">
                        提交更改
                    </button>
                </div>
            </div>
            <!-- /.modal-content -->
        </div>
        <!-- /.modal -->
    </div>
</div>

<!--

    大招会管理
-->


<div class="right-body" id="dzh_two" style="display: none;">
    <div class="right-body-main " style="border: 1px solid black;height: 1200px;">

        <!--添加大招会表单-->
        <table border="0" class="smallAddTab">
            <tr>
                <th>*文章类型：</th>
                <td>
                    <select name="" class="TabTextBox">
                        <option value="">请选择</option>
                    </select>
                </td>
            </tr>
            <tr>
                <th>*标题：</th>
                <td><input type="text" name="" class="TabTextBox" value="" /></td>
            </tr>
            <tr>
                <th>*副标题(分享内容)：</th>
                <td><input type="text" name="" class="TabTextBox" value="" /></td>
            </tr>
            <tr>
                <th>*作者：</th>
                <td><input type="text" name="" class="TabTextBox" placeholder="请输入：用户名、手机号" /></td>
            </tr>
            <tr>
                <th>*作者邮箱：</th>
                <td><input type="email" name="" class="TabTextBox" value="" /></td>
            </tr>
            <tr>
                <th>*关键字：</th>
                <td><input type="text" name="" class="TabTextBox" value="" /></td>
            </tr>
            <tr>
                <th>*显示状态：</th>
                <td>
                    <div class="searchRadio">
									<span>
										<i class='input_style radio_bg radio_bg_check'><input type="radio" name="hot" value="全部"></i>
										是&nbsp;&nbsp;&nbsp;&nbsp;
									</span>
                        <span>
										<i class='input_style radio_bg'><input type="radio" name="hot" value="显示"></i>
										否&nbsp;&nbsp;&nbsp;&nbsp;
									</span>
                    </div>
                </td>
            </tr>
            <tr>
                <th>*外部链接：</th>
                <td><input type="text" name="" class="TabTextBox" value="" /></td>
            </tr>
            <tr>
                <th>*标签：</th>
                <td>
                    <textarea></textarea><i class="icon-info-sign"></i>
                </td>
            </tr>
            <tr>
                <th>*文章封面图：</th>
                <td><input type="file" name="" id="" value="" /></td>
            </tr>
            <tr>
                <th>*文章分享图：</th>
                <td><input type="file" name="" id="" value="" /></td>
            </tr>
            <tr>
                <th>*内容：</th>
                <td>
                    <form>
                        <textarea name="content" id="content" style="width:800px;height:400px;visibility:hidden;"></textarea>

    删除文章 (模态框)Modal

                               -->
<div class="modal fade" id="del_wz" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" data-backdrop="static"
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
                <button type="button" onclick="wz()" id="wzsc" class="btn btn-danger">确定删除</button>
            </div>
        </div>
    </div>
</div>

</body>



<script type="text/javascript" src="/js/input.js" charset="utf-8"></script>
<script src="/js/kindeditor-min.js" type="text/javascript" charset="utf-8"></script>
<script src="/js/zh_CN.js" type="text/javascript" charset="utf-8"></script>
<script type="text/javascript">
//    var ueditor = new UE.ui.Editor();
//    ueditor.render("content");
    $(function(){
        $("#searchBtn3").click(function(){
            $("#dzh_one").css("display","none");
            $("#dzh_two").css("display","block");
            $("#fb").css("display","block");
        });
        $("#qzgl,#xxgl,#gl").click(function(){
            $("#dzh_one").css("display","block");
            $("#fb").css("display","none");
        });
    });

    var editor;
    KindEditor.ready(function(K) {
        editor = K.create('textarea[name="content"]', {
            allowFileManager : true
        });
    });

</script>

<%----%>
<script>
    all();
    function all(){
        $.ajax({
            type: "get", //请求的方式，也有get请求
            url: "<%=request.getContextPath()%>/aticle/ajaxGetArticleAll", //请求地址，后台提供的,这里我在本地自己建立了个json的文件做例子
            dataType: "json", //json格式，后台返回的数据为json格式的。
            success: function(result){
                var dataObj = result, //返回的result为json格式的数据
                    con = "";
                var v1 ,v2;
                console.log(result);
                $.each(dataObj, function(index, item){
                    //console.log(item.articleStatus);
                    con += "<tr>";
                    con += "<td>"+item.articleId+"</td>";
                    con += "<td>"+item.articleMtitle+"</td>";
                    con += "<td></td>";
                    con += "<td>"+item.articleAuthor+"</td>";
                    con += "<td>"+item.articleType+"</td>";
                    con += "<td>"+new Date(item.articleTime).toLocaleDateString()+"</td>";
                    con += "<td>1</td>";
                    con += "<td>1</td>";
                    con += "<td>1</td>";
                    con += "<td>1</td>";
                    if(item.articleStatus==1){
                        v1="显示";
                        v2="隐藏";
                    }else {
                        v1="隐藏";
                        v2="显示";
                    }
                    con += "<td><div class='miniDiv'>"+v1+"</div></td>";
                    con += "<td><button class='btn btn-warning btn-xs' value='"+item.articleId+"' onclick='ggzt(this)' id='btnHidden'>"+v2+"</button>"+
                    "<button class='btn btn-info btn-xs' id='btnEdit' data-toggle='modal' data-target='#edit'>编辑</button>"+
                        "<button class='btn btn-primary btn-xs' id='btnDetails'>详情</button>"+
                        "<button class='btn btn-danger btn-xs' id='btnDelete' value='"+item.articleId+"' onclick='wz_sc(this)'data-toggle='modal' data-target='#del_wz'>删除</button></td>";
                    con += "</tr>";

                });
                $("#tbody").html(con); //把内容入到这个div中即完成
            }
        })
    }
</script>

<script>
    function xs() {
        $.ajax({
            type: "post", //请求的方式，也有get请求
            url: "<%=request.getContextPath()%>/aticle/ajaxGetStatusAll", //请求地址，后台提供的,这里我在本地自己建立了个json的文件做例子
            data:"status="+1,
            dataType: "json", //json格式，后台返回的数据为json格式的。
            success: function(result){
                var dataObj = result, //返回的result为json格式的数据
                    con = "";
                //console.log(result);
                $.each(dataObj, function(index, item){
                    con += "<tr>";
                    con += "<td>"+item.articleId+"</td>";
                    con += "<td>"+item.articleMtitle+"</td>";
                    con += "<td></td>";
                    con += "<td>"+item.articleAuthor+"</td>";
                    con += "<td>"+item.articleType+"</td>";
                    con += "<td>"+new Date(item.articleTime).toLocaleDateString()+"</td>";
                    con += "<td>1</td>";
                    con += "<td>1</td>";
                    con += "<td>1</td>";
                    con += "<td>1</td>";
                    con += "<td><div class='miniDiv'>显示 </div></td>";
                    con += "<td><button class='btn btn-warning btn-xs' value='"+item.articleId+"' onclick='ggzt(this)' id='btnHidden'>隐藏</button>"+
                        "<button class='btn btn-info btn-xs' id='btnEdit' data-toggle='modal' data-target='#edit'>编辑</button>"+
                        "<button class='btn btn-primary btn-xs' id='btnDetails'>详情</button>"+
                        "<button class='btn btn-danger btn-xs' id='btnDelete'value='"+item.articleId+"' onclick='wz_sc(this)'data-toggle='modal' data-target='#del_wz'>删除</button></td>";
                    con += "</tr>";

                });
                $("#tbody").html(con); //把内容入到这个div中即完成
            }
        })
    }
</script>


<script>
    function yc() {
        $.ajax({
            type: "post", //请求的方式，也有get请求
            url: "<%=request.getContextPath()%>/aticle/ajaxGetStatusAll", //请求地址，后台提供的,这里我在本地自己建立了个json的文件做例子
            data:"status="+2,
            dataType: "json", //json格式，后台返回的数据为json格式的。
            success: function(result){
                var dataObj = result, //返回的result为json格式的数据
                    con = "";
               // console.log(result);
                $.each(dataObj, function(index, item){
                    con += "<tr>";
                    con += "<td>"+item.articleId+"</td>";
                    con += "<td>"+item.articleMtitle+"</td>";
                    con += "<td></td>";
                    con += "<td>"+item.articleAuthor+"</td>";
                    con += "<td>"+item.articleType+"</td>";
                    con += "<td>"+new Date(item.articleTime).toLocaleDateString()+"</td>";
                    con += "<td>1</td>";
                    con += "<td>1</td>";
                    con += "<td>1</td>";
                    con += "<td>1</td>";
                    con += "<td><div class='miniDiv'>隐藏 </div></td>";
                    con += "<td><button class='btn btn-warning btn-xs' value='"+item.articleId+"' onclick='ggzt(this)' id='btnHidden'>显示</button>"+
                        "<button class='btn btn-info btn-xs' id='btnEdit' data-toggle='modal' data-target='#edit'>编辑</button>"+
                        "<button class='btn btn-primary btn-xs' id='btnDetails'>详情</button>"+
                        "<button class='btn btn-danger btn-xs' id='btnDelete' value='"+item.articleId+"' onclick='wz_sc(this)'data-toggle='modal' data-target='#del_wz'>删除</button></td>";
                    con += "</tr>";

                });
                $("#tbody").html(con); //把内容入到这个div中即完成
            }
        })
    }
</script>

<script>
    function search() {
        if ($("#title").val() == ""){
            alert("请输入标题或作者");
        }else {
            $.ajax({
                type: "post", //请求的方式，也有get请求
                url: "<%=request.getContextPath()%>/aticle/ajaxGetOrAll", //请求地址，后台提供的,这里我在本地自己建立了个json的文件做例子
                data:"article="+$("#title").val(),
                dataType: "json", //json格式，后台返回的数据为json格式的。
                success: function(result){
                    var dataObj = result, //返回的result为json格式的数据
                        con = "";
                    //console.log(result);
                    $.each(dataObj, function(index, item){
                        con += "<tr>";
                        con += "<td>"+item.articleId+"</td>";
                        con += "<td>"+item.articleMtitle+"</td>";
                        con += "<td></td>";
                        con += "<td>"+item.articleAuthor+"</td>";
                        con += "<td>"+item.articleType+"</td>";
                        con += "<td>"+new Date(item.articleTime).toLocaleDateString()+"</td>";
                        con += "<td>1</td>";
                        con += "<td>1</td>";
                        con += "<td>1</td>";
                        con += "<td>1</td>";
                        con += "<td><div class='miniDiv'>隐藏 </div></td>";
                        con += "<td><button class='btn btn-warning btn-xs' value='"+item.articleId+"' onclick='ggzt(this)' id='btnHidden'>隐藏</button>"+
                            "<button class='btn btn-info btn-xs' id='btnEdit' data-toggle='modal' data-target='#edit'>编辑</button>"+
                            "<button class='btn btn-primary btn-xs' id='btnDetails'>详情</button>"+
                            "<button class='btn btn-danger btn-xs' id='btnDelete' value='"+item.articleId+"' onclick='wz_sc(this)'data-toggle='modal' data-target='#del_wz'>删除</button></td>";
                        con += "</tr>";

                    });
                    $("#tbody").html(con); //把内容入到这个div中即完成
                }
            })
        }

    }
</script>

<script>
    function qb() {
        all();
    }
</script>

<script>
    function wz_load(){
        $(".right-center").load("<%=request.getContextPath()%>/enret/wz_add");
    }
</script>

<%--删除--%>
<script>
    function wz_sc(id) {
        $("#wzsc").val(id.value);
    }
    function wz() {
        $.ajax({
            type: "post", //请求的方式，也有get请求
            url: "<%=request.getContextPath()%>/aticle/ajaxDelete", //请求地址，后台提供的,这里我在本地自己建立了个json的文件做例子
            data: "articleId=" + $("#wzsc").val(),
            dataType: "json", //json格式，后台返回的数据为json格式的。
            success: function (result) {
                if (result){
                    $("#del_wz").modal("hide");
                    all();
                }
            }
        });
    }

</script>

<%--更改状态--%>
<script>
    function ggzt(id) {
        $.ajax({
            type: "post", //请求的方式，也有get请求
            url: "<%=request.getContextPath()%>/aticle/ajaxUpdateStatus", //请求地址，后台提供的,这里我在本地自己建立了个json的文件做例子
            data: {articleId: id.value},
            dataType: "json", //json格式，后台返回的数据为json格式的。
            success: function (result) {
                if (result){
                    $("#del_wz").modal("hide");
                    all();
                }
            }
        });
    }
</script>

<%--清楚搜索--%>
<script>
    function clearSearch() {
        $("#title").val("");
    }
</script>
<c:if test="${articleResult==1}">
    <script>
        $(function () {
            alert("添加成功！！！！");
        })
    </script>
</c:if>
<%
    session.removeAttribute("articleResult");
%>

</html>
