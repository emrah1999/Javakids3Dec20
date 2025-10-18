package Ders41Collection2;

public class ArrayClass {
    int[] array;
    int index=0;

    public ArrayClass(int count){
        this.array=new int[count];
    }
    public void add(int a){
        if(index>=array.length){
            int[] newArray=new int[index+1];
            for (int i = 0; i < index; i++) {
                newArray[i]=array[i];
            }
            array=newArray;
        }
        array[index++]=a;

    }

    @Override
    public String toString(){
        String myArray="[";
        for (int i = 0; i < array.length; i++) {
            myArray+=array[i]+",";
        }
        myArray+="]";
        return myArray;
    }
}
