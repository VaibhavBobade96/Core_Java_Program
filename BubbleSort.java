public class BubbleSort {

    public static void main(String[] args) {

        int arr[] = {10, 50, 20, 70, 30, 60, 40}; // 10,20,30,40,50,60,70

        int j = 0;

        for(int i = 0; i < arr.length - 1; i++)  // (int i = 0 ; i <= 7-1 = 6; i++)
        {
            for(j = 0; j < arr.length - 1 - i; j++)  // (j = 0 ; j <= 7-1-1= 5; j++
            {
                if(arr[j] > arr[j + 1])
                {
                    int Temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = Temp;
                }
            }
        }

        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i] + " ");
        }
    }
}