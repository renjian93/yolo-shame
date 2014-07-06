package com.baldurtech.yolo.shame;
public class FizzBuzzTest{
	static Boolean testResult = true;
	
	public static void main(String[] args){
		FizzBuzz app =new FizzBuzz();

		assertEquals("1",app.say(1));
		assertEquals("Fizz",app.say(3));
		assertEquals("Buzz",app.say(5));
		assertEquals("FizzBuzz",app.say(15));
		System.out.println("Test result "+(testResult ?"SUCCESS":"FAIL"));
	}

	public static void assertEquals(String expectedResult,String actualResult){
		if(! expectedResult.equals(actualResult)){
			testResult = false;
		}
	}
} 
