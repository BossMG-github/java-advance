package json.gson.Ex;

public class StudentMain {

  public static void main(String[] args) {
    Student st = new Student(1, "SSG");
    System.out.println(st.getJson());
    Student st2 = st.changeStudent();
    System.out.println(st2.getJson());
  }
}
