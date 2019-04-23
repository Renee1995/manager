
DROP TABLE IF EXISTS `t_sys_menu`;
CREATE TABLE `t_sys_menu` (
  `id` varchar(12) NOT NULL COMMENT 'id',
  `menu_name` varchar(50) DEFAULT NULL COMMENT '菜单名称',
  `menu_url` varchar(80) DEFAULT NULL COMMENT '菜单路径',
  `parent_id` varchar(12) DEFAULT NULL COMMENT '父级菜单',
  `menu_level` int(2) DEFAULT NULL COMMENT '菜单等级',
  `sort` int(4) DEFAULT NULL COMMENT '排序',
  `icon` varchar(50) DEFAULT NULL COMMENT '图标',
  `menu_describe` varchar(200) DEFAULT NULL COMMENT '菜单描述',
  `is_enable` char(1) DEFAULT 'Y' COMMENT '是否启用(Y: 启用 N:未启用)',
  `is_remove` tinyint(1) DEFAULT '0' COMMENT '是否删除(0:未删除，1:已删除)',
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `create_id` varchar(32) DEFAULT NULL,
  `update_id` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='菜单表';

-- ----------------------------
-- Records of t_sys_menu
-- ----------------------------

INSERT INTO `t_sys_menu` VALUES ('M000001', '系统设置', NULL, NULL, 1, 1, NULL, NULL, 'Y', 0, NULL, NULL, NULL, NULL);
INSERT INTO `t_sys_menu` VALUES ('M000002', '个人资料', NULL, NULL, 1, 2, NULL, NULL, 'Y', 0, NULL, NULL, NULL, NULL);
INSERT INTO `t_sys_menu` VALUES ('M000003', '用户管理', '/user/userPage', 'M000001', 2, 2, NULL, NULL, 'Y', 0, NULL, NULL, NULL, NULL);


-- ----------------------------
-- Table structure for t_sys_role
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_role`;
CREATE TABLE `t_sys_role` (
  `id` varchar(12) NOT NULL COMMENT 'id',
  `role_name` varchar(60) DEFAULT NULL COMMENT '角色名称',
  `role_describe` varchar(100) DEFAULT NULL COMMENT '角色描述',
  `is_enable` char(1) DEFAULT 'Y' COMMENT '是否启用(Y: 启用 N:未启用)',
  `is_remove` tinyint(1) DEFAULT '0' COMMENT '是否删除(0:未删除，1:已删除)',
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `create_id` varchar(32) DEFAULT NULL,
  `update_id` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色表';

-- ----------------------------
-- Records of t_sys_role
-- ----------------------------

INSERT INTO `t_sys_role` VALUES ('R000001', 'ROLE_ADMIN', '超级管理员', 'Y', 0, NULL, NULL, NULL, NULL);
INSERT INTO `t_sys_role` VALUES ('R000002', 'ROLE_USER', '用户', 'Y', 0, NULL, NULL, NULL, NULL);


-- ----------------------------
-- Table structure for t_sys_role_menu
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_role_menu`;
CREATE TABLE `t_sys_role_menu` (
  `id` varchar(32) NOT NULL COMMENT 'id',
  `role_id` varchar(12) DEFAULT NULL COMMENT '角色id',
  `menu_id` varchar(12) DEFAULT NULL COMMENT '菜单id',
  `is_remove` tinyint(1) DEFAULT '0' COMMENT '是否删除(0:未删除，1:已删除)',
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `create_id` varchar(32) DEFAULT NULL,
  `update_id` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色菜单关系表';

-- ----------------------------
-- Records of t_sys_role_menu
-- ----------------------------

INSERT INTO `t_sys_role_menu` VALUES ('1', 'R000001', 'M000001', 0, NULL, NULL, NULL, NULL);
INSERT INTO `t_sys_role_menu` VALUES ('2', 'R000001', 'M000002', 0, NULL, NULL, NULL, NULL);
INSERT INTO `t_sys_role_menu` VALUES ('3', 'R000001', 'M000003', 0, NULL, NULL, NULL, NULL);
INSERT INTO `t_sys_role_menu` VALUES ('4', 'R000002', 'M000002', 0, NULL, NULL, NULL, NULL);


-- ----------------------------
-- Table structure for t_sys_user
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_user`;
CREATE TABLE `t_sys_user` (
  `id` varchar(12) NOT NULL COMMENT '用户id',
  `username` varchar(50) DEFAULT NULL COMMENT '登录名',
  `password` varchar(32) DEFAULT NULL COMMENT '登录密码',
  `phone` varchar(11) DEFAULT NULL COMMENT '手机号码',
  `realname` varchar(30) DEFAULT NULL COMMENT '真实姓名',
  `sex` int(2) DEFAULT NULL COMMENT '用户性别 0:男 1:女',
  `email` varchar(50) DEFAULT NULL COMMENT '用户邮箱',
  `head_image` varchar(200) DEFAULT NULL COMMENT '用户头像',
  `introduction` varchar(500) DEFAULT NULL COMMENT '介绍',
  `is_enable` char(1) DEFAULT 'Y' COMMENT '是否启用(Y: 启用 N:未启用)',
  `is_remove` tinyint(1) DEFAULT '0' COMMENT '是否删除(0:未删除，1:已删除)',
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `create_id` varchar(32) DEFAULT NULL,
  `update_id` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Records of t_sys_user
-- ----------------------------

INSERT INTO `t_sys_user` VALUES ('U000000001', 'admin', '6d789d4353c72e4f625d21c6b7ac2982', '13521094573', '婉欣', 1, '634337473@qq.com', 'https://wx.qlogo.cn/mmopen/vi_32/LHjyLq39p3xZgKwcDJCySFEgjQLVBN41kRIFdzYWemmic8BfhmOw2iakpFnS84Hrro0E95bUOnWHiaqdTfhxsBNqA/132', NULL, 'Y', 0, '2019-02-28 14:47:39', NULL, NULL, NULL);
INSERT INTO `t_sys_user` VALUES ('U000000002', 'wanwan', '6d789d4353c72e4f625d21c6b7ac2982', '13521094573', '婉欣', 1, '634337473@qq.com', 'https://wx.qlogo.cn/mmopen/vi_32/LHjyLq39p3xZgKwcDJCySFEgjQLVBN41kRIFdzYWemmic8BfhmOw2iakpFnS84Hrro0E95bUOnWHiaqdTfhxsBNqA/132', NULL, 'Y', 0, '2019-02-28 14:47:39', NULL, NULL, NULL);


-- ----------------------------
-- Table structure for t_sys_user_role
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_user_role`;
CREATE TABLE `t_sys_user_role` (
  `id` varchar(32) NOT NULL COMMENT 'id',
  `user_id` varchar(12) DEFAULT NULL COMMENT '用户id',
  `role_id` varchar(12) DEFAULT NULL COMMENT '角色id',
  `is_remove` tinyint(1) DEFAULT '0' COMMENT '是否删除(0:未删除，1:已删除)',
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `create_id` varchar(32) DEFAULT NULL,
  `update_id` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户角色关系表';

-- ----------------------------
-- Records of t_sys_user_role
-- ----------------------------

INSERT INTO `t_sys_user_role` VALUES ('1', 'U000000001', 'R000001', 0, NULL, NULL, NULL, NULL);
INSERT INTO `t_sys_user_role` VALUES ('2', 'U000000001', 'R000002', 0, NULL, NULL, NULL, NULL);
INSERT INTO `t_sys_user_role` VALUES ('3', 'U000000002', 'R000002', 0, NULL, NULL, NULL, NULL);


-- ----------------------------
-- Table structure for t_user_login_record
-- ----------------------------
DROP TABLE IF EXISTS `t_user_login_record`;
CREATE TABLE `t_user_login_record` (
  `id` varchar(32) NOT NULL COMMENT 'id',
  `user_id` varchar(50) DEFAULT NULL COMMENT '用户id',
  `login_ip` varchar(50) DEFAULT NULL COMMENT '登录IP',
  `login_devic` varchar(50) DEFAULT NULL COMMENT '登录设备',
  `login_address` varchar(50) DEFAULT NULL COMMENT '登录地址',
  `login_coordinate` varchar(64) DEFAULT NULL COMMENT '登录地经纬度',
  `is_remove` tinyint(1) DEFAULT '0' COMMENT '是否删除(0:未删除，1:已删除)',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间(登录时间)',
  `update_time` datetime DEFAULT NULL,
  `create_id` varchar(32) DEFAULT NULL,
  `update_id` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户登录记录表';

-- ----------------------------
-- Records of t_user_login_record
-- ----------------------------

INSERT INTO `t_user_login_record` VALUES ('111111', 'U000000001', '219.143.170.146', 'MacBook Pro', '海淀五路居·玲珑天地', '116.283232,39.937916', 0, '2019-02-28 14:51:05', NULL, 'U000000001', NULL);
INSERT INTO `t_user_login_record` VALUES ('121111', 'U000000001', '219.143.170.146', 'MacBook Pro', '海淀五路居·玲珑天地', '116.283232,39.937916', 0, '2019-02-27 14:51:05', NULL, 'U000000001', NULL);


