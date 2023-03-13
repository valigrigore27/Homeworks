public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String[] languages = {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};
        int n = (int) (Math.random() * 1_000_000);
        n = n * 3;
        String binary = "10101";
        int decimal = Integer.parseInt(binary, 2);
        System.out.println(decimal);
        n = n + decimal;
        String hex = "FF";
        decimal = Integer.parseInt(hex, 16);
        n = n + decimal;
        System.out.println(decimal);
        n = n * 6;
        while(n > 9){
            int sum = 0;
            int m = n;
            while(m > 0){
                sum += m % 10;
                m /= 10;
            }
            n = sum;
        }
        System.out.println("Willy-nilly, this semester I will learn " + languages[n]);
    }
}