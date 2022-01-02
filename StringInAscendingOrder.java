package dsaassignment;

public class StringInAscendingOrder {
	public static void main(String[] args) {
		String str="GeeksterGivesUsBestCoaching";
		
		int [] lower=new int[26];
		int [] upper=new int[26];
		
		for(int i=0;i<str.length();i++)
		{
			if (Character.isLowerCase(str.charAt(i)))
				lower[str.charAt(i)-'a']++;
			else if (Character.isUpperCase(str.charAt(i)))
				upper[str.charAt(i)-'A']++;
		}
		
		
		int i = 0, j = 0;
		char str1[]=str.toCharArray();
		
		while (i < 26 && lower[i] == 0)
		    i++;

		while (j < 26 && upper[j] == 0)
		    j++;
		for (int k=0;k<str.length();k++)
		{
		    if (Character.isLowerCase(str.charAt(k)))
		    {
		        while (lower[i] == 0)
		            i++;
		        str1[k]=(char) (i + 'a');
		        lower[i]--;
		    } 
		    else if (Character.isUpperCase(str.charAt(k)))
		    {
		        while (upper[j] == 0)
		            j++;
		        str1[k]=(char) (j + 'A');
		        upper[j]--;
		    }
		}
		for(int a=0;a<str1.length;a++)
		{
		System.out.print(str1[a]);
		}
	}

}
