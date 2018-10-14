package progr1.day4.repeat.interfaces;

public class ClassImplementsInterfaces implements InterfaceA, InterfaceB{

    @Override
    public void methodA(String a) {
        System.out.println("Zaimplementowana z interfejsu A");
    }

    @Override
    public void methodB(String b) {//klasa implementuje 2 iterfejsy z met.defaultową, więc trzeba ją zaimplementować

    }

    public void changeA(){
       // a="b";zmienna a jest finalną, nie można jej przypisać innej wartości
    }
    //metody defaultowej nie trzeba implementować


}
