package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class PlaceDOBTester{
  public static void main(String[] args){

    DateAndPlaceOfBirth pAndDob1 = new DateAndPlaceOfBirth(1732, 2, 22,"Popes Creek","Virginia","USA");
    DateAndPlaceOfBirth pAndDob2 = new DateAndPlaceOfBirth(1809, 2, 12,"Hardin County","Kentucky","USA");
    DateAndPlaceOfBirth pAndDob3 = new DateAndPlaceOfBirth(2000, 2, 12,"Yonkers","New York","USA");
    DateAndPlaceOfBirth pAndDob4 = new DateAndPlaceOfBirth(1809, 2, 12,"Shrewsbury","England");
    DateAndPlaceOfBirth pAndDob5 = new DateAndPlaceOfBirth(1867, 11, 7,"Warsaw","Poland");

    System.out.println(pAndDob1);   //Prints the palce and DOB for each class
    System.out.println(pAndDob2);
    System.out.println(pAndDob3);
    System.out.println(pAndDob4);
    System.out.println(pAndDob5);

    System.out.println(pAndDob1.olderThan(pAndDob2));
    System.out.println(pAndDob1.olderThan(pAndDob3));
    System.out.println(pAndDob1.olderThan(pAndDob4));
    System.out.println(pAndDob1.olderThan(pAndDob5));
    System.out.println(pAndDob2.olderThan(pAndDob1));
    System.out.println(pAndDob2.olderThan(pAndDob3));
    System.out.println(pAndDob2.olderThan(pAndDob4));
    System.out.println(pAndDob2.olderThan(pAndDob5));
    System.out.println(pAndDob3.olderThan(pAndDob1));
    System.out.println(pAndDob3.olderThan(pAndDob2));
    System.out.println(pAndDob3.olderThan(pAndDob4));
    System.out.println(pAndDob3.olderThan(pAndDob5));
    System.out.println(pAndDob4.olderThan(pAndDob1));
    System.out.println(pAndDob4.olderThan(pAndDob2));
    System.out.println(pAndDob4.olderThan(pAndDob3));
    System.out.println(pAndDob4.olderThan(pAndDob5));
    System.out.println(pAndDob5.olderThan(pAndDob1));
    System.out.println(pAndDob5.olderThan(pAndDob2));
    System.out.println(pAndDob5.olderThan(pAndDob3));
    System.out.println(pAndDob5.olderThan(pAndDob4));

    System.out.println(pAndDob1.youngerThan(pAndDob2));
    System.out.println(pAndDob1.youngerThan(pAndDob3));
    System.out.println(pAndDob1.youngerThan(pAndDob4));
    System.out.println(pAndDob1.youngerThan(pAndDob5));
    System.out.println(pAndDob2.youngerThan(pAndDob1));
    System.out.println(pAndDob2.youngerThan(pAndDob3));
    System.out.println(pAndDob2.youngerThan(pAndDob4));
    System.out.println(pAndDob2.youngerThan(pAndDob5));
    System.out.println(pAndDob3.youngerThan(pAndDob1));
    System.out.println(pAndDob3.youngerThan(pAndDob2));
    System.out.println(pAndDob3.youngerThan(pAndDob4));
    System.out.println(pAndDob3.youngerThan(pAndDob5));
    System.out.println(pAndDob4.youngerThan(pAndDob1));
    System.out.println(pAndDob4.youngerThan(pAndDob2));
    System.out.println(pAndDob4.youngerThan(pAndDob3));
    System.out.println(pAndDob4.youngerThan(pAndDob5));
    System.out.println(pAndDob5.youngerThan(pAndDob1));
    System.out.println(pAndDob5.youngerThan(pAndDob2));
    System.out.println(pAndDob5.youngerThan(pAndDob3));
    System.out.println(pAndDob5.youngerThan(pAndDob4));

    System.out.println(pAndDob1.hasSameBirthDateAs(pAndDob2));
    System.out.println(pAndDob1.hasSameBirthDateAs(pAndDob3));
    System.out.println(pAndDob1.hasSameBirthDateAs(pAndDob4));
    System.out.println(pAndDob1.hasSameBirthDateAs(pAndDob5));
    System.out.println(pAndDob2.hasSameBirthDateAs(pAndDob1));
    System.out.println(pAndDob2.hasSameBirthDateAs(pAndDob3));
    System.out.println(pAndDob2.hasSameBirthDateAs(pAndDob4));
    System.out.println(pAndDob2.hasSameBirthDateAs(pAndDob5));
    System.out.println(pAndDob3.hasSameBirthDateAs(pAndDob1));
    System.out.println(pAndDob3.hasSameBirthDateAs(pAndDob2));
    System.out.println(pAndDob3.hasSameBirthDateAs(pAndDob4));
    System.out.println(pAndDob3.hasSameBirthDateAs(pAndDob5));
    System.out.println(pAndDob4.hasSameBirthDateAs(pAndDob1));
    System.out.println(pAndDob4.hasSameBirthDateAs(pAndDob2));
    System.out.println(pAndDob4.hasSameBirthDateAs(pAndDob3));
    System.out.println(pAndDob4.hasSameBirthDateAs(pAndDob5));
    System.out.println(pAndDob5.hasSameBirthDateAs(pAndDob1));
    System.out.println(pAndDob5.hasSameBirthDateAs(pAndDob2));
    System.out.println(pAndDob5.hasSameBirthDateAs(pAndDob3));
    System.out.println(pAndDob5.hasSameBirthDateAs(pAndDob4));

    System.out.println(pAndDob1.hasSameBirthDayAs(pAndDob2));
    System.out.println(pAndDob1.hasSameBirthDayAs(pAndDob3));
    System.out.println(pAndDob1.hasSameBirthDayAs(pAndDob4));
    System.out.println(pAndDob1.hasSameBirthDayAs(pAndDob5));
    System.out.println(pAndDob2.hasSameBirthDayAs(pAndDob1));
    System.out.println(pAndDob2.hasSameBirthDayAs(pAndDob3));
    System.out.println(pAndDob2.hasSameBirthDayAs(pAndDob4));
    System.out.println(pAndDob2.hasSameBirthDayAs(pAndDob5));
    System.out.println(pAndDob3.hasSameBirthDayAs(pAndDob1));
    System.out.println(pAndDob3.hasSameBirthDayAs(pAndDob2));
    System.out.println(pAndDob3.hasSameBirthDayAs(pAndDob4));
    System.out.println(pAndDob3.hasSameBirthDayAs(pAndDob5));
    System.out.println(pAndDob4.hasSameBirthDayAs(pAndDob1));
    System.out.println(pAndDob4.hasSameBirthDayAs(pAndDob2));
    System.out.println(pAndDob4.hasSameBirthDayAs(pAndDob3));
    System.out.println(pAndDob4.hasSameBirthDayAs(pAndDob5));
    System.out.println(pAndDob5.hasSameBirthDayAs(pAndDob1));
    System.out.println(pAndDob5.hasSameBirthDayAs(pAndDob2));
    System.out.println(pAndDob5.hasSameBirthDayAs(pAndDob3));
    System.out.println(pAndDob5.hasSameBirthDayAs(pAndDob4));

    try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR DateAndPlaceOfBirth.java:");

    DateAndPlaceOfBirth pAndDob12 = new DateAndPlaceOfBirth(1732, 2, 22,"Popes Creek","Virginia","USA");
    DateAndPlaceOfBirth pAndDob22 = new DateAndPlaceOfBirth(1809, 2, 12,"Hardin County","Kentucky","USA");
    DateAndPlaceOfBirth pAndDob32 = new DateAndPlaceOfBirth(2000, 2, 12,"Yonkers","New York","USA");
    DateAndPlaceOfBirth pAndDob42 = new DateAndPlaceOfBirth(1809, 2, 12,"Shrewsberry","England");
    DateAndPlaceOfBirth pAndDob52 = new DateAndPlaceOfBirth(1867, 11, 7,"Warsaw","Poland");

    output.print(pAndDob12);  //Prints the palce and DOB for each class
    output.print("\n");
    output.print(pAndDob22);
    output.print("\n");
    output.print(pAndDob32);
    output.print("\n");
    output.print(pAndDob42);
    output.print("\n");
    output.print(pAndDob52);
    output.print("\n");

    output.print(pAndDob12.olderThan(pAndDob22));
    output.print(pAndDob12.olderThan(pAndDob32));
    output.print(pAndDob12.olderThan(pAndDob42));
    output.print(pAndDob12.olderThan(pAndDob52));
    output.print(pAndDob22.olderThan(pAndDob12));
    output.print(pAndDob22.olderThan(pAndDob32));
    output.print(pAndDob22.olderThan(pAndDob42));
    output.print(pAndDob22.olderThan(pAndDob52));
    output.print(pAndDob32.olderThan(pAndDob12));
    output.print(pAndDob32.olderThan(pAndDob22));
    output.print(pAndDob32.olderThan(pAndDob42));
    output.print(pAndDob32.olderThan(pAndDob52));
    output.print(pAndDob42.olderThan(pAndDob12));
    output.print(pAndDob42.olderThan(pAndDob22));
    output.print(pAndDob42.olderThan(pAndDob32));
    output.print(pAndDob42.olderThan(pAndDob52));
    output.print(pAndDob52.olderThan(pAndDob12));
    output.print(pAndDob52.olderThan(pAndDob22));
    output.print(pAndDob52.olderThan(pAndDob32));
    output.print(pAndDob52.olderThan(pAndDob42));

    output.print(pAndDob12.youngerThan(pAndDob22));
    output.print(pAndDob12.youngerThan(pAndDob32));
    output.print(pAndDob12.youngerThan(pAndDob42));
    output.print(pAndDob12.youngerThan(pAndDob52));
    output.print(pAndDob22.youngerThan(pAndDob12));
    output.print(pAndDob22.youngerThan(pAndDob32));
    output.print(pAndDob22.youngerThan(pAndDob42));
    output.print(pAndDob22.youngerThan(pAndDob52));
    output.print(pAndDob32.youngerThan(pAndDob12));
    output.print(pAndDob32.youngerThan(pAndDob22));
    output.print(pAndDob32.youngerThan(pAndDob42));
    output.print(pAndDob32.youngerThan(pAndDob52));
    output.print(pAndDob42.youngerThan(pAndDob12));
    output.print(pAndDob42.youngerThan(pAndDob22));
    output.print(pAndDob42.youngerThan(pAndDob32));
    output.print(pAndDob42.youngerThan(pAndDob52));
    output.print(pAndDob52.youngerThan(pAndDob12));
    output.print(pAndDob52.youngerThan(pAndDob22));
    output.print(pAndDob52.youngerThan(pAndDob32));
    output.print(pAndDob52.youngerThan(pAndDob42));

    output.print(pAndDob12.hasSameBirthDateAs(pAndDob22));
    output.print(pAndDob12.hasSameBirthDateAs(pAndDob32));
    output.print(pAndDob12.hasSameBirthDateAs(pAndDob42));
    output.print(pAndDob12.hasSameBirthDateAs(pAndDob52));
    output.print(pAndDob22.hasSameBirthDateAs(pAndDob12));
    output.print(pAndDob22.hasSameBirthDateAs(pAndDob32));
    output.print(pAndDob22.hasSameBirthDateAs(pAndDob42));
    output.print(pAndDob22.hasSameBirthDateAs(pAndDob52));
    output.print(pAndDob32.hasSameBirthDateAs(pAndDob12));
    output.print(pAndDob32.hasSameBirthDateAs(pAndDob22));
    output.print(pAndDob32.hasSameBirthDateAs(pAndDob42));
    output.print(pAndDob32.hasSameBirthDateAs(pAndDob52));
    output.print(pAndDob42.hasSameBirthDateAs(pAndDob12));
    output.print(pAndDob42.hasSameBirthDateAs(pAndDob22));
    output.print(pAndDob42.hasSameBirthDateAs(pAndDob32));
    output.print(pAndDob42.hasSameBirthDateAs(pAndDob52));
    output.print(pAndDob52.hasSameBirthDateAs(pAndDob12));
    output.print(pAndDob52.hasSameBirthDateAs(pAndDob22));
    output.print(pAndDob52.hasSameBirthDateAs(pAndDob32));
    output.print(pAndDob52.hasSameBirthDateAs(pAndDob42));

    output.print(pAndDob12.hasSameBirthDayAs(pAndDob22));
    output.print(pAndDob12.hasSameBirthDayAs(pAndDob32));
    output.print(pAndDob12.hasSameBirthDayAs(pAndDob42));
    output.print(pAndDob12.hasSameBirthDayAs(pAndDob52));
    output.print(pAndDob22.hasSameBirthDayAs(pAndDob12));
    output.print(pAndDob22.hasSameBirthDayAs(pAndDob32));
    output.print(pAndDob22.hasSameBirthDayAs(pAndDob42));
    output.print(pAndDob22.hasSameBirthDayAs(pAndDob52));
    output.print(pAndDob32.hasSameBirthDayAs(pAndDob12));
    output.print(pAndDob32.hasSameBirthDayAs(pAndDob22));
    output.print(pAndDob32.hasSameBirthDayAs(pAndDob42));
    output.print(pAndDob32.hasSameBirthDayAs(pAndDob52));
    output.print(pAndDob42.hasSameBirthDayAs(pAndDob12));
    output.print(pAndDob42.hasSameBirthDayAs(pAndDob22));
    output.print(pAndDob42.hasSameBirthDayAs(pAndDob32));
    output.print(pAndDob42.hasSameBirthDayAs(pAndDob52));
    output.print(pAndDob52.hasSameBirthDayAs(pAndDob12));
    output.print(pAndDob52.hasSameBirthDayAs(pAndDob22));
    output.print(pAndDob52.hasSameBirthDayAs(pAndDob32));
    output.print(pAndDob52.hasSameBirthDayAs(pAndDob42));
    } catch (FileNotFoundException e) {
      e.printStackTrace();
      }

    }
}
