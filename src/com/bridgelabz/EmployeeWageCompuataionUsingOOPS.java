package com.bridgelabz;

public class EmployeeWageCompuataionUsingOOPS {

	public static void main(String[] args){
		checkAttendance employee = new checkAttendance();
		employee.isPresent();
	    }
	}

class checkAttendance extends calculateWage{
	//Computation
    	double empCheck = Math.floor(Math.random() * 10) % 3;
        void isPresent(){
        int check = 0;
		if ( check == 0 ) {
            System.out.println("Employee is Present for full time !");
            System.out.println("Wage is "+dailyWage(8));
        }
        else if ( check == 1 ) {
            System.out.println("Employee is Present for part time !");
            System.out.println("Wage is "+dailyWage(4));
        }
        else
            System.out.println("Employee is Absent !");
}
}

//Wage computation 
class calculateWage {
    	final int wagePerHr = 20;
    	int dailyWage(int workHr){
    		return wagePerHr * workHr;
        }
    }