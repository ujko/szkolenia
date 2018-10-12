package day4.repeat.inheritant;

public class InheritantAfter extends Abstr{
    @Override
    public void methodAbstr(String name) {
        a=name;//można korzystać ze zmiennej z nadklasy
        System.out.println(a);
    }
}
