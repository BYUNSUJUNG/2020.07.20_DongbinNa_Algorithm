package Step04_Sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// ǥ�� ���̺귯��
// ��������
public class StandardLibrary_ReverseOrder {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // �Է��� ������ ����
        int n = sc.nextInt();

        // N���� ������ �Է¹޾� �迭�� ����
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // �⺻ ���� ���̺귯���� �̿��Ͽ� �������� ���� ����
        Arrays.sort(arr, Collections.reverseOrder());

        // ���ĵ� �迭 ���
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
