package MoningTest.ObjectEx;

public class Vehicle {
  private Owner owner;
  private int price;

  public Owner getOwner() {
    return owner;
  }

  public void setOwner(Owner owner) {
    this.owner = owner;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  @Override
  public boolean equals(Object obj) {
    Vehicle vehicle = (Vehicle) obj;
    if(this.owner.equals(vehicle.owner))
    {
      return true;
    }
    return false;
  }

  @Override
  public String toString() {
    return "이름은 " + this.owner.getName() + "이고, 핸드폰 번호는 " + this.owner.getCellPhone() + "입니다.\n 차량정보 : 가격은 " + this.price + "입니다.";
  }
}
