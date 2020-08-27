package introduction;

public class PracticeBruh {

	public static void main(String[] args) {
		
		String str = "Hello";
		String str1 = "Polly's tea is cold";
		String str2 = "The tea is cold";
		String str3 = "Music";
		String str4 = new String ("Last Of Us 2 is the game of the year");
		String str5 = new String ("");
		String str6 = new String ("    Look at the gaps      ");
		String str7 = new String ("Music");
		
		System.out.println(str.length());
		System.out.println(str1.charAt(4));
		System.out.println(str2.concat(" so I do not want it."));
		System.out.println(str3.startsWith("Mu"));
		System.out.println(str4.endsWith("year"));
		System.out.println(str3.equals(str7));
		System.out.println(str2.indexOf('i'));
		System.out.println(str5.isEmpty());
		System.out.println(str7.replace('c', 'k'));
		System.out.println(str1.substring(4));
		System.out.println(str5.isEmpty());
		System.out.println(str6.trim());
		System.out.println(str7.toLowerCase());
		System.out.println(str2.toUpperCase());
		
		char[] charArray = str1.toCharArray();
		for (int i = 0; i < charArray.length; i++)
			System.out.println("Index " + i + " is: " + charArray[i]);
		
		
			

	}

}
