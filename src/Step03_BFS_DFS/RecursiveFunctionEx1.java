package Step03_BFS_DFS;

// ���� ������ ��� �������� ����Լ��� �����
public class RecursiveFunctionEx1 {

    public static void recursiveFunction() {
        System.out.println("��� �Լ��� ȣ���մϴ�.");
        recursiveFunction(); // ����Լ� ȣ��
    }

    public static void main(String[] args) {
        recursiveFunction(); // �Լ� ȣ��
    }

}
