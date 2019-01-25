import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;

public class Log{

	private static Log instance;
	private String filename;
	private SimpleDateFormat format;

	private Log() {}

	public static Log getInstance() {
		if(instance == null) {
			instance = new Log();
		}
		return instance;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public void write(String textToLog) {
		try (FileOutputStream fis = new FileOutputStream(filename, true);
				OutputStreamWriter osr = new OutputStreamWriter(fis);
				BufferedWriter writer = new BufferedWriter(osr);){
			
			writer.append(textToLog);
			writer.newLine();
			writer.flush();
			
		} catch (IOException e) {}
	}
	
	public static void main(String[] args) {
		Log log = Log.getInstance();
		log.setFilename("files/logging.txt");
		log.write("Testing");
		System.out.println(log.toString());
	}
}
