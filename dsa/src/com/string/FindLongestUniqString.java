package com.string;

import java.util.HashMap;
import java.util.Map;

//asked by google facebook 
//input aabcce ==> abc
public class FindLongestUniqString{

	  public static void main(String [] arg){
	    
	    String mInputString = "aabcce";
	    int mSlowPointer = 0,mFastPointer =0;
	    Map<Character,Integer> mVistedMap = new HashMap<>();
	    String mOut = "";
	    while(mSlowPointer<mInputString.length() && mFastPointer<mInputString.length()){
	      char mCurrentChar = mInputString.charAt(mFastPointer);
	      if(mVistedMap.containsKey(mCurrentChar)){
	          mSlowPointer = Math.max(mVistedMap.get(mCurrentChar)+1,mSlowPointer);
	      }else{
	    	  mVistedMap.put(mInputString.charAt(mFastPointer),mFastPointer);
	      }
	      if(mOut.length()<mFastPointer-mSlowPointer+1) {
	    	  mOut = mInputString.substring(mSlowPointer, mFastPointer+1);
	      }
	      mFastPointer++;
	    }
	    System.out.println(mOut);
	  }

	}