DROP TABLE IF EXISTS vc_users;
CREATE TABLE vc_users(
	id serial,
	mail text,
	last_name text,
	first_name text,
	password text
);