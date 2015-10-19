public class test15 {

    public static void main(String[] args) {
        int n = 16;
        print(n);

    }

    public static void print(int n) {
        if (n != 0)

        {
            System.out.println("Слава Роботам! Убить всех человеков!");
            print(--n);
        }

    }
}