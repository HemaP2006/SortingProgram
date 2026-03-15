import java.util.Scanner;
//Java Program to sort an array of integers
class Sorting{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number of Elements:");
    int n=sc.nextInt();
    int arr[]=new int[n];
    int temp;
    System.out.println("Enter elements:");
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
      for(int j=i+1;j<n;j++){
        if(arr[i]>arr[j]){
          temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
        }
      }
    }
    System.out.println("Sorting array:");
    for(int i=0;i<n;i++){
      System.out.println(arr[i]+" ");
    }
  }
}
