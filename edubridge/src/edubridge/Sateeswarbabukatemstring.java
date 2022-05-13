package edubridge;

public class Sateeswarbabukatemstring 
{
	public static void main(String[] args)
	{
		String S="Sateesh";//lateral
		String S2=" ";
		String S1=new String("warbabu");//using new
		System.out.println(S.charAt(0));//it returns char value for particular index.
		System.out.println(S.length());//it returns string lenght
		System.out.println(S.contains("tee"));//it returns true or false after matching the sequence of char value.
		System.out.println(S.lastIndexOf('s'));//it returns specified char value index
		System.out.println(S.endsWith("h"));//returns boolean value if found
		System.out.println(S.replace('h','s'));//it replaces all occurrances of the specified char value
		System.out.println(S.toUpperCase());//returns a string in uppercase
		System.out.println(S.toLowerCase());//returns a string in lowercase
		System.out.println(S.concat("warbabu"));//it concatenates the specified string
		System.out.println(S.substring(2));//it returns substring for given index
		System.out.println(S.equals(S1));//check whether the both strings are same or not
		System.out.println(S.equalsIgnoreCase(S1));//check whether the both strings are same or not ignoring case
		System.out.println(S2.isEmpty());//returns boolean value if string is empty or not
		System.out.println(S2.trim());//it returns begining and ending spaces of the string.
	}

}
