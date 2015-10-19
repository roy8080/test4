/**
 * Created by roy on 06.10.15.
 */
public class test4 {

    public static void main(String[] args) {
        int n = 5;
        print(n);

    }

    public static void print(int n) {
        if (n != 0)

        {
            System.out.println("Элли самая красивая");
            print(--n);
        }

    }
}