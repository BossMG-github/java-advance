package MoningTest.StringEx;

import java.util.Scanner;

public class Prob2 {

  public static void main(String[] args) {
    String inputStr;

    Scanner keyboard = new Scanner(System.in);

    System.out.print("문자열을 입력하세요. : ");
    inputStr = keyboard.nextLine();
    String chnge = changeStr(inputStr);
    System.out.println(chnge);
    //프로그램을 구현하세요.
  }

  private static String changeStr(String str){
    str = str.toUpperCase();
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < str.length(); i++){
      sb.append(str.charAt(i));
    }
    str = sb.reverse().toString();
    return str;
  }
}
