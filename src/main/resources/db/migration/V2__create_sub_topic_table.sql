CREATE TABLE `sub_topic_table`
(
    `sub_topic_id`   BIGINT UNSIGNED                           NOT NULL PRIMARY KEY AUTO_INCREMENT,
    `sub_topic_name` VARCHAR(100)                              NOT NULL,
    `date_created`   TIMESTAMP(3) DEFAULT CURRENT_TIMESTAMP(3) NOT NULL,
    `date_modified`  TIMESTAMP(3) DEFAULT CURRENT_TIMESTAMP(3) NOT NULL ON UPDATE CURRENT_TIMESTAMP(3)

);
