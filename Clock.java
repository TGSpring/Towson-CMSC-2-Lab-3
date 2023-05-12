public class Clock
{
  private int hr;
  private int min;
  private int sec;
  
  public Clock()
  {
    setTime(0, 0, 0);
  }
  
  public Clock(int hours, int minutes, int seconds)
  {
    setTime(hours, minutes, seconds);
  }
  
  public void setTime(int hours, int minutes, int seconds)
  {
    if (0 <= hours && hours < 24)
      hr = hours;
    else
      hr = 0;
    
    if (0 <= minutes && minutes < 60)
      min = minutes;
    else
      min = 0;
    
    if(0 <= seconds && seconds < 60)
      sec = seconds;
    else
      sec = 0;
  }
  
  public int getHours()
  {
    return hr;
  }
  
  public int getMinutes()
  {
    return min;
  }
  
  public int getSeconds()
  {
    return sec;
  }
  
  public void printTime()
  {
    if (hr < 10)
      System.out.print("0");
    System.out.print(hr + ":");
    
    if (min < 10)
      System.out.print("0");
    System.out.print(min + ":");
    
    if (sec < 10)
      System.out.print("0");
    System.out.print(sec);
  }
  
  public void incrementSeconds()
  {
    sec++;
    if (sec > 59)
    {
      sec = 0;
      incrementMinutes();
    }
  }
  
  public void incrementMinutes()
  {
    min++;
    if (min > 59)
    {
      min = 0;
      incrementHours();
    }
  }
  
  public void incrementHours()
  {
    hr++;
    if(hr > 23)
      hr = 0;
  }
  
  public boolean equals(Clock otherClock)
  {
    return (hr == otherClock.hr && min == otherClock.min && sec == otherClock.sec);
  }
  
  public void makeCopy(Clock otherClock)
  {
    hr =  otherClock.hr;
    min = otherClock.min;
    sec = otherClock.sec;
  }
  
  public Clock getCopy()
  {
    Clock temp = new Clock();
    
    temp.hr = hr;
    temp.min = min;
    temp.sec = sec;
    
    return temp;
  }
}
class ExtClock extends Clock
{
  private String timeZ;
  
  public ExtClock()
  {
    this.timeZ = "UTC";
  }
      public ExtClock(int hours, int mins, int sec, String timeZ)
      {
        super(hours, mins, sec);
        this.timeZ = timeZ;
      }
      public void printTime()
      {
        super.printTime();
        System.out.print(" " + timeZ);
      }
      public boolean equals(ExtClock otherClock)
      {
        return super.equals(otherClock) && timeZ.equalsIgnoreCase(otherClock.timeZ);
      }
      public Clock getCopy()
      {
        ExtClock temp = new ExtClock(getHours(), getMinutes(), getSeconds(), timeZ);
        return temp;
      }
}