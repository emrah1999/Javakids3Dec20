package Ders29TekrarOOP;

public class Task1 {
    public static void main(String[] args) {
        int a=456; //a=4
        int sum=0; //sum=11
        while(a>0){
            sum+=a%10;
            a/=10;
        }
        System.out.println(sum);
    }
}
