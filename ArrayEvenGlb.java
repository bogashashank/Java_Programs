public class ArrayEvenGlb {
    public static void main(String[] args) {
        
        int[] evenNumbers = new int[5]; 
        int index = 0;
        
        
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                evenNumbers[index] = i;
                index++;
            }
        }
        
        
        for (int i = 0; i < evenNumbers.length; i++) {
            System.out.println(evenNumbers[i]); 
        }
    }
}