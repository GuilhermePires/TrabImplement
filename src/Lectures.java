
public class Lectures {
	
	private static String title;
	private static String summary;
	private static String speaker;
	private static String room;

	public Lectures(String title, String summary, String speaker, String room) {
		
		this.title = title;
		this.summary = summary;
		this.speaker = speaker;
		this.room = room;
	}

	public static String getTitle() {
		return title;
	}

	public static String getSummary() {
		return summary;
	}

	public static String getSpeaker() {
		return speaker;
	}

	public static String getRoom() {
		return room;
	}

	
}