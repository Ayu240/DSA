class Shape{
   int l,h;
   public void area (){
       System.out.println("dispay area");
   }
}
class Triangle extends Shape{
    public void area(int l,int h){
        System.out.println("the area of triangle is:"+0.5*l*h);
    }
}
class Cricle extends Triangle{
    public void area(int r){
        System.out.print("the area of cricle is:");
        System.out.println((3.14)*r*r);
    }
}
class Rectangle extends Shape{
    public void area ( int l,int b){
        System.out.println("the area of Rectangle : " +l*b);
    }
    public void perimeter(int l,int b){
        System.out.println("the perimeter of rectangle :"+2*(l+b));
    }
}

public class Inheritace {
   public static void main(String[] args) {
    Triangle t1=new Triangle();
   
    System.out.println("triangle ");
    t1.area(10,20);
     
   Cricle c1=new Cricle();
   System.out.println("cricle ");
   c1.area(20);

   // thea rea of rectangle 
   Rectangle r1=new Rectangle();
   System.out.println("REctangle ");
   r1.area(90,43); 
   r1.perimeter(3, 90);
   
   }
}
