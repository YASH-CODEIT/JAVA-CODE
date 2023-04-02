class Main{
    public static void moveAllE(String str,int indx,int count){
        if(indx==str.length()){
            for(int i=0;i<count;i++){
                System.out.print('e');
            }
            return;
        }
        char currentChar=str.charAt(indx);
        if(currentChar=='e'){
            count++;
        }
        else{
            System.out.print(currentChar);
        }
        moveAllE(str,indx+1,count);
    }
    public static void main(String []args){
        String str="adebered";
        moveAllE(str,0,0);
    }
}
