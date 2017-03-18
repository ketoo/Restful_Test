package hello;

import java.util.Arrays;

public class Greeting {

    
    private String strContent = new String();
    private String strReplaceData = new String();
    private int nMaxCount = 0;
    private char cMaxCountChar;

    public Greeting(String content) {

        this.strContent = content;
    }

    public void Counting()
    {
    	strReplaceData = strContent.replaceAll("[^A-Za-z]", "");  
    	
		
		if (strReplaceData.isEmpty())
		{
			return;
		}
		String strLowerCaseData = strReplaceData.toLowerCase();
		char[] stch = strLowerCaseData.toCharArray();
		Arrays.sort(stch);

		//System.out.println(stch);
		
		char lastch = stch[0];
		int nLastCount = 0;
		for (int i = 0; i < stch.length; i++)
		{  
           char ch = stch[i];  
           if (ch == lastch)
           {
        	   nLastCount++;
        	   if (i == stch.length - 1)
               {
        		   if (nLastCount > nMaxCount)
            	   {
            		   nMaxCount = nLastCount;
            		   cMaxCountChar = lastch;
            	   }
               }
           }
           else
           {
        	   if (nLastCount > nMaxCount)
        	   {
        		   nMaxCount = nLastCount;
        		   cMaxCountChar = lastch;
        	   }
        	   
    		   lastch = ch;
        	   nLastCount = 1;
           }
        }
		
		System.out.println(strReplaceData);
		System.out.println(cMaxCountChar + " " + nMaxCount);
		
    }
    
    public char getFrequentData()
    {
    	return this.cMaxCountChar;
    }
    
    public int getFrequency()
    {
    	return this.nMaxCount;
    }
    
    public String getContent() {
        return strReplaceData;
    }
}
