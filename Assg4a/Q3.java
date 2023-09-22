import java.util.Scanner;

class IntegerArray {
    private int[] data = new int[5];

    public void inputData() {
        Scanner sc= new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            data[i] = sc.nextInt();
        }

        sc.close();
    }

    public void bubSort() {

        for (int i = 0; i < data.length ; i++) {
            for (int j = i + 1; j < data.length ; j++) {
                if (data[j] < data[i]) {
                    int temp = data[j];
                    data[j] = data[i];
                    data[i] = temp;
                }
            }
        }

        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] == data[i + 1]) {
                System.out.println("INVALID INPUT");
                return;
            }
        }

        for (int i  = 0; i < data.length; i++) {
            System.out.print(data[i]+ " ");
        }
        System.out.println();
    }
}

public class Q3{
    public static void main(String[] args) {
        IntegerArray integerArray = new IntegerArray();
        integerArray.inputData();
        integerArray.bubSort();
    }
}
