package Step03;

import java.util.*;

public class QueueEx {
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		
		// ����(5) - ����(2) - ����(3) - ����(7) - ����() - ����(1) - ����(4) - ����()
		q.offer(5);	// 5
		q.offer(2);	// 2 5
		q.offer(3); // 3 2 5 
		q.offer(7);	// 7 3 2 5
		q.poll();	// 7 3 2
		q.offer(1);	// 1 7 3 2
		q.offer(4);	// 4 1 7 3 2 
		q.poll();	// 4 1 7 3
		
		// ���� ���� ���Һ��� ����
		// 3 7 1 4
		while(!q.isEmpty()) {
			System.out.print(q.poll() + "");
		} 
	}
}
