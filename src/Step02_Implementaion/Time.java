package Step02_Implementaion;

import java.util.Scanner;

// ���� �˰���
// ���� Ž��
// �ð�

// ���� N�� �ԷµǸ� 00�� 00�� 00�ʺ��� N�� 59�� 59�ʱ���
// 3�� ���ԵǴ� ��� ����� ���� ���ؾ��Ѵ�.

// �Է� ����
// 5

// ��� ����
// 11475

public class Time {

	// Ư���� �ð� �ȿ� '3'�� ���ԵǾ� �ִ����� ����
    public static boolean check(int h, int m, int s) {
    	// % 10 : 1�� �ڸ��� 3�� ���ԵǾ� �ִ���
    	// / 10 : 10�� �ڸ��� 3�� ���ԵǾ� �ִ���
        if (h % 10 == 3 || m / 10 == 3 || m % 10 == 3 || s / 10 == 3 || s % 10 == 3)
            return true; // ���Ե� ��� true ����
        return false; // ���Ե��� �ʾ��� ��� false ����
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // h�� �Է¹ޱ� 
        int h = sc.nextInt();
        // 3�� ���Ե� ����
        int cnt = 0;

        // 00�� 00�� 00�ʺ��� N�� 59�� 59�ʱ���
        for (int i = 0; i <= h; i++) { // 0 ~ h
            for (int j = 0; j < 60; j++) { // 0 ~ 59
                for (int k = 0; k < 60; k++) { // 0 ~ 59
                    // �� �ð� �ȿ� '3'�� ���ԵǾ� �ִٸ�(true), ī��Ʈ ����
                    if (check(i, j, k)) cnt++;
                }
            }
        }

        System.out.println(cnt);
    }

}
