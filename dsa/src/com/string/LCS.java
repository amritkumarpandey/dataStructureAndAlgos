package com.string;


//ased buy google
//output def
public class LCS {

	public static void main(String[] args) {
		
		String mInputString1="abcdefghl";
		String mInputString2="defkb";
		System.out.println(helper(mInputString1,mInputString2,0,0));
	}
	
	static int helper(String aInputString1,String aInputString2,int aPointerForS1,int aPointerForS2) {
		
		if(aPointerForS1>aInputString1.length()-1 || aPointerForS2>aInputString2.length()-1) {
			return 0;
		}
		
		if(aInputString1==""|| aInputString1==null || aInputString2==""||aInputString2==null) {
			return 0;
		}
		if(aInputString1.charAt(aPointerForS1)==aInputString2.charAt(aPointerForS2)) {
			return 1+helper( aInputString1, aInputString2, aPointerForS1+1, aPointerForS2+1);
		}else {
			return Math.max(helper( aInputString1, aInputString2, aPointerForS1+1, aPointerForS2), helper( aInputString1, aInputString2, aPointerForS1+1, aPointerForS2));
		}
	}
}
