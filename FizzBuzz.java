package com.baldurtech.yolo.shame;
public class FizzBuzz{
	public String say(Integer num){
		if(num == 42) return "42";
		return num % 15 == 0 ?"FizzBuzz":num % 5 == 0 ?"Buzz":num % 3 == 0 ?"Fizz":String.valueOf(num); 	
	}

}
