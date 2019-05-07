import java.util.Scanner;

public class Insertion {
    //插入排序
    public static void sort(Comparable[] a){
        int N = a.length;
        for(int i=1;i<N;i++){
            for(int j = i;j>0&&less(a[j],a[j-1]);j--){
                exch(a,j,j-1);
            }
        }
    }

    private static boolean less(Comparable v,Comparable w) {
        return v.compareTo(w)<0;
    }

    private static void exch(Comparable[] a , int i, int j){
        Comparable t = a[i];a[i]=a[j];a[j]=t;
    }

    private static void show(Comparable[] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    private static boolean isSorted(Comparable[] a){
        for(int i = 0;i<a.length;i++){
            if(less(a[i],a[i-1])) return false;
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] a = s.split(" ");
        sort(a);
        assert isSorted(a);
        show(a);

    }
}
