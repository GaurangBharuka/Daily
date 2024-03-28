class Student{
    String name;
    int marks;
}
public class b11 {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name = "Gaurang";
        s1.marks = 95;

        Student s2=new Student();
        s2.name = "Hardy";
        s2.marks=99;

        Student score[]=new Student[2];
        score[0]=s1;
        score[1]=s2;

        for(int i=0;i<score.length;i++){
            System.out.println(score[i].name+ " : "  +score[i].marks);
        }
    }
}
