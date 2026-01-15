package Numbers;

class Main {
    public static void main(String[] args) {
        /*
         * int n=12345;
         * int count=0;
         * while(n>0){
         * n/=10;
         * count+=1;
         * }
         */
        int n = 12345;
        int count = (int) (Math.log10(n) + 1);
        System.out.println("Count is:" + count);
    }
}