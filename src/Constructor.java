public class Constructor {
    int a;
    int b;
    //method
    public void display(){
        System.out.println(a+" "+b);
    }
    Constructor(int a,int b){
        this.a=a;
        this.b=b;

    }
    public static void main(String[] args){
        Constructor obj=new Constructor(2,3);
        obj.display();
    }
}

