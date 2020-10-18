
public class App {

	static Logger logger;
	
	public static void main(String[] args) {
		
		Logger logger = new AsteriskLogger();
		
		logger.Log("Hello");
		
		System.out.println(" ");
		
		logger.Error("Hello");

		System.out.println("______________________");
		System.out.println(" ");
		
		
		Logger logger2 = new SpacedLogger();
		
		logger2.Log("Hello");
		
		System.out.println(" "); //so... I don't actually know why I need two of these here to give me the space I need but I guess I did.
		System.out.println(" ");
		
		logger2.Error("Hello");
		
		/*
		 * This was genuinely the easiest assignment to date. OOP coding and loggers are a ton of fun to work with.
		 * 
		 * I thought the SpacedLogger would be hard until I remembered I could just use a for loop to simplify the whole process.
		 * 
		 * And.. tbh interfaces are so clean that I feel like the explanation of what everything does is just apparent so I didn't add many notes.
		 * 
		 * seriously... this took me less than an hour to write. I spent WAY more time working on other assignments.
		 * 
		 * Are they really this easy? If so I regret all the time I've wasted trying to accomplish similar tasks before this. TY TY.
		 */
	
	}
	

}

