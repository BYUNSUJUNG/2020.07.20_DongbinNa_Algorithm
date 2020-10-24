package Step03_BFS_DFS;

import java.util.Scanner;

// ����� ��� �Ա� - DFS

// �Է� ����
// 4 5
// 00110
// 00011
// 11111
// 00000

// ������ �շ��ִ� �κ� 0, �׷��� ���� �κ� 1 
// ���� �� �ִ� ���̽�ũ���� ����

public class DFS_Drink {
	
	public static int n, m;
    public static int[][] graph = new int[1000][1000];

    // DFS�� Ư�� ��带 �湮�ϰ� ����� ��� ���鵵 �湮
    public static boolean dfs(int x, int y) {
    	
        // �־��� ������ ����� ��쿡�� ��� ����
        if (x <= -1 || x >=n || y <= -1 || y >= m) { // ������ ���� x: 0 1 2 3, y: 0 1 2 3 4 �� ���ԵǾ� �־�� �Ѵ�.
            return false;
        }
        
        // ���� ��带 ���� �湮���� �ʾҴٸ�
        if (graph[x][y] == 0) {
        	
            // �ش� ��� �湮 ó��
            graph[x][y] = 1;
            
            // ��, ��, ��, ���� ��ġ�鵵 ��� ��������� ȣ��
            dfs(x - 1, y);
            dfs(x, y - 1);
            dfs(x + 1, y);
            dfs(x, y + 1);
            
            // �ڱ��ڽ� �湮 ó�� ������ true
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N, M�� ������ �������� �����Ͽ� �Է� �ޱ�
        n = sc.nextInt(); // 4 - ��
        m = sc.nextInt(); // 5 - ��
        sc.nextLine(); // ���� �����

        // 2���� ����Ʈ�� �� ���� �Է� �ޱ� 
        for (int i = 0; i < n; i++) { // �� �྿ �Է�
            String str = sc.nextLine();
            for (int j = 0; j < m; j++) { // ������ ���� �� ����
                graph[i][j] = str.charAt(j) - '0'; // - '0': ���ڸ� ���ڷ� ����
            }
        }

        // ���̽�ũ�� ī��Ʈ
        int result = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
               
                if (dfs(i, j)) { // true�� ��� ī��Ʈ
                    result += 1;
                }
            }
        }
        System.out.println(result); // ���� ��� 
    }
	
}
