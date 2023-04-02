import java.util.*;
class Main{
    public static int countPath(int i,int j,int n,int m){
        if(i==n || j==m){
            return 0;
        }
        if(i==n-1 && j==m-1){
            return 1;
        }
        //downward;
        int downward=countPath(i+1,j,n,m);
        //rightward
        int rightward=countPath(i,j+1,n,m);

        return downward+rightward;
    }
    public static void main(String []args){
        //i->rows
        //j->columns
        int n=3;
        int m=2;
        int result=countPath(0,0,n,m);
        System.out.println(result);
    }
}
