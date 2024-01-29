import java.util.Random;

public class Rolling {

    public static void main(String[] args) {
        Random R =new Random();
        int result = R.nextInt(6);
        System.out.println("you rolled a : " +result);
    }
}