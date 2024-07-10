package collectionEx.Generic.InterFaceEx;

public interface Rentable<M> { // 다양한 대상을 렌트하기 위한 rent()메소드의 리턴 타입을 타입파라미터(M)로 지정
  public M rent();
}
