package Step04_Sort;

import java.util.Arrays;

// ǥ�� ���̺귯��
// ��������
public class StandardLibrary {
	public static void main(String[] args) {
    	
		// ������ ����
        int n = 10;
        
        // �迭 ����
        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

        // ����
        Arrays.sort(arr);

        // ���ĵ� �迭 ���
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
