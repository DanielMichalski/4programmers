package pl.programmers.ocjp;


interface Interface1 {
    interface Interface2 {
        interface Interface3 {
            int test = 1;
        }
    }
}

class SimpleClass {
    interface NestedInterface {
        int test = 2;
    }
}

public class InnerInterface {
    public static void main(String[] args) {
        System.out.print(Interface1.Interface2.Interface3.test);
        System.out.print(SimpleClass.NestedInterface.test);
    }
}