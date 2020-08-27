package introduction;

public class Variables {

	public static void main(String[] args) {
		/*
		 * Byte, used rarely, only used when concerned with space
		 * Min:-128
		 * Max: 127
		 * Default: 0
		 */
		byte byteVariable = 100;
		System.out.println("Byte Value " + byteVariable);
		
		/*
		 * Short
		 * Min: -32,768
		 * Max: 32,767
		 * Default: 0
		 */
		short shortVariable = 1000;
		System.out.println("Short Value " + shortVariable);
		
		/*
		 * int, has a big range and is used often
		 * Min: -2,147,483,648
		 * Max: 2,147,483,647
		 * Default: 0
		 */
		int integerVariable = 100000;
		System.out.println("Int Value " + integerVariable);
		
		/*
		 * long, another integer type, huge range
		 * Min: -2^63
		 * Max: 2^63 -1
		 * Default: 0
		 */
		long longVariable = 100000000L;
		System.out.println("Long Value " + longVariable);
		//end of integers
		
		/*
		 * float, can use if not precise calculations
		 * Default: 0.0f
		 */
		float floatVariable = 20.1f;
		System.out.println("Float Value " + floatVariable);
		
		/*
		 * double, used more in finance and precise calculations
		 * Default: 0.0d
		 */
		double doubleVariable = 60.33;
		System.out.println("Double Value " + doubleVariable);
		//end of floats and double floats
		
		/*
		 * boolean
		 * false and true
		 * Default: false
		 */
		boolean booleanVariable = true;
		System.out.println("Boolean Value " + booleanVariable);
		
		/*
		 * char
		 * Min: 0
		 * Max: 65,535
		 */
		char charVariable = 'a';
		System.out.println("Char Value " + charVariable);
		//These are all the data types
	
	

	}

}
