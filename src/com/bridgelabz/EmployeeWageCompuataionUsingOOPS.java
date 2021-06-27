package com.bridgelabz;

public class EmployeeWageCompuataionUsingOOPS {

	public static void main(String[] args){
		checkAttendance employee = new checkAttendance();
		employee.isPresent();
	    }
	}

class checkAttendance extends calculateWage{
	//Computation
	int check;
	static int days = 0;
	static int workHrs = 0;
	static int totalWorkHrs = 0;
void isPresent(){
    int wage = 0;
    int totalWage = 0;
    while ( days != 20 && totalWorkHrs <= 100 ) {
        days++;
        System.out.println(days);
        check = (int)(Math.floor(Math.random() * 10) % 3);
        switch(check) {
            case 0:
                workHrs = 8;
                break;
            case 1:
                workHrs = 4;
                break;
            default:
                workHrs = 0;
                break;
        }
        totalWorkHrs = totalWorkHrs + workHrs;
        wage = dailyWage(workHrs);
        totalWage = totalWage + wage;
    }
    System.out.println("Total earning of employee for a month is "+totalWage);
}
}
            
            
//Wage computation 
class calculateWage {
    	final int wagePerHr = 20;
    	int dailyWage(int workHr){
    		return wagePerHr * workHr;
        }
    }