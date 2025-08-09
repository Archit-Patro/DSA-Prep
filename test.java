public class test {
    public static void pascalTriangle(int n){
        long ans = 1;

        System.out.print(ans + " ");
    
        for(int i=1; i<n; i++){
    
            ans = ans * (n - i);
            ans = ans / i;
    
            System.out.print(ans + " ");
        }
    
        System.out.println();
    }
    
    public static void main(String[] args) {
        
        int n = 5;
        
        for(int i=0; i<=n; i++){
            pascalTriangle(i);
        }
    
    
    }
    
}
