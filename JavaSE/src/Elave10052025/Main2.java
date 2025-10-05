package Elave10052025;

public class Main2 {
    public static void main(String[] args) {
//        int[]arr={34,5,34,24,52,52,534};
//        int sum=0;
//        for (int i:arr){
//            sum+=i;
//        }
//        System.out.println("Sum: "+sum);
        int a=54635;
        int sum=0;
        while (a>0){
            int r=a%10;
            sum+=r;
            a=a/10;
        }
        System.out.println("Sum: "+sum);
    }
}
