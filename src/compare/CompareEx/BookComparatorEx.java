package compare.CompareEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookComparatorEx {

  public static void main(String[] args) {
    List<Book> books = new ArrayList<>();
    books.add(new Book("세이노의 가르침", "세이토", "화이트혁명", 2001));
    books.add(new Book("호모데우스", "유발 하라리", "민음사", 2010));
    books.add(new Book("호모데우스", "유발 하라리", "민음사", 2004));
    books.add(new Book("불안", "알랭 드 보통", "은행나무", 1999));
    books.add(new Book("코스모스", "칼세이건", "사이언스북", 2015));
    books.add(new Book("코스모스", "칼세이건", "사이언스북", 2010));
    books.add(new Book("동물농장", "조지오웰", "민음사", 1989));
    books.add(new Book("정의란 무엇인가", "마이클샌델", "와이즈베리", 2013));
    books.add(new Book("정의란 무엇인가", "마이클샌델", "와이즈베리", 1999));
    books.add(new Book("사피엔스", "유발 하라리", "김영사", 2020));
    books.add(new Book("역사의 쓸모", "최태성", "다산북스", 2020));
    books.add(new Book("역사의 쓸모", "최태성", "다산북스", 2010));

    System.out.println("===========================================================");
    System.out.println("제목 내림차순 정렬");
    System.out.println("===========================================================");
    // 제목 내림차순 정렬
    Collections.sort(books, new DescSubject());
    for(Book book : books){
      System.out.println(book.getSubject() + "\t" + book.getWriter() + "\t" + book.getPublisher() + "\t" + book.getYear());
    }
    // 출판년도를 기준으로 내림차순 정렬 DescYear 비교기를 만들기
    System.out.println("===========================================================");
    System.out.println("출판년도를 기준으로 내림차순 정렬 DescYear 비교기를 만들기");
    System.out.println("===========================================================");
    Collections.sort(books, new DescYear());
    for(Book book : books){
      System.out.println(book.getSubject() + "\t" + book.getWriter() + "\t" + book.getPublisher() + "\t" + book.getYear());
    }

    Comparator<Book> mycomparator = new Comparator<Book>() {
      @Override
      public int compare(Book o1, Book o2) {
        return (o1.getYear()-(o2.getYear()))*(-1);
      }
    };
    System.out.println("===========================================================");
    System.out.println("Comparator 인스턴스를 생성하여 내림차순 정렬");
    System.out.println("===========================================================");
    Collections.sort(books, mycomparator);
    for(Book book : books){
      System.out.println(book.getSubject() + "\t" + book.getWriter() + "\t" + book.getPublisher() + "\t" + book.getYear());
    }


    // 3. 기준1 : 출판년도 최신, 기준2 : 출파년도가 같다면 제목의 글자수로 내림차순 기준3 : 출판년도 제목의 글자 수까지 같다면 제목 내림차순
    Comparator<Book> mycomparator2 = new Comparator<Book>() {
      @Override
      public int compare(Book o1, Book o2) {
        int result = (o1.getYear() - o2.getYear())*(-1);
        if(result == 0){
          result = (o1.getSubject().length() - o2.getSubject().length())*(-1);
        }
        if(result == 0){
          result = (o1.getSubject().compareTo(o2.getSubject()))*(-1);
        }
        return result;
      }
    };
    Collections.sort(books, mycomparator2);
    System.out.println("===========================================================");
    System.out.println("기준1 : 출판년도 최신, 기준2 : 출파년도가 같다면 제목의 글자수로 내림차순 기준3 : 출판년도 제목의 글자 수까지 같다면 제목 내림차순");
    System.out.println("===========================================================");
    for(Book book : books){
      System.out.println(book.getSubject() + "\t" + book.getWriter() + "\t" + book.getPublisher() + "\t" + book.getYear());
    }
  }
}
