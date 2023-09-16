public class person {
    protected String name;
    protected int age;
    public person(int age, String name) {
        this.name = name;
        this.age = age;
    }
}
class student extends person{
    private static String studentId;
    public student(String name, int age, String studentId) {
        super(age, name);

        this.studentId = studentId;
    }
    public void printdetails(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(studentId);
    }
    public static void main(String[] args) {
        student st =new student("jatin",18,"Jatin Sihag");
        st.printdetails();
    }
}

