import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
        System.out.println(formatter.format(new Date()));
        System.out.println(1+1);
    }
}