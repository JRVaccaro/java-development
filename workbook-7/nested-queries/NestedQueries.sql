-- Question 1
SELECT ProductName, UnitPrice
FROM northwind.Products
WHERE UnitPrice = (
SELECT MAX(UnitPrice)
FROM northwind.Products
);

-- Question 2
SELECT OrderID, ShipName, ShipAddress
FROM northwind.Orders
WHERE ShipVia = (
    SELECT ShipperID
    FROM northwind.Shippers
    WHERE CompanyName = 'Federal Shipping'
    );
    
    -- Question 3
    SELECT OrderID
    FROM 'Order Details'
    WHERE ProductID = (
    SELECT ProductID
    FROM Products
    WHERE ProductName = "Sasquatch Ale"
    );
    
    -- Question 4
    SELECT  FirstName, LastName
    FROM Employees
    WHERE  EnployeeID = (
    SELECT EmployeeID
    FROM Orders
    WHERE OrderID = "10266"
    );
    
    -- Question 5