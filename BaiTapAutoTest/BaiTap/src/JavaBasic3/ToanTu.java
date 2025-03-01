package JavaBasic3;

public class ToanTu {
    int number = 100;
    public void sosanh (int n){
        if( n == number) {
            System.out.println(" n = 100");
        }else
            if(n < number) {
                System.out.println("n nhỏ hơn 100");
            } else
                    System.out.println("n lớn hơn 100");
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 50;
        int c = 20;

        if (a != b){
            System.out.println("a khác b");
        } else System.out.println("a bằng b");

        if ((a > b) && (b > c)){
            System.out.println("a lớn hơn c");
        } else System.out.println("a không lớn hơn c");

        ToanTu sosanh = new ToanTu();
        sosanh.sosanh(100);
    }
}
