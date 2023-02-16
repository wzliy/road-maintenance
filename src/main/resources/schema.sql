CREATE TABLE IF NOT EXISTS `road_info` (
    `id` int(11) NOT NULL AUTO_INCREMENT,
    `roadName` varchar(255) NULL,
    `address` varchar(255) NULL,
    `location` varchar(255) NULL,
    `discoveryUnit` varchar(255) NULL,
    `discoveryStaff` varchar(255) NULL,
    `dangerDesc` varchar(255) NULL,
    `dangerPhoto` varchar(255) NULL,
    `rectificationStaff` varchar(255) NULL,
    `rectificationUnit` varchar(255) NULL,
    `rectificationTime` varchar(255) NULL,
    `rectificationDesc` varchar(255) NULL,
    `rectificationPhoto` varchar(255) NULL,
    `status` varchar(255) NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;