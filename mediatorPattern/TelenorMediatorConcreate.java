package mediatorPattern;

import java.time.LocalDateTime;

public class TelenorMediatorConcreate implements IMediator {

	@Override
	public void sendMessage(Chatter chatter, String msg) {
		System.out.println(LocalDateTime.now()+":::"+ chatter.getName()+" -send- "+msg);
	}

}
