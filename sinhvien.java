class sinhvien extends nguoi {
    double hocphi;

    sinhvien() {
    }

    sinhvien(String hoten, int namsinh, String mathe, double hocphi) {
        super(hoten, namsinh, mathe);
        this.hocphi = hocphi;
    }

    public void setHocphi(double hocphi) {
        this.hocphi = hocphi;
    }

    public double getHocphi() {
        return hocphi;
    }

    @Override
    public String toString() {
        return super.toString() + "; Hoc phi : " + hocphi;
    }

    @Override
    void showinfor() {
        System.out.println(this.toString());
    }
}
