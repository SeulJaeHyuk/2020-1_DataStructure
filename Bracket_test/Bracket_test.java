package Bracket_test; //���İ�ȣ
public class Bracket_test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		optExp opt = new optExp();
		String exp =  "(3*5)-(6/2)";
		
		System.out.println(exp);
		
		if(opt.testPair(exp))
			System.out.println("��ȣ ����!");
		else
			System.out.println("��ȣ Ʋ��!!!");
	}

}
