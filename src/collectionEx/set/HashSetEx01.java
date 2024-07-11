package collectionEx.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx01 {

  public static void main(String[] args) {
    // HashSet 컬렉션 생성
    Set<String> set = new HashSet<>();

    // 객체 저장
    set.add("신세계");
    set.add("신세계");
    set.add("신세계1");
    System.out.println(set.size());
    System.out.println(set.toString());

    Set<Member> memberSet = new HashSet<>();
    Member member = new Member("SSG",20);

    memberSet.add(member);
    memberSet.add(new Member("SMG",24));
    memberSet.add(new Member("jMG",24));
    memberSet.add(new Member("lMG",24));

    System.out.println("================회원을 반복자 Iterator 를 이용해서 가져오기===================");
    // 회원을 반복자 Iterator 를 이용해서 가져오기
    Iterator<Member> iterator = memberSet.iterator();
    while(iterator.hasNext()){
      // 외원 한명 가져오기
      Member mem = iterator.next();
      System.out.println(mem.name + " \t" + mem.age);
      if(mem.name.equals("jMG")){
        iterator.remove();
      }
    }
    System.out.println();
    System.out.println();
    System.out.println();
    Iterator<Member> iterator1 = memberSet.iterator();
    while(iterator1.hasNext()){
      // 외원 한명 가져오기
      Member mem = iterator1.next();
      System.out.println(mem.name + " \t" + mem.age);
      if(mem.name.equals("SSG")){
        iterator1.remove();
      }
    }


    //memberSet.remove(member);

    // member "lMG"를 삭제하고자 한다.

    // 회원을 enhanced for 를 이용해서 가져오기
    System.out.println("===============회원을 enhanced for 를 이용해서 가져오기================");
    for(Member member1 : memberSet){
      System.out.println(member1.name + " \t" + member1.age);
      if(member1.name.equals("SMG")){
        memberSet.remove(member1);
      }
    }

    System.out.println(memberSet.size());
  }
}