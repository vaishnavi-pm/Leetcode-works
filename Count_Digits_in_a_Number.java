public class Main {

    static int countDigits(int n){

        int cnt = 0;

        while(n > 0){

            cnt++;

            n = n / 10;
        }

        return cnt;
    }

    public static void main(String[] args) {

        int n = 12345;

        System.out.println(
                countDigits(n)
        );

    }
}