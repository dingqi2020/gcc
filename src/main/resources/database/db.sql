-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        8.0.18 - MySQL Community Server - GPL
-- 服务器OS:                        Win64
-- HeidiSQL 版本:                  10.2.0.5599
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for oasys_db
DROP DATABASE IF EXISTS `oasys_db`;
CREATE DATABASE IF NOT EXISTS `oasys_db` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `oasys_db`;

-- Dumping structure for table oasys_db.user
DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `user_id` varchar(10) NOT NULL COMMENT '用户ID',
  `employ_id` int(5) NOT NULL AUTO_INCREMENT COMMENT '员工号码',
  `password` varchar(10) DEFAULT 'Mtw_123456' COMMENT '密码',
  `user_name` varchar(10) DEFAULT NULL COMMENT '用户名',
  `update_pwd_dt` date DEFAULT NULL COMMENT '上次更新密码时间',
  `login_dt` date DEFAULT NULL COMMENT '上次登录时间',
  `logout_dt` date DEFAULT NULL COMMENT '上次登出时间',
  `status` int(1) DEFAULT '1' COMMENT '用户状态(1：可用 2：禁用 3：已删除)',
  PRIMARY KEY (`employ_id`,`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- Dumping data for table oasys_db.user: ~0 rows (大约)
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (`user_id`, `employ_id`, `password`, `user_name`, `update_pwd_dt`, `login_dt`, `logout_dt`, `status`) VALUES
	('dingq', 2, 'Mtw_123456', '丁其', NULL, NULL, NULL, 1);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;

-- Dumping structure for table oasys_db.user_base_info
DROP TABLE IF EXISTS `user_base_info`;
CREATE TABLE IF NOT EXISTS `user_base_info` (
  `user_id` varchar(10) NOT NULL COMMENT '用户ID',
  `name_jp` varchar(10) DEFAULT NULL COMMENT '用户日文名',
  `sex` int(1) DEFAULT NULL COMMENT '性别',
  `email` varchar(30) DEFAULT NULL COMMENT '邮箱',
  `tel` varchar(11) DEFAULT NULL COMMENT '手机号码',
  `birth` date DEFAULT NULL COMMENT '生日',
  `identity_code` varchar(18) DEFAULT NULL COMMENT '身份证号码',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table oasys_db.user_base_info: ~0 rows (大约)
/*!40000 ALTER TABLE `user_base_info` DISABLE KEYS */;
INSERT INTO `user_base_info` (`user_id`, `name_jp`, `sex`, `email`, `tel`, `birth`, `identity_code`) VALUES
	('dingq', NULL, NULL, NULL, NULL, NULL, NULL);
/*!40000 ALTER TABLE `user_base_info` ENABLE KEYS */;

-- Dumping structure for table oasys_db.user_company_info
DROP TABLE IF EXISTS `user_company_info`;
CREATE TABLE IF NOT EXISTS `user_company_info` (
  `user_id` varchar(10) NOT NULL,
  `department` varchar(50) DEFAULT NULL,
  `leader` varchar(10) DEFAULT NULL,
  `position` varchar(3) DEFAULT NULL,
  `into_company_dt` date DEFAULT NULL,
  `regular_dt` date DEFAULT NULL,
  `maternity_dt` date DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table oasys_db.user_company_info: ~0 rows (大约)
/*!40000 ALTER TABLE `user_company_info` DISABLE KEYS */;
INSERT INTO `user_company_info` (`user_id`, `department`, `leader`, `position`, `into_company_dt`, `regular_dt`, `maternity_dt`) VALUES
	('dingq', NULL, NULL, NULL, NULL, NULL, NULL);
/*!40000 ALTER TABLE `user_company_info` ENABLE KEYS */;

-- Dumping structure for table oasys_db.user_personal_info
DROP TABLE IF EXISTS `user_personal_info`;
CREATE TABLE IF NOT EXISTS `user_personal_info` (
  `user_id` varchar(10) NOT NULL COMMENT '用户ID',
  `party` varchar(10) DEFAULT NULL COMMENT '党派',
  `native_place` varchar(50) DEFAULT NULL COMMENT '籍贯',
  `province` varchar(10) DEFAULT NULL COMMENT '省份',
  `city` varchar(10) DEFAULT NULL COMMENT '市',
  `area` varchar(10) DEFAULT NULL COMMENT '区',
  `address` varchar(50) DEFAULT NULL COMMENT '家庭住址',
  `home_tel` varchar(11) DEFAULT NULL COMMENT '家庭电话',
  `emergency_contact` varchar(10) DEFAULT NULL COMMENT '紧急联系人',
  `emergency_contact_relationship` varchar(10) DEFAULT NULL COMMENT '与紧急联系人关系',
  `emergency_contact_tel` varchar(11) DEFAULT NULL COMMENT '紧急联系电话',
  `graduation_from1` varchar(20) DEFAULT NULL COMMENT '毕业学校1',
  `graduation_dt1` date DEFAULT NULL COMMENT '毕业时间1',
  `major1` varchar(20) DEFAULT NULL COMMENT '专业1',
  `graduation_from2` varchar(20) DEFAULT NULL COMMENT '毕业学校2',
  `graduation_dt2` date DEFAULT NULL COMMENT '毕业时间2',
  `major2` varchar(20) DEFAULT NULL COMMENT '专业2',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table oasys_db.user_personal_info: ~0 rows (大约)
/*!40000 ALTER TABLE `user_personal_info` DISABLE KEYS */;
INSERT INTO `user_personal_info` (`user_id`, `party`, `native_place`, `province`, `city`, `area`, `address`, `home_tel`, `emergency_contact`, `emergency_contact_relationship`, `emergency_contact_tel`, `graduation_from1`, `graduation_dt1`, `major1`, `graduation_from2`, `graduation_dt2`, `major2`) VALUES
	('dingq', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
/*!40000 ALTER TABLE `user_personal_info` ENABLE KEYS */;

-- Dumping structure for trigger oasys_db.user_baseinfo_after_delete
DROP TRIGGER IF EXISTS `user_baseinfo_after_delete`;
SET @OLDTMP_SQL_MODE=@@SQL_MODE, SQL_MODE='STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION';
DELIMITER //
CREATE TRIGGER `user_baseinfo_after_delete` AFTER DELETE ON `user` FOR EACH ROW BEGIN
	DELETE FROM user_base_info WHERE user_id = OLD.user_id;
END//
DELIMITER ;
SET SQL_MODE=@OLDTMP_SQL_MODE;

-- Dumping structure for trigger oasys_db.user_baseinfo_after_insert
DROP TRIGGER IF EXISTS `user_baseinfo_after_insert`;
SET @OLDTMP_SQL_MODE=@@SQL_MODE, SQL_MODE='STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION';
DELIMITER //
CREATE TRIGGER `user_baseinfo_after_insert` AFTER INSERT ON `user` FOR EACH ROW BEGIN
	INSERT user_base_info(user_id) values (NEW.user_id);
END//
DELIMITER ;
SET SQL_MODE=@OLDTMP_SQL_MODE;

-- Dumping structure for trigger oasys_db.user_companyinfo_after_delete
DROP TRIGGER IF EXISTS `user_companyinfo_after_delete`;
SET @OLDTMP_SQL_MODE=@@SQL_MODE, SQL_MODE='STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION';
DELIMITER //
CREATE TRIGGER `user_companyinfo_after_delete` AFTER DELETE ON `user` FOR EACH ROW BEGIN
	DELETE FROM user_company_info WHERE user_id = OLD.user_id;
END//
DELIMITER ;
SET SQL_MODE=@OLDTMP_SQL_MODE;

-- Dumping structure for trigger oasys_db.user_companyinfo_after_insert
DROP TRIGGER IF EXISTS `user_companyinfo_after_insert`;
SET @OLDTMP_SQL_MODE=@@SQL_MODE, SQL_MODE='STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION';
DELIMITER //
CREATE TRIGGER `user_companyinfo_after_insert` AFTER INSERT ON `user` FOR EACH ROW BEGIN
	INSERT user_company_info(user_id) values (NEW.user_id);
END//
DELIMITER ;
SET SQL_MODE=@OLDTMP_SQL_MODE;

-- Dumping structure for trigger oasys_db.user_personalinfo_after_delete
DROP TRIGGER IF EXISTS `user_personalinfo_after_delete`;
SET @OLDTMP_SQL_MODE=@@SQL_MODE, SQL_MODE='STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION';
DELIMITER //
CREATE TRIGGER `user_personalinfo_after_delete` AFTER DELETE ON `user` FOR EACH ROW BEGIN
	DELETE FROM user_personal_info WHERE user_id = OLD.user_id;
END//
DELIMITER ;
SET SQL_MODE=@OLDTMP_SQL_MODE;

-- Dumping structure for trigger oasys_db.user_personalinfo_after_insert
DROP TRIGGER IF EXISTS `user_personalinfo_after_insert`;
SET @OLDTMP_SQL_MODE=@@SQL_MODE, SQL_MODE='STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION';
DELIMITER //
CREATE TRIGGER `user_personalinfo_after_insert` AFTER INSERT ON `user` FOR EACH ROW BEGIN
 	INSERT INTO user_personal_info(user_id) values (NEW.user_id);
END//
DELIMITER ;
SET SQL_MODE=@OLDTMP_SQL_MODE;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
