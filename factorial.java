public class factorial {
     public static void main(String[] arg){
        int n = 5;
        int fact =1;
        int i=1;
        while(i <= n){
            fact = fact * i;
            i++;
        }
        System.out.println("factorial = "  fact);

     }
    
}
