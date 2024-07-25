package net.media.training.live.srp;

public class Employee{

    private int empId;
    private static int TOTAL_LEAVES_ALLOWED = 30;

    private double monthlySalary;
    private String name;
    private String addressStreet;
    private String addressCity;
    private String addressCountry;
    private int leavesTaken;
    private int totalLeaveAllowed;
    private int leaveTaken;
    private String manager;
    private int yearsInOrg;
    private int thisYeard;
    private int[] leavesLeftPreviously;


    public Employee(int empId, double monthlySalary, String name, String addressStreet, String addressCity, String addressCountry, int leavesTaken, int[] leavesLeftPreviously) {
        this.empId = empId;
        this.monthlySalary = monthlySalary;
        this.name = name;
        this.addressStreet = addressStreet;
        this.addressCity = addressCity;
        this.addressCountry = addressCountry;
        this.leavesTaken = leavesTaken;
        this.leavesLeftPreviously = leavesLeftPreviously;
        this.yearsInOrg = leavesLeftPreviously.length;
    }

    public Employee() {
    }

    public int getempId(){
        return empId;
    }

    public String getname(){
        return name;
    }

    public int gettotalLeaveAllowed(){
        return totalLeaveAllowed;
    }

    public int getleaveTaken(){
        return leaveTaken;
    }

    public double getmonthlySalary(){
        return monthlySalary;
    }

    public String getmanager(){
        return manager;
    }

    public int getyearsInOrg(){
        return yearsInOrg;
    }

    public int[] getleavesLeftPreviously(){
        return leavesLeftPreviously;
    }
}

