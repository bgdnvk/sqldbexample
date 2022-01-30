USE mydb;

CREATE TABLE my_table 
(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL
);

INSERT INTO my_table (name, email) VALUES ("random_name", "random@random.com");
INSERT INTO my_table (name, email) VALUES ("random_name1", "random1@random.com");
INSERT INTO my_table (name, email) VALUES ("random_name2", "random2@random.com");