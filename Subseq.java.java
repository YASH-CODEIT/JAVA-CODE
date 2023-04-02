class Main{
    public static void subSeq(String str,int indx,String newString){
        if(indx==str.length()){
            System.out.println(newString);
            return ;
        }
        char currentChar=str.charAt(indx);

        subSeq(str,indx+1,newString+currentChar);

        subSeq(str,indx+1,newString);

    }
    public static void main(String []args){
        String str="abc";
        subSeq(str,0,"");
    }
}