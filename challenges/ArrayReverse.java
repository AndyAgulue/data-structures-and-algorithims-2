public class ArrayReverse {
  public static void main(String[] args){
    
    int[] array = {0,1,2,3,4,5,6,7,8};
    int[] array2;
    array2 = new int[array.length];
    for(int i=0; i<array.length; i++){
      System.out.println(array[i]);
        int j = array.length-i-1;
        array2[j] = array[i];
    }
    for(int i = 0; i < array2.length; i++){
      System.out.println(array2[i]);
    }
  }
}