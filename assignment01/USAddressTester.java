package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class USAddressTester{
  public static void main(String[] args){
    StreetUSAddress address1 = new StreetUSAddress("2900 Southern Boulevard","","Bronx","NY","10458");
    StreetUSAddress address2 = new StreetUSAddress("420 Round Hill Road","Apt 5I","Yonkers","NY","10705");

    System.out.println(address1);
    System.out.println(address2);


    try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR StreetUSAddress.java:");
    StreetUSAddress address12 = new StreetUSAddress("2900 Southern Boulevard","","Bronx","NY","10458");
    StreetUSAddress address22 = new StreetUSAddress("420 Round Hill Road","Apt 5I","Yonkers","NY","10705");

    output.print(address12);
    output.print("\n");
    output.print(address22);

  } catch (FileNotFoundException e) {
    e.printStackTrace();
    }
  }
}
