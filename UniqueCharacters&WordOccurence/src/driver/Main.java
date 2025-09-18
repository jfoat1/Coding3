package driver;

public class Main {

	public static void main(String[] args) {
		boolean testWord = unique("queue");
		System.out.println(testWord);
		boolean testChar = isLetter('P');
		System.out.println(testChar);
		int testSentence = wordOccurences("In the beginning God created the heavens and the earth.", "the");
		System.out.println(testSentence);
	}

	public static boolean unique(String str)
	{
		for(int i = 0; i < str.length(); i++)
		{
			char letter = str.charAt(i);
			for(int j = i+1; j < str.length(); j++)
			{
				if(str.charAt(j) == letter)
				{
					return false; 
				}
			} 
		}
		return true;
	}
	
	public static int wordOccurences(String sentence, String word)
	{
		String temp = "";
		int count = 0;
		for(int i = 0; i < sentence.length(); i++)
		{
			if(isLetter(sentence.charAt(i)))
			{
				temp = temp + sentence.charAt(i);
			}
			else
			{
				if(temp.equals(word))
				{
					count++;
				}
				temp = "";
			}
		}
		
		if(temp.equals(word))
		{
			count++;
		}
		
		return count;
	}
	
	public static boolean isLetter(char c)
	{
		c = Character.toLowerCase(c); 
		String map = "abcdefghijklmnopqrstuvwxyz";
		for(int i = 0; i < map.length(); i++)
		{
			if(map.charAt(i) == c)
			{
				return true;
			}
		}
		return false; 
	}
}
