package Inheritance;

class  Vehicle{
    String type;
    int price;
    String brand;

    void display(){
        System.out.println(type);
        System.out.println(price);
        System.out.println(brand);
    }
}
class Car extends Vehicle{
    boolean isSunroof;
    int numOfDoor;
}

public class Implementation {
    public static void main(String[] args){
        Car car = new Car();
        car.type= "SUV";
        car.price=1500000;
        car.brand="Tata";
        car.isSunroof=true;
        car.numOfDoor=4;
        car.display();
    }
}
