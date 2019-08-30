package oop;

public class Iron  extends Man{
    Man man =new Man();

    public int getvee() {
        int ve = man.vee;
        return ve;

    }


    public void testiron() {
        methods();
        System.out.println("QA");

    }


    public void polymortest() {
        System.out.println("koko1");
    }



    public static void main(String[] args) {
        Iron iron =new Iron();

        System.out.println(iron.getvee());
        System.out.println(iron.getvee()+ 50);

        iron.testiron();
        iron.methods();


        iron.polymortest();
    }
}
