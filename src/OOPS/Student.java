package OOPS;

//OOPS Concept demo
public class Student {
    String name;
    int age;

    public void sayHello() {
        System.out.println(name + " says hello" + " and he is " + age + "-years old.");
    }

    public void sayHi(String name, Student s) {
        /*
        * this.name ---> context in which this function is going to run
        * name ---> name that you are going to pass as an argument while calling this function.
        * name could also be seen as local variable of this function.
        * */
        System.out.println(this.name + " says hi to " + name);
        s.sayHello();
    }
}
