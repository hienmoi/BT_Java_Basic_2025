package JavaBasic4;

public class ForAndArray {


    public static void main(String[] args) {
        int mang[] = new int[26];
        int index = 0;

        System.out.println("--------------------------");
        for (int j = 0; j <= 50; j++) {
        if(j % 2 == 0) {
            System.out.print(j + " ");
            mang[index] = j;
            index++;
        }
        }
        System.out.println(" ");
        for (int value : mang){
            System.out.println(value);
        }


    }
}
