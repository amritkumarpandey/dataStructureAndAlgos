package com.string;
//facebook
public class StringPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     new StringPermutation().permutation("", "top");
	}

	
	private  void permutation(String prefix, String str) {
	    int n = str.length();
	    if (n == 0) System.out.println(prefix);//print all permutation
	    else {
	        for (int i = 0; i < n; i++) {
	            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	        }
	   }
	}
  
}
