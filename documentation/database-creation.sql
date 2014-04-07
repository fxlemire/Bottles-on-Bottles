CREATE DATABASE IF NOT EXISTS ISProject;
USE ISProject;

SET FOREIGN_KEY_CHECKS = 0;
DROP TABLE product;
DROP TABLE category;
DROP TABLE belongsTo;
SET FOREIGN_KEY_CHECKS = 1;

CREATE TABLE product (
UPC char(12) PRIMARY KEY,
name varchar(128),
size varchar(8),
price varchar(16),
image varchar(128),
age int, /*check*/
description varchar(1024),
country varchar(64),
AOC varchar(64),
percentage real, 
CHECK ((age >= 0 AND age <= 200) OR (age >= 1800 AND age <= 2014)),
CHECK (percentage >= 0 AND percentage <= 100)
);

CREATE TABLE category (
name varchar(64) PRIMARY KEY,
description varchar(1024),
image varchar(128)
);

CREATE TABLE belongsTo (
UPC char(12) REFERENCES product(UPC) ON DELETE CASCADE,
cname varchar(64) REFERENCES category(name) ON DELETE CASCADE,
PRIMARY KEY(UPC)
);

INSERT INTO product VALUES (
    "080480280017",
    "Grey Goose",
    "1 L",
    "85.00",
    "greygoose.jpeg",
    0,
    "In the fine epicurean tradition of France comes a vodka of uncommon brilliance. GREY GOOSE (r) Vodka is distilled from French wheat and is made with spring water rom Gensac that is naturally filtered through champagne limestone. The expertise of the Maitre de Chai ensures an unparalleled smoothness and exceptional taste.",
    "France",belongsto
	"",
    40.00
);

INSERT INTO category VALUES (
    "vodka",
    "Vodka is a distilled beverage composed primarily of water and ethanol, sometimes with traces of impurities and flavorings. Traditionally, vodka is made by the distillation of fermented grains or potatoes, though some modern brands use other substances - such as fruits or sugar.",
    "vodka.jpeg"
);

INSERT INTO belongsTo VALUES (
    "080480280017",
    "vodka"
);

INSERT INTO product VALUES (
    "080432400432",
    "Chivas Regal"
);
