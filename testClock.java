public class testClock
{
  public static void main(String [] args)
  {
    Clock myClock = new Clock(15,10,45);
    myClock.printTime();
    System.out.println("");
    
    ExtClock timeZClock = new ExtClock(10,45,00, "IST");
      timeZClock.printTime();
      System.out.println("");
  }
}