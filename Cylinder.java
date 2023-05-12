public class Cylinder
{
    protected double x, y; // coordinates of the Point

     //Default constructor
    public Cylinder()
    {
       setCylinder( 0, 0 );
    }

     //Constructor with parameters
    public Cylinder(double xValue, double yValue )
    {
       setCylinder(xValue, yValue );
    }

     // set x and y coordinates of Point
    public void setCylinder(double xValue, double yValue )
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
    public boolean equals(Cylinder otherCylinder)
    {
        return(x == otherCylinder.x &&
               y == otherCylinder.y);
    }

     //Method to compare two points
   public void makeCopy(Cylinder otherCylinder)
   {
       x = otherCylinder.x;
       y = otherCylinder.y;
 }

    public Cylinder getCopy()
    {
       Cylinder temp = new Cylinder();

       temp.x = x;
       temp.y = y;

       return temp;
    }

     // print method
    public void printCylinder()
    {
       System.out.print("[" + String.format("%.2f", x)
                      + ", " + String.format("%.2f", y) + "]");
    }
}

class secondCylinder extends Cylinder
{
  private double rad;
  private double height;
  
  public secondCylinder()
  {
    this.rad = 0;
    this.height = 0;
  }
  
  public secondCylinder(double xValue, double yValue, double rad, double height)
  {
    super(xValue, yValue);
    this.rad = rad;
    this.height = height;
  }
  public void printCylinder()
  {
    super.printCylinder();
    System.out.print("\nRadius: " + rad + "\n");
    System.out.println("Volume: " + String.format("%.2f", vol()));
    System.out.println("Area: " + String.format("%.2f", sArea()));
    System.out.println("Base: " + String.format("%.2f", base()));
  }
  
  public boolean equals(secondCylinder otherCylinder)
  {
    return super.equals(otherCylinder) && rad == (otherCylinder.rad);
  }
  
  public Cylinder getCopy()
  {
    Cylinder temp = new secondCylinder(getX(), getY(), rad, height);
    return temp;
  }
  
  public double vol()
  {
    return rad * 2 * height;
  }
  
  public double sArea()
  {
    return (2 * Math.PI * rad * height) + (2 * Math.PI * rad * rad);
  }
  public double base()
  {
    return rad * 2;
}
}