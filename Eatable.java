package oop;

public class Eatable extends Wide implements Food{

    @Override
    public void start() {
        System.out.println("Burgar");

    }

    @Override
    public void stop() {
        System.out.println("pasta");


    }

    @Override
    public void name() {
        System.out.println("ice-cream");


    }

    @Override
    public void town() {
        System.out.println("CA");

    }


}

