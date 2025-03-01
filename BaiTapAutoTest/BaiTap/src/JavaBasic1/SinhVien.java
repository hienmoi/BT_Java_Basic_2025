package JavaBasic1;

public class SinhVien {
    String queQuan = "Quảng Ninh";
    static int tuoi = 28;
    public static void main(String[] args) {
        SinhVien sinhVien = new SinhVien();
        String hoTen = "Nguyễn Thị Thúy Hiền";
        System.out.println("Họ và tên: " + hoTen);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Quê quán: " + sinhVien.queQuan);
        System.out.println("Lớp học phần: " + ThongTin.lop);

    }
}
