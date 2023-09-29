import java.util.*;
//import java.io.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create an int array called ages that contains {3, 9 , 23 , 64 , 2 , 8 , 28 , 93}
		ArrayList<Integer> ages = new ArrayList<Integer>();
		ages.add(3);
		ages.add(9);
		ages.add(23);
		ages.add(64);
		ages.add(2);
		ages.add(8);
		ages.add(28);
		ages.add(93);
		System.out.println("Original Array ages BEFORE subtracting first element from last  : " + ages);
		ages.set(ages.size()-1 , ages.get(0) - ages.get(ages.size()-1) );
		System.out.println("Original Array ages AFTER subtracting first element from last  : " + ages);
		ages.set(ages.size()-1 , 93);
		
		{
		int holder = 0;
		ArrayList<Integer> agesAvg = new ArrayList<Integer>(ages.size() + 1);
		for (int i = 0 ; i <= ages.size() - 1 ; i++) {
			agesAvg.add(ages.get(i));
			holder += ages.get(i);
		}
		System.out.println("Array int agesAvg; Duplicated from ages using for loop : " + agesAvg);
		// max out array size.
		System.out.println("Average Array BEFORE maxing out array : " + holder / agesAvg.size());
		agesAvg.add(43);
		
		System.out.println("AFTER adding 9th element : " + agesAvg);
		System.out.println("Average AFTER maxing out array with a value '43' : " + holder / agesAvg.size());
		// find avg of ages in double 
		double avg = (double)holder / ages.size();
		System.out.println("Average BEFORE as double : " + avg);
		double avg2 = (double)holder / agesAvg.size();
		holder += agesAvg.get(agesAvg.size() - 1);
		System.out.println("Average AFTER as double : " + avg2);
		
		
		
		
		// create a new array of string called names. {"sam , tommy , tim , sally , buck , bob" }
		ArrayList<String> names = new ArrayList<String>();
		names.add("Sam");
		names.add("Tommy");
		names.add("Tim");
		names.add("Sally");
		names.add("Buck");
		names.add("Bob");
		System.out.println(" ");
		System.out.println("Names : " + names);
		// iterate through the arrays and calculate the average length of names.
		
		int total = 0;
		for (int i = 0 ; i < names.size() - 1 ; i++) {
			for (String name : names) {
				total += name.length();
				
			}
		}
		double avgName = (double) total / names.size();
		System.out.println("Avg name length : " + avgName);
		// iterate another loop again to concatenate all the names together, separated by spaces
		// print new value.
		//
		//create StringBuilder conc. conc will be the value of the final String. It will start with length 0
		StringBuilder conc = new StringBuilder();
		
		// I iterate over a for loop, creating a String item nameC for all the values stored in the indexes of  ArrayList<String> names 
		// that was created earlier...
		for (String nameC : names) {
			
			// .append is a method available to the StringBuilder, which I have aptly named conc for concatenate. 
			// use conc.append(String).append(another String.)...
			conc.append(nameC).append(" ");
		}
		// sysout the final value of the string stored in StringBuilder conc. This will print one continual string. The second .append() allows me
		// to add an empty string to make the final StringBuilder String look like it has spaces.
		System.out.println(conc);
		
		//how to access last element of the array?
		// first, there must be an array...
		ArrayList<String> code = new ArrayList<String>();
		code.add("Gate Close...");
		code.add("Gate Opened...");
		code.add("Gate Hold-Open...");
		code.add("Gate State...");
		// access the last element by using;
		System.out.println("Last Element : " + (code.get(code.size() - 1)));
		// access the first element using 0th index
		System.out.println("First element : " + (code.get(0)));
		
		
		// create a new array of int called nameLengths and iterate over the old names array to add the length of each name to the end of the name.
		// iterate over nameLengths and calculate the sum of all the elements in the array, print result to console
		
		// create the int array...
		ArrayList<Integer> nameLengths = new ArrayList<Integer>();
		// i chose this for loop bcz i only want to iterate over the list one time and add a value at each iteration.
		// The loop runs however any times until the Strings of names in names have been iterated over. In this case it iterates 6 times; 
		// adding 6 new String values to the nameLengths array.
			for(String length : names) {
				nameLengths.add(length.length());
			}
		// print name lengths array.
		System.out.println("Name lengths : " + nameLengths);
		
		
		
		// write a method that takes in a Stirng and an int that concatenates the word to itself, int number of times.
		concat("concat 3x " , 3);	
		
		// write a method that takes in two stirngs (String firstName , String lastName) ; the method should take in the parameters and add them together with a space.
		fullName("John", "Doe");
		// write a method that takes in an array of int and returns true if the array is GREATER than 100.
		System.out.println(sumitup(nameLengths));
		// write a method that takes in an array of double and returns the average of all the elements in the array.
		ArrayList<Double> doubarray = new ArrayList<Double>();
		doubarray.add(3.53);
		doubarray.add(79.8);
		doubarray.add(4.3);
		doubarray.add(80.9);
		doubarray.add(247.365);
		// write a method that takes in two arrays of double and returns true if the average of elements in the first array is greater than the average of the elements in the second
		avgDouble(doubarray); 
		
		// Write a method that takes two arrays of double and returns true if the average of 
		// the elements in the first array is greater than the average of the elements in the second array.
		ArrayList<Double> doubex1 = new ArrayList<Double>();
		doubex1.add(4.3);
		doubex1.add(45.345);
		doubex1.add(675.3);
		ArrayList<Double> doubex2 = new ArrayList<Double>();
		doubex2.add(45.2);
		doubex2.add(798.0);
		doubex2.add(4.45);
		
		//boolean result = doubex(doubex1 , doubex2);
		//print doubex return value visually
		System.out.println(doubex(doubex1 , doubex2));
		// Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, 
		//  and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		System.out.println(willBuyDrink(true , avgName));
		// write your own method that solves a problem and add comments to it.
		}
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the 1st octet of an IP : ");
		int oc1 = in.nextInt();
		System.out.println("Enter the 2nd octet of an IP : ");
		int oc2 = in.nextInt();
		System.out.println("Enter the 3rd octet of an IP : ");
		int oc3 = in.nextInt();
		System.out.println("Enter the 4th octet of an IP : ");
		int oc4 = in.nextInt();
		ipv4Is(oc1, oc2, oc3, oc4);
	
	}
	// be sure methods are within the scope of the class. methods cannot be nested within other methods
	public static void concat(String str , int n) {
	StringBuilder result = new StringBuilder();
	// use loop to concat n num of times
	for (int i = 0 ; i < n ; i++) {
		result.append(str);
		
	}
	
	System.out.println(result.toString());
	}
	
	public static void fullName(String firstName , String lastNmae) {
		StringBuilder fn = new StringBuilder();
		fn.append(firstName).append(" ").append(lastNmae);
		System.out.println(fn.toString());
	}
	
	public static boolean sumitup(ArrayList<Integer> nums) {
		int result = 0;
		for (int i = 0 ; i < nums.size() ; i++) {
			result += nums.get(i);
		}
		if (result > 100) {
			return true;
		}
		return false;
	}
	public static void avgDouble(ArrayList<Double> doubleArray) {
		
		double avg;
		double x = 0;
		for(int i = 0 ; i < doubleArray.size() ; i++ ) {
			x += doubleArray.get(i);
			
			
		}
		avg = x / doubleArray.size();
		System.out.println(avg);
	}
	public static boolean doubex(ArrayList<Double> array1 , ArrayList<Double> array2) {
		double av = 0.00;
		double av2 = 0.00;
		for (double weneed : array1) {
			av += weneed;
		}
		for (double weneed : array2) {
			av2 += weneed;
			
		}
		av /= array1.size();
		av2 /= array2.size();
		if (av > av2) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean willBuyDrink(boolean isHotOutside , double moneyInPocket) {
		if (moneyInPocket > 10.50 && isHotOutside){
			return true;
		} else {
			return false;
		}
	}
	
	public static void ipv4Is(int oc1 , int oc2 , int oc , int oc4) {
		if (oc1 == 10 && oc2 >= 0 && oc2 <= 255) {
			System.out.println("Class A");
		}else if (oc1 == 172 && oc2 >=16 && oc2 <= 31) {
			System.out.println("Class B");	
		}else if (oc1 == 192 && oc2 == 168) {
			System.out.println("Class C");
		}else if (oc1 == 127) {
			System.out.println("Loopback");
		}
	}
	
}
