class MainOverloading{
    public static void main(String []args){
        MainOverloading.main1("Hii","Yash GUPTA");
    }
    public static void main1(String s1,String s2){
        System.out.println(s1 +" "+ s2);
        MainOverloading.main2("Good Night!!!");
    }
    public static void main2(String s3){
        System.out.println(s3);
    }
}
