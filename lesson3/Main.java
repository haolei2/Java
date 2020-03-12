
public class Main {
    final static int m = 100;
    public static void main(String[] args) {
	// write your code here
        boolean[] prime = new boolean[m+1];

        for(int i = 0;i <= m;i++)
            prime[i] = true;

        prime[0] = false;
        prime[1] = false;
        for(int i = 2;i <= m;i++){
            for(int j = 2*i;j <= m;j = j + i) {
                prime[j] = false;
            }
        }

        for(int i = 1;i <= m;i++){
            if(prime[i]){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
