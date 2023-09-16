public class student8 {
        int rollno;
        String name;
        static String college = "its";
        void student8(int r, String nam){
            rollno = r;
            name = nam;
        }
        void display(){
            System.out.println(rollno+" "+name + " " + college);
        }

    public static void main(String[] args) {
        student8 s1 = new student8();
        student8 s2 = new student8();
        s1.display();
        s2.display();
    }

}
