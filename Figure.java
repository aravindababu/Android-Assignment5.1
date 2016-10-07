/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractexample;

/**
 *
 * @author user2
 */
abstract class Figure {
    
    double dim1;
    //using this dim1 as radius,length,width,base,side
    
    abstract void findArea();
    abstract void findPerimeter();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Circle C=new Circle();
        
        new Circle().findArea();
        new Circle().findPerimeter();
        //Printing values of Area and Perimeter of Circle
        
        //Rectangle R =new Rectangle();
        new Rectangle().findArea();
        new Rectangle().findPerimeter();
        //Printing values of Area and Perimeter of Rectangle
        
        //Triangle T=new Triangle();
        new Triangle().findArea();
        new Triangle().findPerimeter();
        //Printing values of Area and Perimeter of Triangle
    }
}
//class Circle extending Figure class which is abstract and 
//Implementing both the abstract method from abstract class
class Circle extends Figure{
    //declaring new value for double to calculate area and perimeter of Rectangle 
    double dim1=2.8;
    
    @Override
    void findArea() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //Area of Circle = pi*r*r
   double Area= 3.14*dim1*dim1;
   System.out.println("Area of Circle: " +Area);
        
    }

    @Override
    void findPerimeter() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //Perimeter of Circle = 2*pi*r
    double Perimeter=2*3.14*dim1;
    System.out.println("Perimeter of Circle: " +Perimeter);
    }
    
}
//class Rectangle extending Figure class which is abstract and 
//Implementing both the abstract method from abstract class
class Rectangle extends Figure{
    //declaring new value for double to calculate area and perimeter of Rectangle 
    double dim1=4.7;
    
    @Override
    void findArea() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //Area of Rectangle = length*width
    double areaRectangle=dim1*dim1;
    System.out.println("Area of Rectangle: " +areaRectangle);
    }

    @Override
    void findPerimeter() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //Perimeter of Rectangle = 2(length+width)
    double perimeterRectangle=2*(dim1+dim1);
    System.out.println("Perimeter of Rectangle: " +perimeterRectangle);
    }
    
}

//class Triangle extending Figure class which is abstract and 
//Implementing both the abstract method from abstract class
class Triangle extends Figure{
    //declaring new value for double to calculate area and perimeter of Triangle
    double dim1=5.5;
    @Override
    void findArea() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //Area of Triangle=(height*base)/2
    double areaTriangle=(dim1*dim1)/2;
    System.out.println("Area of Triangle: " +areaTriangle);
    }

    @Override
    void findPerimeter() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //Area of Triangle=Side+Base+Side
    double perimeterTriangle=dim1+dim1+dim1;
    System.out.println("Perimeter of Triangle: " +perimeterTriangle);
    }
    
}

