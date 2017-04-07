
create table ezd_role( --   角色表 1
	role_id int primary key  AUTO_INCREMENT,
	role_name varchar(20) not null	
);
create table ezd_permission( --   权限表 2
	per_id int primary key ,
	per_name varchar(20) not null
);
create table ezd_tole_permission(--   角色权限关系表 3
	roper_id int primary key auto_increment,
	roper_role int , --  对应的那个权限
	reper_perm  int ,	--  那个角色对应了权限
	
	foreign key (roper_role) references ezd_role(role_id),
	foreign key (reper_perm) references ezd_permission(per_id)	
);

create table ezd_users(--  用户表 4
	user_id int primary key AUTO_INCREMENT, --  主键
	user_phone varchar(11)  not null, --  电话
	user_Pwd varchar(20)  not null,--  密码
	user_uptime timestamp default current_timestamp	--  创建时间	
);
create table ezd_umg(--  用户信息表 5
	umg_id int primary key auto_increment, --  主键
	umg_user int ,--   引用用户的主键
	umg_photo varchar(50),--  头像
	umg_name  varchar(20),--  姓名
	umg_sex varchar(10)  ,
	umg_birthday year ,--  生日
	umg_email varchar(20),--  邮箱
	umg_school varchar(20),--  学校
	umg_major varchar(20),--  专业
	umg_degree varchar(20),--  学历
	umg_sayMf varchar(500),--  自我评价
	umg_education varchar(200),--  教育经历
	umg_uptime timestamp default current_timestamp, --  修改时间	
	foreign key (umg_user) references ezd_users(user_id)
);
create table ezd_role_user(--  用户角色关系表
	uper_id  int primary key auto_increment,
	uper_role int , --  对应的那个角色
	uper_umg int , --  那个用户对应的角色
	foreign key (uper_role) references ezd_role(role_id),
	foreign key (uper_umg) references ezd_users(user_id)
);
create table ezd_entype(  						--  企业类型表
	entype_id int primary key AUTO_INCREMENT,
	entype_name varchar(30)	 not null			--  企业类型名称
);
create table ezd_enmg(--  企业信息表
	enmg_id int primary key AUTO_INCREMENT,
	enmg_logo varchar(50),
	enmg_name varchar(20)  not null,--  名称
	enmg_domain varchar(20),--  公司网址	
	enmg_user varchar(20),--  联系人
	enmg_wcontact varchar(50),--  联系方式
	enmg_detail text,--  公司详情
	enmg_address varchar(200),--  公司地址
	enmg_type int  ,--  企业类型	
	enmg_scale varchar(20) ,--  公司规模
	enmg_cretime timestamp default current_timestamp, --  公司成立时间
	foreign key (enmg_type) references ezd_entype(entype_id)
);

create table ezd_schtype(--  学校类型表（大专 本科 中专）
	schtype_id int primary key AUTO_INCREMENT,
	schtype_name varchar(20) not null
);
create table ezd_schmg(--  学校信息表
	schmg_id  int primary key AUTO_INCREMENT,
	schmg_domain varchar(20), --   学校网址
	schmg_name varchar(10)  not null,--  学校名称
	schmg_mg text,--  学校详情
	schmg_address varchar(50),--  学校地址
	schmg_type int ,--  学校性质 
	schmg_cretime timestamp default current_timestamp, --  学校成立时间	
	foreign key (schmg_type) references ezd_schtype(schtype_id)
);
create table ezd_uminden(--  关注记录表
	uminden_id int  primary key AUTO_INCREMENT,
	uminden_user  int ,--  谁关注的 对应用户信息
	uminden_en int , --  关注了谁 对应公司信息表	
	uminden_status int  not null, -- 是否关注
	uminden_time timestamp default current_timestamp,
	foreign key (uminden_user) references ezd_umg(umg_id),
	foreign key (uminden_en) references ezd_enmg(enmg_id)
);
create table ezd_jobmg(--  用户兼职记录信息表
	jobmg_id int primary key AUTO_INCREMENT,
	jobmg_user int ,
	jobmg_num int ,--  包名次数
	jobmg_undonum int ,--  取消次数
	jobmg_donum int ,--  录用次数
	jobmg_uundo int ,--  用户取消
	jobmg_enundo int ,--  企业取消
	jobmg_success int, --  已完工
	foreign key (jobmg_user)   REFERENCES ezd_umg(umg_id)
	
);
create table ezd_unews(--  用户消息表
	unews_id int primary key AUTO_INCREMENT,
	unews_user int ,--   收信人--  用户信息
	unews_from varchar(20)  not null,--  （默认系统） 发件人
	unews_content text  not null,-- 信息内容
	unews_status int check(unews_status=0 or unews_status=1 ), --  消息状态（0未读 1已读）	
	foreign key (unews_user) references ezd_umg(umg_id)
);
create table ezd_retType(--  招聘类型表
	retType_id int primary key auto_increment,
	retType_name varchar(20) not null
);
create table ezd_restatus(--  报名状态表
	restatus_id int primary key auto_increment,
	restatus_name varchar(20) not null --  已报名 审核 录用 拒绝
);
create table ezd_newsStatus(--  消息状态表
	newsStatus_id int primary key auto_increment,
	newsStatus_name varchar(20)  not null--  未开始  进行中  已结束
);
create table ezd_enret(--  招聘信息表
	enret_id int primary key AUTO_INCREMENT,
	nret_enmg int ,
	enret_wantNum int  not null,--  招聘人数
	enret_type int ,--   招聘类型 （实习 兼职 全职）
	enret_creTime timestamp default current_timestamp,--  发布时间
	enret_lwMoney int  not null,--  最低工资
	enret_hgMoney int  not null,--  最高工资
	enret_post varchar(20) not null,--  招聘岗位
	enret_pg text,--  待遇
	enret_demand text not null,--  招聘要求
	enret_status int ,  --  信息状态,( 进行中  已结束)
	foreign key (nret_enmg) references ezd_enmg(enmg_id),
	foreign key (enret_type) references ezd_retType(retType_id),
	foreign key (enret_status) references ezd_newsStatus(newsStatus_id)	
);
create table ezd_erlenret(--  招聘信息报名表
	erlenret_id int primary key auto_increment,
	erlenret_umg int , --  谁报名了
	erlenret_enret int , --  报名的是那个招聘信息
	erlenret_status int, --  报名状态 (已报名 审核 录用 拒绝)	
	foreign key (erlenret_enret) references ezd_enret(enret_id),
	foreign key (erlenret_status)  references ezd_restatus(restatus_id),
	foreign key (erlenret_umg) references ezd_umg(umg_id)
);
create table ezd_enret_browse(--  浏览记录表
	browse_id int primary key auto_increment,
	browse_user int ,--   谁浏览的 对应用户信息
	browse_en int ,--   浏览的信息 对应 招聘信息
	foreign key (browse_user) references ezd_umg(umg_id),
	foreign key (browse_en)  references ezd_enret(enret_id)
);
create table ezd_bigret(--  大招会信息表
	bigret_id int primary key auto_increment,
	bigret_logo varchar(50),
	bigret_title varchar(100),--  大招会标题
	bigret_time timestamp  not null,--  大招会时间
	bigret_address varchar(20),--  大招会地址
	bigret_status int ,--  大招会状态(未开始  进行中 已结束)
	bigret_creTime timestamp default current_timestamp,--  发布时间
	bigret_detail text  not null,--  大招会详情
	bigret_post varchar(20),--  招聘职位
	bigret_enmg int ,--   哪家公司发布的
	
	foreign key (bigret_status)  references ezd_newsStatus(newsStatus_id),
	foreign key (bigret_enmg)  references ezd_enmg(enmg_id)
);
create table ezd_erlbigret(--  大招会报名表
	erlbigret_id int primary key auto_increment,
	erlbigret_mes int , --  报名了那个大招会
	erlbigret_user int, --   谁报名了大招会
	erlbigret_status int , --  报名状态 (已报名 审核 录用 拒绝)
	erlbigret_time timestamp default current_timestamp,
	
	foreign key (erlbigret_mes) references ezd_bigret(bigret_id),
	foreign key (erlbigret_user)  references ezd_umg(umg_id),
	foreign key (erlbigret_status) references ezd_restatus(restatus_id)
);
create table ezd_schret(--  校招会
	schret_id int primary key auto_increment,
	schret_schmg int ,--   那所学校开校招会
	schret_enmg int ,--  那家公司在招聘
	schret_status int,--  校招聘状态 （未开始 已结束 进行中)
	schret_detail text,--  校招会详情
	schret_time timestamp not null,--  校招会始时间
	schret_cretime timestamp default current_timestamp,--   校招会发布时间
	bigret_post varchar(20), --  招聘职位
	
	foreign key (schret_schmg) references ezd_schmg(schmg_id),	
	foreign key (schret_enmg)  references ezd_enmg(enmg_id),
	foreign key (schret_status)  references ezd_newsStatus(newsStatus_id)
);
create table ezd_erlschret(--  校招会包名表
	erlschret_id int primary key auto_increment,
	erlschret_user int ,--   谁报名了
	erlschret_schret int ,--   报名了那个校招会\
	erlschret_status int , --  包名状态 (已报名 审核 录用 拒绝)
	erlschret_time timestamp default current_timestamp,
	
		
	foreign key (erlschret_user) references ezd_umg(umg_id),	
	foreign key (erlschret_schret) references ezd_schret(schret_id),	
	foreign key (erlschret_status) references ezd_restatus(restatus_id)	
);
create table ezd_artitype(--  文章类型表
	artitype_id int primary key  auto_increment,
	artitype_name varchar(20)  not null
);
create table ezd_article(--  文章信息表
	article_id int primary key auto_increment, 
	article_logo varchar(50),--  文章封面
	article_type int ,--  文章类型
	article_mtitle varchar(50),--  主标题
	article_stitle varchar(50),--  副标题
	article_author  varchar(20) not null,--  作者
	article_auemail varchar(20),--  作者邮箱
	article_pic varchar(50),--  文章分享图
	article_content text not null,--  文章内容
	article_keywords varchar(50),--  文章关键字
	article_status int  not null ,--  文章状态（显示 影藏）
	
	foreign key (article_type) references ezd_artitype(artitype_id)
	
);
create table ezd_readarti( -- 文章阅读信息表
	readarti_id int primary key auto_increment,
	readarti_article int , -- 阅读了那篇文章
	readarti_user int ,-- 谁阅读了
	readarti_time timestamp default current_timestamp ,
	
	foreign key (readarti_article) references ezd_article(article_id),
	foreign key (readarti_user) references ezd_umg(umg_id)
);
create table ezd_sayart(--  文章评论
	sayart_id int primary key auto_increment,
	sayart_article int ,--  评论的文章
	sayart_umg int ,--   评论人
	sayart_content varchar(500) ,--  评论内容
	sayart_touser int ,--  可为null 评论其他用户
	sayart_status int  not null,--   评论状态表 需要管理员审核
	sayart_time timestamp default current_timestamp,
	
	foreign key (sayart_article) references ezd_article(article_id),
	foreign key (sayart_umg) references ezd_umg(umg_id)
);
create table ezd_point(--  点赞信息表
	point_id int primary key auto_increment,
	point_article int ,--  点赞的文章
	point_umg int,--   点赞人	
	point_touser int ,--  可为null 为其他用户点赞
	point_status int not null, --  （0 取消点赞 1 点赞）
	
	foreign key (point_article) references ezd_article(article_id),
	foreign key (point_umg)  references ezd_umg(umg_id)
);
create table ezd_adv(
	adv_id int primary key  auto_increment,
	adv_address varchar(20)not null,--  广告位置
	adv_metype varchar(20) not null,--  媒体类型
	adv_type varchar(20) not null,--  广告类型(一般都是普通)
	adv_title varchar(50) not null,	--  广告标题
	adv_people varchar(20),--  广告联系人
	adv_peoway varchar(50),--  联系方式
	adv_domain varchar(50), --  广告连接
	adv_status int  -- 状态（已过时 正在进行 稍后进行）
);
