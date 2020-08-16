/*
 Navicat Premium Data Transfer

 Source Server         : 本地
 Source Server Type    : MySQL
 Source Server Version : 50726
 Source Host           : localhost:3306
 Source Schema         : cms_middle

 Target Server Type    : MySQL
 Target Server Version : 50726
 File Encoding         : 65001

 Date: 16/08/2020 15:01:57
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for smtp_send_log
-- ----------------------------
DROP TABLE IF EXISTS `smtp_send_log`;
CREATE TABLE `smtp_send_log` (
  `id` bigint(22) NOT NULL,
  `created_time` datetime DEFAULT NULL COMMENT '创建时间',
  `updated_time` datetime DEFAULT NULL COMMENT '更新时间',
  `message` varchar(2000) DEFAULT NULL COMMENT '发送内容',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `send_to` varchar(255) DEFAULT NULL COMMENT '收件人',
  `send_form` varchar(255) DEFAULT NULL COMMENT '发送人',
  `subject` varchar(255) DEFAULT NULL COMMENT '主题',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of smtp_send_log
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for ym_config
-- ----------------------------
DROP TABLE IF EXISTS `ym_config`;
CREATE TABLE `ym_config` (
  `id` int(22) NOT NULL,
  `secret_key` varchar(255) DEFAULT NULL COMMENT '密钥',
  `app_id` varchar(255) DEFAULT NULL COMMENT '应用Id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ym_config
-- ----------------------------
BEGIN;
INSERT INTO `ym_config` VALUES (1, '264C5A934D8B5740D9150A24D86195F6', '264C5A934D8B5740D9150A24D86195F6');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
