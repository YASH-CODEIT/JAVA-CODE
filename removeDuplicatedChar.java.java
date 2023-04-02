class Main{
    public static boolean []map=new boolean[26];
    public static void delDuplicate(String str,int indx,String newString){
        if(indx==str.length()){
            System.out.println("Sting after removal of duplicated: "+newString);
            return;
        }
        char currentChar=str.charAt(indx);
        int pos=currentChar-'a';
        if(map[pos]){
            delDuplicate(str,indx+1,newString);
        }
        else{
           newString+=currentChar;
           map[pos]=true;
           delDuplicate(str,indx+1,newString);
        }
    }
    public static void main(String []args){
        String str="abbccda";
        System.out.println("String Before removal of duplicated: "+str);
       delDuplicate(str,0,"");
    }
}