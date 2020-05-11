package ffmpeg_sampe1;
                                //Converting Mp4 to Avi Format.
import java.util.ArrayList;
import java.util.List;

public class FfmpegTest {
	
	private String ffmpegEXE;
	
	public FfmpegTest(String ffmpegEXE) {
		super();
		this.ffmpegEXE = ffmpegEXE;
	}
	public void convertor(String videoInputPath, String videoOutputPath) throws Exception {
		//ffmpeg -i input.mp4 output.avi
		List<String> command = new ArrayList<>();
		command.add(ffmpegEXE);
		command.add("-i");
		command.add(videoInputPath);
		command.add(videoOutputPath);
		
		for(String c:command) {
			System.out.println(c);
		}
		
		ProcessBuilder process = new ProcessBuilder(command);
		process.start();
	}
	
	
	
	
	public static void main(String[] args) {
		FfmpegTest ffmpeg = new FfmpegTest("C:\\ffmpeg\\bin\\ffmpeg.exe");
	
		try {
			ffmpeg.convertor("C:\\ffmpeg\\bin\\FFMPEG Testing\\video.mp4", "C:\\ffmpeg\\bin\\FFMPEG Testing\\video.avi");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
