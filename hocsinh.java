
public class hocsinh {
    String hoten;
    String lop;
    double toan, ly, hoa;

    hocsinh() {
    }

    hocsinh(String hoten, String lop, double toan, double ly, double hoa) {
        this.hoten = hoten;
        this.lop = lop;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }

    public void setHoa(double hoa) {
        this.hoa = hoa;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void setLy(double ly) {
        this.ly = ly;
    }

    public void setToan(double toan) {
        this.toan = toan;
    }

    public double getHoa() {
        return hoa;
    }

    public String getHoten() {
        return hoten;
    }

    public String getLop() {
        return lop;
    }

    public double getLy() {
        return ly;
    }

    public double getToan() {
        return toan;
    }

    double getAvg() {
        return (toan + ly + hoa) / 3;
    }
}
