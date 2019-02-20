
public class SpacedLogger implements Logger{

	public void Log(String Log) {
	
		Log = Log.replace("", " ");
		
		System.out.println(Log);
	}

	public void Error(String Error) {
		
		Error = Error.replaceAll("", " ");
		
		System.out.println("ERROR:" + Error);
	}
}
