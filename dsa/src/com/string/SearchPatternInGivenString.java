package com.string;
//asked by google
public class SearchPatternInGivenString {
	
	public static void main(String[] args) {
		
		String givenString = "XYZCDFGABHKERYT";
		String searchPattern = "ABCDFGHK";
		new SearchPatternInGivenString().getPatternInGivenString("",givenString,searchPattern);
	}

	private void getPatternInGivenString(String prefix, String givenString, String searchPattern) {
		
		if(prefix==null || givenString==null || searchPattern==null ) {
			return;
		}
		
		if(givenString.indexOf(searchPattern)>-1) {
			System.out.println( givenString.indexOf(searchPattern));
			getPatternInGivenString(null,null,null);
			
		}else {
			
			for(int i=0;i<givenString.length();i++) {
				getPatternInGivenString(prefix+givenString.charAt(i), givenString.substring(0, i)+givenString.substring(i+1), searchPattern);
			}
		
		}
		
		
	}

}
