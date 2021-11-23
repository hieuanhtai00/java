public class vietnamese {
    String ho = "";
    String ten = "";

    vietnamese() {
    }

    vietnamese(String ho, String ten) {
        this.ho = ho;
        this.ten = ten;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getHo() {
        return ho;
    }

    public String getTen() {
        return ten;
    }

    @Override
    public String toString() {
        return ho + " " + ten;
    }

    void show() {
        System.out.println(toString());
    }
}
