import java.util.*;
public class trace
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);

        int arr[][] = new int[20][20], tsum = 0;

        System.out.println("Enter the order of square matrice: ");
        int n = obj.nextInt();

        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                arr[i][j] = obj.nextInt();
            }
        }

        for (int i = 0; i < n; i++) 
        {
            tsum += arr[i][i];
        }

        System.out.println("The trace of the matrix is " + tsum);
    }
}
