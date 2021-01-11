import java.util.Scanner;

public class Stuck_in_a_time_loop{ 
  public static void main(String args[]){  
    Scanner kb= new Scanner(System.in);
    int r= kb.nextInt();
    for(int i=1;1<=r && r<=100 && i<=r;i++)
      System.out.println(i+" Abracadabra");
 
  }  
} 