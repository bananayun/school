/*
 Navicat Premium Data Transfer

 Source Server         : banana
 Source Server Type    : MySQL
 Source Server Version : 80021
 Source Host           : localhost:3306
 Source Schema         : banana

 Target Server Type    : MySQL
 Target Server Version : 80021
 File Encoding         : 65001

 Date: 19/12/2020 12:34:59
*/


-- ----------------------------
-- Table structure for t_cart
-- ----------------------------
DROP TABLE IF EXISTS `t_cart`;
CREATE TABLE `t_cart`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `uid` int NULL DEFAULT NULL,
  `money` bigint NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_cart
-- ----------------------------
INSERT INTO `t_cart` VALUES (1, 4, 0);
INSERT INTO `t_cart` VALUES (2, 5, 0);
INSERT INTO `t_cart` VALUES (3, 6, 0);
INSERT INTO `t_cart` VALUES (4, 7, 0);
INSERT INTO `t_cart` VALUES (5, 8, 0);
INSERT INTO `t_cart` VALUES (6, 10, 0);

-- ----------------------------
-- Table structure for t_cartdetail
-- ----------------------------
DROP TABLE IF EXISTS `t_cartdetail`;
CREATE TABLE `t_cartdetail`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `cid` int NULL DEFAULT NULL,
  `gid` int NULL DEFAULT NULL,
  `num` int NULL DEFAULT NULL,
  `money` bigint NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_cartdetail
-- ----------------------------

-- ----------------------------
-- Table structure for t_goods
-- ----------------------------
DROP TABLE IF EXISTS `t_goods`;
CREATE TABLE `t_goods`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `price` bigint NULL DEFAULT NULL,
  `pubdate` date NULL DEFAULT NULL,
  `typeName` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `intro` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `picture` varchar(150) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `flag` int NULL DEFAULT NULL COMMENT '1上架 2下架',
  `star` int NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 44 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_goods
-- ----------------------------
INSERT INTO `t_goods` VALUES (1, '2020新款】XPS 17(9700)', 39999, '2020-01-01', '笔记本电脑', '17英寸全面屏设计轻薄本 至尊版 创作全面屏/物理防蓝光 64GB 内存', '202012/b1fe48dd-f290-42ca-9184-212a2de782bb_新款戴尔.jpg', 1, 6);
INSERT INTO `t_goods` VALUES (2, '易拉罐可可可乐', 8800, '2018-11-25', '酒水饮料', '日本原装进口 可口可乐(Coca-Cola)碳酸饮料 500ml*6罐，味道谁喝谁知道！', '201811/f65d85f4-a622-4f6b-bbdf-2e354d7b0737_js2.jpg', 1, 5);
INSERT INTO `t_goods` VALUES (3, '干红', 99900, '2018-11-25', '酒水饮料', '自营张裕（CHANGYU）红酒 张裕干红葡萄酒750ml*6瓶（彩龙版），', '201811/fa61ef77-4adc-4895-962b-fcb084e3e809_js3.jpg', 1, 4);
INSERT INTO `t_goods` VALUES (4, '进口红酒', 99900, '2018-11-25', '酒水饮料', '法国进口红酒 拉菲（LAFITE）传奇波尔多干红葡萄酒 双支礼盒装带酒具 750ml*2瓶', '201811/cb233c79-2f18-4f97-afad-0d2079098345_js4.jpg', 1, 3);
INSERT INTO `t_goods` VALUES (5, '草莓饼干', 8800, '2018-11-25', '饼干糕点', '土斯（Totaste） 葡萄味夹层饼干（含葡萄果粒） 休闲零食蛋糕甜点心 实惠分享装360g', '201811/afdd4cd4-9782-46a5-96ed-0ba3c4036379_bg1.jpg', 1, 5);
INSERT INTO `t_goods` VALUES (6, '蔬菜棒', 10100, '2018-11-25', '饼干糕点', '土斯（Totaste） 混合蔬菜味棒形饼干 酥脆可口 独立包装 休闲零食蛋糕甜点心小吃 128g', '201811/8bdbdb3f-4cb6-4af8-9c6f-183411537726_bg2.jpg', 1, 4);
INSERT INTO `t_goods` VALUES (7, '曲奇', 24400, '2018-11-25', '饼干糕点', '丹麦进口 皇冠（danisa）丹麦曲奇精选礼盒装908g(新老包装随机发货)', '201811/db2a101d-600a-44c5-8d0f-0a3b173f81aa_bg3.jpg', 1, 5);
INSERT INTO `t_goods` VALUES (8, '夹心饼干', 6600, '2018-11-25', '饼干糕点', '马来西亚原装进口 茱蒂丝Julie\'s雷蒙德巧克力榛果夹心饼干180g×2', '201811/3b047c04-6b23-491d-bf9c-5405cf36c308_bg4.jpg', 1, 5);
INSERT INTO `t_goods` VALUES (9, '玉米棒', 1800, '2018-11-25', '休闲零食', '印尼进口 Nabati 丽芝士（Richeese）雅嘉 休闲零食 奶酪味 玉米棒 400g/盒 早餐下午茶', '201811/287f1938-f039-4d24-9942-3c8a456d757b_ls1.jpg', 1, 5);
INSERT INTO `t_goods` VALUES (10, '千层酥', 880, '2018-11-25', '休闲零食', '葡韵手信 澳门特产 休闲零食 传统糕点小吃 千层酥150g 新旧包装随机发货', '201811/7570a0dc-eacb-4b61-9085-966ac322172f_ls2.jpg', 1, 5);
INSERT INTO `t_goods` VALUES (11, '海苔', 990, '2018-11-25', '休闲零食', '泰国原装进口休闲零食 老板仔 超大片烤海苔脆紫菜 经典原味 54g/袋（新老包装随机发货）', '201811/62c5370b-2f32-450f-ba4c-401a004d5270_ls3.jpg', 1, 5);
INSERT INTO `t_goods` VALUES (12, '提子干', 4400, '2018-11-25', '休闲零食', '三只松鼠无核白葡萄干蜜饯果干休闲食品新疆特产提子干120g/袋', '201811/4e807511-5515-4ec8-9e20-41e8f49ece66_ls4.jpg', 1, 5);
INSERT INTO `t_goods` VALUES (13, '青岛啤酒', 11800, '2018-11-25', '酒水饮料', '青岛啤酒（TsingTao） 青岛啤酒经典10度 500ml*24听，好喝又实惠！', '201811/555da004-a18c-4fa9-9f23-094551928831_js5.jpg', 1, 5);
INSERT INTO `t_goods` VALUES (14, '手撕面包', 1880, '2018-11-25', '饼干糕点', '三只松鼠 手撕面包1000g整箱装零食大礼包口袋面包孕妇零食早餐食品生日蛋糕小糕点点心礼盒装', '201811/12a3f75c-8ddd-41d8-862f-93f342e5e41e_bg5.png', 1, 5);
INSERT INTO `t_goods` VALUES (15, '开心果', 3200, '2018-11-25', '休闲零食', '满199减120三只松鼠 开心果100g坚果炒货零食每日坚果 1袋装', '201811/d468a868-a7b8-4ad6-bde1-124e23c66437_ls5.jpg', 1, 5);
INSERT INTO `t_goods` VALUES (16, '可可可乐', 6600, '2018-11-25', '酒水饮料', '巴厘岛原装进口 百事可乐(Pepsi) blue 蓝色可乐 网红可乐汽水饮料 450ml*4瓶装', '201811/7b001eee-38df-4c66-9a0f-350879007402_js1.jpg', 1, 5);
INSERT INTO `t_goods` VALUES (31, 'Alienware m17 2020', 44999, '2020-01-01', '笔记本电脑', 'i9/32G/4TB SSD/RTX 2080 SUPER 8GB', '202012/4ac07646-56cb-4968-abe3-4789c0d25d1e_外星人.jpg', 1, 30);
INSERT INTO `t_goods` VALUES (32, '灵越5000(5509) Fit', 6499, '2020-01-01', '笔记本电脑', '第11代智能英特尔® 酷睿™ i7-1165G7 处理器 (12MB 缓存,最高睿频 4.7 GHz)\r\n内存	16GB, 1x16GB, DDR4, 3200MHz\r\n硬盘	512GB M.2 PCIe NVMe 固态硬盘', '202012/14711736-5179-458a-bb8b-ac4b7cde594a_灵越.jpg', 1, 4);
INSERT INTO `t_goods` VALUES (33, '华为笔记本电脑 MateBook X Pro 2020款', 9899, '2020-01-01', '笔记本电脑', '3K触屏 i7 16G 512G 独显|翡冷翠3K触屏 i7 16G 512G 独显|翡冷翠', '202012/06822308-2f22-49c4-a3cc-c8bd1ab2d1f8_华为.jpg', 1, 8);
INSERT INTO `t_goods` VALUES (34, '联想(Lenovo)YOGA Pro14s', 12999, '2020-01-01', '笔记本电脑', '处理器：Intel i7系统：windows 10 带Office内存容量：16G厚度：其他屏幕刷新率：其他固态硬盘（SSD）：1TB显卡类别：集成显卡显卡型号：其他特性：触控屏', '202012/3562cd42-2e73-4674-b9c5-36f21195c152_联想.jpg', 1, 12);
INSERT INTO `t_goods` VALUES (35, 'AOC 23.8英寸', 1199, '2020-01-01', '显示器', '亮度  250cd/m2\r\n点距  0.2745(H)mmx0.2745(V)mm\r\n色数  16.7M', '202012/5a737c42-681f-46b7-a0e1-bc3d7e186ec6_小钢炮.jpg', 1, 7);
INSERT INTO `t_goods` VALUES (36, '戴尔（DELL）D2720DS', 1499, '2020-01-01', '显示器', '亮度  350 cd/m2\r\n点距  0.233\r\n色数  16.7M', '202012/520cbe63-2926-4a6d-a287-8d73d5188a31_戴尔.jpg', 1, 8);
INSERT INTO `t_goods` VALUES (37, '爱度22/24/27/英寸电竞', 499, '2020-01-01', '显示器', '分辨率：1920×1080（全高清）\r\n售后服务：5年质保\r\n响应时间：2ms-4ms\r\n接口：HDMI，VGA', '202012/71f86187-a676-4112-a41b-aa7fb7a67788_爱度.jpg', 1, 5);
INSERT INTO `t_goods` VALUES (38, 'AOC 27英寸', 2099, '2020-01-01', '显示器', '2K IPS 广色域 \r\n155Hz 1ms响应 \r\n10.7亿色 HDR Mode \r\n电竞小金刚', '202012/e257ccc5-1642-4034-b587-39b42636b09a_AOC.jpg', 1, 9);
INSERT INTO `t_goods` VALUES (39, '戴尔S2721', 2999, '2020-01-01', '显示器', '2K Nano IPS 165Hz 1ms响应 FreeSync 电竞小金刚 HDR400 升降 电竞显示器 S2721DGF', '202012/1f2ed759-9b3e-4a8e-b1e3-189b4f297aa0_戴尔S2721.jpg', 1, 10);
INSERT INTO `t_goods` VALUES (40, '小米10 至尊纪念版', 5599, '2020-01-01', '手机', '双模5G 骁龙865 120HZ高刷新率 120倍长焦镜头 120W快充', '202012/4dea3057-d848-466f-a90c-aab89e4d979c_小米10.jpg', 1, 8);
INSERT INTO `t_goods` VALUES (41, 'iPhone 12 Pro', 8499, '2020-01-01', '手机', '(A2408) 128GB 银色 支持移动联通电信5G 双卡双待手', '202012/7c6a7082-9149-4444-a55c-79d9c558c0fa_iphone.jpg', 1, 10);
INSERT INTO `t_goods` VALUES (42, 'vivo Y52s 5G', 1798, '2020-01-01', '手机', '8GB+128GB 莫奈彩 5000mAh大电池 4800万影', '202012/98f6baa4-b713-4494-91c2-882776b19226_vovi.jpg', 1, 2);
INSERT INTO `t_goods` VALUES (43, '华为 HUAWEI P40 Pro', 6488, '2020-01-01', '手机', '麒麟990 5G SoC芯片 5000万超感知徕卡四摄 50倍数字变焦', '202012/b0ff05ac-1547-47dd-9b75-a2549801ec4e_华为.jpg', 1, 7);
INSERT INTO `t_goods` VALUES (44, 'OPPO Reno4 Pro', 3799, '2020-01-01', '手机', '65W超级闪充 7.6mm超轻薄设计 双模5G 8GB+128GB 晶钻蓝', '202012/6050db37-5111-4bf3-8cd5-69bbb7ac6d34_oppo.jpg', 1, 8);

-- ----------------------------
-- Table structure for t_goodstype
-- ----------------------------
DROP TABLE IF EXISTS `t_goodstype`;
CREATE TABLE `t_goodstype`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `grade` int NULL DEFAULT NULL COMMENT '1或2',
  `parentName` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `flag` int NULL DEFAULT NULL COMMENT '1有效 2无效',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_goodstype
-- ----------------------------
INSERT INTO `t_goodstype` VALUES (1, '笔记本电脑', 1, NULL, 1);
INSERT INTO `t_goodstype` VALUES (2, '显示器', 1, NULL, 1);
INSERT INTO `t_goodstype` VALUES (3, '手机', 1, NULL, 1);
INSERT INTO `t_goodstype` VALUES (4, '饼干糕点', 1, NULL, 1);
INSERT INTO `t_goodstype` VALUES (5, '休闲零食', 1, NULL, 1);
INSERT INTO `t_goodstype` VALUES (7, '酒水饮料', 1, NULL, 1);

-- ----------------------------
-- Table structure for t_order
-- ----------------------------
DROP TABLE IF EXISTS `t_order`;
CREATE TABLE `t_order`  (
  `id` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `uaid` int NULL DEFAULT NULL,
  `uid` int NULL DEFAULT NULL,
  `createtime` datetime DEFAULT NULL,
  `money` bigint NULL DEFAULT NULL,
  `flag` int NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_order
-- ----------------------------
INSERT INTO `t_order` VALUES ('20181125221443438917ca6e3-0e7f-4341-a7e9-e949a06dd290', 1, 4, '2018-11-25 22:14:43', 8800, 1);
INSERT INTO `t_order` VALUES ('20181201213246884eb150e3a-2195-4fef-b275-8d49f5b02fbe', 2, 7, '2018-12-01 21:32:46', 140600000, 1);
INSERT INTO `t_order` VALUES ('20181201213404004b8fce4b9-99cc-410b-9474-97c5a316995b', 2, 7, '2018-12-01 21:34:04', 140600000, 1);
INSERT INTO `t_order` VALUES ('201812012147219217deb537c-2ed5-443f-8857-8fb413a9e320', 2, 7, '2018-12-01 21:47:21', 88000, 1);
INSERT INTO `t_order` VALUES ('2020121119340915025c5b15e-4f0c-4d1d-8172-504df5221251', 3, 8, '2020-12-11 19:34:09', 16700, 1);
INSERT INTO `t_order` VALUES ('202012190040260155347f386-3f78-4581-9034-8c6409e0b2b7', 3, 8, '2020-12-19 00:40:26', 44999, 1);
INSERT INTO `t_order` VALUES ('20201219004545235d92748de-c3f4-4364-b527-f5b189a8a34a', 3, 8, '2020-12-19 00:45:45', 44999, 1);

-- ----------------------------
-- Table structure for t_orderdetail
-- ----------------------------
DROP TABLE IF EXISTS `t_orderdetail`;
CREATE TABLE `t_orderdetail`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `gid` int NULL DEFAULT NULL,
  `oid` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `money` bigint NULL DEFAULT NULL,
  `num` int NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_orderdetail
-- ----------------------------
INSERT INTO `t_orderdetail` VALUES (1, 2, '20181125221443438917ca6e3-0e7f-4341-a7e9-e949a06dd290', 8800, 1);
INSERT INTO `t_orderdetail` VALUES (2, 11, '20181201213246884eb150e3a-2195-4fef-b275-8d49f5b02fbe', 39600000, 4);
INSERT INTO `t_orderdetail` VALUES (3, 6, '20181201213246884eb150e3a-2195-4fef-b275-8d49f5b02fbe', 101000000, 1);
INSERT INTO `t_orderdetail` VALUES (4, 11, '20181201213404004b8fce4b9-99cc-410b-9474-97c5a316995b', 39600000, 4);
INSERT INTO `t_orderdetail` VALUES (5, 6, '20181201213404004b8fce4b9-99cc-410b-9474-97c5a316995b', 101000000, 1);
INSERT INTO `t_orderdetail` VALUES (6, 10, '201812012147219217deb537c-2ed5-443f-8857-8fb413a9e320', 88000, 1);
INSERT INTO `t_orderdetail` VALUES (7, 6, '2020121119340915025c5b15e-4f0c-4d1d-8172-504df5221251', 1010000, 1);
INSERT INTO `t_orderdetail` VALUES (8, 1, '2020121119340915025c5b15e-4f0c-4d1d-8172-504df5221251', 660000, 1);
INSERT INTO `t_orderdetail` VALUES (9, 31, '202012190040260155347f386-3f78-4581-9034-8c6409e0b2b7', 44999, 1);
INSERT INTO `t_orderdetail` VALUES (10, 31, '20201219004545235d92748de-c3f4-4364-b527-f5b189a8a34a', 4499900, 1);

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `role` int NULL DEFAULT NULL COMMENT '角色类型 0管理员 1会员',
  `username` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `email` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sex` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `createtime` datetime DEFAULT NULL,
  `flag` int NULL DEFAULT NULL COMMENT '标记位  1未激活  2有效  3临时无效 4永久无效',
  `activatecode` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES (1, 0, 'admin', '21232f297a57a5a743894a0e4a801fc3', 'admin', '男', '2018-11-25 17:22:22', 2, NULL);
INSERT INTO `t_user` VALUES (7, 1, 'student', '202cb962ac59075b964b07152d234b70', 'it_feri@163.com', '男', '2018-11-30 09:22:37', 2, '20181130092237424214');
INSERT INTO `t_user` VALUES (8, 0, 'banana', 'e10adc3949ba59abbe56e057f20f883e', '123456@qq.com', '男', '2020-12-09 19:19:25', 2, '20201209191925458346');
INSERT INTO `t_user` VALUES (9, 1, 'test', '202cb962ac59075b964b07152d234b70', '123@qq.com', '女', '2020-12-10 00:43:10', 2, '202012100043105903ab');

-- ----------------------------
-- Table structure for t_useraddress
-- ----------------------------
DROP TABLE IF EXISTS `t_useraddress`;
CREATE TABLE `t_useraddress`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `phone` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `detail` varchar(150) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `uid` int NULL DEFAULT NULL,
  `flag` int NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_useraddress
-- ----------------------------
INSERT INTO `t_useraddress` VALUES (1, 'Feri', '18515990152', '河南省郑州市二七区海为科技园千锋郑州校区', 4, 1);
INSERT INTO `t_useraddress` VALUES (2, '千锋教育', '18515990152', '海为科技园', 7, 1);
INSERT INTO `t_useraddress` VALUES (3, 'anana B', '1568131325', '1543120.', 8, 1);
INSERT INTO `t_useraddress` VALUES (4, NULL, NULL, NULL, 8, 1);
INSERT INTO `t_useraddress` VALUES (5, NULL, NULL, NULL, 8, 1);
INSERT INTO `t_useraddress` VALUES (6, NULL, NULL, NULL, 8, 1);
INSERT INTO `t_useraddress` VALUES (7, NULL, NULL, NULL, 8, 1);
INSERT INTO `t_useraddress` VALUES (8, NULL, NULL, NULL, 8, 1);
INSERT INTO `t_useraddress` VALUES (9, NULL, NULL, NULL, 8, 1);
INSERT INTO `t_useraddress` VALUES (10, NULL, NULL, NULL, 8, 1);
INSERT INTO `t_useraddress` VALUES (11, NULL, NULL, NULL, 8, 1);
INSERT INTO `t_useraddress` VALUES (12, NULL, NULL, NULL, 8, 1);
INSERT INTO `t_useraddress` VALUES (13, NULL, NULL, NULL, 8, 1);

SET FOREIGN_KEY_CHECKS = 1;
