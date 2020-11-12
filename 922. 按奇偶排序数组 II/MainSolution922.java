import java.util.Objects;

public class MainSolution922 {
}

class Solution922 {
    public int[] sortArrayByParityII(int[] A) {
        if (Objects.isNull(A) || A.length == 0) {
            return A;
        }
        int j = 1;
        for (int i = 0; i < A.length; i += 2) {
            if (A[i] % 2 != 0) {
                for (; j < A.length; j += 2) {
                    if (A[j] % 2 == 0) {
                        swap(A, i, j);
                        break;
                    }
                }
            }
        }
        return A;
    }

    private void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
