package com.bridgelabz;

public class EmployeeWageCompuataionUsingOOPS {

	public static void main(String[] args){
		checkAttendance employee = new checkAttendance();
		employee.isPresent();
	    }
	}

class checkAttendance extends calculateWage{
	//Constants
	int IS_FULL_TIME = 1;
	//Computation
    	double empCheck = Math.floor(Math.random() * 10) % 2;
    	void isPresent(){
        if ( empCheck == IS_FULL_TIME )
            System.out.println("Employee is Present !");
	    System.out.println("Wage is "+dailyWage());	
            System.out.println("Employee is Absent !");
    }
}

//Wage computation 
class calculateWage {
    	final int wagePerHr = 20;
    	final int workHr = 8;
    	int dailyWage(){
        return wagePerHr * workHr;
    }
}
