package day1.person;

//imitation of enum
public class PseudoGender {
    public static final PseudoGender MALE = new PseudoGender("chłopczyk");
    public static final PseudoGender FEMALE = new PseudoGender("dziewczynka");
    private String gender;

    public String getGender() {
        return gender;
    }
    private PseudoGender(String gender) {
        this.gender = gender;
    }
}
