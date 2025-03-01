package JavaBasic2;

public class Calculator {
    public int tong2SoNguyen (int a, int b){
        return (a + b);
    }

    public double tich2SoThuc (double a, double b){
        return (a * b);
    }
    public static void main(String[] args) {
        Calculator tinhtoan = new Calculator();
        System.out.println("Tổng 2 số nguyên là: " + tinhtoan.tong2SoNguyen(10,20));
        System.out.println("Tích 2 số thực là: " + tinhtoan.tich2SoThuc(1.5,0.55));
    }
}
