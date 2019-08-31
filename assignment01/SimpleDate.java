package assignment01;
import java.time.LocalDate;

public class SimpleDate{
  private int year;
  private int month;
  private int day;

  public static SimpleDate of(int yr, int m, int d){
    var returnValue = new SimpleDate();
    returnValue.year = yr;
    returnValue.month = m;
    returnValue.day = d;
    return returnValue;
  }
  public int getYear(){
    return year;
  }
  public int getMonth(){
    return month;
  }
  public int getDay(){
    return day;
  }

  public boolean before(SimpleDate other){
    if(this.year < other.getYear()){
      return true;
    }else if(this.year > other.getYear()){
      return false;
    }else if (this.month > other.getMonth()) {
      return true;
    }else if (this.month < other.getMonth()) {
      return false;
    }else if (this.day < other.getDay()) {
      return true;
    }else if (this.day > other.getDay()) {
      return false;
    }else{
      return false;
    }
  }
}
