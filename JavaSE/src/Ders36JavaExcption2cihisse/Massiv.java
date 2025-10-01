package Ders36JavaExcption2cihisse;

public class Massiv {
    public  void getIndex(int index,int[] arr){
        if(index<0 || index>=arr.length){
            throw new ArrayIndexOutOfBoundsException("Massivin indexi yanlsihdir");
        }else{
            System.out.println(arr[index]);
        }
    }

    public static void main(String[] args) {
        Massiv massiv=new Massiv();
        int[] arr={2,4,5};
        try {
            massiv.getIndex(1, arr);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

    }
}
