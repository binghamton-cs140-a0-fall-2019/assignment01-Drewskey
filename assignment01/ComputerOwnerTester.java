package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class ComputerOwnerTester{
  public static void main(String[] args){
    DateAndPlaceOfBirth nerdBirth = new DateAndPlaceOfBirth(1980,6,27,"Scarsdale","New York","USA");
    StreetUSAddress nerdAddress = new StreetUSAddress("6 Beta Street","","San Fransisco","CA","90210");
    Person nerd = new Person("Nick","Deoki","101-10-1010",nerdBirth,nerdAddress);
    Computer comp1 = new Computer("Lenovo", "Quad Core Nividia Terga 3", 16, 1200, false, 3000);
    Computer comp2 = new Computer("Apple", "Intel Core i9", 12, 500, false, 3750);
    Computer comp3 = new Computer("Dell", "Six Core U-SeriesCore i7", 18, 128, true, 2500);
    Computer comp4 = new Computer("Chromebook", "Intel Celeron N2830", 16, 1050, true, 2300);

    ComputerOwner nickTheNerd = new ComputerOwner(nerd);

    nickTheNerd.addComputer(comp1);
    nickTheNerd.addComputer(comp2);
    nickTheNerd.addComputer(comp3);
    nickTheNerd.addComputer(comp4);
    System.out.println(nickTheNerd);
    System.out.println("\n");
    nickTheNerd.removeComputer(0);
    nickTheNerd.removeComputer(2);
    System.out.println(nickTheNerd);

    try(var output =new PrintWriter(new FileOutputStream(
    			    new File("output.txt"), true /* true means append to file */))) {
    			output.println("\nTESTS FOR ComputerOwnerTester.java:");

        DateAndPlaceOfBirth nerdBirth2 = new DateAndPlaceOfBirth(1980,6,27,"Scarsdale","New York","USA");
        StreetUSAddress nerdAddress2 = new StreetUSAddress("6 Beta Street","","San Fransisco","CA","90210");
        Person nerd2 = new Person("Nick","Deoki","101-10-1010",nerdBirth2,nerdAddress2);
        Computer comp12 = new Computer("Lenovo", "Quad Core Nividia Terga 3", 16, 1200, false, 3000);
        Computer comp22 = new Computer("Apple", "Intel Core i9", 12, 500, false, 3750);
        Computer comp32 = new Computer("Dell", "Six Core U-SeriesCore i7", 18, 128, true, 2500);
        Computer comp42 = new Computer("Chromebook", "Intel Celeron N2830", 16, 1050, true, 2300);

        ComputerOwner nickTheNerd2 = new ComputerOwner(nerd2);

        nickTheNerd2.addComputer(comp12);
        nickTheNerd2.addComputer(comp22);
        nickTheNerd2.addComputer(comp32);
        nickTheNerd2.addComputer(comp42);
        output.println(nickTheNerd2);
        output.println("\n");
        nickTheNerd2.removeComputer(0);
        nickTheNerd2.removeComputer(2);
        output.println(nickTheNerd2);

      } catch (FileNotFoundException e) {
        e.printStackTrace();
        }
  }
}
