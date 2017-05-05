CREATE TABLE ezd_users(--  用户表 4
	user_id INT PRIMARY KEY AUTO_INCREMENT, --  主键
	user_phone VARCHAR(11)  NOT NULL, --  电话
	user_Pwd VARCHAR(20)  NOT NULL,--  密码
	user_uptime Datetime DEFAULT CURRENT_TIMESTAMP	--  创建时间	
)ENGINE=INNODB DEFAULT CHARSET=utf8;
ALTER TABLE ezd_users ADD UNIQUE(user_phone);

--用户表
insert into ezd_users VALUES (1,'15179791514','123',DEFAULT );
insert into ezd_users VALUES (2,'13679791514','1234',DEFAULT );
insert into ezd_users VALUES (3,'15979791514','12345',DEFAULT );
insert into ezd_users VALUES (4,'17679791514','123456',DEFAULT );

CREATE TABLE ezd_umg(--  用户信息表 5
	umg_id INT PRIMARY KEY AUTO_INCREMENT, --  主键
	umg_user INT ,--   引用用户的主键
	umg_photo VARCHAR(50),--  头像
	umg_name  VARCHAR(20),--  姓名
	umg_sex VARCHAR(10),  --性别
	umg_birthday Datetime ,--  生日
	umg_email VARCHAR(20),--  邮箱
	umg_school VARCHAR(20),--  学校
	umg_major VARCHAR(20),--  专业
	umg_degree VARCHAR(20),--  学历
	umg_sayMf VARCHAR(500),--  自我评价
	umg_education VARCHAR(200),--  教育经历
	umg_uptime TIMESTAMP DEFAULT CURRENT_TIMESTAMP --  修改时间
)ENGINE=INNODB DEFAULT CHARSET=utf8;

--用户信息表
inset into ezd_umg VALUES (1,1,'touxiang1.png','刘小峰','男','1996-08-26','1336629729@qq.com','南方','java','大专','菜的一波','广东南方科贸培训学院就读于南1学院',DEFAULT );
inset into ezd_umg VALUES (2,2,'touxiang2.png','刘小花','男','1997-08-26','1534354542@qq.com','南方小','php','大学','精英','广东南方科贸培训学院就读于南方2学院',DEFAULT );
inset into ezd_umg VALUES (3,3,'touxiang3.png','刘小帽','男','1998-08-26','5342543543@qq.com','南方中','ui','博士','牛逼','广东南方科贸培训学院就读于南方3学院',DEFAULT );
inset into ezd_umg VALUES (4,4,'touxiang4.png','刘小永','男','1999-08-26','5435435466@qq.com','南方大','前端','硕士','boss','广东南方科贸培训学院就读于南方4学院',DEFAULT );


CREATE TABLE ezd_role_user(--  用户角色关系表
	uper_id  INT PRIMARY KEY AUTO_INCREMENT,
	uper_role INT , --  对应的那个角色
	uper_umg INT  --  那个用户对应的角色
	
)ENGINE=INNODB DEFAULT CHARSET=utf8;
CREATE TABLE ezd_entype(  						--  企业类型表
	entype_id INT PRIMARY KEY AUTO_INCREMENT,
	entype_name VARCHAR(30)	 NOT NULL			--  企业类型名称
)ENGINE=INNODB DEFAULT CHARSET=utf8;
ALTER TABLE ezd_entype ADD UNIQUE(entype_name);

--  企业类型表
inset into ezd_entype VALUES (1,'内资企业');
inset into ezd_entype VALUES (2,'国有企业');
inset into ezd_entype VALUES (3,'集体企业');
inset into ezd_entype VALUES (4,'股份合作企业');
inset into ezd_entype VALUES (5,'股份合作企业');
inset into ezd_entype VALUES (6,'联营企业');
inset into ezd_entype VALUES (7,'有限责任公司');　　
inset into ezd_entype VALUES (8,'股份有限公司');
inset into ezd_entype VALUES (9,'私营企业');
inset into ezd_entype VALUES (10,'其他企业');
inset into ezd_entype VALUES (11,'港、澳、台商投资企业');

CREATE TABLE ezd_industry ( -- 一级行业信息表
	in_id  INT PRIMARY KEY AUTO_INCREMENT , 
	in_name VARCHAR(40) -- 一级行业
) ENGINE=INNODB DEFAULT CHARSET=utf8;

CREATE TABLE ezd_seindustry( -- 二级行业信息表
	se_id INT  PRIMARY KEY AUTO_INCREMENT,
	se_in INT , -- 关键 一级行业
	se_name VARCHAR(40)
	
) ENGINE=INNODB DEFAULT CHARSET=utf8;
CREATE TABLE ezd_enmg(--  企业信息表
	enmg_id INT PRIMARY KEY AUTO_INCREMENT,
	enmg_logo VARCHAR(50),
	enmg_name VARCHAR(20)  NOT NULL,--  名称
	enmg_domain VARCHAR(20),--  公司网址	
	enmg_user VARCHAR(20),--  联系人
	enmg_wcontact VARCHAR(50),--  联系方式
	enmg_detail TEXT,--  公司详情
	enmg_address VARCHAR(200),--  公司地址
	enmg_type INT  ,--  企业类型	
	enmg_scale VARCHAR(20) ,--  公司规模
	enmg_cretime Datetime DEFAULT CURRENT_TIMESTAMP, --  公司成立时间
	enmg_industry INT  -- 企业所在行业
) ENGINE=INNODB DEFAULT CHARSET=utf8;
ALTER TABLE ezd_enmg ADD UNIQUE(enmg_name);

--  企业信息表
inset into ezd_enmg VALUES (1,'logo1.png','大华企业','www.n1f.com','刘先生','15179791514','一家成立100周年的上市公司','珠海市香洲区唐家湾',3,'比南方学院大',DEFAULT ,1);
inset into ezd_enmg VALUES (2,'logo2.png','大帽企业','www.n2f.com','张先生','15435432532','一家成立99周年的上市公司','珠海市香洲区拱北',2,'比南方学院大',DEFAULT ,2);
inset into ezd_enmg VALUES (3,'logo3.png','大海企业','www.n3f.com','李先生','15954353353','一家成立88周年的上市公司','珠海市斗门区白蕉',4,'比南方学院大',DEFAULT ,1);

CREATE TABLE ezd_schtype(--  学校类型表（大专 本科 中专）
	schtype_id INT PRIMARY KEY AUTO_INCREMENT,
	schtype_name VARCHAR(20) NOT NULL
)ENGINE=INNODB DEFAULT CHARSET=utf8;
ALTER TABLE ezd_schtype ADD UNIQUE(schtype_name);

 -- 学校性质
INSERT INTO ezd_schtype VALUES(1, '本科'),(2, '大专'),(3,'中专'),(4,'其他');

CREATE TABLE ezd_schmg(--  学校信息表
	schmg_id  INT PRIMARY KEY AUTO_INCREMENT,
	schmg_domain VARCHAR(20), --   学校网址
	schmg_name VARCHAR(10)  NOT NULL,--  学校名称
	schmg_mg TEXT,--  学校详情
	schmg_address VARCHAR(50),--  学校地址
	schmg_type INT ,--  学校性质 
	schmg_cretime Datetime DEFAULT CURRENT_TIMESTAMP --  学校成立时间
	
)ENGINE=INNODB DEFAULT CHARSET=utf8;
ALTER TABLE ezd_schmg ADD UNIQUE(schmg_name);

--  学校信息表
insert into ezd_schmg VALUES (1,'www.1nf.com','南方学院','位于斗门白蕉南方',2,DEFAULT );
insert into ezd_schmg VALUES (2,'www.2nf.com','北方学院','位于香洲白蕉南方',1,DEFAULT );
insert into ezd_schmg VALUES (3,'www.3nf.com','西方学院','位于金湾白蕉南方',3,DEFAULT );

CREATE TABLE ezd_uminden(--  关注记录表
	uminden_id INT  PRIMARY KEY AUTO_INCREMENT,
	uminden_user  INT ,--  谁关注的 对应用户信息
	uminden_en INT , --  关注了谁 对应公司信息表	
	uminden_status INT  NOT NULL, -- 是否关注
	uminden_time Datetime DEFAULT CURRENT_TIMESTAMP
	
)ENGINE=INNODB DEFAULT CHARSET=utf8;

--  关注记录表
insert into ezd_uminden VALUES (1,1,1,1,DEFAULT );
insert into ezd_uminden VALUES (2,1,2,1,DEFAULT );
insert into ezd_uminden VALUES (3,2,3,1,DEFAULT );


CREATE TABLE ezd_jobmg(--  用户兼职记录信息表
	jobmg_id INT PRIMARY KEY AUTO_INCREMENT,
	jobmg_user INT ,
	jobmg_num INT ,--  报名次数
	jobmg_undonum INT ,--  取消次数
	jobmg_donum INT ,--  录用次数
	jobmg_uundo INT ,--  用户取消
	jobmg_enundo INT ,--  企业取消
	jobmg_success INT --  已完工
	
)ENGINE=INNODB DEFAULT CHARSET=utf8;

--  用户兼职记录信息表
insert into ezd_jobmg VALUES (1,1,20,7,5,6,7,8);
insert into ezd_jobmg VALUES (2,2,30,7,5,6,7,8);
insert into ezd_jobmg VALUES (3,3,20,7,5,6,7,8);

CREATE TABLE ezd_unews(--  用户消息表
	unews_id INT PRIMARY KEY AUTO_INCREMENT,
	unews_user INT ,--   收信人--  用户信息
	unews_from VARCHAR(20)  NOT NULL,--  （默认系统） 发件人
	unews_content TEXT  NOT NULL,-- 信息内容
	unews_status INT CHECK(unews_status=0 OR unews_status=1 ), --  消息状态（0未读 1已读）	
	unews_time Datetime DEFAULT CURRENT_TIMESTAMP
)ENGINE=INNODB DEFAULT CHARSET=utf8;

--  用户消息表
insert into ezd_unews VALUES (1,1,DEFAULT ,'今天天气很好',1,DEFAULT );
insert into ezd_unews VALUES (2,3,DEFAULT ,'今天天气很好吧',0,DEFAULT );
insert into ezd_unews VALUES (3,3,DEFAULT ,'今天天气很好那当然',1,DEFAULT );


CREATE TABLE ezd_retType(--  招聘类型表
	retType_id INT PRIMARY KEY AUTO_INCREMENT,
	retType_name VARCHAR(20) NOT NULL
)ENGINE=INNODB DEFAULT CHARSET=utf8;

--addDate.sql已添加

CREATE TABLE ezd_restatus(--  报名状态表
	restatus_id INT PRIMARY KEY AUTO_INCREMENT,
	restatus_name VARCHAR(20) NOT NULL --  已报名 审核 录用 拒绝
)ENGINE=INNODB DEFAULT CHARSET=utf8;

--  报名状态表
insert into ezd_restatus VALUES (1,'已报名');
insert into ezd_restatus VALUES (2,'审核');
insert into ezd_restatus VALUES (3,'录用');
insert into ezd_restatus VALUES (4,'拒绝');

CREATE TABLE ezd_newsStatus(--  消息状态表
	newsStatus_id INT PRIMARY KEY AUTO_INCREMENT,
	newsStatus_name VARCHAR(20)  NOT NULL--  未开始  进行中  已结束
)ENGINE=INNODB DEFAULT CHARSET=utf8;

--  消息状态表
insert into ezd_newsStatus VALUES (1,'未开始');
insert into ezd_newsStatus VALUES (2,'进行中');
insert into ezd_newsStatus VALUES (3,'已结束');

CREATE TABLE ezd_postOne( -- 招聘类型一级表
	pone_id INT PRIMARY KEY AUTO_INCREMENT,
	pone_name VARCHAR(20) NOT NULL	
)ENGINE=INNODB DEFAULT CHARSET=utf8;

--addDate.sql已添加

CREATE TABLE ezd_postTwo( -- 招聘类型二级表
	ptwo_id INT PRIMARY KEY AUTO_INCREMENT,
	ptwo_postOne INT ,
	ptwo_name VARCHAR(20)
)ENGINE=INNODB DEFAULT CHARSET=utf8;

--addDate.sql已添加

CREATE TABLE ezd_enret(--  招聘信息表
	enret_id INT PRIMARY KEY AUTO_INCREMENT,
	nret_enmg INT ,--企业信息
	enret_wantNum INT  NOT NULL,--  招聘人数
	enret_type INT ,--   招聘类型 （实习 兼职 全职）
	enret_creTime Datetime DEFAULT CURRENT_TIMESTAMP,--  发布时间
	enret_lwMoney INT  NOT NULL,--  最低工资
	enret_hgMoney INT  NOT NULL,--  最高工资
	enret_edu int not null , -- 学历要求
	enret_postOne int,--  招聘岗位1
	enret_postTwo int ,--  招聘岗位2
	enret_pg TEXT,--  待遇
	enret_demand TEXT NOT NULL,--  招聘要求
	enret_status INT   --  信息状态,( 进行中  已结束)
	
)ENGINE=INNODB DEFAULT CHARSET=utf8;

--  招聘信息表
insert into ezd_enret VALUES (1,1,5,1,DEFAULT ,2000,5000,1,2,3,'五险一金','精通java',1);
insert into ezd_enret VALUES (2,2,10,1,DEFAULT ,5000,8000,2,3,1,'包吃住','会扫地',1);
insert into ezd_enret VALUES (3,3,40,2,DEFAULT ,10000,15000,3,1,2,'包接送','会上天',1);

CREATE TABLE ezd_erlenret(--  招聘信息报名表
	erlenret_id INT PRIMARY KEY AUTO_INCREMENT,
	erlenret_umg INT , --  谁报名了
	erlenret_enret INT , --  报名的是那个招聘信息	
	enret_time Datetime DEFAULT CURRENT_TIMESTAMP  , -- 报名时间
	erlenret_status INT --  报名状态 (已报名 审核 录用 拒绝)
)ENGINE=INNODB DEFAULT CHARSET=utf8;

--  招聘信息报名表
insert into ezd_erlenret VALUES (1,1,1,DEFAULT ,2);
insert into ezd_erlenret VALUES (2,2,2,DEFAULT ,1);
insert into ezd_erlenret VALUES (3,3,3,DEFAULT ,3);

CREATE TABLE ezd_enret_browse(--  浏览记录表
	browse_id INT PRIMARY KEY AUTO_INCREMENT,
	browse_user INT ,--   谁浏览的 对应用户信息
	browse_en INT --   浏览的信息 对应 招聘信息
)ENGINE=INNODB DEFAULT CHARSET=utf8;

--  浏览记录表
insert into ezd_enret_browse VALUES (1,1,1);
insert into ezd_enret_browse VALUES (2,2,2);
insert into ezd_enret_browse VALUES (3,3,3);

CREATE TABLE ezd_bigret(--  大招会信息表
	bigret_id INT PRIMARY KEY AUTO_INCREMENT,
	bigret_logo VARCHAR(50),
	bigret_title VARCHAR(100),--  大招会标题
	bigret_time Datetime  NOT NULL,--  大招会时间
	bigret_address int,--  大招会地址
	bigret_status INT ,--  大招会状态(未开始  进行中 已结束)
	bigret_creTime Datetime DEFAULT CURRENT_TIMESTAMP,--  发布时间
	bigret_detail TEXT  NOT NULL,--  大招会详情
	enret_postOne int,--  招聘岗位1
	enret_postTwo int ,--  招聘岗位2
	bigret_enmg INT --   哪家公司发布的
)ENGINE=INNODB DEFAULT CHARSET=utf8;

--  大招会信息表
insert into ezd_bigret VALUES (1,'logo11.png','我是大标题','2017-3-4' ,1,1,DEFAULT ,'很好玩',1,2,1);
insert into ezd_bigret VALUES (2,'logo22.png','我是大大标题','2017-4-4' ,2,2,DEFAULT ,'来呀快活呀',1,3,2);
insert into ezd_bigret VALUES (3,'logo33.png','我是大大大标题','2017-5-4' ,3,3,DEFAULT ,'很好玩丫丫丫丫丫',2,3,3);

CREATE TABLE ezd_erlbigret(--  大招会报名表
	erlbigret_id INT PRIMARY KEY AUTO_INCREMENT,
	erlbigret_mes INT , --  报名了那个大招会
	erlbigret_user INT, --   谁报名了大招会
	erlbigret_status INT , --  报名状态 (已报名 审核 录用 拒绝)
	erlbigret_time Datetime DEFAULT CURRENT_TIMESTAMP
)ENGINE=INNODB DEFAULT CHARSET=utf8;

--  大招会报名表
insert into ezd_erlbigret VALUES (1,1,1,1,DEFAULT );
insert into ezd_erlbigret VALUES (2,2,2,2,DEFAULT );
insert into ezd_erlbigret VALUES (3,3,3,3,DEFAULT );

CREATE TABLE ezd_schret(--  校招会
	schret_id INT PRIMARY KEY AUTO_INCREMENT,
	schret_schmg INT ,--   那所学校开校招会
	schret_enmg INT ,--  那家公司在招聘
	schret_status INT,--  校招聘状态 （未开始 已结束 进行中)
	schret_detail TEXT,--  校招会详情
	schret_time Datetime NOT NULL,--  校招会始时间
	schret_cretime Datetime DEFAULT CURRENT_TIMESTAMP,--   校招会发布时间
	bigret_post VARCHAR(20) --  招聘职位
	
)ENGINE=INNODB DEFAULT CHARSET=utf8;

--  校招会
insert into ezd_schret VALUES (1,1,1,1,'欢迎来到南方校招会','2017-5-6',DEFAULT ,'java');
insert into ezd_schret VALUES (2,2,2,2,'欢迎来到广东校招会','2017-6-6',DEFAULT ,'php');
insert into ezd_schret VALUES (1,1,1,1,'欢迎来到珠海校招会','2017-6-6',DEFAULT ,'ui');


CREATE TABLE ezd_erlschret(--  校招会包名表
	erlschret_id INT PRIMARY KEY AUTO_INCREMENT,
	erlschret_user INT ,--   谁报名了
	erlschret_schret INT ,--   报名了那个校招会\
	erlschret_status INT , --  包名状态 (已报名 审核 录用 拒绝)
	erlschret_time Datetime DEFAULT CURRENT_TIMESTAMP
)ENGINE=INNODB DEFAULT CHARSET=utf8;

--  校招会包名表
insert into ezd_erlschret VALUES (1,1,1,1,DEFAULT );
insert into ezd_erlschret VALUES (2,2,2,2,DEFAULT );
insert into ezd_erlschret VALUES (3,3,3,3,DEFAULT );

CREATE TABLE ezd_artitype(--  文章类型表
	artitype_id INT PRIMARY KEY  AUTO_INCREMENT,
	artitype_name VARCHAR(20)  NOT NULL
)ENGINE=INNODB DEFAULT CHARSET=utf8;

--  文章类型表
insert into ezd_artitype VALUES (1,'教育');
insert into ezd_artitype VALUES (2,'就业');
insert into ezd_artitype VALUES (3,'科普');
insert into ezd_artitype VALUES (4,'生活');
insert into ezd_artitype VALUES (5,'职业');


CREATE TABLE ezd_article(--  文章信息表
	article_id INT PRIMARY KEY AUTO_INCREMENT, 
	article_logo VARCHAR(50),--  文章封面
	article_type INT ,--  文章类型
	article_mtitle VARCHAR(50),--  主标题
	article_stitle VARCHAR(50),--  副标题
	article_author  VARCHAR(20) NOT NULL,--  作者
	article_auemail VARCHAR(20),--  作者邮箱
	article_pic VARCHAR(50),--  文章分享图
	article_content TEXT NOT NULL,--  文章内容
	article_keywords VARCHAR(50),--  文章关键字
	TIME Datetime DEFAULT CURRENT_TIMESTAMP ,-- 时间
	article_status INT  NOT NULL --  文章状态（显示 影藏）
)ENGINE=INNODB DEFAULT CHARSET=utf8;

--  文章信息表
insert into ezd_article VALUES (1,'fengmian1.png',1,'大中国','如何打倒小日本','墨子','1336629729@qq.com','fengxinag1.png','在22世纪的世界，中国称霸武林，打倒了青莲派的小日本','保家卫国',DEFAULT ,1);
insert into ezd_article VALUES (2,'fengmian2.png',2,'毕业了','马上要毕业了','峰子','13353422459@qq.com','fengxinag2.png','5月26号大家就要各奔东西了','毕业季',DEFAULT ,2);
insert into ezd_article VALUES (3,'fengmian3.png',3,'明天张茂荣结婚','小四眼','1334535435@qq.com','fengxinag3.png','5年后，张茂荣结婚了','生子',DEFAULT ,3);

CREATE TABLE ezd_readarti( -- 文章阅读信息表
	readarti_id INT PRIMARY KEY AUTO_INCREMENT,
	readarti_article INT , -- 阅读了那篇文章
	readarti_user INT ,-- 谁阅读了
	readarti_time Datetime DEFAULT CURRENT_TIMESTAMP
)ENGINE=INNODB DEFAULT CHARSET=utf8;

 -- 文章阅读信息表
insert into  ezd_readarti VALUES (1,1,1,1);
insert into  ezd_readarti VALUES (2,2,2,2);
insert into  ezd_readarti VALUES (3,3,3,3);

CREATE TABLE ezd_sayart(--  文章评论
	sayart_id INT PRIMARY KEY AUTO_INCREMENT,
	sayart_article INT ,--  评论的文章
	sayart_umg INT ,--   评论人
	sayart_content VARCHAR(500) ,--  评论内容
	sayart_touser INT ,--  可为null 评论其他用户
	sayart_status INT  NOT NULL,--   评论状态表 需要管理员审核
	sayart_time Datetime DEFAULT CURRENT_TIMESTAMP
)ENGINE=INNODB DEFAULT CHARSET=utf8;

--  文章评论
insert into ezd_sayart VALUES (1,1,1,'文章很是有文采',1,1,DEFAULT );
insert into ezd_sayart VALUES (2,2,2,'这首歌听了要怀孕啊',2,2,DEFAULT );
insert into ezd_sayart VALUES (3,3,3,'张茂荣生仔了',1,1,DEFAULT );


CREATE TABLE ezd_point(--  点赞信息表
	point_id INT PRIMARY KEY AUTO_INCREMENT,
	point_article INT ,--  点赞的文章
	point_umg INT,--   点赞人	
	point_touser INT ,--  可为null 为其他用户点赞
	point_status INT NOT NULL --  （0 取消点赞 1 点赞）
)ENGINE=INNODB DEFAULT CHARSET=utf8;

--  点赞信息表
insert into ezd_point VALUES (1,1,1,1,1);
insert into ezd_point VALUES (2,2,2,NULL ,1);
insert into ezd_point VALUES (2,3,3,1,0);


CREATE TABLE ezd_adv(--广告
	adv_id INT PRIMARY KEY  AUTO_INCREMENT,
	adv_address VARCHAR(20)NOT NULL,--  广告位置
	adv_metype VARCHAR(20) NOT NULL,--  媒体类型
	adv_type VARCHAR(20) NOT NULL,--  广告类型(一般都是普通)
	adv_title VARCHAR(50) NOT NULL,	--  广告标题
	adv_people VARCHAR(20),--  广告联系人
	adv_peoway VARCHAR(50),--  联系方式
	adv_domain VARCHAR(50), --  广告连接
	adv_status INT  -- 状态（已过时 正在进行 稍后进行）
)ENGINE=INNODB DEFAULT CHARSET=utf8;

--广告
insert into ezd_adv VALUES (1,'香洲','中央记者','生活家居','一切为了生活','张茂荣','17607560915','www.guanggao.com',1);
insert into ezd_adv VALUES (2,'斗门','报刊','战地报道','国外战争','张小花','17615150915','www.guanggao.com',2);
insert into ezd_adv VALUES (3,'金湾','摄影','国外实时','一切为了生活','张茂荣','17607560915','www.guanggao.com',3);
