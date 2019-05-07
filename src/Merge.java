import java.util.Scanner;

public class Merge {
    //自顶向下的归并排序
    private static Comparable[] aux;

    public static void sort(Comparable[] a){
        aux = new Comparable[a.length];
        sort(a,0,a.length-1);
    }

    public static void sort(Comparable[] a,int lo,int hi){
        //将a[lo.....hi]排序
        if(hi<=lo) return;
        int mid = lo+(hi-lo)/2;
        sort(a,lo,mid);
        sort(a,mid+1,hi);
        merge(a,lo,mid,hi);
    }

    public static void merge(Comparable[] a, int lo, int mid, int hi){
        int i=lo,j=mid+1;
        for(int k=lo;k<=hi;k++){
            aux[k]=a[k];
        }
        for(int k=lo;k<=hi;k++){
            if(i>mid)                           a[k]=aux[j++];
            else if(j>hi)                       a[k]=aux[i++];
            else if(less(aux[j],aux[i]))        a[k]=aux[j++];
            else                                a[k]=aux[i++];
        }
    }


    private static boolean less(Comparable v,Comparable w){
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
