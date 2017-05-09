

ALTER DATABASE `ezd_item` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;

CREATE TABLE ezd_role( --   角色表 1
	role_id INT PRIMARY KEY  AUTO_INCREMENT,
	role_name VARCHAR(20) NOT NULL	
)ENGINE=INNODB DEFAULT CHARSET=utf8;
ALTER TABLE ezd_role ADD UNIQUE(role_name);

CREATE TABLE ezd_permission( --   权限表 2
	per_id INT PRIMARY KEY ,
	per_name VARCHAR(20) NOT NULL
)ENGINE=INNODB DEFAULT CHARSET=utf8;
ALTER TABLE ezd_permission ADD UNIQUE(per_name);

CREATE TABLE ezd_tole_permission(--   角色权限关系表 3
	roper_id INT PRIMARY KEY AUTO_INCREMENT,
	roper_role INT , --  对应的那个权限
	reper_perm  INT 	--  那个角色对应了权限
		
)ENGINE=INNODB DEFAULT CHARSET=utf8;

CREATE TABLE ezd_users(--  用户表 4
	user_id INT PRIMARY KEY AUTO_INCREMENT, --  主键
	user_phone VARCHAR(11)  NOT NULL, --  电话
	user_Pwd VARCHAR(20)  NOT NULL,--  密码
	user_uptime Datetime DEFAULT CURRENT_TIMESTAMP	--  创建时间	
)ENGINE=INNODB DEFAULT CHARSET=utf8;
ALTER TABLE ezd_users ADD UNIQUE(user_phone);

CREATE TABLE ezd_umg(--  用户信息表 5
	umg_id INT PRIMARY KEY AUTO_INCREMENT, --  主键
	umg_user INT ,--   引用用户的主键
	umg_photo VARCHAR(50),--  头像
	umg_name  VARCHAR(20),--  姓名
	umg_sex VARCHAR(10)  , -- 姓别
	umg_birthday Datetime ,--  生日
	umg_email VARCHAR(20),--  邮箱
	umg_school VARCHAR(20),--  学校
	umg_major VARCHAR(20),--  专业
	umg_degree VARCHAR(20),--  学历
	umg_sayMf VARCHAR(500),--  自我评价
	umg_education VARCHAR(200),--  教育经历
	umg_address varchar(100), -- 家庭地址
	umg_idCard1 varchar(100), -- 省份证 正面地址
	umg_idCard2 varchar(100), -- 省份证 背面地址
	umg_status int default 0, -- 是否实名 1 已实名认证  0 未认证
	umg_uptime TIMESTAMP DEFAULT CURRENT_TIMESTAMP --  修改时间
)ENGINE=INNODB DEFAULT CHARSET=utf8;
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

CREATE TABLE ezd_schtype(--  学校类型表（大专 本科 中专）
	schtype_id INT PRIMARY KEY AUTO_INCREMENT,
	schtype_name VARCHAR(20) NOT NULL
)ENGINE=INNODB DEFAULT CHARSET=utf8;
ALTER TABLE ezd_schtype ADD UNIQUE(schtype_name);

CREATE TABLE ezd_schmg(--  学校信息表
	schmg_id  INT PRIMARY KEY AUTO_INCREMENT,
	schmg_domain VARCHAR(20), --   学校网址
	schmg_name VARCHAR(10)  NOT NULL,--  学校名称
	schmg_logo VARCHAR(40) , -- 学校logo
	schmg_mg TEXT,--  学校详情
	schmg_address VARCHAR(50),--
	schmg_type INT ,--  学校性质 学校地址
	schmg_cretime Datetime DEFAULT CURRENT_TIMESTAMP --  学校成立时间
	
)ENGINE=INNODB DEFAULT CHARSET=utf8;
ALTER TABLE ezd_schmg ADD UNIQUE(schmg_name);

CREATE TABLE ezd_uminden(--  关注记录表
	uminden_id INT  PRIMARY KEY AUTO_INCREMENT,
	uminden_user  INT ,--  谁关注的 对应用户信息
	uminden_en INT , --  关注了谁 对应公司信息表	
	uminden_status INT  NOT NULL, -- 是否关注
	uminden_time Datetime DEFAULT CURRENT_TIMESTAMP
	
)ENGINE=INNODB DEFAULT CHARSET=utf8;


CREATE TABLE ezd_jobmg(--  用户兼职记录信息表
	jobmg_id INT PRIMARY KEY AUTO_INCREMENT,
	jobmg_user INT ,
	jobmg_num INT ,--  包名次数
	jobmg_undonum INT ,--  取消次数
	jobmg_donum INT ,--  录用次数
	jobmg_uundo INT ,--  用户取消
	jobmg_enundo INT ,--  企业取消
	jobmg_success INT --  已完工
	
)ENGINE=INNODB DEFAULT CHARSET=utf8;
CREATE TABLE ezd_unews(--  用户消息表
	unews_id INT PRIMARY KEY AUTO_INCREMENT,
	unews_user INT ,--   收信人--  用户信息
	unews_from VARCHAR(20)  NOT NULL,--  （默认系统） 发件人
	unews_content TEXT  NOT NULL,-- 信息内容
	unews_status INT CHECK(unews_status=0 OR unews_status=1 ), --  消息状态（0未读 1已读）	
	unews_time Datetime DEFAULT CURRENT_TIMESTAMP
	
)ENGINE=INNODB DEFAULT CHARSET=utf8;
CREATE TABLE ezd_retType(--  招聘类型表
	retType_id INT PRIMARY KEY AUTO_INCREMENT,
	retType_name VARCHAR(20) NOT NULL
)ENGINE=INNODB DEFAULT CHARSET=utf8;

CREATE TABLE ezd_restatus(--  报名状态表
	restatus_id INT PRIMARY KEY AUTO_INCREMENT,
	restatus_name VARCHAR(20) NOT NULL --  已报名 审核 录用 拒绝
)ENGINE=INNODB DEFAULT CHARSET=utf8;

CREATE TABLE ezd_newsStatus(--  消息状态表
	newsStatus_id INT PRIMARY KEY AUTO_INCREMENT,
	newsStatus_name VARCHAR(20)  NOT NULL--  未开始  进行中  已结束
)ENGINE=INNODB DEFAULT CHARSET=utf8;

CREATE TABLE ezd_postOne( -- 招聘类型一级表
	pone_id INT PRIMARY KEY AUTO_INCREMENT,
	pone_name VARCHAR(20) NOT NULL	
)ENGINE=INNODB DEFAULT CHARSET=utf8;
CREATE TABLE ezd_postTwo( -- 招聘类型二级表
	ptwo_id INT PRIMARY KEY AUTO_INCREMENT,
	ptwo_postOne INT ,
	ptwo_name VARCHAR(20)
	
)ENGINE=INNODB DEFAULT CHARSET=utf8;

CREATE TABLE ezd_enret(--  招聘信息表
	enret_id INT PRIMARY KEY AUTO_INCREMENT,
	nret_enmg INT ,
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

CREATE TABLE ezd_erlenret(--  招聘信息报名表
	erlenret_id INT PRIMARY KEY AUTO_INCREMENT,
	erlenret_umg INT , --  谁报名了
	erlenret_enret INT , --  报名的是那个招聘信息	
	enret_time Datetime DEFAULT CURRENT_TIMESTAMP  , -- 报名时间
	erlenret_status INT --  报名状态 (已报名 审核 录用 拒绝)	
	
)ENGINE=INNODB DEFAULT CHARSET=utf8;
CREATE TABLE ezd_enret_browse(--  浏览记录表
	browse_id INT PRIMARY KEY AUTO_INCREMENT,
	browse_user INT ,--   谁浏览的 对应用户信息
	browse_en INT --   浏览的信息 对应 招聘信息
	
)ENGINE=INNODB DEFAULT CHARSET=utf8;
CREATE TABLE ezd_bigret(--  大招会信息表
	bigret_id INT PRIMARY KEY AUTO_INCREMENT,
	bigret_logo VARCHAR(50),
	bigret_title VARCHAR(100),--  大招会标题
	bigret_time Datetime  NOT NULL,--  大招会时间
	bigret_address int,--  大招会地址
	bigret_status INT ,--  大招会状态(未开始  进行中 已结束)
	bigret_creTime Datetime DEFAULT CURRENT_TIMESTAMP,--  发布时间
	bigret_detail TEXT  NOT NULL,--  大招会详情
	bigret_postOne int,--  招聘岗位1
	bigret_postTwo int ,--  招聘岗位2
	bigret_enmg INT --   哪家公司发布的
	
)ENGINE=INNODB DEFAULT CHARSET=utf8;
CREATE TABLE ezd_erlbigret(--  大招会报名表
	erlbigret_id INT PRIMARY KEY AUTO_INCREMENT,
	erlbigret_mes INT , --  报名了那个大招会
	erlbigret_user INT, --   谁报名了大招会
	erlbigret_status INT , --  报名状态 (已报名 审核 录用 拒绝)
	erlbigret_time Datetime DEFAULT CURRENT_TIMESTAMP
	
)ENGINE=INNODB DEFAULT CHARSET=utf8;
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


CREATE TABLE ezd_erlschret(--  校招会包名表
	erlschret_id INT PRIMARY KEY AUTO_INCREMENT,
	erlschret_user INT ,--   谁报名了
	erlschret_schret INT ,--   报名了那个校招会\
	erlschret_status INT , --  包名状态 (已报名 审核 录用 拒绝)
	erlschret_time Datetime DEFAULT CURRENT_TIMESTAMP
		
)ENGINE=INNODB DEFAULT CHARSET=utf8;
CREATE TABLE ezd_artitype(--  文章类型表
	artitype_id INT PRIMARY KEY  AUTO_INCREMENT,
	artitype_name VARCHAR(20)  NOT NULL
)ENGINE=INNODB DEFAULT CHARSET=utf8;

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
	TIMEs Datetime DEFAULT CURRENT_TIMESTAMP ,-- 时间
	article_status INT  NOT NULL --  文章状态（显示 影藏）
	
	
)ENGINE=INNODB DEFAULT CHARSET=utf8;
CREATE TABLE ezd_readarti( -- 文章阅读信息表
	readarti_id INT PRIMARY KEY AUTO_INCREMENT,
	readarti_article INT , -- 阅读了那篇文章
	readarti_user INT ,-- 谁阅读了
	readarti_time Datetime DEFAULT CURRENT_TIMESTAMP 
	
)ENGINE=INNODB DEFAULT CHARSET=utf8;
CREATE TABLE ezd_sayart(--  文章评论
	sayart_id INT PRIMARY KEY AUTO_INCREMENT,
	sayart_article INT ,--  评论的文章
	sayart_umg INT ,--   评论人
	sayart_content VARCHAR(500) ,--  评论内容
	sayart_touser INT ,--  可为null 评论其他用户
	sayart_status INT  NOT NULL,--   评论状态表 需要管理员审核
	sayart_time Datetime DEFAULT CURRENT_TIMESTAMP
	
)ENGINE=INNODB DEFAULT CHARSET=utf8;

CREATE TABLE ezd_point(--  点赞信息表
	point_id INT PRIMARY KEY AUTO_INCREMENT,
	point_article INT ,--  点赞的文章
	point_umg INT,--   点赞人	
	point_touser INT ,--  可为null 为其他用户点赞
	point_status INT NOT NULL --  （0 取消点赞 1 点赞）
	
)ENGINE=INNODB DEFAULT CHARSET=utf8;
CREATE TABLE ezd_adv(
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
