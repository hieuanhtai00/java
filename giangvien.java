class giangvien extends nguoi {
    double luong;

    giangvien() {
    }

    giangvien(String hoten, int namsinh, String mathe, double luong) {
        super(hoten, namsinh, mathe);
        this.luong = luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public double getLuong() {
        return luong;
    }

    @Override
    public String toString() {
        return super.toString() + "; Luong : " + luong;
    }

    @Override
    void showinfor() {
        System.out.println(this.toString());
    }
}
