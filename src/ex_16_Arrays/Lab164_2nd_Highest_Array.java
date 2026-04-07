package ex_16_Arrays;

public class Lab164_2nd_Highest_Array {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 67, 23, 89, 45, 89};
        int highest = 0;
        int secondHighest = 0;
        //67
        for (int num : numbers) {
            if (num > highest) {
                secondHighest = highest;
                highest = num;

            }
        }
        System.out.println(secondHighest);

    }
}
