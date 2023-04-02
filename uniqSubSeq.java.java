import java.util.HashSet;
class Main{
    public static void subSeq(String str,int indx,String newString,HashSet<String> uniq){
        if(indx==str.length()){
          if(uniq.contains(newString)){
              return;
          }
          else{
              System.out.println(newString);
              uniq.add(newString);
              return;
          }
        }
        char currentChar=str.charAt(indx);

        subSeq(str,indx+1,newString+currentChar,uniq);

        subSeq(str,indx+1,newString,uniq);

    }
    public static void main(String []args){
        String str="aaa";
        HashSet<String> uniq=new HashSet<>();
        subSeq(str,0,"",uniq);
    }
}