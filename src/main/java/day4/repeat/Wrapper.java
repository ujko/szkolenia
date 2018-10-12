package day4.repeat;

public class Wrapper {
    int a;
    byte b;
    short sh;
    long l;
    float f;
    double d;
    char ch;
    boolean bl;

    Integer wA= a;
    Byte wByte=b;
    Short wSh=sh;
    Long wL=l;
    Float wF=f;
    Double wD=d;
    Character wCh=ch;
    Boolean wBl=bl;

    // Wrapper- gdy potrzebujemy wykorzystać typ prosty obiektowo, opakowanie dla typu prostego

    public void sample(){ //pojawiają się metody niedostępne dla typów prostych
        int check=Integer.MAX_VALUE;
        System.out.println(check);//maksymalna wartość dla Integera

        int checkMin=Integer.MIN_VALUE;
        System.out.println(checkMin);//minimalna wartość dla Integera
    }

    public static void main(String[] args) {
        new Wrapper().sample();
    }
}
