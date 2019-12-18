CREATE TABLE `user` (
	`username` VARCHAR(10) NOT NULL DEFAULT '' COMMENT '用户名',
	`password` VARCHAR(10) NOT NULL DEFAULT 'Mtw_123456' COMMENT '密码',
	`userid` INT(5) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
	`updatepwddt` DATE NULL DEFAULT NULL COMMENT '密码更新时间',
	`logindt` DATE NULL DEFAULT NULL COMMENT '上次登录时间',
	`logoutdt` DATE NULL DEFAULT NULL COMMENT '上次登出时间',
	`status` INT(1) NULL DEFAULT '1' COMMENT '用户状态(1：可用)(2：不可用)',
	PRIMARY KEY (`userid`, `username`, `password`)
)
COLLATE='utf8_general_ci'
ENGINE=InnoDB
;
