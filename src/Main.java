public class Main {
    public static void main(String[] args) {

        System.out.println(arrayFactory(8,3,2,1, true));
    }
    static  int[] arrayFactory(int a, int b, int c, int d, boolean ascending){
        int [] array = new  int[]{a,b,c,d};
        if (ascending){
            for (int i = 0; i < array.length; i++) {
                for (int j = i+1; j < array.length ; j++) {
                    if (array[i] > array[j]){
                        int templete = array[i];
                        array[i] = array[j];
                        array[j] = templete;
                    }
                }
            }
        }else {
            for (int i = 0; i < array.length; i++) {
                for (int j = i+1; j < array.length ; j++) {
                    if (array[i] < array[j]){
                        int templete = array[i];
                        array[i] = array[j];
                        array[j] = templete;
                    }
                }
            }
        }
        return array;
    }


    }