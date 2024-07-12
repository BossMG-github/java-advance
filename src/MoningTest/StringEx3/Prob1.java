package MoningTest.StringEx3;

public class Prob1 {
  public static void main(String[] args) {
    Prob1 p = new Prob1();
    String addr = "서울시,강남구,봉은사로,SSGJavaBackend";
    String[] addrArr = p.split(addr, ',');
    System.out.println("배열 크기 : " + addrArr.length);
    for(int i=0; i<addrArr.length; i++){
      System.out.print(addrArr[i] + " ");
    }
  }
  public String[] split(String str, char separator){

      int count = 0;
      for(int i = 0; i < str.length(); i++){
        if(str.charAt(i) == separator){
          count++;
        }
      }

      String[] arrstr = new String[count+1];
      int startIndex = 0;
      int arrayIndex = 0;

      for(int i = 0; i < str.length(); i++){
        if(str.charAt(i) == separator){
          arrstr[arrayIndex] = str.substring(startIndex, i);
          arrayIndex++;
          startIndex = i+1;
        }
      }

      arrstr[arrayIndex] = str.substring(startIndex);

      return arrstr;

  }
}
