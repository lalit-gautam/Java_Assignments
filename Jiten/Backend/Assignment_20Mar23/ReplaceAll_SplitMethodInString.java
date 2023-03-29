package Assignment_20Mar23;

public class ReplaceAll_SplitMethodInString{
	public static void main(String[] args) {
		String string1="My name is Rajendra. My name is lamror. My name is Technolamror.";
		String replaceString=string1.replaceAll("is","was");  //replaces all occurrences of "is" to "Was".
		
		System.out.println("String before replaceAll() : "+string1);
		System.out.println("String after replaceAll()  : "+replaceString);
		
		String string2="java string split method by Technolamror"; 
		String[] words=string2.split(" ");  //Where space
		
		System.out.println("Oroginal string : "+string2);
		System.out.println("After split() method where space : ");
		for(String oneWord:words){ 
			System.out.println(oneWord);
		}  
		
		String string3="java+string+split+method+by+Technolamror"; 
		String[] words1=string2.split("\\+");  //where '+' sign
		
		System.out.println("Oroginal string : "+string2);
		System.out.println("After split() method with sign '+': ");
		for(String oneWord:words){ 
			System.out.println(oneWord);
		} 
	}
}
