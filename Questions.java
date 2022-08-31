package PasswordGenerator;
import java.util.Scanner;

public class Questions {
  
  public void askQuestions(){
    Scanner in = new Scanner(System.in);

    Generator g1 = new Generator();
    String hasUpperCaseAnswer = "";
    String hasLowerCaseAnswer = "";
    String hasNumbersAnswer = "";
    String hasSpecialCharactersAnswer = "";

    
    
    
    System.out.println("How many characters long do you want ur password? We recommend at least 8 characters, but the more characters you have, the safer the password.");
      g1.passwordLength = in.nextInt();
  
    System.out.println("Do you want Uppercase letters in your Password?");
    hasUpperCaseAnswer = in.next();
      
    if(hasUpperCaseAnswer.equals("yes")){
      g1.hasUpperCase=true;
    }

    System.out.println("Do you want Lowercase letters in your Password?");
    hasLowerCaseAnswer = in.next();
    
    if(hasLowerCaseAnswer.equals("yes")){
      g1.hasLowerCase=true;
    }
    
    System.out.println("Do you want Numbers in your Password?");
    hasNumbersAnswer = in.next();
    
    if(hasNumbersAnswer.equals("yes")){
      g1.hasNumbers=true;
    }

    
    System.out.println("Do you want Special characters and symbols like ( !@#$%^&*()-_=+/~? ) in your Password");
    hasSpecialCharactersAnswer = in.next();
    
    if(hasSpecialCharactersAnswer.equals("yes")){
      g1.hasSpecialCharacters=true;
    }
    System.out.println("This is your password: " + g1.passwordMaker());
    
    
  }
}
