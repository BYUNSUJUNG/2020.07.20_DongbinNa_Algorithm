package Step03;

// ���� ���� �ִ� ����Լ�
public class RecursiveFunctionEx2 {
	
    public static void recursiveFunction(int i) {
        // 100��° ȣ���� ���� �� ����ǵ��� ���� ���� ���
        if (i == 100) return;
        
        System.out.println(i + "��° ��� �Լ����� " + (i + 1) + "��° ����Լ��� ȣ���մϴ�.");
        recursiveFunction(i + 1); // i+1��° �Լ� ȣ��
        System.out.println(i + "��° ��� �Լ��� �����մϴ�.");
    }

    public static void main(String[] args) {
        recursiveFunction(1);
    }

}
