import java.util.Scanner;

public class grade {

	public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         System.out.println("수학,과학,영어 순으로 3갸의 점수 입력>>");
         Grade me =new Grade();
         me.math = scan.nextInt();
         me.math = scan.nextInt();
         me.math = scan.nextInt();
         System.out.println("평균은"+me.avaerage());
		
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