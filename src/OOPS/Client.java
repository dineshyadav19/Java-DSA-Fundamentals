package OOPS;

//OOPS Concept demo
public class Client {
    public static void main(String[] args) {
        /*Every time I am using new key word with the instance of student,
        *it is coping all the data members of student class in heap memory.
        */
        //Student s1 = new Student();
        //s1.name = "Mohit";
        //s1.age = 24;
        /*
        * whenever a function defined inside a class is called somewhere it
        * carries a this key word along with that
        * this key word tells you in which context that function is called.
        * For eg. here sayHello is called in context of s1 so address
        * of s1 will be passed to this.
        *
        */
        //s1.sayHello();

        Student s = new Student();

        System.out.println(s.name);
        System.out.println(s.age);

        s.name = "Amit";
        s.age = 10;

        System.out.println(s.name);
        System.out.println(s.age);

        Student s1 = s;
        s1.name = "Rohit";

        System.out.println(s.name);

        Student s2 = new Student();
        s2.name = "Mohit";
        s2.age = 20;

        System.out.println(s2.name);
        System.out.println(s2.age);

        s1 = s2;

        Student s3 = new Student();
        s3.age = 10;
        s3.name = "A";

        Student s4 = new Student();
        s4.age = 20;
        s4.name = "B";

        Test1(s3, s4);
        System.out.println(s3.age + " " + s3.name);
        System.out.println(s4.age + " " + s4.name);

        // Test2(s3, s4);
        System.out.println(s3.age + " " + s3.name);
        System.out.println(s4.age + " " + s4.name);

        int myAge = 30;
        String myName = "C";

        //Test3(s3, s4.age, s4.name, myAge, myName);
        System.out.println(s3.age + " " + s3.name);
        System.out.println(s4.age + " " + s4.name);
        System.out.println(myAge + " " + myName);

        s3.sayHello();
        // s4.sayHello();

        // System.out.println(s3.name);
        // System.out.println(s3.age);

        //s3.sayHi("Pawan", s4);
    }

    public static void Test3(Student s, int age, String name, int myAge, String myName) {
        s = new Student();
        // s.age = 0;
        // s.name = "_";
        age = 0;
        name = "_";
        myAge = 0;
        myName = "_";
    }

    public static void Test2(Student s1, Student s2) {

        s2 = new Student();
        int tempa = s1.age;
        s1.age = s2.age;
        s2.age = tempa;

        s1 = new Student();
        String tempn = s1.name;
        s1.name = s2.name;
        s2.name = tempn;
    }

    public static void Test1(Student s1, Student s2) {
        Student temp = s1;
        s1 = s2;
        s2 = temp;
    }


}
