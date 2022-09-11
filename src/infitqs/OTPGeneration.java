package infitq;

public class OTPGeneration {
    public static void main(String[] args) {
        int number = 13456;
        String otp = "";
        int lastDigit = 0;
        while (number > 0) {
            lastDigit = number % 10;
            if (lastDigit % 2 > 0) {
                otp = lastDigit * lastDigit + otp;
            }
            number /= 10;
        }
        System.out.println(Integer.parseInt(otp));
    }
}
