class Student {
    private String stud_name;
    private int stud_id;
    private int stud_roll;

    void set_Stud_name(String stud_name) {
        this.stud_name = stud_name;
    }

    void set_Stud_id(int stud_id) {
        this.stud_id = stud_id;
    }

    void set_Stud_roll(int stud_roll) {
        this.stud_roll = stud_roll;
    }

    String get_Stud_name() {
        return stud_name;
    }

    int get_Stud_id() {
        return stud_id;
    }

    int get_Stud_roll() {
        return stud_roll;
    }

}
class Encapsulation{
    public static void main(String []args){
        Student obj=new Student();
        obj.set_Stud_name("Yash");
        obj.set_Stud_id(567);
        obj.set_Stud_roll(23);
        System.out.println(obj.get_Stud_name()+"\n"+obj.get_Stud_id()+"\n"+obj.get_Stud_roll());
    }
}