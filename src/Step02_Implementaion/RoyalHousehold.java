package Step02_Implementaion;

import java.util.Scanner;

// ���� �˰���
// �ս��� ����Ʈ

// �Է� ����
// a1

// ��� ����
// 2

public class RoyalHousehold {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
	    // ���� ����Ʈ�� ��ġ �Է¹ޱ�
	    String inputData = sc.nextLine();
	    int row = inputData.charAt(1) - '0'; // - '0': ���ڸ� ���ڷ� �ٲپ��ش�. // '1' -> 1
	    int column = inputData.charAt(0) - 'a' + 1; // 0 + 1 -> 1
	
	    // ����Ʈ�� �̵��� �� �ִ� 8���� ���� ����
	    int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
	    int[] dy = {-1, -2, -2, -1, 1, 2, 2, 1};
	
	    // ���� ��ġ ī��Ʈ
	    int cnt = 0;
	    
	    // 8���� ���⿡ ���Ͽ� �� ��ġ�� �̵��� �������� Ȯ��
	    for (int i = 0; i < 8; i++) {
	        // �̵��ϰ��� �ϴ� ��ġ Ȯ��
	        int nextRow = row + dx[i];
	        int nextColumn = column + dy[i];
	        
	        // �̵� ��ġ�� �̵��� �� ������ ī��Ʈ ����
	        if (nextRow >= 1 && nextRow <= 8 && nextColumn >= 1 && nextColumn <= 8) {
	            cnt += 1;
	        }
	        
	        /*	���� ������ ������ ����� cnt���ϴ� ����� ���� - UpDownLeftRight���� �� ���
	         *  if (nextRow < 1 || nextRow > 8 || nextColumn < 1 || nextColumn > 8) continue;
	        
	       		cnt += 1;
	       		
	         * */
	    }
	    System.out.println(cnt);
	}

}
