import java.util.Scanner;

public class hocsinh {
    String mahocsinh;
    double diem;
    int age;
    String lop;

    hocsinh() {
    }

    hocsinh(String mahocsinh, double diem, int age, String lop) {
        this.mahocsinh = mahocsinh;
        this.diem = diem;
        this.age = age;
        this.lop = lop;
    }

    public int getAge() {
        return age;
    }

    public double getDiem() {
        return diem;
    }

    public String getLop() {
        return lop;
    }

    public String getMahocsinh() {
        return mahocsinh;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void setMahocsinh(String mahocsinh) {
        this.mahocsinh = mahocsinh;
    }

    void inputInfor() {
        Scanner scanner = new Scanner(System.in);
        mahocsinh = scanner.nextLine();
        diem = scanner.nextDouble();
        age = scanner.nextInt();
        lop = scanner.nextLine();
        scanner.close();
    }

    void showInfor() {
        System.out.println("mahocsinh : " + mahocsinh);
        System.out.println("diem : " + diem);
        System.out.println("tuoi : " + age);
        System.out.println("lop : " + lop);
    }

    boolean hocbong() {
        if (diem > 8)
            return true;
        return false;
    }

    public static void main(String[] args) {
        hocsinh hs = new hocsinh();
        hs.inputInfor();
        hs.showInfor();
    }
}
