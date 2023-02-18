CREATE TABLE IF NOT EXISTS `road_info` (
    `id` int(11) NOT NULL AUTO_INCREMENT,
    `road_name` varchar(255) NULL,
    `address` varchar(255) NULL,
    `location` varchar(255) NULL,
    `discovery_unit` varchar(255) NULL,
    `discovery_staff` varchar(255) NULL,
    `danger_desc` varchar(255) NULL,
    `danger_photo` varchar(255) NULL,
    `rectification_staff` varchar(255) NULL,
    `rectification_unit` varchar(255) NULL,
    `rectification_time` varchar(255) NULL,
    `rectification_desc` varchar(255) NULL,
    `rectification_photo` varchar(255) NULL,
    `status` varchar(255) NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;