CREATE DATABASE IF NOT EXISTS inventory_service;
CREATE TABLE 't_inventory' (
    
  'id' bigint(20) not null AUTO_INCREMENT,
  'sku_code' VARCHAR(255) DEFAULT NULL,
  'quantity' int(11) DEFAULT NULL,
  primary key ('id')
);