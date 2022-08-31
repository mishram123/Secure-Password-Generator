package PasswordGenerator;
import java.util.ArrayList;

public class Generator {
  public static boolean hasUpperCase = false;
  public static boolean hasLowerCase = false;
  public static boolean hasNumbers = false;
  public static boolean hasSpecialCharacters = false;
  public static int passwordLength = 0;
  

  Characters c1 = new Characters();


  public String passwordMaker(){
    
    String Password = "";
    int i=0;
    while(i<passwordLength){
     int randomNum = (int)(Math.random()*4);
      if(randomNum==0 && hasLowerCase==true){
        int randomNum2 = (int)(Math.random()*26);
        Password+=c1.alphabet[randomNum2];
        i++;
      }
      if(randomNum==1&&hasUpperCase==true){
        int randomNum2 = (int)(Math.random()*26);
        Password+=c1.alphabetUpperCase[randomNum2];
        i++;
      }
      if(randomNum==2&&hasNumbers==true){
        int randomNum2 = (int)(Math.random()*10);
        Password+=c1.numbers[randomNum2];
        i++;
      }
      if(randomNum==3&&hasSpecialCharacters==true){
        int randomNum2 = (int)(Math.random()*c1.specialCharacters.length);
        Password+=c1.specialCharacters[randomNum2];
        i++;
      }
    }
    
    return Password;

  }
}
