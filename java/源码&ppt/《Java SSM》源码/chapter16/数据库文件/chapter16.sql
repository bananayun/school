-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: chapter16
-- ------------------------------------------------------
-- Server version	5.7.18-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `t_cart`
--

DROP TABLE IF EXISTS `t_cart`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_cart` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) DEFAULT NULL,
  `money` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_cart`
--

LOCK TABLES `t_cart` WRITE;
/*!40000 ALTER TABLE `t_cart` DISABLE KEYS */;
INSERT INTO `t_cart` VALUES (1,4,0),(2,5,0),(3,6,0),(4,7,0);
/*!40000 ALTER TABLE `t_cart` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_cartdetail`
--

DROP TABLE IF EXISTS `t_cartdetail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_cartdetail` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cid` int(11) DEFAULT NULL,
  `gid` int(11) DEFAULT NULL,
  `num` int(11) DEFAULT NULL,
  `money` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_cartdetail`
--

LOCK TABLES `t_cartdetail` WRITE;
/*!40000 ALTER TABLE `t_cartdetail` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_cartdetail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_goods`
--

DROP TABLE IF EXISTS `t_goods`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_goods` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `price` bigint(20) DEFAULT NULL,
  `pubdate` date DEFAULT NULL,
  `typeName` varchar(20) DEFAULT NULL,
  `intro` varchar(200) DEFAULT NULL,
  `picture` varchar(150) DEFAULT NULL,
  `flag` int(11) DEFAULT NULL COMMENT '1上架 2下架',
  `star` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_goods`
--

LOCK TABLES `t_goods` WRITE;
/*!40000 ALTER TABLE `t_goods` DISABLE KEYS */;
INSERT INTO `t_goods` VALUES (1,'可可可乐',6600,'2018-11-25','酒水饮料','巴厘岛原装进口 百事可乐(Pepsi) blue 蓝色可乐 网红可乐汽水饮料 450ml*4瓶装','201811/7b001eee-38df-4c66-9a0f-350879007402_js1.jpg',1,5),(2,'易拉罐可可可乐',8800,'2018-11-25','酒水饮料','日本原装进口 可口可乐(Coca-Cola)碳酸饮料 500ml*6罐，味道谁喝谁知道！','201811/f65d85f4-a622-4f6b-bbdf-2e354d7b0737_js2.jpg',1,5),(3,'干红',99900,'2018-11-25','酒水饮料','自营张裕（CHANGYU）红酒 张裕干红葡萄酒750ml*6瓶（彩龙版），','201811/fa61ef77-4adc-4895-962b-fcb084e3e809_js3.jpg',1,4),(4,'进口红酒',99900,'2018-11-25','酒水饮料','法国进口红酒 拉菲（LAFITE）传奇波尔多干红葡萄酒 双支礼盒装带酒具 750ml*2瓶','201811/cb233c79-2f18-4f97-afad-0d2079098345_js4.jpg',1,3),(5,'草莓饼干',8800,'2018-11-25','饼干糕点','土斯（Totaste） 葡萄味夹层饼干（含葡萄果粒） 休闲零食蛋糕甜点心 实惠分享装360g','201811/afdd4cd4-9782-46a5-96ed-0ba3c4036379_bg1.jpg',1,5),(6,'蔬菜棒',10100,'2018-11-25','饼干糕点','土斯（Totaste） 混合蔬菜味棒形饼干 酥脆可口 独立包装 休闲零食蛋糕甜点心小吃 128g','201811/8bdbdb3f-4cb6-4af8-9c6f-183411537726_bg2.jpg',1,4),(7,'曲奇',24400,'2018-11-25','饼干糕点','丹麦进口 皇冠（danisa）丹麦曲奇精选礼盒装908g(新老包装随机发货)','201811/db2a101d-600a-44c5-8d0f-0a3b173f81aa_bg3.jpg',1,5),(8,'夹心饼干',6600,'2018-11-25','饼干糕点','马来西亚原装进口 茱蒂丝Julie\'s雷蒙德巧克力榛果夹心饼干180g×2','201811/3b047c04-6b23-491d-bf9c-5405cf36c308_bg4.jpg',1,5),(9,'玉米棒',1800,'2018-11-25','休闲零食','印尼进口 Nabati 丽芝士（Richeese）雅嘉 休闲零食 奶酪味 玉米棒 400g/盒 早餐下午茶','201811/287f1938-f039-4d24-9942-3c8a456d757b_ls1.jpg',1,5),(10,'千层酥',880,'2018-11-25','休闲零食','葡韵手信 澳门特产 休闲零食 传统糕点小吃 千层酥150g 新旧包装随机发货','201811/7570a0dc-eacb-4b61-9085-966ac322172f_ls2.jpg',1,5),(11,'海苔',990,'2018-11-25','休闲零食','泰国原装进口休闲零食 老板仔 超大片烤海苔脆紫菜 经典原味 54g/袋（新老包装随机发货）','201811/62c5370b-2f32-450f-ba4c-401a004d5270_ls3.jpg',1,5),(12,'提子干',4400,'2018-11-25','休闲零食','三只松鼠无核白葡萄干蜜饯果干休闲食品新疆特产提子干120g/袋','201811/4e807511-5515-4ec8-9e20-41e8f49ece66_ls4.jpg',1,5),(13,'青岛啤酒',11800,'2018-11-25','酒水饮料','青岛啤酒（TsingTao） 青岛啤酒经典10度 500ml*24听，好喝又实惠！','201811/555da004-a18c-4fa9-9f23-094551928831_js5.jpg',1,5),(14,'手撕面包',1880,'2018-11-25','饼干糕点','三只松鼠 手撕面包1000g整箱装零食大礼包口袋面包孕妇零食早餐食品生日蛋糕小糕点点心礼盒装','201811/12a3f75c-8ddd-41d8-862f-93f342e5e41e_bg5.png',1,5),(15,'开心果',3200,'2018-11-25','休闲零食','满199减120三只松鼠 开心果100g坚果炒货零食每日坚果 1袋装','201811/d468a868-a7b8-4ad6-bde1-124e23c66437_ls5.jpg',1,5);
/*!40000 ALTER TABLE `t_goods` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_goodstype`
--

DROP TABLE IF EXISTS `t_goodstype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_goodstype` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `level` int(11) DEFAULT NULL COMMENT '1或2',
  `parentName` varchar(20) DEFAULT NULL,
  `flag` int(11) DEFAULT NULL COMMENT '1有效 2无效',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_goodstype`
--

LOCK TABLES `t_goodstype` WRITE;
/*!40000 ALTER TABLE `t_goodstype` DISABLE KEYS */;
INSERT INTO `t_goodstype` VALUES (1,'酒水饮料',1,NULL,1),(2,'饼干糕点',1,NULL,1),(3,'休闲零食',1,NULL,1),(4,'喂养用品',1,NULL,1),(5,'洗护用品',1,NULL,1),(6,'美妆个护',1,NULL,1);
/*!40000 ALTER TABLE `t_goodstype` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_order`
--

DROP TABLE IF EXISTS `t_order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_order` (
  `id` varchar(100) NOT NULL,
  `uaid` int(11) DEFAULT NULL,
  `uid` int(11) DEFAULT NULL,
  `createtime` datetime DEFAULT NULL,
  `money` bigint(20) DEFAULT NULL,
  `flag` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_order`
--

LOCK TABLES `t_order` WRITE;
/*!40000 ALTER TABLE `t_order` DISABLE KEYS */;
INSERT INTO `t_order` VALUES ('20181125221443438917ca6e3-0e7f-4341-a7e9-e949a06dd290',1,4,'2018-11-25 22:14:43',8800,1),('20181201213246884eb150e3a-2195-4fef-b275-8d49f5b02fbe',2,7,'2018-12-01 21:32:46',140600000,1),('20181201213404004b8fce4b9-99cc-410b-9474-97c5a316995b',2,7,'2018-12-01 21:34:04',140600000,1),('201812012147219217deb537c-2ed5-443f-8857-8fb413a9e320',2,7,'2018-12-01 21:47:21',88000,1);
/*!40000 ALTER TABLE `t_order` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_orderdetail`
--

DROP TABLE IF EXISTS `t_orderdetail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_orderdetail` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `gid` int(11) DEFAULT NULL,
  `oid` varchar(100) DEFAULT NULL,
  `money` bigint(20) DEFAULT NULL,
  `num` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_orderdetail`
--

LOCK TABLES `t_orderdetail` WRITE;
/*!40000 ALTER TABLE `t_orderdetail` DISABLE KEYS */;
INSERT INTO `t_orderdetail` VALUES (1,2,'20181125221443438917ca6e3-0e7f-4341-a7e9-e949a06dd290',8800,1),(2,11,'20181201213246884eb150e3a-2195-4fef-b275-8d49f5b02fbe',39600000,4),(3,6,'20181201213246884eb150e3a-2195-4fef-b275-8d49f5b02fbe',101000000,1),(4,11,'20181201213404004b8fce4b9-99cc-410b-9474-97c5a316995b',39600000,4),(5,6,'20181201213404004b8fce4b9-99cc-410b-9474-97c5a316995b',101000000,1),(6,10,'201812012147219217deb537c-2ed5-443f-8857-8fb413a9e320',88000,1);
/*!40000 ALTER TABLE `t_orderdetail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_user`
--

DROP TABLE IF EXISTS `t_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role` int(11) DEFAULT NULL COMMENT '角色类型 0管理员 1会员',
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `gender` varchar(2) DEFAULT NULL,
  `createtime` datetime DEFAULT NULL,
  `flag` int(11) DEFAULT NULL COMMENT '标记位  1未激活  2有效  3临时无效 4永久无效',
  `activatecode` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_user`
--

LOCK TABLES `t_user` WRITE;
/*!40000 ALTER TABLE `t_user` DISABLE KEYS */;
INSERT INTO `t_user` VALUES (1,1,'admin','21232f297a57a5a743894a0e4a801fc3','admin','男','2018-11-25 17:22:22',2,NULL),(7,1,'student','202cb962ac59075b964b07152d234b70','it_feri@163.com','男','2018-11-30 09:22:37',2,'20181130092237424214');
/*!40000 ALTER TABLE `t_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_useraddress`
--

DROP TABLE IF EXISTS `t_useraddress`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_useraddress` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `detail` varchar(150) DEFAULT NULL,
  `uid` int(11) DEFAULT NULL,
  `flag` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_useraddress`
--

LOCK TABLES `t_useraddress` WRITE;
/*!40000 ALTER TABLE `t_useraddress` DISABLE KEYS */;
INSERT INTO `t_useraddress` VALUES (1,'Feri','18515990152','河南省郑州市二七区海为科技园千锋郑州校区',4,1),(2,'千锋教育','18515990152','海为科技园',7,1);
/*!40000 ALTER TABLE `t_useraddress` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-12-01 22:59:30
