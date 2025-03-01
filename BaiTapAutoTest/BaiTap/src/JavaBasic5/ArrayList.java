package JavaBasic5;

import java.util.List;

public class ArrayList {

    public static List<String> employee(String name, String age, String Home) {
        List<String> ThongTin = new java.util.ArrayList<>();
        //Thêm thông tin nhân sự vào mảng
        ThongTin.add(name);
        ThongTin.add(age);
        ThongTin.add(Home);
        return ThongTin;
    }

    public static void main(String[] args) {
        List<Integer> mang = new java.util.ArrayList<>();

        //Kiểm tra số chẵn, add vào Arraylist
        for (int j = 0; j <= 50; j++) {
            if (j % 2 == 0) {
                System.out.print(j + " ");
                mang.add(j);
            }

        }
        System.out.println("------------------");
        //In mảng số chẵn
        System.out.println(mang);
        System.out.println("---------------------");
        System.out.println(" ");
        //Duyệt mảng số chẵn
        for (int value : mang) {
            System.out.print(value + "\t");// \t là tab

        }
        System.out.println(" ");
        System.out.println("***** In thông tin nhân viên *****" + "\n");// \n là xuống dòng
        //In cả mảng thông tin nhân sự
        System.out.println(employee("Nguyễn Thị Thúy Hiền", "28 tuổi", "Quảng Ninh"));

        List<String> employee1 = employee
                ("Phan Thanh Vũ", "28 tuổi", "Hà Nội");
        //In Thông tin nhân sự với for cải tiến
        for (String nhansu : employee1) {
            System.out.println(nhansu);
        }
        List<String> employee2 = employee
                ("Vũ Thùy Trâm", "28 tuổi", "Nam Định");
        //In Thông tin nhân sự với for cơ bản
        for (int i = 0; i < employee2.size(); i++) {
            System.out.println(employee2.get(i));
        }

    }

}
