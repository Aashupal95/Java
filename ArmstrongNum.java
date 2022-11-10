public class ArmstrongNum {
    // 1 to N ArmstrongNumbers by return and void.
    static void armstrong(int num) {
        int sum = 0;
        int temp = num;
        while (temp > 0) {
            int rem = temp % 10;
            sum = sum + rem * rem * rem;
            temp = temp / 10;
        }
        if (sum == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }

    public static void main(String[] args) {
        int num = 153;
        armstrong(num);

    }

}
