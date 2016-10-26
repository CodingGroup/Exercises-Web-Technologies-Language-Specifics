import java.util.*;

/**
 * Created by stoia on 25-Oct-16.
 */
public class FoldAndSum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int[] numbers = Arrays.stream(console.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int k = numbers.length;

        int[] leftPart = new int[k];
        int[] rigthPart = new int[k];

        System.arraycopy(numbers, 0, leftPart, 0, k);

        System.arraycopy(numbers, numbers.length - k, rigthPart, 0, k);

        Collections.reverse(Arrays.asList(leftPart));
        
        List<Integer> listLeftPart = new ArrayList<>();



    }
}
