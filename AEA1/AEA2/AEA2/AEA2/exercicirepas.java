
public class exercicirepas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        while (i < n) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a + b + c == 0) {
                System.out.println("0");
            } else if (a + b + c == 1) {
                System.out.println("1");
            } else if (a + b + c == 2) {
                System.out.println("2");
            } else if (a + b + c == 3) {
                System.out.println("3");
            }
}   
    }
}