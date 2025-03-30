import java.util.Scanner;

class A {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String n = s.nextLine();
        StringBuilder c = new StringBuilder();

        for (int i = 0; i < n.length(); i++) {
            char ch = n.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                c.append((char) (ch + 32)); // Convert uppercase to lowercase
            } else if (ch >= 'a' && ch <= 'z') {
                c.append((char) (ch - 32)); // Convert lowercase to uppercase
            } else {
                c.append(ch);
            }
        }
        System.out.println(c.toString());
        s.close();
    }
}
