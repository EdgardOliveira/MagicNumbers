public class Main {
    public static void main(String[] args){
        int[] numbers = new int[]{2, 4, 1, 3, 5, 7, 9 };
        for(int i = 0; i<numbers.length;i++)
            if (i == numbers[i]){
                System.out.println("Magic number founded at position: " + i + " Value: " + numbers[i]);
            }
    }
}
