import java.util.ArrayList;


public class Program2 {
  public static void main(String[] args) {


ArrayList<Integer> array = new ArrayList<Integer>(); // array = pole do ktereho se ukladaji prvocisla
array.add(2);


int i = 1; // i = pro cyklus while
while (array.size() < 30) {
i++;
  for (int a = 0; a < array.size(); a++)  { //a = pro cyklus for
    if(i % array.get(a) == 0)
      break;
    if(a == array.size() - 1){
      array.add(i);
  }
}
  }
System.out.println(array);
 }

    //Deli prvocisly pokud cislo nevydeli bez zbytku ulozi ho jako dalsi prvocislo a pokracuje dokud nedojde do 30
}
