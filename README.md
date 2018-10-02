# Springboot v2

## Create user mysql

```mysql
# connect to root
mysql -h 127.0.0.1 -u root -p
# create user
create user bootcamp identified by 'bootcamp';
# grant user
grant all privileges on *.* to bootcamp@'%' identified by 'bootcamp';
# database bootcamp;
create database bootcamp;
```