package Step02_Greedy;

// �׸��� �˰���
// �Ž��� ��

// ���� ū ȭ�� �������� ���� �Ž��� �ش�.

public class Change {

    public static void main(String[] args) {
        int n = 1260; // �Ž��� ����ϴ� �ݾ�
        int cnt = 0; // ���� ����
        int[] coinTypes = {500, 100, 50, 10};
		
        // ū ȭ����� ���� ����
        for (int i = 0; i < 4; i++) {
            int coin = coinTypes[i];
            cnt += n / coin;
            n %= coin; // ���� �ٽ� n������
        }

        System.out.println(cnt);
    }
}
