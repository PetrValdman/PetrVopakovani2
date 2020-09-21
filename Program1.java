import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in); 
    System.out.println("zadejte větu");
    String veta = scan.nextLine();
    String vetatrim = veta.trim();
    int poslednimezera = vetatrim.lastIndexOf(" ");
    String predPosledniSlovo = vetatrim.substring(poslednimezera);

    System.out.println(predPosledniSlovo);
}
}