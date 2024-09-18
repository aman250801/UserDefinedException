package com.exception;

public class UserDefineException extends Exception {
	UserDefineException(String msg){
		// call parent 
		super(msg);
	}
	
	public class TestUserException{
		// method
		
		static void vailidAge(int age) throws UserDefineException{
			if(age<18) {
				// throw
				throw new UserDefineException("person is not vailid");
			}else {
				System.out.println("welcome to vote.....");
			}
		}
		//public static void main(String[] args) {
			//try {
				//method call
			//	vailidAge(15);
		//	}catch(UserDefineException e) {
			//	System.out.println("Exception occured");
			//}
		//}
	}
	
	

}
