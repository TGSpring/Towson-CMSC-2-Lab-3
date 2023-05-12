public class testCylinder
{
  public static void main(String [] args)
  {
    Cylinder myCyl = new Cylinder(1,2);
    myCyl.printCylinder();
    System.out.println("\n");
    
    secondCylinder testCyl = new secondCylinder(2,3,2,4);
    testCyl.printCylinder();
  }
  
}