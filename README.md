create database sandbox character set utf8;
grant all privileges on sandbox.* to 'user'@'localhost' identified by 'sandbox' with grant option;
grant all privileges on sandbox.* to 'user'@'%' identified by 'sandbox' with grant option;
