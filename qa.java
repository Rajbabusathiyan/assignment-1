package day6;

1.Explain about the main method in java?
			Main method is a starting point of every java program. Its syntax is public static void main(String[]args)
			public is an an access specifier. static is an keyword. we can make a method static by using this static keyword. void i s an return type.abstract
			vod explains that the main() method does not return any value. main is an method name and String[] args indicates array of String type.class
					
2.What are the different Contral flow statement available in java?
			contral flow statements are,
			if statement, switch statement. while lop for loop, do while loop, for -each statement, break statement, continue statement.class

3. What is the Difference between break and continue statements?
			Break stateent is used to terminate the loop immediately. In java break statement is indicated using break keyword.class
			Continue statement is used to skip the current iteration of the loop. in java continue statement is indicated using continue keyword.
			
4. What is an Array? How will you declare an array in java?
			Array is an collection of similar type of elements. Array in java is an index - based, the first element is stored at 0th index
			array is declared as,
			int a[]= new int[12]
					
5. When will you get Array Index Out Of Bounds Exception
			ArrayIndexOutOfBoundsException exception happens when an array is accessed using invalid index,
			the index may be negative number of greater than or equal to the size of the array.
			
6. Define te Syntax to create an object for a class.
			What are the naming conventions to be followed while creating a class,
			method and a variable. Explain with examples.
					The syntax for creating an object is,
			className object= new ClassName();
Naming conventions
	class The name should be camelcase. For eg CustomerName. In this every new word starts with the upper case.
	method The method should be in mixedCase. Eg customerName. In this the first letter should be lowercase.
	variable The method should be in mixedCase. Eg customerName. In this the first letter should be lowercase.

7. What is Variable? How will you declare a variables in java?
		A variable is a contained that holds a value while java program is executed. a variable is assigned to datatype.
		Variable may be of three types,
		local variable
		instance variable
		static variable
		local variable local variable is declared inside the method body You can use this variable only in that method
		instance variable A variable is declared inside the class but outside the method body.
		static variable static variable in java is variable which belongs to the class and initialized only once at the start of the execution.
		
8. What is String in java? Is it a Data Type?
		String is a sequence of characters. But in java, string is an object that represents a sequence of characters.
		Yes, string belongs to non primitive data type.
		
9. What are the different ways to create the String Object in java?
		String object is created by using two ways,
		by using String literal
		BY using new keyword
		
10. What is the Difference between .Equals and ==?
		.Equals () method The string equals() method compares the original content of String. It compares he values of String of equality.
		The == operator cmpares the reference not values.