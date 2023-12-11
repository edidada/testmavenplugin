/*
 Navicat Premium Data Transfer

 Source Server         : 5%Edidadas-ucloud_root
 Source Server Type    : MySQL
 Source Server Version : 50733
 Source Host           : 106.75.209.6:3306
 Source Schema         : springboot

 Target Server Type    : MySQL
 Target Server Version : 50733
 File Encoding         : 65001

 Date: 13/12/2021 23:43:59
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `userName` varchar(255) DEFAULT NULL,
  `passWord` varchar(255) DEFAULT NULL,
  `realName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of user
-- ----------------------------
BEGIN;
INSERT INTO `user` VALUES (1, 'dddddd', 'd', 'd');
INSERT INTO `user` VALUES (2, 'abcd', 'd', 'd');
INSERT INTO `user` VALUES (3, 'abcde', 'd', 'd');
INSERT INTO `user` VALUES (4, 'dd', 'd', 'd');
INSERT INTO `user` VALUES (5, '的', '的', '的');
INSERT INTO `user` VALUES (6, '测试1', '123456', 'dfdf');
INSERT INTO `user` VALUES (7, '测试2', '123456', 'dfdf');
INSERT INTO `user` VALUES (8, '测试3', '123456', 'dfdf');
INSERT INTO `user` VALUES (9, '测试4', '123456', 'dfdf');
INSERT INTO `user` VALUES (10, '测试6', '123456', 'dfdf');
INSERT INTO `user` VALUES (11, '测试5', '123456', 'dfdf');
INSERT INTO `user` VALUES (12, '测试7', '123456', 'dfdf');
INSERT INTO `user` VALUES (13, '测试8', '123456', 'dfdf');
INSERT INTO `user` VALUES (14, '测试9', '123456', 'dfdf');
INSERT INTO `user` VALUES (15, '231', 'sdfs', 'zhangsan');
INSERT INTO `user` VALUES (16, '232', 'sdfs', 'zhangsan');
INSERT INTO `user` VALUES (17, '233', 'sdfs', 'zhangsan');
INSERT INTO `user` VALUES (18, '234', 'sdfs', 'zhangsan');
INSERT INTO `user` VALUES (19, '5123', 'sdfs', 'zhangsan');
INSERT INTO `user` VALUES (20, '12312', 'sdfs', 'zhangsan');
INSERT INTO `user` VALUES (21, '123123', 'sdfs', 'zhangsan');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
