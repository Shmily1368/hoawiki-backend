-- // category_table
-- Migration SQL that makes the change goes here.

CREATE TABLE `categories`
(
    `cat_id`   BIGINT       NOT NULL,
    `cat_name` VARCHAR(255) NOT NULL,
    PRIMARY KEY (`cat_id`)
);

-- //@UNDO
-- SQL to undo the change goes here.

DROP TABLE `categories`;
