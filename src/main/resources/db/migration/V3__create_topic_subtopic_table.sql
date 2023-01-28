CREATE TABLE `topic_subtopic_table`
(
    `topic_id` BIGINT UNSIGNED NOT NULL ,
    `sub_topic_id` BIGINT UNSIGNED NOT NULL,
    CONSTRAINT topic_table_topic_id_fk FOREIGN KEY (topic_id) REFERENCES topic_table(topic_id),
    CONSTRAINT sub_topic_table_sub_topic_id_fk FOREIGN KEY (sub_topic_id) REFERENCES sub_topic_table(sub_topic_id),
    UNIQUE (topic_id, sub_topic_id)

);
