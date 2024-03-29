package Quiz_time;

import java.text.SimpleDateFormat;
//import java.util.Scanner;

public class TimeService {
	/*
	 * 시간 설정 및 가져오는 기능
	 * 시간을 출력하는 내용은 return을 사용하여 main에서 출력
	 */
//	Scanner input = new Scanner(System.in);
	TimeDTO dto = new TimeDTO();
	SimpleDateFormat si = 
			new SimpleDateFormat("yyyy년 MM월 dd일 aa hh시 mm분 ss초");
	
//	public void TimeServe() {
//		System.out.println("1. 시작 시간 설정");
//		System.out.println("2. 시작 시간 확인");
//		System.out.println("3. 종료시간 설정");
//		System.out.println("4. 종료 시간 확인");
//		System.out.println("5. 사용 시간 가져오기");
//		System.out.print(">>> ");
//		int num = input.nextInt();
//			
//		switch (num) {
//		case 1:
//			startSet();
//			break;
//		case 2:
//			startcheck();
//			break;
//			
//		case 3:
//			endSet();
//			break;
//		case 4:
//			endcheck();
//			break;
//		case 5:
//			useTime();
//			break;
//		default:
//			System.out.println("잘못 입력된 숫자");
//				break;	
//		}
//		
//	}
	public void startSet() { //1. 시작시간 설정
		dto.setStart(System.currentTimeMillis());
	}
	public String startcheck() { //2. 시작시간 확인
		String st = si.format(dto.getStart());
		return st;
	}
	public void endSet() { //3.종료시간 설정
		dto.setEnd(System.currentTimeMillis());
		dto.setTotal((dto.getEnd() - dto.getStart()) / 1000);
	}
	public String endcheck() { //4. 종료시간 확인
		
		String end = si.format(dto.getEnd());
		return end;
	}
	public String useTime() {
		long total = dto.getTotal();
		
		int m = (int)total / 60;
		int s = (int)total % 60;
		
//		System.out.println("사용 시간 : " 
//				+ m + "분 " + s + "초");
		
		return  m + "분 " + s + "초";
	}
	

}
