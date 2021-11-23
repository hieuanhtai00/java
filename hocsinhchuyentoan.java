public class hocsinhchuyentoan extends hocsinh {

    hocsinhchuyentoan() {
    }

    hocsinhchuyentoan(String hoten, String lop, double toan, double ly, double hoa) {
        super(hoten, lop, toan, ly, hoa);
    }

    @Override
    double getAvg() {
        return (toan * 2 + ly + hoa) / 4;
    }
}
