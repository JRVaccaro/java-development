-- Question 1
SELECT COUNT(*)
FROM northwind.Suppliers;

-- Question 2
SELECT SUM(Salary) 
FROM northwind.employees;

-- Question 3
select min(unitPrice)
FROM northwind.products;

-- Question 4
SELECT avg(unitPrice) 
FROM northwind.products;

-- Question 5
select max(unitPrice)
from northwind.products;

-- Question 6
SELECT SupplierID, COUNT(*) AS NumberOfProducts
FROM northwind.Products
GROUP BY SupplierID;