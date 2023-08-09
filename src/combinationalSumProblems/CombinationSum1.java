package combinationalSumProblems;
import java.util.Scanner;
public class CombinationSum1 {
	public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enetr the Size of Array:");
        int N=scan.nextInt();
        int arr[]=new int[N];
        System.out.println();
        System.out.print("Enetr the Array Elements:");
        for(int i=0;i<=arr.length-1;i++){
            arr[i]=scan.nextInt();
            System.out.print(" ");
        }
        
        System.out.print("Enter the Combinmation Sum to find:");
        int csum=scan.nextInt();
        System.out.println();
        System.out.println("The pairs Whose Sum is "+csum);
        for(int i=0;i<=arr.length-1;i++){
            for(int j=0;j<=arr.length-1;j++){
                if(arr[i]+arr[j]==csum){
                    System.out.print(arr[i]+","+arr[j]);
                    System.out.println();
                }
                    for(int k=0;k<=arr.length-1;k++){
                       if(arr[i]+arr[j]+arr[k]==csum){
                          System.out.print(arr[i]+","+arr[j]+","+arr[k]);
                          System.out.println();
                       }
                       for(int f=0;f<=arr.length-1;f++){
                          if(arr[i]+arr[j]+arr[k]+arr[f]==csum){
                            System.out.print(arr[i]+","+arr[j]+","+arr[k]+","+arr[f]);
                            System.out.println();
                          }
                       }
                    }
                
            }
        }
        scan.close();
    }
}
