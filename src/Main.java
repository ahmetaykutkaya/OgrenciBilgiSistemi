public class Main {
    public static void main(String[] args)
    {
        Teacher t1 =new Teacher("Ahmet Aykut","53655555","TRH");
        Teacher t2 =new Teacher("Ali","1212","FZK");
        Teacher t3 =new Teacher("Osman","654","BIO");


        Course Tarih =new Course("Tarih","101","TRH",t1);
        Tarih.addTeacher(t1);
        Course Fizik =new Course("Fizik","102","FZK",t2);
        Fizik.addTeacher(t2);
        Course Bio= new Course("Biyoloji","103","BIO",t3);
        Bio.addTeacher(t3);

        Student s1 =new Student("Ali","123","4",Tarih,Fizik,Bio);
        s1.addBulkExamNote(100,100,50);
        s1.isPass();


    }
}