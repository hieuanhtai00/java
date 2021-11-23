public class mouse extends usb {
    mouse() {
    }

    mouse(String ma, double gia, int soluong) {
        super(ma, gia, soluong);
    }

    @Override
    double tongtien() {
        return super.tongtien() * 0.8;
    }

    @Override
    void show() {
        System.out.println("MA : " + ma);
        System.out.println("Gia : " + ma);
        System.out.println("So luong : " + soluong);
        System.out.println("Tong tien : " + this.tongtien());
    }
}
