﻿CREATE TABLE SINHVIEN
(
ID				INT NOT NULL PRIMARY KEY,
HOTEN			NVARCHAR(50) NULL,
DIACHI			NVARCHAR(50) NULL,
TUOI			INT NULL,
TRANGTHAI		VARCHAR(50) NULL
)

SELECT * FROM SINHVIEN

INSERT INTO SINHVIEN(ID, HOTEN, DIACHI, TUOI, TRANGTHAI) VALUES (3, N'Nguyễn Văn Nam', N'Hà Nội', 20, 'Failed')