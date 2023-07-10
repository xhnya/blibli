/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 50735
 Source Host           : localhost:3306
 Source Schema         : bilibili_admin

 Target Server Type    : MySQL
 Target Server Version : 50735
 File Encoding         : 65001

 Date: 10/07/2023 09:25:19
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for dict_data
-- ----------------------------
DROP TABLE IF EXISTS `dict_data`;
CREATE TABLE `dict_data`  (
  `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `dict_code` bigint(20) NULL DEFAULT NULL COMMENT '字典编码',
  `dict_sort` int(4) NULL DEFAULT 0 COMMENT '字典排序',
  `dict_label` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '字典标签',
  `dict_value` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '字典键值',
  `dict_type` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '字典类型',
  `css_class` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '样式属性（其他样式扩展）',
  `list_class` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '表格回显样式',
  `is_default` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT 'N' COMMENT '是否默认（Y是 N否）',
  `dict_data_status` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT '状态（1正常 0停用）',
  `create_by` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建者',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `update_by` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新者',
  `remark` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '字典数据表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of dict_data
-- ----------------------------

-- ----------------------------
-- Table structure for dict_type
-- ----------------------------
DROP TABLE IF EXISTS `dict_type`;
CREATE TABLE `dict_type`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `dict_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '字典名称	',
  `dict_type` bigint(20) NULL DEFAULT NULL COMMENT '字典类型	',
  `dict_type_status` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '状态（1正常 0停用）	',
  `create_by` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `create_time` datetime NULL DEFAULT NULL,
  `update_by` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `update_time` datetime NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '字典类型' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of dict_type
-- ----------------------------

-- ----------------------------
-- Table structure for page_images
-- ----------------------------
DROP TABLE IF EXISTS `page_images`;
CREATE TABLE `page_images`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `image_url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '图片url',
  `des` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '描述',
  `type` int(5) NULL DEFAULT NULL COMMENT '图片位置',
  `show_status` int(2) NULL DEFAULT 0 COMMENT '显示状态 0，不显示，1显示',
  `status` int(2) NULL DEFAULT 1,
  `update_id` bigint(20) NULL DEFAULT NULL,
  `update_time` datetime NULL DEFAULT NULL,
  `create_time` datetime NULL DEFAULT NULL,
  `sort` int(5) NULL DEFAULT NULL COMMENT '排序',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 100 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of page_images
-- ----------------------------
INSERT INTO `page_images` VALUES (1, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'lXaMRMvcU5', 10001, 0, 0, 201, '2000-04-16 14:50:49', '2014-11-13 05:57:28', NULL);
INSERT INTO `page_images` VALUES (2, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'QflbZZCKpS', 10001, 0, 1, 407, '2018-05-13 21:44:32', '2010-07-20 13:35:51', NULL);
INSERT INTO `page_images` VALUES (3, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'raNvBwSWus', 10001, 0, 1, 675, '2001-07-22 03:42:04', '2014-07-01 11:30:29', NULL);
INSERT INTO `page_images` VALUES (4, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'JfNVO58NkT', 10001, 0, 1, 240, '2001-10-06 13:32:36', '2014-09-22 02:28:33', NULL);
INSERT INTO `page_images` VALUES (5, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'H6xTKb2fXk', 10001, 0, 1, 489, '2017-08-02 16:43:29', '2003-08-02 19:54:31', NULL);
INSERT INTO `page_images` VALUES (6, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', '0WhL15ioFG', 10001, 0, 1, 317, '2002-07-09 21:29:20', '2011-06-22 20:15:38', NULL);
INSERT INTO `page_images` VALUES (7, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'cTEOAfIuzi', 10001, 0, 0, 64, '2001-12-23 08:38:09', '2011-06-10 06:36:22', NULL);
INSERT INTO `page_images` VALUES (8, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'XHXSS1hyW6', 10001, 0, 0, 181, '2001-03-30 15:10:20', '2020-07-23 09:33:19', NULL);
INSERT INTO `page_images` VALUES (9, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'WKi8HHhreq', 10001, 0, 0, 623, '2006-08-18 14:28:29', '2006-01-21 06:12:25', NULL);
INSERT INTO `page_images` VALUES (10, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'EmxY7IoPyJ', 10001, 0, 1, 900, '2007-11-25 08:37:15', '2004-02-08 20:14:04', NULL);
INSERT INTO `page_images` VALUES (11, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'CmhuBstWHf', 10001, 0, 1, 469, '2020-05-19 01:56:15', '2022-06-01 07:39:18', NULL);
INSERT INTO `page_images` VALUES (12, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', '6wcz9MPgsr', 10001, 0, 1, 664, '2002-05-25 03:00:52', '2017-05-24 14:05:38', NULL);
INSERT INTO `page_images` VALUES (13, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'knzOAaQMqC', 10001, 0, 1, 793, '2013-04-19 09:12:37', '2011-10-30 07:41:24', NULL);
INSERT INTO `page_images` VALUES (14, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', '1RmDcQpMQG', 10001, 0, 0, 256, '2005-09-24 18:29:58', '2005-06-10 20:40:59', NULL);
INSERT INTO `page_images` VALUES (15, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', '0SmNAc7IIJ', 10001, 0, 1, 310, '2020-11-14 19:31:10', '2018-10-11 09:54:44', NULL);
INSERT INTO `page_images` VALUES (16, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'O1Wo8jACdB', 10001, 0, 1, 533, '2001-02-05 10:50:48', '2008-12-12 01:31:29', NULL);
INSERT INTO `page_images` VALUES (17, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', '4mLbnu8vNX', 10001, 0, 1, 866, '2006-07-21 21:14:03', '2020-01-15 17:54:54', NULL);
INSERT INTO `page_images` VALUES (18, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'RBOUyr9iIX', 10001, 0, 1, 780, '2012-02-10 06:03:27', '2018-04-08 00:14:33', NULL);
INSERT INTO `page_images` VALUES (19, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'MpPX07sLXr', 10001, 0, 0, 903, '2016-08-12 08:53:37', '2015-10-19 21:39:27', NULL);
INSERT INTO `page_images` VALUES (20, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', '8xYsyuS4lk', 10001, 0, 0, 798, '2007-06-23 19:06:17', '2017-10-25 18:24:33', NULL);
INSERT INTO `page_images` VALUES (21, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'dbet5EskSV', 10001, 0, 1, 765, '2000-05-19 03:03:46', '2012-05-13 10:50:36', NULL);
INSERT INTO `page_images` VALUES (22, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', '6RtfuwmEzY', 10001, 0, 1, 746, '2019-10-30 15:02:50', '2017-12-20 20:33:39', NULL);
INSERT INTO `page_images` VALUES (23, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'tzSrfnt8ge', 10001, 0, 1, 139, '2005-03-14 05:16:29', '2022-10-19 06:33:02', NULL);
INSERT INTO `page_images` VALUES (24, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', '8imjByC2nD', 10001, 0, 1, 766, '2013-04-19 17:00:49', '2017-03-03 06:51:42', NULL);
INSERT INTO `page_images` VALUES (25, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'ubXgjLllKQ', 10001, 0, 0, 580, '2019-05-08 18:08:02', '2002-02-03 12:12:19', NULL);
INSERT INTO `page_images` VALUES (26, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'IqxAyuRMfX', 10001, 0, 0, 731, '2018-01-28 18:44:19', '2013-12-04 17:28:48', NULL);
INSERT INTO `page_images` VALUES (27, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'bNJgX1TRwQ', 10001, 0, 1, 713, '2016-04-09 20:01:27', '2011-10-15 18:02:54', NULL);
INSERT INTO `page_images` VALUES (28, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', '6vM5U1Twrz', 10001, 0, 1, 406, '2007-11-23 13:02:04', '2006-06-15 16:56:11', NULL);
INSERT INTO `page_images` VALUES (29, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'HEkXS4auJ2', 10001, 0, 1, 702, '2015-06-23 15:50:04', '2004-04-11 19:20:26', NULL);
INSERT INTO `page_images` VALUES (30, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'zOtR2ZYFaC', 10001, 0, 0, 572, '2021-04-10 14:47:30', '2002-03-13 18:04:43', NULL);
INSERT INTO `page_images` VALUES (31, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'pK2v2sCa0f', 10001, 0, 0, 956, '2021-09-16 03:02:57', '2012-05-28 23:28:15', NULL);
INSERT INTO `page_images` VALUES (32, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'djEfH9swFW', 10001, 0, 1, 656, '2018-06-25 20:07:48', '2020-05-10 01:33:32', NULL);
INSERT INTO `page_images` VALUES (33, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'h61QjKoDJx', 10001, 0, 1, 537, '2016-03-31 13:21:47', '2022-01-09 20:03:38', NULL);
INSERT INTO `page_images` VALUES (34, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'l0DM22ZjQz', 10001, 0, 0, 713, '2003-08-18 19:31:02', '2017-07-04 22:39:53', NULL);
INSERT INTO `page_images` VALUES (35, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 's8GspPoIWo', 10001, 0, 0, 231, '2012-06-10 02:35:41', '2018-01-01 16:00:44', NULL);
INSERT INTO `page_images` VALUES (36, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'oaYQGqRND3', 10001, 0, 0, 187, '2001-11-05 06:27:17', '2001-07-31 16:53:04', NULL);
INSERT INTO `page_images` VALUES (37, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'PJug1eE6Dx', 10001, 0, 0, 295, '2017-05-17 04:45:46', '2005-07-09 23:37:38', NULL);
INSERT INTO `page_images` VALUES (38, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'lAYYlnBoYJ', 10001, 0, 0, 685, '2018-06-24 00:41:40', '2014-02-18 12:47:27', NULL);
INSERT INTO `page_images` VALUES (39, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'cE2loBKvBP', 10001, 0, 0, 471, '2008-05-30 06:27:59', '2012-04-24 12:02:00', NULL);
INSERT INTO `page_images` VALUES (40, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'qSME2NrZ0x', 10001, 0, 1, 990, '2019-05-14 23:13:26', '2008-05-30 23:47:26', NULL);
INSERT INTO `page_images` VALUES (41, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'eJZbTCJy7v', 10001, 0, 0, 939, '2017-08-07 19:17:56', '2012-09-05 15:03:37', NULL);
INSERT INTO `page_images` VALUES (42, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'nnh8jAFB2x', 10001, 0, 0, 408, '2007-02-21 22:46:35', '2017-12-20 14:04:30', NULL);
INSERT INTO `page_images` VALUES (43, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'PZhUrffnE5', 10001, 0, 1, 675, '2004-05-17 19:10:54', '2012-09-04 02:24:44', NULL);
INSERT INTO `page_images` VALUES (44, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'XQ1ze6AtDK', 10001, 0, 1, 496, '2018-09-07 19:42:26', '2023-02-07 18:16:25', NULL);
INSERT INTO `page_images` VALUES (45, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'AOqvDU5Q7P', 10001, 0, 1, 862, '2002-11-12 01:36:14', '2008-11-12 13:54:31', NULL);
INSERT INTO `page_images` VALUES (46, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'xqX4et1ET4', 10001, 0, 1, 668, '2019-06-12 07:50:11', '2011-10-29 19:52:51', NULL);
INSERT INTO `page_images` VALUES (47, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'RzXSIxUzeI', 10001, 0, 0, 18, '2017-05-16 17:18:08', '2000-02-24 10:30:22', NULL);
INSERT INTO `page_images` VALUES (48, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'N3eZkb46im', 10001, 0, 0, 457, '2001-11-18 08:11:28', '2006-08-18 08:03:20', NULL);
INSERT INTO `page_images` VALUES (49, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'FCLZghENiZ', 10001, 0, 1, 209, '2009-11-14 23:15:11', '2002-10-19 09:08:25', NULL);
INSERT INTO `page_images` VALUES (50, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'VPODFqUsAh', 10001, 0, 1, 503, '2003-02-13 22:29:29', '2009-03-13 07:21:46', NULL);
INSERT INTO `page_images` VALUES (51, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', '2C5JF9ZjaM', 10001, 0, 1, 89, '2006-04-17 12:58:16', '2011-11-10 17:40:30', NULL);
INSERT INTO `page_images` VALUES (52, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'tUmfKSpQrr', 10001, 0, 0, 603, '2012-03-17 00:26:10', '2002-04-07 19:12:20', NULL);
INSERT INTO `page_images` VALUES (53, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'mJgLKVQzp0', 10001, 0, 1, 428, '2012-08-25 08:19:14', '2009-01-18 16:17:27', NULL);
INSERT INTO `page_images` VALUES (54, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', '866ROJc9O2', 10001, 0, 0, 393, '2007-09-04 02:36:15', '2000-04-30 19:52:55', NULL);
INSERT INTO `page_images` VALUES (55, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'sAnREA1DPF', 10001, 0, 0, 117, '2016-09-29 10:21:02', '2004-05-20 06:56:58', NULL);
INSERT INTO `page_images` VALUES (56, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'LkvzU8ZOjO', 10001, 0, 1, 924, '2016-12-17 22:12:49', '2019-02-25 01:52:35', NULL);
INSERT INTO `page_images` VALUES (57, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', '5wKhS0z2sr', 10001, 0, 0, 783, '2016-06-18 21:58:09', '2018-09-11 18:51:41', NULL);
INSERT INTO `page_images` VALUES (58, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'sn33qJibqn', 10001, 0, 0, 838, '2012-03-21 21:01:53', '2015-08-05 16:10:54', NULL);
INSERT INTO `page_images` VALUES (59, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'ilG61BGHEn', 10001, 0, 0, 696, '2020-06-17 15:44:15', '2008-06-06 09:46:55', NULL);
INSERT INTO `page_images` VALUES (60, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'jDNH0bB3YM', 10001, 0, 1, 511, '2004-07-29 17:21:09', '2006-12-07 21:18:15', NULL);
INSERT INTO `page_images` VALUES (61, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'ngBouT6tjD', 10001, 0, 0, 966, '2004-03-28 12:39:28', '2011-03-08 06:55:47', NULL);
INSERT INTO `page_images` VALUES (62, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'NqWBQySSIA', 10001, 0, 0, 453, '2008-03-05 00:37:49', '2016-10-16 00:51:02', NULL);
INSERT INTO `page_images` VALUES (63, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'jqh6IXZOqE', 10001, 0, 0, 574, '2016-07-14 12:38:47', '2010-02-25 07:41:51', NULL);
INSERT INTO `page_images` VALUES (64, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'mR1giwhS8b', 10001, 0, 0, 538, '2001-08-08 21:07:36', '2013-09-04 18:52:33', NULL);
INSERT INTO `page_images` VALUES (65, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'MVc9Cs8Z0E', 10001, 0, 1, 671, '2013-09-25 10:41:29', '2010-12-23 15:10:01', NULL);
INSERT INTO `page_images` VALUES (66, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'BsEvz7HozO', 10001, 0, 0, 934, '2020-01-04 00:52:11', '2015-06-01 14:27:05', NULL);
INSERT INTO `page_images` VALUES (67, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'Xl6H9POwzF', 10001, 0, 1, 666, '2007-05-31 18:45:28', '2002-04-25 05:05:59', NULL);
INSERT INTO `page_images` VALUES (68, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'omJvo86Wvz', 10001, 0, 1, 911, '2012-11-03 11:19:15', '2007-11-28 23:21:35', NULL);
INSERT INTO `page_images` VALUES (69, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'SyGnJeydB6', 10001, 0, 0, 76, '2021-01-21 01:19:32', '2017-12-12 07:05:43', NULL);
INSERT INTO `page_images` VALUES (70, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', '9JRLqgVECL', 10001, 0, 0, 469, '2013-02-04 15:47:26', '2021-11-14 03:35:34', NULL);
INSERT INTO `page_images` VALUES (71, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'a8vM5lHk2K', 10001, 0, 0, 191, '2009-11-14 05:47:56', '2016-06-08 15:48:05', NULL);
INSERT INTO `page_images` VALUES (72, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'ES9jAP2Vg7', 10001, 0, 0, 666, '2002-08-07 19:48:41', '2018-02-06 12:36:26', NULL);
INSERT INTO `page_images` VALUES (73, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'oKC8tOGkFx', 10001, 0, 1, 605, '2020-06-19 07:36:26', '2016-11-05 14:53:29', NULL);
INSERT INTO `page_images` VALUES (74, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'TeyIgAP7GY', 10001, 0, 1, 176, '2016-08-18 21:09:37', '2004-06-29 20:13:07', NULL);
INSERT INTO `page_images` VALUES (75, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', '7Z0HJ7ZoJd', 10001, 0, 1, 194, '2003-11-30 22:11:06', '2002-02-14 09:23:04', NULL);
INSERT INTO `page_images` VALUES (76, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', '25XRx3Lbs0', 10001, 0, 0, 131, '2015-05-23 03:22:06', '2000-11-01 15:36:49', NULL);
INSERT INTO `page_images` VALUES (77, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'IP0iVOm2FE', 10001, 0, 1, 828, '2016-02-25 11:29:55', '2021-03-10 08:22:47', NULL);
INSERT INTO `page_images` VALUES (78, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'UnEd2uV0SU', 10001, 0, 1, 69, '2010-01-14 08:38:50', '2009-11-19 09:03:11', NULL);
INSERT INTO `page_images` VALUES (79, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'PXojbiA89E', 10001, 0, 1, 596, '2019-03-22 14:53:16', '2001-09-08 18:04:27', NULL);
INSERT INTO `page_images` VALUES (80, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'EXq7VNPUtH', 10001, 0, 1, 815, '2015-10-07 04:19:36', '2019-12-12 00:24:58', NULL);
INSERT INTO `page_images` VALUES (81, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'PXMkHqVkEL', 10001, 0, 0, 472, '2016-05-28 03:55:49', '2003-06-10 05:48:24', NULL);
INSERT INTO `page_images` VALUES (82, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'Fxesltztc7', 10001, 0, 0, 189, '2005-05-03 05:42:25', '2006-07-21 19:15:24', NULL);
INSERT INTO `page_images` VALUES (83, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'svj6U7rqEl', 10001, 0, 0, 297, '2013-02-04 10:52:04', '2000-04-16 12:34:09', NULL);
INSERT INTO `page_images` VALUES (84, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', '6lmEAB0FjK', 10001, 0, 1, 847, '2000-04-09 10:04:46', '2020-08-21 14:36:59', NULL);
INSERT INTO `page_images` VALUES (85, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'OFCBLcpKLk', 10001, 0, 0, 263, '2002-06-03 09:50:39', '2014-10-27 23:14:56', NULL);
INSERT INTO `page_images` VALUES (86, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', '81ifVwx1cu', 10001, 0, 0, 486, '2018-01-21 21:57:17', '2014-08-13 22:40:02', NULL);
INSERT INTO `page_images` VALUES (87, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'FvDH3Jm0GA', 10001, 0, 0, 972, '2014-05-04 19:33:33', '2007-02-07 20:04:35', NULL);
INSERT INTO `page_images` VALUES (88, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', '8KCnIIOnBc', 10001, 0, 0, 190, '2002-05-05 17:16:51', '2018-08-06 20:22:15', NULL);
INSERT INTO `page_images` VALUES (89, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'crinl05Lkw', 10001, 0, 1, 1, '2015-07-14 18:35:54', '2008-03-07 12:23:45', NULL);
INSERT INTO `page_images` VALUES (90, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'WXInalmP1P', 10001, 0, 1, 999, '2000-06-25 22:46:19', '2016-06-25 16:52:29', NULL);
INSERT INTO `page_images` VALUES (91, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'gagag(String)', 10001, 0, 0, 201, NULL, NULL, 1);
INSERT INTO `page_images` VALUES (92, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'gagag(String)', 10001, 0, 0, 201, NULL, NULL, 1);
INSERT INTO `page_images` VALUES (93, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'gagag(String)', 10001, 1, 0, 201, NULL, NULL, 1);
INSERT INTO `page_images` VALUES (94, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'gagag', 10001, 1, 0, 201, NULL, NULL, 1);
INSERT INTO `page_images` VALUES (95, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'gagag', 10001, 1, 1, 201, NULL, NULL, 1);
INSERT INTO `page_images` VALUES (96, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'gagag', 10001, 1, 0, 201, '2023-04-12 09:48:31', '2023-04-12 09:48:31', 1);
INSERT INTO `page_images` VALUES (97, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'gagag', 10001, 1, 0, 201, '2023-04-12 09:50:24', '2023-04-12 09:50:24', 1);
INSERT INTO `page_images` VALUES (98, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'test', 10002, 1, 1, NULL, '2023-04-12 10:29:13', '2023-04-12 10:29:13', 2);
INSERT INTO `page_images` VALUES (99, 'https://xhnya.oss-cn-hangzhou.aliyuncs.com/2023/04/18/2f24a59c28ce4127b34c6188f2a6519820221012_214449.bmp', 'test', 10002, 1, 1, NULL, '2023-04-18 09:31:04', '2023-04-18 09:31:04', 1);

-- ----------------------------
-- Table structure for page_position
-- ----------------------------
DROP TABLE IF EXISTS `page_position`;
CREATE TABLE `page_position`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '名称',
  `code` int(20) NULL DEFAULT NULL,
  `sort` int(10) NULL DEFAULT NULL,
  `status` int(5) NULL DEFAULT NULL,
  `create_time` datetime NULL DEFAULT NULL,
  `update_time` datetime NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '门户位置表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of page_position
-- ----------------------------

SET FOREIGN_KEY_CHECKS = 1;
