class giamdoc extends nguoi {
    double tientieu;

    giamdoc() {
    }

    giamdoc(String hoten, int namsinh, String mathe, double tientieu) {
        super(hoten, namsinh, mathe);
        this.tientieu = tientieu;
    }

    public void setTientieu(double tientieu) {
        this.tientieu = tientieu;
    }

    public double getTientieu() {
        return tientieu;
    }

    @Override
    public String toString() {
        return super.toString() + "; Tien tieu : " + tientieu;
    }

    @Override
    void showinfor() {
        System.out.println(this.toString());
    }
}