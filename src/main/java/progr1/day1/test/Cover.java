package progr1.day1.test;

public enum Cover {
    HARD("twarda"), SOFT("miękka");

    private String cover;

    Cover(String cover) {
        this.cover = cover;
    }

    public String getCover() {
        return cover;
    }
}
