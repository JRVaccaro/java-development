-- Question 1
USE northwind;
SELECT Products.ProductID, Products.ProductName, Products.UnitPrice, Categories.CategoryName
FROM Products
JOIN Categories 
ON Products.CategoryID = Categories.CategoryID
ORDER BY  Categories.CategoryName, Products.ProductName;

-- Question 2
SELECT Products.ProductID, Products.ProductName, Products.UnitPrice, Suppliers.CompanyName
FROM Products
JOIN Suppliers
ON Products.SupplierID = Suppliers.SupplierID
WHERE Products.UnitPrice > 75
ORDER BY Products.ProductName;

-- Question 3
SELECT Products.ProductID, Products.ProductName, Products.UnitPrice, Categories.CategoryName, Suppliers.CompanyName
FROM Products
JOIN Categories 
ON Products.CategoryID = Categories.CategoryID
JOIN Suppliers 
ON Products.SupplierID = Suppliers.SupplierID
ORDER BY Products.ProductName;

-- Question 4