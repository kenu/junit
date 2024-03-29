package junit;

import junit.framework.TestCase;

public class PlayTest extends TestCase {
	public void testJudge() {
		int 가위 = 0;
		int 바위 = 1;
		int 보 = 2;
		assertEquals("비겼습니다.", Play.judge(가위, 가위));
		assertEquals("비겼습니다.", Play.judge(바위, 바위));
		assertEquals("비겼습니다.", Play.judge(보, 보));
		assertEquals("당신이 이겼습니다.", Play.judge(바위, 가위));
		assertEquals("당신이 이겼습니다.", Play.judge(가위, 보));
		assertEquals("당신이 이겼습니다.", Play.judge(보, 바위));
		assertEquals("컴퓨터가 이겼습니다.", Play.judge(가위, 바위));
		assertEquals("컴퓨터가 이겼습니다.", Play.judge(바위, 보));
		assertEquals("컴퓨터가 이겼습니다.", Play.judge(보, 가위));
	}

}
