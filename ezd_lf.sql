
-- 用户表
INSERT INTO ezd_users VALUES (DEFAULT,'15179791514','22d7c725d882735922786637d8f9b9a',DEFAULT),
(DEFAULT,'13679791514','f60fca59e4481e6af5498007b4fd16e',DEFAULT),
(DEFAULT,'15979791514','48f97f49b35a662fbb0d6cde0afeda1',DEFAULT),
(DEFAULT,'17679791514','d31515537c436f229a6a6f130eb3fddc',DEFAULT),
(DEFAULT,'13680399658','0390f4a145c685cbe734ef97e1b51c20',DEFAULT),
(DEFAULT,'13620463438','fd8ae0d8a846af8c9fbc24572b4b5371',DEFAULT);


INSERT INTO ezd_role VALUES (DEFAULT,'qiye'),(DEFAULT, 'shixi'),(DEFAULT,'quanzhi'),(DEFAULT,'dahzaohui'),(DEFAULT,'xuexiao'),(DEFAULT,'wenzhang');
INSERT INTO ezd_role_user VALUES (DEFAULT,1,1),(DEFAULT,1,2),(DEFAULT,1,3),(DEFAULT,1,4),(DEFAULT,1,5),(DEFAULT,1,6),(DEFAULT,2,4),(DEFAULT,3,3),(DEFAULT,4,2),(DEFAULT,5,1);
INSERT INTO ezd_role_user VALUES (DEFAULT,1,5),(DEFAULT,2,5),(DEFAULT,3,5),(DEFAULT,4,5),(DEFAULT,5,5),(DEFAULT,6,5);




-- 用户信息表
INSERT INTO ezd_umg VALUES (1,1,'logo.png','刘小峰','男','1996-08-26','1336629729@qq.com','南方','java','大专','菜的一波','广东南方科贸培训学院就读于南1学院' ,'广东省珠海市',NULL,NULL,0,DEFAULT);
INSERT INTO ezd_umg VALUES (2,2,'logo.png','刘小花','男','1997-08-26','1534354542@qq.com','南方小','php','大学','精英','广东南方科贸培训学院就读于南方2学院','广东省深圳市' ,NULL,NULL,0,DEFAULT);
INSERT INTO ezd_umg VALUES (3,3,'logo.png','刘小帽','男','1998-08-26','5342543543@qq.com','南方中','ui','博士','牛逼','广东南方科贸培训学院就读于南方3学院','广东省东莞市' ,NULL,NULL,1,DEFAULT);
INSERT INTO ezd_umg VALUES (4,4,'logo.png','刘小永','男','1999-08-26','5435435466@qq.com','南方大','前端','硕士','boss','广东南方科贸培训学院就读于南方4学院','广东省广州市' ,NULL,NULL,1,DEFAULT);

--  企业类型表
INSERT INTO ezd_entype VALUES (1,'内资企业');
INSERT INTO ezd_entype VALUES (2,'国有企业');
INSERT INTO ezd_entype VALUES (3,'集体企业');
INSERT INTO ezd_entype VALUES (4,'股份合作企业');
INSERT INTO ezd_entype VALUES (6,'联营企业');
INSERT INTO ezd_entype VALUES (7,'有限责任公司');
INSERT INTO ezd_entype VALUES (8,'股份有限公司');
INSERT INTO ezd_entype VALUES (9,'私营企业');
INSERT INTO ezd_entype VALUES (10,'其他企业');
INSERT INTO ezd_entype VALUES (11,'港、澳、台商投资企业');


--  企业信息表
INSERT INTO ezd_enmg VALUES (1,'logo.png','大华企业','www.n1f.com','刘先生','15179791514','一家成立100周年的上市公司','珠海市香洲区唐家湾',3,'比南方学院大',DEFAULT ,1);
INSERT INTO ezd_enmg VALUES (2,'logo.png','大帽企业','www.n2f.com','张先生','15435432532','一家成立99周年的上市公司','珠海市香洲区拱北',2,'比南方学院大',DEFAULT ,2);
INSERT INTO ezd_enmg VALUES (3,'logo.png','大海企业','www.n3f.com','李先生','15954353353','一家成立88周年的上市公司','珠海市斗门区白蕉',4,'比南方学院大',DEFAULT ,1);


 -- 学校性质
INSERT INTO ezd_schtype VALUES(1, '本科'),(2, '大专'),(3,'中专'),(4,'其他');


--  学校信息表
INSERT INTO ezd_schmg VALUES (1,'www.1nf.com','南方学院','logo.png','该校相当NB','珠海市白蕉镇',2,DEFAULT );
INSERT INTO ezd_schmg VALUES (2,'www.2nf.com','北方学院','logo.png','该校相当NB','珠海市蓝蕉镇',1,DEFAULT );
INSERT INTO ezd_schmg VALUES (3,'www.3nf.com','西方学院','logo.png','该校相当NB','珠海市黄蕉镇',3,DEFAULT );


--  关注记录表
INSERT INTO ezd_uminden VALUES (1,1,1,1,DEFAULT );
INSERT INTO ezd_uminden VALUES (2,1,2,1,DEFAULT );
INSERT INTO ezd_uminden VALUES (3,2,3,1,DEFAULT );



--  用户兼职记录信息表
INSERT INTO ezd_jobmg VALUES (1,1,20,7,5,6,7,8);
INSERT INTO ezd_jobmg VALUES (2,2,30,7,5,6,7,8);
INSERT INTO ezd_jobmg VALUES (3,3,20,7,5,6,7,8);


--  用户消息表
INSERT INTO ezd_unews VALUES (1,1,'系统' ,'今天天气很好',1,DEFAULT );
INSERT INTO ezd_unews VALUES (2,3,'系统' ,'今天天气很好吧',0,DEFAULT );
INSERT INTO ezd_unews VALUES (3,3,'系统' ,'今天天气很好那当然',1,DEFAULT );

-- addDate.sql已添加


--  报名状态表
INSERT INTO ezd_restatus VALUES (1,'已报名');
INSERT INTO ezd_restatus VALUES (2,'审核');
INSERT INTO ezd_restatus VALUES (3,'录用');
INSERT INTO ezd_restatus VALUES (4,'拒绝');

--  消息状态表
INSERT INTO ezd_newsStatus VALUES (1,'未开始');
INSERT INTO ezd_newsStatus VALUES (2,'进行中');
INSERT INTO ezd_newsStatus VALUES (3,'已结束');


-- addDate.sql已添加

-- addDate.sql已添加


--  招聘信息表
INSERT INTO ezd_enret VALUES (1,1,5,1,DEFAULT ,2000,5000,1,2,3,'五险一金','精通java',1);
INSERT INTO ezd_enret VALUES (2,2,10,1,DEFAULT ,5000,8000,2,3,1,'包吃住','会扫地',1);
INSERT INTO ezd_enret VALUES (3,3,40,2,DEFAULT ,10000,15000,3,1,2,'包接送','会上天',1);


--  招聘信息报名表
INSERT INTO ezd_erlenret VALUES (1,1,1,DEFAULT ,2);
INSERT INTO ezd_erlenret VALUES (2,2,2,DEFAULT ,1);
INSERT INTO ezd_erlenret VALUES (3,3,3,DEFAULT ,3);
--  浏览记录表
INSERT INTO ezd_enret_browse VALUES (1,1,1);
INSERT INTO ezd_enret_browse VALUES (2,2,2);
INSERT INTO ezd_enret_browse VALUES (3,3,3);

--  大招会信息表
INSERT INTO ezd_bigret VALUES (1,'logo11.png','我是大标题','2017-3-4' ,1,1,DEFAULT ,'很好玩',1,2,1);
INSERT INTO ezd_bigret VALUES (2,'logo22.png','我是大大标题','2017-4-4' ,2,2,DEFAULT ,'来呀快活呀',1,3,2);
INSERT INTO ezd_bigret VALUES (3,'logo33.png','我是大大大标题','2017-5-4' ,3,3,DEFAULT ,'很好玩丫丫丫丫丫',2,3,3);

--  大招会报名表
INSERT INTO ezd_erlbigret VALUES (1,1,1,1,DEFAULT );
INSERT INTO ezd_erlbigret VALUES (2,2,2,2,DEFAULT );
INSERT INTO ezd_erlbigret VALUES (3,3,3,3,DEFAULT );

--  校招会
INSERT INTO ezd_schret VALUES (1,1,1,1,'欢迎来到南方校招会','2017-5-6',DEFAULT ,'java');
INSERT INTO ezd_schret VALUES (2,2,2,2,'欢迎来到广东校招会','2017-6-6',DEFAULT ,'php');
INSERT INTO ezd_schret VALUES (3,1,1,1,'欢迎来到珠海校招会','2017-6-6',DEFAULT ,'ui');



--  校招会包名表
INSERT INTO ezd_erlschret VALUES (1,1,1,1,DEFAULT );
INSERT INTO ezd_erlschret VALUES (2,2,2,2,DEFAULT );
INSERT INTO ezd_erlschret VALUES (3,3,3,3,DEFAULT );


--  文章类型表
INSERT INTO ezd_artitype VALUES (1,'教育');
INSERT INTO ezd_artitype VALUES (2,'就业');
INSERT INTO ezd_artitype VALUES (3,'科普');
INSERT INTO ezd_artitype VALUES (4,'生活');
INSERT INTO ezd_artitype VALUES (5,'职业');



--  文章信息表
INSERT INTO ezd_article VALUES (1,'fengmian1.png',1,'大中国','如何打倒小日本','墨子','1336629729@qq.com','fengxinag1.png','在22世纪的世界，中国称霸武林，打倒了青莲派的小日本','保家卫国',DEFAULT ,1);
INSERT INTO ezd_article VALUES (2,'fengmian2.png',2,'毕业了','马上要毕业了','峰子','13353422459@qq.com','fengxinag2.png','5月26号大家就要各奔东西了','毕业季',DEFAULT ,2);
INSERT INTO ezd_article VALUES (3,'fengmian3.png',3,'张茂荣','明天张茂荣结婚','小四眼','1334535435@qq.com','fengxinag3.png','5年后，张茂荣结婚了','生子',DEFAULT ,3);


 -- 文章阅读信息表
INSERT INTO  ezd_readarti VALUES (1,1,1,DEFAULT);
INSERT INTO  ezd_readarti VALUES (2,2,2,DEFAULT);
INSERT INTO  ezd_readarti VALUES (3,3,3,DEFAULT);


--  文章评论
INSERT INTO ezd_sayart VALUES (1,1,1,'文章很是有文采',1,1,DEFAULT );
INSERT INTO ezd_sayart VALUES (2,2,2,'这首歌听了要怀孕啊',2,2,DEFAULT );
INSERT INTO ezd_sayart VALUES (3,3,3,'张茂荣生仔了',1,1,DEFAULT );



--  点赞信息表
INSERT INTO ezd_point VALUES (1,1,1,1,1);
INSERT INTO ezd_point VALUES (2,2,2,NULL ,1);
INSERT INTO ezd_point VALUES (3,3,3,1,0);



-- 广告
INSERT INTO ezd_adv VALUES (1,'香洲','中央记者','生活家居','一切为了生活','张茂荣','17607560915','www.guanggao.com',1);
INSERT INTO ezd_adv VALUES (2,'斗门','报刊','战地报道','国外战争','张小花','17615150915','www.guanggao.com',2);
INSERT INTO ezd_adv VALUES (3,'金湾','摄影','国外实时','一切为了生活','张茂荣','17607560915','www.guanggao.com',3);
