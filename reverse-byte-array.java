Here is a simple function to reverse a byte array in android.

public static void reverse(byte[] array) {
         
        if (null == array) {
            return;
        }
 
        int i = 0;
        int j = array.length - 1;
        byte tmp;  
        while (j > i) {
            tmp = array[j];
            array[j] = array[i];
            array[i] = tmp;
            j--;
            i++;
    }
}
