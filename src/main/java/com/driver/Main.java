package com.driver;

class A{
    public String meth(){
        return "Invoking method from class A";
    }
}
class B extends A{

}
public class Main {
    public static void main(String args[]){
        B obj = new B();
        String str = obj.meth();
    }

}