-- Question 1
USE Northwind;
INSERT INTO Suppliers(SupplierID, CompanyName, ContactName, ContactTitle, Address, City, Region, PostalCode, Country, Phone, Fax, HomePage)
VALUES (30, 'Potato Company','John TaterMan','Manager','223 Tater Rd','TaterVille','US', '123','USA','111-111-1111','13423', 'WebsiteLink');

-- Question 2
INSERT INTO Products(ProductID, ProductName, SupplierID, CategoryID, UnitPrice)
VALUES (80, 'TaterLaser', 30, 2344, 10000)

-- Question 3