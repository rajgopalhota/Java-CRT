import java.util.Random;
public class Captch_genenrator {
    public static String generate_captcha(int n) {
      //  Random r=new Random(62);
        String str = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890";
        String captcha = "";
        while (n-- > 0) {
            // int index=r.nextInt(62);
            int index = (int) (Math.random() * 62);
            captcha = captcha + str.charAt(index);
        }
        return captcha;
    }

    public static void main(String args[]) {
        String captcha = generate_captcha(15);
        System.out.println("Generated CAPTCH : " + captcha);
    }
}
