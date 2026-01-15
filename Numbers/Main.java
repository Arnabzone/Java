package Numbers;

public class Main {
    public static void main(String[] args) {
        int n=121;
        int dup=n;
        int rev=0;
        while(n>0){
            int ld= n%10;
            rev=(rev*10)+ld;
             n /=10;
        }
        if(rev==dup){
        System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}{

}
