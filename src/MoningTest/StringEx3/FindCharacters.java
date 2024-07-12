package MoningTest.StringEx3;

public class FindCharacters {
  public static void main(String[] args) {
    FindCharacters fc=new FindCharacters();
    int count=fc.countChar("Boys, be ambitious", 'b');
    int count2 = fc.countChar("Boys, be ambitious", 'i');
    System.out.println(count);
    System.out.println(count2);

  }
  public int countChar(String str, char c) {
    // Method를 완성하세요...
    int count = 0;
    for(int i = 0; i < str.length(); i++){
      if(str.charAt(i) == c){
        count++;
      }
    }

    return count;
  }
}
