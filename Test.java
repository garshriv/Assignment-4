import java.util.Scanner;
abstract class Figure {
    
     double dim1;
     abstract void findArea();
     abstract void findPerimeter();
}
class Circle extends Figure{
	float pi = 3.14f;
    Scanner s= new Scanner(System.in);
    void findArea()  {  
         System.out.println("Enter the radius of the Circle:");
         
         float radius= s.nextFloat();
           float area = pi * radius * radius;  
           System.out.println("Area of circle : "+area);  
      }  
      
      void findPerimeter(){
          System.out.print("Enter radius of circle:");
        int r = s.nextInt();
        float perimeter = 2 * pi * r;
        System.out.println("Perimeter of circle:"+perimeter);
      }
} 
class Triangle extends Figure{

     void findArea(){
        Scanner scanner= new Scanner(System.in);
      System.out.println("Enter the 1st side:");
		         int a= scanner.nextInt();
		a=5;
		         System.out.println("Enter the 2nd side:");
		          int b= scanner.nextInt();
		b=5;
		         System.out.println("Enter the 3rd side:");
		         int c= scanner.nextInt();
		         c=7;
		        if((a+b)>c && (a+c)>b && (b+c)>a)
		          {
		            int s=(a+b+c)/2;
		            double  area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		             System.out.println("Area of Triangle is: " + area);    
		           }
		         else  
		           System.out.println("Area of Triangle not exit");
        
     }
     void findPerimeter(){
        Scanner scanner= new Scanner(System.in);
           System.out.print("Enter length of first side of triangle:");
       int s1 = scanner.nextInt();
        System.out.print("Enter length of second side of triangle:");
        int s2 = scanner.nextInt();
        System.out.print("Enter length of third side of triangle:");
       int s3 = scanner.nextInt();
        int perimeter = s1 + s2 + s3;
        System.out.println("Perimeter of triangle:"+perimeter);
      }
}
class Rectangle extends Figure{

void findArea()  
      {  
            Scanner s= new Scanner(System.in);
          System.out.print("Enter length of rectangle:");
        int length  = s.nextInt();
        System.out.print("Enter breadth of rectangle:");
        int breadth = s.nextInt();

           //calculate area of rectangle  
           int area = length * breadth;  
           //print on the screen  
           System.out.println("Area of rectangle : "+area);  
      } 
      void findPerimeter(){
          Scanner s= new Scanner(System.in);
          System.out.print("Enter length of rectangle:");
        int l = s.nextInt();
        System.out.print("Enter breadth of rectangle:");
        int b = s.nextInt();
        int perimeter = 2 * (l + b);
        System.out.println("Perimeter of rectangle:"+perimeter);
      }
    
}

        
public class Test{
     public static void main(String args[]){
      Figure c = new Circle();
      c.findArea();
      c.findPerimeter();
      
     Figure r = new Rectangle();
      r.findArea();
      r.findPerimeter();
     
      Figure t = new Triangle();
      t.findArea();
      t.findPerimeter();
     
  }
}
