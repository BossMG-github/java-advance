package compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableEx {

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

    Collections.sort(books);

    for(Book book : books) {
      System.out.println(book.getSubject() + "\t" + book.getWriter() + "\t" + book.getPublisher());
    }
    System.out.println();
    System.out.println("========================================================");
    for(int i = 0; i < books.size(); i++) {
      System.out.println(books.get(i).getSubject() + "\t" + books.get(i).getWriter() + "\t" + books.get(i).getPublisher() + "\t" + books.get(i).getYear());
    }

    // 출판년도 기준으로 오름차순 정렬


    // 책 제목 사전순으로 정렬


    // 책 제목 기준으로 사전순으로 정렬을 하되, 만약 책 제목이 동일하다면 출판년도로 오름차순으로 정렬

  }
}
