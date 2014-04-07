CREATE DATABASE IF NOT EXISTS ISProject;
USE ISProject;

CREATE TABLE IF NOT EXISTS product (
UPC char(12) PRIMARY KEY,
name varchar(128),
size varchar(8),
price varchar(16),
image varchar(128),
age int, /*check*/
description varchar(1024),
country varchar(64),
AOC varchar(64),
percentage int
);

CREATE TABLE IF NOT EXISTS category (
name varchar(64),
description varchar(1024)
);

CREATE TABLE IF NOT EXISTS belongsTo (
UPC char(12) PRIMARY KEY,
cname varchar(64)
);

ALTER TABLE belongsTo ADD FOREIGN KEY (UPC) REFERENCES product(UPC);
ALTER TABLE belongsTo ADD FOREIGN KEY (cname) REFERENCES category(cname);