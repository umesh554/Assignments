package com.assignments;

public class Assignment2 {
	
	// 1) Create a 3D array TO Represent DATA
	
	
	/* 2) From the Array
	 * Print Semester 3 - Suject4 and subject 5 Names.
	 * Print Semester 5- Subject 3 and subject 6 marks */

	public static void main(String[] args) {
		String [][][] ClassData = {
				{ 
					{"Mathematics","Physics","Chemistry","Computer Programming","Engineering Drawing","Basic Electrical Eng."},
					{"78","85","91","74","88","79"}
				},
				{
					{"Mathematics 2","Mechanics","Environmental Sci.","Basic Electronics","Engineering Physics","Engineering Graphics"},
					{"82","77","93","69","84","90"}
				},
				{
					{"Data Structure","Discrete Mathematics","Digital Electronics","operating systems","signals and systems","object-oriented prog."},
					{"88","81","76","92","85","78"}
					
				},
				{
					{"Algorithms","computer ntework","database system","microprocessors","communication engg,","software engineering"},
					{"91","73","89","80","76","87"}
				},
				{
					{"probability & states","machine learning","compiler design","theory of compilation","embedded systems","computer graphics"},
					{"86","88","84","95","73","90"}
				}
				
				
		};
		
		System.out.println(ClassData[2][0][3]);
		System.out.println(ClassData[2][0][4]);
		System.out.println(ClassData[4][0][2]);
		System.out.println(ClassData[4][1][5]);
				
		}

	}







