package Inheritance;

class A{
    void methodA(){
        System.out.println("method of class A");
    }
}
class B extends A{
    void methodB(){
        System.out.println("method of class B");
    }
}
class C extends B {
    void methodC() {
        System.out.println("method of class C");
    }
}


public class MultiLevel_Inheritance {

    public static void main(String[] args){
        C c1 =new C();
        c1.methodC();
        c1.methodB();
        c1.methodA();
    }
}
