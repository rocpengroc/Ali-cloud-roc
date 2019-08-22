/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 50727
 Source Host           : localhost:3306
 Source Schema         : roc

 Target Server Type    : MySQL
 Target Server Version : 50727
 File Encoding         : 65001

 Date: 22/08/2019 17:14:21
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_order
-- ----------------------------
DROP TABLE IF EXISTS `t_order`;
CREATE TABLE `t_order` (
  `id` int(12) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '修改时间',
  `user_id` int(11) DEFAULT NULL COMMENT '用户主键',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_order
-- ----------------------------
BEGIN;
INSERT INTO `t_order` VALUES (1, '2019-08-14 12:02:55', '2019-08-14 12:02:57', 1, '第一单');
INSERT INTO `t_order` VALUES (2, '2019-08-14 12:03:19', '2019-08-14 12:03:21', 2, '第二单');
INSERT INTO `t_order` VALUES (3, '2019-08-14 12:02:55', '2019-08-14 12:02:57', 1, '订单');
INSERT INTO `t_order` VALUES (4, '2019-08-14 12:03:19', '2019-08-14 12:03:21', 2, '订单');
INSERT INTO `t_order` VALUES (5, '2019-08-14 12:02:55', '2019-08-14 12:02:57', 1, '订单');
INSERT INTO `t_order` VALUES (6, '2019-08-14 12:03:19', '2019-08-14 12:03:21', 2, '订单');
INSERT INTO `t_order` VALUES (7, '2019-08-14 12:02:55', '2019-08-14 12:02:57', 1, '订单');
INSERT INTO `t_order` VALUES (8, '2019-08-14 12:03:19', '2019-08-14 12:03:21', 2, '订单');
INSERT INTO `t_order` VALUES (9, '2019-08-14 12:02:55', '2019-08-14 12:02:57', 1, '订单');
INSERT INTO `t_order` VALUES (10, '2019-08-14 12:03:19', '2019-08-14 12:03:21', 2, '订单');
INSERT INTO `t_order` VALUES (11, '2019-08-14 12:02:55', '2019-08-14 12:02:57', 1, '订单');
INSERT INTO `t_order` VALUES (12, '2019-08-14 12:03:19', '2019-08-14 12:03:21', 2, '订单');
INSERT INTO `t_order` VALUES (13, '2019-08-14 12:02:55', '2019-08-14 12:02:57', 1, '订单');
INSERT INTO `t_order` VALUES (14, '2019-08-14 12:03:19', '2019-08-14 12:03:21', 2, '订单');
INSERT INTO `t_order` VALUES (15, '2019-08-14 12:02:55', '2019-08-14 12:02:57', 1, '订单');
INSERT INTO `t_order` VALUES (16, '2019-08-14 12:03:19', '2019-08-14 12:03:21', 2, '订单');
INSERT INTO `t_order` VALUES (17, '2019-08-14 12:02:55', '2019-08-14 12:02:57', 1, '订单');
INSERT INTO `t_order` VALUES (18, '2019-08-14 12:03:19', '2019-08-14 12:03:21', 2, '订单');
INSERT INTO `t_order` VALUES (19, '2019-08-14 12:02:55', '2019-08-14 12:02:57', 1, '订单');
INSERT INTO `t_order` VALUES (20, '2019-08-14 12:03:19', '2019-08-14 12:03:21', 2, '订单');
INSERT INTO `t_order` VALUES (21, '2019-08-14 12:02:55', '2019-08-14 12:02:57', 1, '订单');
INSERT INTO `t_order` VALUES (22, '2019-08-14 12:03:19', '2019-08-14 12:03:21', 2, '订单');
COMMIT;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(12) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(50) DEFAULT NULL COMMENT '名称',
  `age` int(3) DEFAULT NULL COMMENT '年龄',
  `sex` varchar(2) DEFAULT NULL COMMENT '性别',
  `tel` varchar(32) DEFAULT NULL COMMENT '手机号',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
BEGIN;
INSERT INTO `t_user` VALUES (1, '张三', 18, '女', '139', '2019-08-13 22:12:24', '2019-08-13 22:12:27');
INSERT INTO `t_user` VALUES (2, '李四', 20, '男', '186', '2019-08-13 22:12:29', '2019-08-13 22:12:31');
INSERT INTO `t_user` VALUES (3, 'hhh', NULL, NULL, NULL, '2019-08-19 22:38:31', '2019-08-19 22:38:31');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
