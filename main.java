import java.util.Scanner;

public class main {

  public static void main (String ... args){
    
    Scanner input = new Scanner(System.in);
    int base = 0, height = 0;
    while(true){
      System.out.print("write the base of the triangle: ");
      if(input.hasNextInt()){
        base = input.nextInt();
        input.nextLine();
        if(base > 0)
          break;
        System.out.println("Invalid number");
      }
      else{
        input.nextLine();
        System.out.println("Invalid input");
      }
    }

    while(true){
      System.out.print("write the height of the triangle: ");
      if(input.hasNextInt()){
        height = input.nextInt();
        input.nextLine();
        if(height > 0)
          break;
        System.out.println("Invalid number");
      }
      else{
        input.nextLine();
        System.out.println("Invalid input");
      }
    }

    System.out.println("The area of the triangle is: " + ((height * base) / 2));
  }
}
