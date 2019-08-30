package oop;

public class StudentExecution {
    public static void main(String[] args) {

        StudentInfo students =new StudentInfo();
        students .setAge(18);
        int newage = students.getAge();
        System.out.println(newage);


        students.setName("soni");
        String newname =students.getName();
        System.out.println(newname);


        students.setDOB("kon");
        String newdob =students.getDOB();
        System.out.println(newdob);

    }


}
