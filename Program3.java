import java.util.ArrayList;
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in); 
    System.out.println("zadejte pocet cisel");
    int pocetcisel = scan.nextInt();
    int i = 0;
    ArrayList<Integer> array = new ArrayList<Integer>();

while (i < pocetcisel) {
    array.add(scan.nextInt());
  i++;
}
System.out.println("Jake cislo hledate");
int Hledate = scan.nextInt();
System.out.println(array.indexOf(Hledate));

}
}