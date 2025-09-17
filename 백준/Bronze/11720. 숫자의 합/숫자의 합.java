import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        String b = scanner.next();   
        String[] arr = b.split("");
        int result = 0;
        
        for(int i=0 ; i<a ; i++) {
            
            result += Integer.parseInt(arr[i]);
            
        }
        
        System.out.println(result);

}
}