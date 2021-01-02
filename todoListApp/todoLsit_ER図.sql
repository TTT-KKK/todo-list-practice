SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS todoListdb.task;
DROP TABLE IF EXISTS todoListdb.m_priority;
DROP TABLE IF EXISTS todoListdb.users;




/* Create Tables */

CREATE TABLE todoListdb.m_priority
(
	priority_id int(1) NOT NULL AUTO_INCREMENT,
	priority_name varchar(10) NOT NULL,
	PRIMARY KEY (priority_id)
) ENGINE = InnoDB DEFAULT CHARACTER SET utf8;


CREATE TABLE todoListdb.task
(
	task_id bigint NOT NULL AUTO_INCREMENT,
	task_name varchar(60) NOT NULL,
	task_end_at timestamp NOT NULL,
	task_memo varchar(6000),
	priority_id int(1) NOT NULL,
	created_at timestamp NOT NULL,
	created_by varchar(128) NOT NULL,
	updated_at timestamp,
	updated_by varchar(128),
	-- 現状では必須にしない
	-- ユーザ実装を考えるときに外部キーとして必要
	user_id bigint COMMENT '現状では必須にしない
ユーザ実装を考えるときに外部キーとして必要',
	is_done tinyint,
	PRIMARY KEY (task_id)
) ENGINE = InnoDB DEFAULT CHARACTER SET utf8;


CREATE TABLE todoListdb.users
(
	user_id bigint NOT NULL AUTO_INCREMENT,
	user_last_name varchar(64) NOT NULL,
	user_first_name varchar(64) NOT NULL,
	user_mailaddress varchar(255) NOT NULL,
	password varchar(64) DEFAULT '' NOT NULL,
	is_admin tinyint NOT NULL,
	created_at timestamp NOT NULL,
	created_by varchar(128) NOT NULL,
	updated_at timestamp,
	updated_by varchar(128),
	PRIMARY KEY (user_id)
) ENGINE = InnoDB DEFAULT CHARACTER SET utf8;



/* Create Foreign Keys */

ALTER TABLE todoListdb.task
	ADD FOREIGN KEY (priority_id)
	REFERENCES todoListdb.m_priority (priority_id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



