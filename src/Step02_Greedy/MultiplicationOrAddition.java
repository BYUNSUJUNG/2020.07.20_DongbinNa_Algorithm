package Step02_Greedy;

import java.util.Scanner;

// �׸��� �˰���
// ���� �Ǵ� ����
public class MultiplicationOrAddition {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		// ù ��° ���ڸ� ���ڷ� ������ ���� ����
		long result = str.charAt(0) - '0';
		
		// ù ��° ���ڿ� ������ ��� Ȯ��
		for (int i = 1; i < str.length(); i++) { // �ε����� 0�� �ƴ� 1����
			// �� �� �߿��� �ϳ��� 0 Ȥ�� 1�� ���, ����
			int num = str.charAt(i) - '0';
			if (num<=1||result<=1) { // ù��° ������ result�� 0 �Ǵ� 1�� ��츦 ��ġ�� �ȵȴ�.
				result += num;
			}
			else {
				result *= num;
			}
		}
		System.out.println(result);
	}
}
