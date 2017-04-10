 -- 学校性质
INSERT INTO ezd_schtype VALUES(DEFAULT, '本科'),(DEFAULT, '专科'); 


INSERT INTO ezd_restatus VALUES (DEFAULT, '已报名'),(DEFAULT, '审核中'),(DEFAULT, '录用'),(DEFAULT, '拒绝'); -- 报名状态

insert into ezd_newsStatus values (default,'未开始'),(default,'进行中'),(default,'已结束'); -- 消息状态

insert into ezd_retType values(default ,'实习'), (default ,'全职'); -- 招聘类型表


/* 行业数据添加开始*/
insert into ezd_industry values (default , 'it/互联网'),(default , '政府/非营业机构'),(default , '电子/通信/硬件'),(default , '农/林、牧 、渔'),(default , '广告/传媒/影视/文化'),(default , '房地产/商业中心'),(default , '房建'),(default , '教育/培训/科研/院校'),(default , '专业服务'),(default , '生活服务'),(default , '金融业'),(default , '贸易/物流/交通/运输'),(default , '快速/耐用消费品'),(default , '医学/生物'),(default , '能源/水利/化工/环保'),(default , '仪器/仪表/工业自动化/电器'),(default , '汽车/摩托车/电动车'),(default , '机械制造物/机电/重工'),(default , '航空/航天研究与制造'); -- 一级行业信息表

insert into ezd_seindustry(se_in,se_name) values (1,'o2o生活服务'),(1,'电子商务'),(1,'网络招聘'),(1,'网络安全'),(1,'计算机软件'),(1,'IT服务/体统集成'),(1,'网游/手游'),(1,'在线教育'),(1,'云计算/大数据'),(1,'互联网金融'),(1,'在线旅游'),(1,'门户网络/搜索引擎'),(1,'智能硬件/机器人'),(1,'SNS/社交');


insert into ezd_seindustry(se_in,se_name) values (2,'政府职能部门/公共事业'),(2,'各国华政机构'),(2,'协会'),(2,'部队/警察'),(2,'公益组织'),(2,'其他');



insert into ezd_seindustry(se_in,se_name) values (3,'运营商/增值服务'),(3,'计算机硬件/网络设备'),(3,'通信设备'),(3,'电子/半导体/集成电路');


insert into ezd_seindustry(se_in,se_name) values (4,'样值/种植/水产'),(4,'园林/园艺/花卉'),(4,'种子/化肥/农药'),(4,'饲料/添加剂'),(4,'其他');



insert into ezd_seindustry(se_in,se_name) values (5,'广告/公关/会展'),(5,'影视/媒体'),(5,'文化/艺术'),(5,'出版');


insert into ezd_seindustry(se_in,se_name) values (6,'地产经纪/中介'),(6,'物业管理/商业中心'),(6,'房地产开发');


insert into ezd_seindustry(se_in,se_name) values (7,'建材'),(7,'建筑设计'),(7,'装修装饰'),(7,'工程施工'),(7,'园林景观'),(7,'环境工程'),(7,'路桥/隧道'),(7,'高铁/地铁');


insert into ezd_seindustry(se_in,se_name) values (8,'学前教育'),(8,'出国留学'),(8,'外语培训'),(8,'IT培训'),(8,'k12/中专'),(8,'高等院校'),(8,'学术/科研'),(8,'其他技能培训');


insert into ezd_seindustry(se_in,se_name) values (9,'咨询'),(9,'财务/审计/税务'),(9,'法律'),(9,'人才服务'),(9,'外包服务'),(9,'翻译'),(9,'专利/知识产权/商标'),(9,'检测/认证');


insert into ezd_seindustry(se_in,se_name) values (10,'餐饮'),(10,'酒店'),(10,'家政服务'),(10,'汽车租赁'),(10,'旅游'),(10,'中介服务'),(10,'娱乐/休闲/体育'),(10,'婚庆/摄影'),(10,'宠物行业'),(10,'丽人/美容/美发'),(10,'婚庆/摄影');


insert into ezd_seindustry(se_in,se_name) values (11,'银行'),(11,'投资/融资'),(11,'保险'),(11,'证券/基金'),(11,'租赁/信托'),(11,'期贷/外汇'),(11,'担保/典当/拍卖');

insert into ezd_seindustry(se_in,se_name) values (12,'交通/运输'),(12,'物流/仓储/快递'),(12,'贸易/进出口');


insert into ezd_seindustry(se_in,se_name) values (13,'办公用品及设备'),(13,'家电'),(13,'服装/服饰/纺织/皮革'),(13,'奢侈品/收藏品'),(13,'零售（超市）/批发'),(13,'玩具/礼品'),(13,'食品/饮料/烟酒/日化'),(13,'家具/家居'),(13,'珠宝/首饰/工艺品');


insert into ezd_seindustry(se_in,se_name) values (14,'制药（生物/化学））'),(14,'医疗器械'),(14,'医院/医疗卫生'),(14,'保健');

insert into ezd_seindustry(se_in,se_name) values (15,'新能源（太阳能/风能）'),(15,'环保'),(15,'电力/水利'),(15,'石油/石化/化工'),(15,'矿产/地质/采掘/冶炼'),(15,'原材料和加工');

insert into ezd_seindustry(se_in,se_name) values (16,'集成电路ic设计/应用工程师'),(16,'ic验证工程师'),(16,'电子工程师/技术员'),(16,'电子技术研发工程师'),(16,'射频工程师'),(16,'电子/电器维修工程师/技师'),(16,'变压器与磁电工程师'),(16,'版图设计工程师'),(16,'电器工程师/技术员'),(16,'电路工程师/技术员（模拟/数字）'),(16,'电声/音响工程师/技术员'),(16,'激光/光电子技术'),(16,'半导体技术'),(16,'自动控制工程师/技术员'),(16,'电子软件开发（ARM/MCU...'),(16,'嵌入式软件开发（linux/单片机/plc/dsp...）'),(16,'电池/电源开发'),(16,'fae现场应用工程师'),(16,'工艺工程师'),(16,'家用电器/数码产品研发'),(16,'仪器/仪表/计量分析师'),(16,'测试工程师'),(16,'安防系统工程师'),(16,'其他');

insert into ezd_seindustry(se_in,se_name) values (17,'汽车销售'),(17,'汽车维修/美容'),(17,'汽车用品'),(17,'汽车生产'),(17,'汽车零部件'),(17,'摩托'),(17,'电动车');


insert into ezd_seindustry(se_in,se_name) values (18,'机械及工业制品'),(18,'机电设备'),(18,'重工业');

insert into ezd_seindustry(se_in,se_name) values (19,'研究/设计'),(19,'销售部门'),(19,'生产与维修'),(19,'实验与试飞基地'),(19,'管理部门');

/* 行业数据添加结束*/







