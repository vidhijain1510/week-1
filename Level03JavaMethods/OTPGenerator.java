/*Write a program to generate a six-digit OTP number using Math.random() method. 
Validate the numbers are unique by generating the OTP number 10 times and ensuring all the 10 OTPs are not the same
Hint => 
Write a method to Generate a 6-digit OTP number using Math.random() 
Create an array to save the OTP numbers generated 10 times
Write a method to ensure that the OTP numbers generated are unique. If unique return true else return false
*/

import java.util.*;

public class OTPGenerator{
	// Method to generate a 6-digit OTP number using Math.random()
    public static int generateOTP() {
        // Generate a random number between 100000 and 999999
        return (int)(Math.random() * 900000) + 100000;
    }
	
	//To check if OTPs are unique
	public static boolean areOTPsUnique(int[] otps){
		//a method to ensure that the OTP numbers generated are unique
		for(int i = 0; i < otps.length; i++){
			for(int j = i + 1; j < otps.length; j++){
				if(otps[i] == otps[j]){
					return false;
				}
			}
		}
		return true;
	}
	
	
	public static void main(String[] args){
		int [] otps = new int[10];//this array can store upto 10 OTPs
		
		//To generate 10 OTP numbers and store them in the array
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
        }
		
		//Printing the OTPs
        System.out.println("Generated OTPs:");
        for (int i = 0; i<otps.length; i++) {
            System.out.println(otps[i]);
        }
		
		//Dispaying if all OTPs are unique
		if(areOTPsUnique(otps)){
			System.out.println("All OTPs are unique");
		}else{
			System.out.println("All OTPs are not unique");
		}
		
	}
}




