package OperationPostAndPre;

public class ReverseString {
	public static void main(String[] args) {
		String input = "xyz abc w@r";
		//for every word in the input string
		String temp = "";
		//for the reversed string input
		String reversedWord = "";
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i)==' ') {
				reversedWord += reverse(temp)+" ";
				temp = "";
			}
			temp+= input.charAt(i);
		}
		
		reversedWord+= reverse(temp);
		input = reversedWord;
		
		System.out.println(specialCharsInString(input));
		System.out.println('a'+ 0);
		
		int[] count = new int[256];
		String str = "aabbccc";
        int len = str.length();
        for (int i = 0; i < len; i++)
            System.out.println(count[str.charAt(i)]++) ;
	}

	
	private static String reverse(String word) {
		String reversedWord ="";
		for(int i= word.length()-1; i>=0; i--){
			if(word.charAt(i) == ' ') {
				continue;
			}
			   reversedWord += word.charAt(i);
			  }
			  return reversedWord;
	}
	
	
	private static int specialCharsInString(String input) {
		int count=0;
		for(int i=0; i<input.length(); i++) {
			char ch = input.charAt(i);
			if(!(ch>='a'&& ch<='z' || ch>='A'&& ch<='Z'|| ch>='0' && ch<='9' || ch == ' ')) {
				count++;
			}
		}
		return count;
	}
	
	//WAP to sort a String Alphabetically. -> the characters have ascii values to them by making them add +0;
	// we can then run bubble sort on it.

}


//String s = "Welcome to Baeldung";
//String[] expected1 = s.split(" "); gives below code
//String[] expected1 = new String[] { "Welcome", "to", "Baeldung" };
	
