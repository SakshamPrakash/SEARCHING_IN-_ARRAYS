import java.util.Scanner;

public class LinearSearch {
    public static int LSearch(int a[],int val){
        for(int i=0;i<a.length;i++){
            if(a[i]==val){
                return i;
            }

        }return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("Enter the array");
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();  }
        System.out.println("Enter the value to be searched");
        int val=sc.nextInt();
        int result=LSearch(a,val);
        if (result==-1){
            System.out.println("NOT FOUND !");
        }else{
            System.out.println("FOUND AT INDEX "+result);
        }

    }
}
