import java.util.Scanner;

public class grade {

	public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         System.out.println("����,����,���� ������ 3���� ���� �Է�>>");
         Grade me =new Grade();
         me.math = scan.nextInt();
         me.math = scan.nextInt();
         me.math = scan.nextInt();
         System.out.println("�����"+me.avaerage());
		
	}
	}
class Grade{
		int math;
		int science;
		int english; 
		public int avaerage () {
			return(math+science+english)/3;
		}
}