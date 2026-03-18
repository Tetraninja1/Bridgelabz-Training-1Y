import static java.lang.StrictMath.log10;

    static int arm(int n, int digit){
        if(n==0)return 0;
        int rem = n%10;
        return (int) Math.pow(rem,digit) +arm(n/10,digit);
    }

    static void main(String[] args) {
        int n = 153;
        int digit =(int)(log10(n))+1;
        int result = arm(n,digit);
        if(result== n) System.out.println("armstrong num");
        else System.out.println("not a armstrong");

    }