package Step04_Sort;

// ���� ����
public class InsertSort {
	public static void main(String[] args) {

        int n = 10;
        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

        // 0�� �ƴ� �ε��� 1���� ����
        for (int i = 1; i < n; i++) {
            // �ε��� i���� 1���� �����ϸ� �ݺ��ϴ� ����
            for (int j = i; j > 0; j--) {
                // ���� ���� �� ĭ�� ���� ���� ���ϸ鼭  ��ĭ�� �̵�
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
                // ���ʿ� �ִ� ���� �ڱ��ڽź��� ������ j-for�� Ż��
                // i�� 1�����Ͽ� i-for�� ��� ����
                else break;
            }
        }

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
