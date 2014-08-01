package hardcode.papierjosef.model.document.annotation;

public class TextElementProperty {

	private String key;
	private Description description;
	
	public TextElementProperty(String key, Description description) {
		this.key = key;
		this.description = description;
	}
	
	public TextElementProperty(String key, String description) {
		this.key = key;
		this.description = new Description(description);
	}
	
	public String getKey() {
		return key;
	}

	public Description getDescription() {
		return description;
	}
	
	@Override
	public String toString() {
		return "[" + key + ": " + description.getDefaultDescription() + "]";
	}
}
