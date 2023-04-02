import java.util.*;
class Main{
    public static int printTiles(int n,int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        //VerticallyAlignment
        int verticalcount=printTiles(n-m,m);

        //HorizontallyAlignment
        int horizontalcount=printTiles(n-1,m);

        return verticalcount+horizontalcount;
    }
    public static void main(String []args){
        int n=5,m=3;
        int result=printTiles(n,m);
        System.out.println(result);
    }
}