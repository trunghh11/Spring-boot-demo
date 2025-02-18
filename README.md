# Spring Boot – Spring Data JPA

## Thông tin sinh viên 
- Họ và tên: Nguyễn Tiến Trung
- MSSV: 22024527

## Giới thiệu 
Dự án này là một ứng dụng REST API đơn giản sử dụng Spring Boot, Spring Data JPA, và MySQL. Ứng dụng cung cấp API để quản lý thông tin nhân viên, bao gồm thêm, lấy danh sách, tìm theo ID và xóa nhân viên.

## Công nghệ sử dụng: 
- Spring Boot 2.6.1
- Spring Data JPA
- MySQL
- Hibernate
- Maven
- Java 11+

## Cấu trúc thư mục 
spring-jpa-demo
## Cấu trúc thư mục 

- **spring-jpa-demo/**
  - **src/**
    - **main/**
      - **java/com.example/**
        - **controller/**  
        - **modal/**  
        - **repository/** 
        - **service/**
        - **SpringJpaDemoApplication.java**  
      - **resources/**
        - **application.properties** 
    - **test/**
  - **pom.xml**
  - **README.md** 

## API Endpoints

| HTTP Method | Endpoint                 | Chức năng                     |
|------------|--------------------------|-------------------------------|
| POST       | `/employee/`             | Thêm danh sách nhân viên      |
| GET        | `/employee/findall`      | Lấy danh sách tất cả nhân viên |
| GET        | `/employee/findbyid/{id}` | Lấy nhân viên theo ID         |
| DELETE     | `/employee/delete`       | Xóa tất cả dữ liệu            |


## Demo 
![image](https://github.com/user-attachments/assets/62af9127-ce47-49af-9866-f69cacfa5f19)
