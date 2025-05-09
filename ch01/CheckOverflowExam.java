package ch01;

public class CheckOverflowExam {

	public static void main(String[] args) {
		// �츮�� ����Ÿ���� Ű����� �Է¹޾� ó���ϴ°��� ��Ģ
		// �Է°��� ������ �ʿ䰡 �ִ�. (����üũ)
		// main �޼��� �̿ܿ� �Ǵٸ� �Լ� �޼��带 �߰��Ͽ� ���

		int result = safeAdd(70, 80);
		System.out.println(result);

	} // ���θ޼�������

	public static int safeAdd(int left, int right) {
		if(right>0) { // ������ ���� 0���� Ŀ�ߵ�
			if(left > (Integer.MAX_VALUE - right)) {
		            // Integer.MAX_VALUE Ÿ���� �ִ밪 (��21��)
				    // int Ÿ�Կ� �ִ밪���� ������ ���� ������ ���� ������ �۾ƾ���.
				throw new ArithmeticException("�����÷ο�߻�");
				//����ó�� �����߻��� �ڵ�
	          } // ���� if�� ����
	    } else { // false �϶�
		if (left < (Integer.MIN_VALUE - right)) {
			// Integer.MAX_VALUE Ÿ���� �ִ밪 (��-21��)
			throw new ArithmeticException("�����÷ο�߻�");
		} // ���� if�� ����
	} // �����÷ο� if�� ����

	return left+right;
} // safeAdd �޼�������

} // Ŭ���� ����
