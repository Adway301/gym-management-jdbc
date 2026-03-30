CREATE DATABASE gym_management;
USE gym_management;

CREATE TABLE members (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50),
    age INT,
    phone VARCHAR(15),
    membership_type VARCHAR(30)
);
select * from members;