# mysql

```
mysql -u root -p

//查看数据库
SHOW DATABASES;

//创建数据库{{aaaa}}
CREATE DATABASE aaaa;

USE aaaa;

CREATE TABLE IF NOT EXISTS aaaa.comment (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nickname VARCHAR(255),
    email VARCHAR(255),
    pinglun TEXT
);
```

