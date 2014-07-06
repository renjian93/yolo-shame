package com.baldurtech.yolo.shame;
public class FizzBuzz{
	Boolean ultimateAnswer = false;
	public String say(Integer num){
		if(num == 42) return "42";
		if(ultimateAnswer){
			return  String.valueOf(num);
		}if(num == 42){
			ultimateAnswer = true;
		}
		return num % 15 == 0 ?"FizzBuzz":num % 5 == 0 ?"Buzz":num % 3 == 0 ?"Fizz":String.valueOf(num); 	
	}

}
