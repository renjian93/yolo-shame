package com.baldurtech.yolo.shame;
public class FizzBuzzTest{
	public static void main(String[] args){
		FizzBuzz app =new FizzBuzz();
		System.out.println("1".equals(app.say(1)));
		System.out.println("Fizz".equals(app.say(3)));
		System.out.println("Buzz".equals(app.say(5)));
		System.out.println("FizzBuzz".equals(app.say(15)));
	} 
} 
