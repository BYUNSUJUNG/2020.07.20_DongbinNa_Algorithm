package Step02_Implementaion;

import java.util.Scanner;

// ���� �˰���
// �����¿�

// �Է� ����
// 5
// R R R U D D

// ��� ����
// 3 4

public class UpDownLeftRight {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N�� �Է¹ޱ�
        int n = sc.nextInt();
        sc.nextLine(); // ���� ����
        
        // ������ �������� ����� String �迭�� ����
        String[] plans = sc.nextLine().split(" ");
        
        // ���� ��ǥ
        int x = 1, y = 1;

        // L, R, U, D�� ���� �̵� ���� 
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        char[] moveTypes = {'L', 'R', 'U', 'D'};

        // �Է¹��� plans�� ���� �̵�
        // i�� plans�� �ε���, j�� moveTypes�� �ε���
        for (int i = 0; i < plans.length; i++) {
            char plan = plans[i].charAt(0);
            
            // �̵� �� ��ǥ ���ϱ� 
            int nx = 0, ny = 0;
            
            // // plans�� ������ ���� ã��
            for (int j = 0; j < 4; j++) {
                if (plan == moveTypes[j]) {
                    nx = x + dx[j];
                    ny = y + dy[j];
                }
            }
            
            // ������ ����� ��� ���� 
            if (nx < 1 || ny < 1 || nx > n || ny > n) continue;
            
            // �̵� ���� 
            x = nx;
            y = ny;
        }

        System.out.println(x + " " + y);
    }

}