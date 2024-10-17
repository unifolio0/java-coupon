CREATE DATABASE IF NOT EXISTS coupon;

USE coupon;

CREATE TABLE IF NOT EXISTS coupon (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(30) NOT NULL,
    discount_amount INT NOT NULL,
    minimum_order_amount INT NOT NULL,
    category ENUM('FASHION', 'ELECTRONICS', 'FURNITURE', 'FOOD') NOT NULL,
    start_date DATETIME NOT NULL,
    end_date DATETIME NOT NULL,
    created_at DATETIME NOT NULL,
    modified_at DATETIME NOT NULL
);
