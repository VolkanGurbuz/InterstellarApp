CREATE TABLE `topic_table`
(
    `topic_id`         BIGINT UNSIGNED                           NOT NULL PRIMARY KEY AUTO_INCREMENT,
    `point_of_sale_id` VARCHAR(50)                               NOT NULL,
    `date_created`     TIMESTAMP(3) DEFAULT CURRENT_TIMESTAMP(3) NOT NULL,
    `date_modified`    TIMESTAMP(3) DEFAULT CURRENT_TIMESTAMP(3) NOT NULL ON UPDATE CURRENT_TIMESTAMP(3)
);
