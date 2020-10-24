package Step04_Sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// �� �迭 A, B
// ������ ���Ҹ� �ٲ㼭, �迭 A�� ��� ������ ���� �ִ��� ���

public class Replace_two_array_elements {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N�� K�� �Է¹ޱ�
        // �� �迭�� ���� ����
        int n = sc.nextInt();
        // �ִ� �ٲ�ġ�� Ƚ��
        int k = sc.nextInt();

        // �迭 A�� ��� ���Ҹ� �Է¹ޱ�
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        // �迭 B�� ��� ���Ҹ� �Է¹ޱ�
        Integer[] b = new Integer[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        // �迭 A�� �������� ���� ����
        Arrays.sort(a);
        // �迭 B�� �������� ���� ����
        Arrays.sort(b, Collections.reverseOrder());

        // ù ��° �ε������� Ȯ���ϸ�, �� �迭�� ���Ҹ� �ִ� K�� �� 
        for (int i = 0; i < k; i++) {
            // A�� ���Ұ� B�� ���Һ��� ���� ���
            if (a[i] < b[i]) {
                // �� ���Ҹ� ��ü
                int temp = a[i];
                a[i] = b[i];
                b[i] = temp;
            }
            // A�� ���Ұ� B�� ���Һ��� ũ�ų� ���� ��, �ݺ����� Ż��
            else break;
        }

        // �迭 A�� ��� ������ ���� ���
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        System.out.println(sum);
    }

}
