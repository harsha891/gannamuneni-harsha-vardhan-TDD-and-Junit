package com.epam.TddJunitTask;

public class RemoveAatBegin {

	public String removeAFromBegining(String string) {

		String result = string;
		if(string.length() > 0)
		{
			if(string.startsWith("AA"))
			{
				result = string.substring(2,string.length());
			}
			else if(string.startsWith("A"))
			{
				result = string.substring(1,string.length());
			}
		}
		return result;
	}

}
