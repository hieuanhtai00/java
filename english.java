public class english extends vietnamese {
    english() {
    }

    english(String ho, String ten) {
        super(ho, ten);
    }

    @Override
    public String toString() {
        return ten + " " + ho.toUpperCase();
    }

    @Override
    void show() {
        System.out.println(this.toString());
    }
}
