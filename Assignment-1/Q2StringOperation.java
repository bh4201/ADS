import java.util.*;
class Operation{
 static boolean areAnagrams(String s1, String s2) {
        
        // Sort both strings
        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();
        Arrays.sort(s1Array);
        Arrays.sort(s2Array);
			
      for(int i=0;i< s1Array.length;i++)
	  {
		  //check value at index of both strings
  			if(s1Array[i]==s2Array[i])  
			{
           		return true;
            }  
      }
        
               return false;
    }
	
public static void lonstring(){
	 String myStr = "Practice makes a man perfect";
    String regex = "[\\s]";
    String[] strArray = myStr.split(regex);
	String maxStr="";
    for (String s : strArray) {
	    System.out.println(s);
    }
	for(int i=0; i<strArray.length;i++)
	{
		if(strArray[i].length() > maxStr.length())
		{
			maxStr=strArray[i];
		}
	}
	System.out.println("Longest word: "+maxStr);

}

public static void countVC(){
	String str = "Practice makes a man perfect";
	String str1= str.toLowerCase(); 
	int vowel = 0;
	int consonant = 0;
	int whitespace =0;
	
	for(int i=0; i<str1.length(); i++){
		char ch = str1.charAt(i);
		if(ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u'){
			vowel++;
		}
		 else if (ch >= 'a' && ch <= 'z')
        consonant++;
		else
			whitespace++;
	}
	System.out.println("Vowels Count: "+vowel);
	System.out.println("Consonant Count: "+consonant);
	System.out.println("whitespaces Count: "+whitespace);
}	
}





class Q2StringOperation{

public static void main(String[] a){ 


	    String s1 = "listen";
        String s2 = "silent2";
		boolean res =Operation.areAnagrams(s1, s2);
		if(res==true){
			System.out.println("Both String are anagram"+res);
		}
		else{
			System.out.println("Both String are not anagram "+res);
		}
        
		
		Operation.lonstring();
		Operation.countVC();
		
  }
 }