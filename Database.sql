CREATE DATABASE blog
GO

USE blog
GO

CREATE TABLE roles (
	roleID INT NOT NULL,
	role VARCHAR(20) NOT NULL,
	PRIMARY KEY (roleID)
)

CREATE TABLE account (
	username VARCHAR(40) NOT NULL,
	[password] VARCHAR(40) NOT NULL,
	about VARCHAR(255) DEFAULT ' ',
	roleID INT NOT NULL,
	PRIMARY KEY (username),
	FOREIGN KEY (roleID) REFERENCES roles(roleID)
)

INSERT INTO roles 
VALUES
(1, 'Regular User'),
(2, 'Admin')

INSERT INTO account 
VALUES
('admin', 'admin1',DEFAULT, 2)

SELECT * 
FROM account

SELECT *
FROM roles