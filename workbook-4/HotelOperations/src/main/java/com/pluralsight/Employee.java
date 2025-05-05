package com.pluralsight;

public class Employee {
    private String employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    public Employee(String employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getRegularHours() {
    if (hoursWorked <=40){ //if employee worked less then 40 hours or equal. return all hours as regular time
        return hoursWorked;
    }else {
        return 40; // if employee worked more then 40, only first 40 is regular hours
        }
    }

    public double getOverTimeHours() {
        if (hoursWorked > 40){//checks if employee worked over 40 hours
            return hoursWorked - 40; //taking total number of overtime and subtracting it by 40
        }else {//if its 40 or under, no over time
            return 0;
        }
    }

    public double getTotalPay() {
        double regularPay = getRegularHours() * payRate;

        double overtimePay = getOverTimeHours() * payRate *1.5;//time and a half

        return regularPay + overtimePay;


        /* if(hours worked <= 40) {
        return hoursWorked * payRate;
        }else{
        return (40 * payrate) + ((hours worked - 40) * (payRate * 1.5));
         */
    }
}
