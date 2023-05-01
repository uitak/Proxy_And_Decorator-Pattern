package hello.proxy.pureproxy.decorator.code;

import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DecoratorPatternTest {

	@Test
	void noDecoreator() {
		Component realComponent = new RealComponent();
		DecoratorPatternClient client = new DecoratorPatternClient(realComponent);
		client.execute();
	}
	
	@Test
	void decorator1() {
		Component realComponent = new RealComponent();
		Component messageDecorator = new MessageDecorator(realComponent);
		DecoratorPatternClient client = new DecoratorPatternClient(messageDecorator);
		client.execute();
	}
	
	
}
