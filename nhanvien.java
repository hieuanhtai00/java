import java.util.Scanner;

/**
 * nhanvien
 */
public class nhanvien {
    String name;
    int age;
    String diachi;;
    double tienluong;
    int giolam;

    nhanvien() {
    }

    nhanvien(String name, int age, String diachi, double tienluong, int giolam) {
        this.name = name;
        this.age = age;
        this.diachi = diachi;
        this.tienluong = tienluong;
        this.giolam = giolam;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDiachi() {
        return diachi;
    }

    public double getTienluong() {
        return tienluong;
    }

    public int getGiolam() {
        return giolam;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public void setTienluong(double tienluong) {
        this.tienluong = tienluong;
    }

    public void setGiolam(int giolam) {
        this.giolam = giolam;
    }

    void inputInfor() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten :");
        name = scanner.nextLine();
        System.out.print("Nhap tuoi : ");
        age = scanner.nextInt();
        System.out.print("Nhap dia chi : ");
        diachi = scanner.nextLine();
        System.out.print("Nhap tien luong : ");
        tienluong = scanner.nextDouble();
        System.out.print("Nhap gio lam : ");
        giolam = scanner.nextInt();
        scanner.close();
    }

    void printInfor() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Diachi : " + diachi);
        System.out.println("Luong : " + tienluong);
        System.out.println("Giolam : " + giolam);
    }

    double tinhThuong() {
        if (giolam >= 200)
            return tienluong * 0.2;
        if (giolam < 200 && giolam >= 100)
            return tienluong * 0.1;
        return 0;
    }

    public static void main(String[] args) {
        nhanvien nv = new nhanvien();
        nv.inputInfor();
        nv.printInfor();
    }
}