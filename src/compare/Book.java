package compare;


import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;

// Book Vo : 데이터 객체
@Data
@AllArgsConstructor
public class Book implements Comparable<Book>{
  private String subject; // 책 제목
  private String writer; // 지은이
  private String publisher; // 출판사
  private int year; //출판년월일


  /*@Override
  public int compareTo(Book o) { // 내부에서 비교 처리 후 비교 결과를 int로 리턴
    if(this.year == (o.year)){
      return 0;
    }
    else if(this.year < o.year){
      return -1; // 오름차순
    }
    else
    {
      return 1; // 내림차순
    }
  }
*/
 /* @Override
  public int compareTo(Book o) { // 내부에서 비교 처리 후 비교 결과를 int로 리턴
    int result = this.getSubject().compareTo(o.getSubject());
    return result;
  }*/

  @Override
  public int compareTo(Book o){
    int result = this.getSubject().compareTo(o.getSubject());
    if(result == 0){
      result = this.getYear() - o.getYear();
    }
    return result;
  }
  // compareTo(Object o) 메소드 동작 방식
  // - 현재 객체 < 파라미터로 넘어온 객체 : 음수
  // - 현재 객체 == 파라미터로 넘어온 객체 : 0
  // - 현재 객체 > 파라미터로 넘어온 객체 : 양수
  // - 음수 또는 0 이면 객체의 자리가 그대로 유지
  // - 양수일 때 두 객체의 자리가 바뀐다.

}
