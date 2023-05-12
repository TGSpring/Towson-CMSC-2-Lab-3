public class Point
{
    protected double x, y; // coordinates of the Point

     //Default constructor
    public Point()
    {
       setPoint( 0, 0 );
    }

     //Constructor with parameters
    public Point(double xValue, double yValue )
    {
       setPoint(xValue, yValue );
    }

     // set x and y coordinates of Point
    public void setPoint(double xValue, double yValue )
    {
       x = xValue;
       y = yValue;
    }

     // get x coordinate
    public double getX()
    {
       return x;
    }

     // get y coordinate
    public double getY()
    {
       return y;
    }

     // convert point into String representation
    public String toString()
    {
       return "[" + String.format("%.2f", x)
              + ", " + String.format("%.2f", y) + "]";
    }

     //Method to compare two points
    public boolean equals(Point otherPoint)
    {
        return(x == otherPoint.x &&
               y == otherPoint.y);
    }

     //Method to compare two points
   public void makeCopy(Point otherPoint)
   {
       x = otherPoint.x;
       y = otherPoint.y;
 }

    public Point getCopy()
    {
       Point temp = new Point();

       temp.x = x;
       temp.y = y;

       return temp;
    }

     // print method
    public void printPoint()
    {
       System.out.print("[" + String.format("%.2f", x)
                      + ", " + String.format("%.2f", y) + "]");
    }
}

class Circle extends Point
{
  private double rad;
  
  public Circle()
  {
    this.rad = 0;
  }
  
  public Circle(double xValue, double yValue, double rad)
  {
    super(xValue, yValue);
    this.rad = rad;
  }
  public void printPoint()
  {
    super.printPoint();
    System.out.print("\nRadius: " + rad + "\n");
    System.out.println("Circumfernce: " + String.format("%.2f", Circum()));
    System.out.println("Area: " +String.format("%.2f", area()));
  }
  
  public boolean equals(Circle otherCircle)
  {
    return super.equals(otherCircle) && rad == (otherCircle.rad);
  }
  
  public Circle getCopy()
  {
    Circle temp = new Circle(getX(), getY(), rad);
    return temp;
  }
  
  public double area()
  {
    return Math.PI * rad * rad;
  }
  public double Circum()
  {
    return 2 * Math.PI * rad;
  }
  
}















