package assignment01;
<<<<<<< HEAD
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class ComputerTester{
  public static void main(String[] args){
    Computer comp1 = new Computer("Lenovo", "Quad Core Nividia Terga 3", 16, 1200, false, 3000);
    Computer comp2 = new Computer("Apple", "Intel Core i9", 12, 500, false, 3750);
    Computer comp3 = new Computer("Dell", "Six Core U-SeriesCore i7", 18, 128, true, 2500);
    Computer comp4 = new Computer("Chromebook", "Intel Celeron N2830", 16, 1050, true, 2300);

    System.out.println(comp1);
    System.out.println(comp2);
    System.out.println(comp3);
    System.out.println(comp4);

    try(var output =new PrintWriter(new FileOutputStream(
    			    new File("output.txt"), true /* true means append to file */))) {
    			output.println("\nTESTS FOR Computer.java:");

    Computer comp12 = new Computer("Lenovo", "Quad Core Nividia Terga 3", 16, 1200, false, 3000);
    Computer comp22 = new Computer("Apple", "Intel Core i9", 12, 500, false, 3750);
    Computer comp32 = new Computer("Dell", "Six Core U-SeriesCore i7", 18, 128, true, 2500);
    Computer comp42 = new Computer("Chromebook", "Intel Celeron N2830", 16, 1050, true, 2300);

    output.print(comp12);
    output.print("\n");
    output.print(comp22);
    output.print("\n");
    output.print(comp32);
    output.print("\n");
    output.print(comp42);

    } catch (FileNotFoundException e) {
      e.printStackTrace();
      }
  }
}
=======


>>>>>>> 756c32247216a5a9e2480ea2be30eeb85193ecf4
