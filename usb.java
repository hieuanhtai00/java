public class usb {
    String ma;
    double gia;
    int soluong;

    usb() {
    }

    usb(String ma, double gia, int soluong) {
        this.ma = ma;
        this.gia = gia;
        this.soluong = soluong;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public double getGia() {
        return gia;
    }

    public String getMa() {
        return ma;
    }

    public int getSoluong() {
        return soluong;
    }

    double tongtien() {
        return gia * soluong;
    }

    void show() {
        System.out.println("MA : " + ma);
        System.out.println("Gia : " + ma);
        System.out.println("So luong : " + soluong);
        System.out.println("Tong tien : " + tongtien());
    }

    public void setGia(double nextDouble) {
    }
}
