package progr1.day1.person;

public class Gender2 {
    private static Gender2 instance;
    private String name;

    private Gender2() {

    }

    public static Gender2 getInstance() {
        if(instance == null){
            instance = new Gender2();
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Gender2{" + name + "}";
    }
}
