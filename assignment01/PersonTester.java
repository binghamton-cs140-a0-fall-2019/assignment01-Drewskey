package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class PersonTester{
  public static void main(String[] args){

    DateAndPlaceOfBirth myBirth = new DateAndPlaceOfBirth(2000,2,12,"Yonkers","New York","USA");
    StreetUSAddress myAddress = new StreetUSAddress("6 Alpha Street","","Yonkers","NY","10707");
    Person me = new Person("Andrew","Ricci","420-69-4604",myBirth,myAddress);
    System.out.println(me);

    try(var output =new PrintWriter(new FileOutputStream(
          new File("output.txt"), true /* true means append to file */))) {
      output.println("\nTESTS FOR Person.java:");

      DateAndPlaceOfBirth myBirth2 = new DateAndPlaceOfBirth(2000,2,12,"Yonkers","New York","USA");
      StreetUSAddress myAddress2 = new StreetUSAddress("6 Alpha Street","","Yonkers","NY","10707");
      Person me2 = new Person("Andrew","Ricci","420-69-4604",myBirth2,myAddress2);
      output.print(me2);

    } catch (FileNotFoundException e) {
      e.printStackTrace();
      }
  }
}
