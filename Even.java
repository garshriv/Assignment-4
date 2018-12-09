import java.util.Scanner;
public class Even{
     public static void main(String args[]){
 Scanner s = new Scanner(System.in);
      int arr[] = new int[10];
        System.out.println("Enter all the 10 elements:");
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = s.nextInt();
        }
 
      for(int j = 0 ; j < arr.length ; j++)
        {
            if(arr[j] % 2 == 0)
            {
                System.out.print(arr[j]+" ");
            }
        }
  }
}
