package OOPS.Inheritence;

public class Client {
    public static void main(String[] args) {
        // Case 1
        Parent obj1 = new Parent();
        System.out.println(obj1.d); // 10
        System.out.println(obj1.d1); // 100
        obj1.fun(); // P's fun
        obj1.fun1(); // P's fun1

        // Case 2
        Parent obj2 = new Child();
        System.out.println(obj2.d); // 10
        System.out.println(((Child) obj2).d); // 20
        System.out.println(obj2.d1); // 100
        System.out.println(((Child) obj2).d2); // 200
        obj2.fun(); // C's fun
        ((Parent) obj2).fun(); // C's fun
        obj2.fun1(); // P's fun1
        ((Child)obj2).fun2(); // C's fun 2

        // Case 3
        // Child obj3 = new Parent() ;

        // Case 4
        Child obj4 = new Child() ;
        System.out.println(obj4.d); // 20
        System.out.println(((Parent)obj4).d); // 10
        System.out.println(obj4.d1); // 100
        System.out.println(obj4.d2); // 200
        obj4.fun(); // C's fun
        ((Parent)obj4).fun(); // C's fun
        obj4.fun1(); // P's fun 1
        obj4.fun2(); // C's fun 2
    }
}
