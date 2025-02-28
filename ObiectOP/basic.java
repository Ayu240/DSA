class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("I am writing");
    }

    public void printColor(){
        System.out.println(this.color);
    }

    // public void printInfo(){
    //     System.out.println(color+" \n"+type);
    // }
}

class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    //construction,this is non-parameter constructor

    Student(){
        System.out.println("constructor is called :");
    }

    //parameterized constructor
    // Student(String name,int age){
    //     System.out.println("this is called parameterized constructor :)");
    //     this.name="ayua";
    //     this.age=20;
    // }

    //cpoy construction
    Student(Student s){
        this.name=s.name;
        this.age=s.age;
    }
}  
public class basic {
    public static void main(String[] args) {
    //     Pen pen=new Pen();
    //     pen.color="red";
    //     pen.type="dot";

    //     Pen pen2=new Pen();
    //     pen2.color="blue";
    //     pen2.type="ballpoint";

    //        //clalling a Method
    //     pen.write();
    //        //caling information
    //    //  pen.printInfo();

    //     pen.printColor();
    //     pen2.printColor();

        Student s1=new Student();
        s1.name="ayush";
        s1.age=21;
        Student s=new Student(s1);
        s1.printInfo();
    }
}
