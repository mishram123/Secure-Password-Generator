package PasswordGenerator;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;


public class Main{
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    ArrayList<String> passwords = new ArrayList<String>();
    ArrayList<String> passwordUses = new ArrayList<String>();
    
    System.out.println("To help you generate the most secure password, please answer the questions with a number, or with a yes or no");
    System.out.println("How many passwords would you like to make today");
    int numPasswords = in.nextInt();

    for(int i = 1; i<=numPasswords; i++){
      Questions q1 = new Questions();
      Generator g1 = new Generator();
      System.out.println("Password #" + i);
      System.out.println("What will this password be used for? ");
      String answer = in.next();
      passwordUses.add(answer);
      q1.askQuestions();
      passwords.add(g1.passwordMaker());
    }
    try {
      File myObj = new File("filename.txt");
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    try {
      FileWriter myWriter = new FileWriter("SecurePasswords.txt");
      myWriter.write("Here we will store all your passwords and where they will be used");
      myWriter.write(System.getProperty("line.separator"));
      for(int k=0;k<passwords.size();k++){
        myWriter.write(passwordUses.get(k) + "     " + passwords.get(k));
        myWriter.write(System.getProperty("line.separator"));
      }
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }

  }
  
  
