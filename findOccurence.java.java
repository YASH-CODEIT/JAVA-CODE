class Main{
    public static int first=-1;
    public static int last=-1;
    public static void findOccurence(String str,int indx,char elem){
        if(indx==str.length()){
            System.out.println("Last Occurence of "+elem+" : " +(last+1));
            return;
        }
        char currentChar=str.charAt(indx);
        if(currentChar==elem) {
            if (first == -1) {
                first = indx;
                System.out.println("First Occurence of "+elem+" : " + (first+1));
            } else {
                last = indx;
            }
        }
            findOccurence(str,indx+1,elem);
    }
    public static void main(String []args){
       String str="abaacdaefaach";
       char elem='c';
        System.out.println("The given String is : "+str);
       findOccurence(str,0,elem);
    }
}