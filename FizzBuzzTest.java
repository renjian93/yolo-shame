package com.baldurtech.yolo.shame;
public class FizzBuzzTest{
	static Boolean testResult = true;
	static Integer countSuccess = 0;
	static Integer countFail = 0;
	public static void main(String[] args){
		FizzBuzz app =new FizzBuzz();

		assertEquals("1",app.say(1));
		assertEquals("Fizz",app.say(3));
		assertEquals("Buzz",app.say(5));
		assertEquals("FizzBuzz",app.say(15));
		assertEquals("Fizz",app.say(42));
		outputTestReport();
	}
	public static void assertEquals(String expectedResult,String actualResult){
		if(! expectedResult.equals(actualResult)){
			countFail ++;
			System.out.println("Expected "+expectedResult+"but result "+actualResult);
			testResult = false;
		}else{
			countSuccess ++;
		}
	}
	public static void outputTestReport(){
		System.out.println("Test result "+(testResult ?"SUCCESS":"FAIL"));
		System.out.println("Test pass: "+countSuccess+" ,test fail: "+countFail);
	}
} 
