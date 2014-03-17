package junit;

public class Play {

	public static String judge(int c1, int c2) {
		String result = "";
		int diff = c1 - c2;
		if (diff == 0) {
			result = "비겼습니다.";
		} else if ((diff == -1) || (diff == 2)) {
			result = "컴퓨터가 이겼습니다.";
		} else {
			result = "당신이 이겼습니다.";
		}
		return result;
	}

}
