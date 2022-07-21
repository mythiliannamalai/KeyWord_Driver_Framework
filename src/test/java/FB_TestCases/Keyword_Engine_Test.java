package FB_TestCases;

import org.testng.annotations.Test;

import FB_Keyword_Engine.Keyword_Engine;

public class Keyword_Engine_Test {
	Keyword_Engine engine;
	@Test
	public void startExecutions_Test() {
		engine = new Keyword_Engine();
		engine.startExecutions("Sheet1");
	}
}
