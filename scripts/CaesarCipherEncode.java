import java.util.Scanner;
public class CaesarCipherEncode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String st = "abxyz";
        String st = sc.nextLine();
        for(int i=0;i<st.length();i++) {
            int ch = st.charAt(i) - 'a';
            int m = ((ch + 3) % 26) + 'a';
            System.out.println((char)m);
        }
        sc.close();
    }
}
