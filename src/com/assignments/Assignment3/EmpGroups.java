package com.assignments.Assignment3;

public class EmpGroups {

	public static void main(String[] args) {
		
	//creating object of employee class to use employee id from this employee class
		Employees emp = new Employees();
		
		//creating array of EmployeeName of 3 size and adding employee name to employeeName Array
		String [] EmployeeName = new String [3];
		
		//Adding Employee name to index0 means 1st element
		EmployeeName[0] = emp.empnames;
		
		//Adding Employee name to index1 means 2nd element
		EmployeeName[1] = emp.empnames1;
		
		//Adding Employee name to index2 means 3rd element
		EmployeeName[2] = emp.empnames2;
		
		
	//	Creating Array of EmployeeId of 3 size and adding employees id to employeeName array
		
		int[] EmployeeId = new int[3];
		
		//Adding Employee name to index0 means 1st element
		
		EmployeeId[0] = emp.firstemp;
		
		//Adding Employee name to index1 means 2st element
		EmployeeId[1] = emp.secondemp;
		
		//Adding Employee name to index2 means 3st element
		EmployeeId[2] = emp.thirdemp;
		
		
		
    //Print Employee name bharath and Employee id 1234
		
		System.out.println("EmployeeName:" +EmployeeName[0] +","+ "EmployeeId:" +EmployeeId[0]);
		
		
		
		
		}
		
	}

