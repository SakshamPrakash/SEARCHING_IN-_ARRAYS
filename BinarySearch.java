import java.util.Scanner;

public class BinarySearch {
    static int BSearch(int a[],int first , int last ,int val) {
        while(first<=last){
            int mid=first+(last-first)/2;
            if (a[mid]==val){
                return mid;
            }if(a[mid]<val){
                first=mid+1;
            }if(a[mid]>val){
                last=mid-1;
            }
    }return -1;
    }

    public static void main(String[] args) {
        int a[]={10,20,30,40,50,60,70,80,90};
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value to be searched: ");
        int val=sc.nextInt();
        int last=(a.length)-1;
        int result=BSearch(a,0,last,val);
        if (result==-1){
            System.out.println("NOT FOUND ");
        }
        else{
            System.out.println("FOUND AT INDEX: "+result);
        }
    }
}
