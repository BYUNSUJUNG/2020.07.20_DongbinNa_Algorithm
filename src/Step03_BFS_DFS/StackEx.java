package Step03_BFS_DFS;

import java.util.*;

public class StackEx {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		
		// ����(5) - ����(2) - ����(3) - ����(7) - ����() - ����(1) - ����(4) - ����()
		s.push(5); 	// 5
		s.push(2); 	// 2 5
		s.push(3); 	// 3 2 5
		s.push(7); 	// 7 3 2 5
		s.pop();	// 3 2 5
		s.push(1);	// 1 3 2 5
		s.push(4);	// 4 1 3 2 5
		s.pop();	// 1 3 2 5 
		
		// ������ �ֻ�� ���Һ��� ���
		while(!s.empty()) {
			System.out.print(s.peek() + "");
			s.pop();
		}
	}
}
