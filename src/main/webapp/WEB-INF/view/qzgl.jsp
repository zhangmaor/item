<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/4/20
  Time: 14:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="right-mokuai">
    <div class="practice" style="width: 18%;">
        <span id="gl">全职管理<i class="fa fa-angle-down"></i></span>&nbsp;
        <span style="float: right;display: none;" id="fb">发布全职岗位<i class="fa fa-angle-down"></i></span>
    </div>
</div>

<div class="right-body" id="one">
    <div class="right-body-main">
        <div class="main-1">
            <span class="main-1-1">共发布全职12个</span>

            <span class="main-1-2">
						<span class="main-1-2-1">0个正在审核</span>
						<span class="main-1-2-1">3个正在招聘</span>
						<span class="main-1-2-1">0个下架</span>
					</span>
        </div>


        <div class="col-xs-4 text-left">
            <div class="btn">
                <div class="pull-left">
                    <i class="icon-refresh"></i>
                </div>
                <div class="pull-right">
                    <li class="text-left"><strong>刷新全职岗位</strong></li>
                    <li class="text-left">上次刷新为&nbsp;2016-10-30&nbsp;18:30</li>
                </div>
            </div>
        </div>

        <div class="col-xs-4 text-center">
            <div class="btn" data-toggle="modal" data-target="#qzjl">
                <div class="pull-left">
                    <i class="icon-eye-open"></i>
                </div>
                <div class="pull-right">
                    <li class="text-left pull-left"><strong>录用应聘者</strong></li>
                    <li class="pull-right" style="color: #8BCE5C;"><strong>●&nbsp;收到新的简历</strong>&nbsp;&nbsp;</li><br>
                    <li class="text-left">共收到1201份简历</li>

                </div>
            </div>
        </div>

        <div class="col-xs-4 text-right">
            <div class="btn" id="fbgw">
                <div class="pull-left">
                    <i class="icon-arrow-up"></i>
                </div>
                <div class="pull-right">
                    <li class="text-left"><strong>发布全职岗位</strong></li>
                    <li class="text-left small">今天还可以发布5个岗位</li>

                </div>
            </div>
        </div>

        <p style="color: #858A98;">全职列表</p>
        <table class="table-hover" id="sxlb">
            <thead>
            <th></th>
            <th>全职岗位</th>
            <th>姓名</th>
            <th>电话</th>
            <th>性别</th>
            <th>报名时间</th>
            <th>状态</th>
            </thead>

            <tbody>
            <tr>
                <td class="text-center"><img src="img/QQ图片20170308195953.jpg" style="width: 20px;height: 20px;"></td>
                <td>文员</td>
                <td>李四</td>
                <td>2222222222</td>
                <td>女</td>
                <td>2014-11-16</td>
                <td>已报名</td>
            </tr>
            <tr>
                <td class="text-center"><img src="img/QQ图片20170308195953.jpg" style="width: 20px;height: 20px;"></td>
                <td>文员</td>
                <td>李四</td>
                <td>2222222222</td>
                <td>女</td>
                <td>2014-11-16</td>
                <td>已报名</td>
            </tr>
            <tr>
                <td class="text-center"><img src="img/QQ图片20170308195953.jpg" style="width: 20px;height: 20px;"></td>
                <td>文员</td>
                <td>李四</td>
                <td>2222222222</td>
                <td>女</td>
                <td>2014-11-16</td>
                <td>已报名</td>
            </tr>
            <tr>
                <td class="text-center"><img src="img/QQ图片20170308195953.jpg" style="width: 20px;height: 20px;"></td>
                <td>文员</td>
                <td>李四</td>
                <td>2222222222</td>
                <td>女</td>
                <td>2014-11-16</td>
                <td>已报名</td>
            </tr>

            </tbody>
        </table>
    </div>
</div>

<!--

        二级菜单 发布界面

                        -->
<div class="right-body" id="two" style="display: none;">
    <div class="right-body-main">
        <div class="main-1">
            <span class="main-1-1">岗位列表</span>
        </div>
        <div style="width: 100%;line-height: 70px;">

            <button type="button" class="btn btn-info" data-toggle="modal" data-target="#add_qz">
                发布全职岗位
            </button>
        </div>
        <table class="table table-bordered">
            <thead>
            <th>单位/企业名</th>
            <th>工作岗位</th>
            <th>学历要求</th>
            <th>经验要求</th>
            <th>招聘人数</th>
            <th>性别要求</th>
            <th>薪资</th>
            <th>状态</th>
            <th>操作</th>
            </thead>
            <tbody>
            <tr>
                <td>梦映动漫网络科技有限公司</td>
                <td>Android高级工程师</td>
                <td>本科</td>
                <td>2-3年</td>
                <td>1</td>
                <td>不限</td>
                <td>12k-18k</td>
                <td><span class="label label-warning">在招</span></td>
                <td>
                    <button type="button" class="btn btn-info" data-toggle="modal" data-target="#update_qz">修改</button>
                    <button type="button" class="btn btn-danger" data-toggle="modal" data-target="#del_qz">删除</button>
                </td>
            </tr>
            </tbody>
        </table>


    </div>
</div>


<!-- 全职简历 (模态框)Modal -->
<div class="modal fade" id="qzjl" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document" style="width: 40%;">
        <div class="modal-content">

            <!--<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;&times;</span></button>-->
            <div id="xxx"><button type="button" class="close" data-dismiss="modal">&times;</button></div>

            <div class="modal-body">
                <table id="lqsx" cellpadding="0" cellspacing="0" class="table">
                    <tr>
                        <td>
                            <div style="width: 60px; height: 60px;margin: auto;"><img src="img/QQ图片20170308195953.jpg" style="width: 100%;height: 100%;border-radius: 50px;"></div>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <span>13425520042JCH</span>&nbsp;
                            <span>未实名认证</span>&nbsp;
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <span>男</span>&nbsp;
                            <span>未知</span>&nbsp;
                            <span>本科</span>&nbsp;
                            <span>珠海</span>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <span>国际贸易与实务</span>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <span>13425520042</span>
                            <span>790847005@qq.com</span>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <span>教育经历</span>
                            <hr  style="border:1px dashed #E7EAEC;margin: 0;padding: 0;">
                        </td>
                    </tr>
                    <tr>
                        <td class="text-left">
                            <span>2008年9-2011年6 实验中学 2011年9-2014 濠头中学 2014年9-至今 广东工商职业学院 专科-国际贸易与实务</span>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <span>职业统计</span>
                            <hr style="border:1px dashed #E7EAEC;padding: 0;margin: 0;">
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <table cellspacing="0" cellpadding="0" class="table table-bordered">
                                <tr style="background: #F9F9F9;">
                                    <td>总报名次数</td>
                                    <td>取消次数</td>
                                    <td>被录用次数</td>
                                    <td>用户解约</td>
                                    <td>企业解约</td>
                                    <td>已完成</td>
                                </tr>
                                <tr>
                                    <td>0</td>
                                    <td>0</td>
                                    <td>0</td>
                                    <td>0</td>
                                    <td>0</td>
                                    <td>0</td>
                                </tr>
                            </table>
                        </td>
                    </tr>
                </table>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                <button type="button" class="btn btn-primary">录取</button>
                <button type="button" class="btn btn-primary btn-danger">拒绝</button>
            </div>
        </div>
    </div>
</div>

<!--

    发布全职岗位 (模态框)Modal

                                -->
<div class="modal fade" id="add_qz" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" data-backdrop="static" data-keyboard="false">
    <div class="modal-dialog" role="document" style="width: 50%;">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalLabel">请填写发布信息</h4>
            </div>
            <div class="modal-body">
                <form action="">
                    <div class="row">
                        <div class="col-xs-3 text-right">单位/企业</div>
                        <div class="col-xs-8">
                            <div class="input-group" style="width: 100%;">
                                <input type="text" class="form-control" placeholder="输入单位/企业名称" >
                            </div>
                        </div>
                    </div><br>
                    <div class="row">
                        <div class="col-xs-3 text-right">招聘岗位</div>
                        <div class="col-xs-7">
                            <div class="input-group">
                                <input type="text" class="form-control" placeholder="输入招聘的岗位">
                            </div>
                        </div>
                    </div><br>
                    <div class="row">
                        <div class="col-xs-3 text-right">薪资</div>
                        <div class="col-xs-3" style="padding-right: 0;">
                            <div class="input-group">
                                <input type="text" class="form-control" placeholder="最低工资" aria-describedby="basic-addon1">
                                <span class="input-group-addon" id="basic-addon1">k</span>

                            </div>
                        </div>
                        <div class="col-xs-1 text-center" style="padding: 0;line-height: 35px;">
                            ~
                        </div>
                        <div class="col-xs-3" style="padding: 0;">
                            <div class="input-group">
                                <input type="text" class="form-control" placeholder="最高工资" aria-describedby="basic-addon2">
                                <span class="input-group-addon" id="basic-addon2">k</span>
                            </div>
                        </div>

                    </div><br>
                    <div class="row">
                        <div class="col-xs-3 text-right">招聘人数</div>
                        <div class="col-xs-3">
                            <div class="input-group">
                                <input type="text" class="form-control" placeholder="输入数字">
                            </div>
                        </div>
                    </div><br>
                    <div class="row">
                        <div class="col-xs-3 text-right">性别要求</div>
                        <div class="col-xs-7">
                            <div class="input-group">
                                <select name="" class="form-control">
                                    <option value="0">不限</option>
                                    <option value="1">男</option>
                                    <option value="2">女</option>
                                </select>
                            </div>
                        </div>
                    </div><br>
                    <div class="row">
                        <div class="col-xs-3 text-right">学历要求</div>
                        <div class="col-xs-7">
                            <div class="input-group">
                                <select name="" class="form-control">
                                    <option value="0">不限</option>
                                    <option value="1">本科</option>
                                    <option value="2">大专</option>
                                    <option value="3">高职</option>
                                </select>
                            </div>
                        </div>
                    </div><br>
                    <div class="row">
                        <div class="col-xs-3 text-right">工资经验要求</div>
                        <div class="col-xs-7">
                            <div class="input-group">
                                <select name="" class="form-control">
                                    <option value="0">不限</option>
                                    <option value="1">1年以上</option>
                                    <option value="2">1~2年</option>
                                    <option value="3">2~3年</option>
                                    <option value="4">3~5年</option>
                                    <option value="4">5年以上</option>
                                </select>
                            </div>
                        </div>
                    </div><br>
                    <div class="row">
                        <div class="col-xs-3 text-right">联系人</div>
                        <div class="col-xs-9">
                            <div class="input-group">
                                <span class="input-group-addon" id="basic-addon1">姓名</span>
                                <input type="text" class="form-control" placeholder="输入名字" aria-describedby="basic-addon1">
                                <span class="input-group-addon" id="basic-addon2">联系电话</span>
                                <input type="text" class="form-control" placeholder="输入手机号码" aria-describedby="basic-addon2">
                            </div>
                        </div>
                    </div>
                </form>

            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                <button type="button" class="btn btn-primary">发布</button>
            </div>
        </div>
    </div>
</div>

<!--

    修改全职岗位 (模态框)Modal

                               -->
<div class="modal fade" id="update_qz" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" data-backdrop="static" data-keyboard="false">
    <div class="modal-dialog" role="document" style="width: 50%;">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalLabel">修改实习岗位信息</h4>
            </div>
            <div class="modal-body">
                <form action="">
                    <div class="row">
                        <div class="col-xs-3 text-right">单位/企业</div>
                        <div class="col-xs-8">
                            <div class="input-group" style="width: 100%;">
                                <input type="text" class="form-control" placeholder="输入单位/企业名称" >
                            </div>
                        </div>
                    </div><br>
                    <div class="row">
                        <div class="col-xs-3 text-right">招聘岗位</div>
                        <div class="col-xs-7">
                            <div class="input-group">
                                <input type="text" class="form-control" placeholder="输入招聘的岗位">
                            </div>
                        </div>
                    </div><br>
                    <div class="row">
                        <div class="col-xs-3 text-right">薪资</div>
                        <div class="col-xs-3" style="padding-right: 0;">
                            <div class="input-group">
                                <input type="text" class="form-control" placeholder="最低工资" aria-describedby="basic-addon1">
                                <span class="input-group-addon" id="basic-addon1">k</span>

                            </div>
                        </div>
                        <div class="col-xs-1 text-center" style="padding: 0;line-height: 35px;">
                            ~
                        </div>
                        <div class="col-xs-3" style="padding: 0;">
                            <div class="input-group">
                                <input type="text" class="form-control" placeholder="最高工资" aria-describedby="basic-addon2">
                                <span class="input-group-addon" id="basic-addon2">k</span>
                            </div>
                        </div>

                    </div><br>
                    <div class="row">
                        <div class="col-xs-3 text-right">招聘人数</div>
                        <div class="col-xs-3">
                            <div class="input-group">
                                <input type="text" class="form-control" placeholder="输入数字">
                            </div>
                        </div>
                    </div><br>
                    <div class="row">
                        <div class="col-xs-3 text-right">性别要求</div>
                        <div class="col-xs-7">
                            <div class="input-group">
                                <select name="" class="form-control">
                                    <option value="0">不限</option>
                                    <option value="1">男</option>
                                    <option value="2">女</option>
                                </select>
                            </div>
                        </div>
                    </div><br>
                    <div class="row">
                        <div class="col-xs-3 text-right">学历要求</div>
                        <div class="col-xs-7">
                            <div class="input-group">
                                <select name="" class="form-control">
                                    <option value="0">不限</option>
                                    <option value="1">本科</option>
                                    <option value="2">大专</option>
                                    <option value="3">中专</option>
                                </select>
                            </div>
                        </div>
                    </div><br>
                    <div class="row">
                        <div class="col-xs-3 text-right">工资经验要求</div>
                        <div class="col-xs-7">
                            <div class="input-group">
                                <select name="" class="form-control">
                                    <option value="0">不限</option>
                                    <option value="1">1年以上</option>
                                    <option value="2">1~2年</option>
                                    <option value="3">2~3年</option>
                                    <option value="4">3~5年</option>
                                    <option value="4">5年以上</option>
                                </select>
                            </div>
                        </div>
                    </div><br>
                    <div class="row">
                        <div class="col-xs-3 text-right">联系人</div>
                        <div class="col-xs-9">
                            <div class="input-group">
                                <span class="input-group-addon" id="basic-addon1">姓名</span>
                                <input type="text" class="form-control" placeholder="输入名字" aria-describedby="basic-addon1">
                                <span class="input-group-addon" id="basic-addon2">联系电话</span>
                                <input type="text" class="form-control" placeholder="输入手机号码" aria-describedby="basic-addon2">
                            </div>
                        </div>
                    </div><br>
                    <div class="row">
                        <div class="col-xs-3 text-right">招聘状态</div>
                        <div class="col-xs-7">
                            <div class="input-group">
                                <select name="" class="form-control">
                                    <option value="0">在招</option>
                                    <option value="1">停招</option>
                                </select>
                            </div>
                        </div>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                <button type="button" class="btn btn-primary">提交修改</button>
            </div>
        </div>
    </div>
</div>

<!--

    删除全岗位 (模态框)Modal

                               -->
<div class="modal fade" id="del_qz" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" data-backdrop="static" data-keyboard="false">
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
        $(function(){
            $("#fbgw").click(function(){
                $("#one").css("display","none");
                $("#two").css("display","block");
                $("#fb").css("display","block");
            });
            $("#qzgl,#xxgl,#gl").click(function(){
                $("#one").css("display","block");
                $("#fb").css("display","none");
            });
        })

    </script>
</html>
