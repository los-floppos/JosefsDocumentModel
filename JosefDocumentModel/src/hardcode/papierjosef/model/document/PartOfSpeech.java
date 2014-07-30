package hardcode.papierjosef.model.document;

public class PartOfSpeech {
	
	private String partOfSpeech;
	private String description;
	
	/**
	 * Creates a new part of speech object
	 * @param partOfSpeech String: the part of speech's name
	 */
	public PartOfSpeech(String partOfSpeech) {
		this.partOfSpeech = partOfSpeech;
		description = "";
	}
	
	/**
	 * Creates a new part of speech object
	 * @param partOfSpeech String: the part of speech's name
	 * @param description String: textual description of the part of speech
	 */
	public PartOfSpeech(String partOfSpeech, String description) {
		this.partOfSpeech = partOfSpeech;
		this.description = description;
	}
	
	public String getText() {
		return partOfSpeech;
	}
	
	public String getDescription() {
		return description;
	}
	
	@Override
	public String toString() {
		return partOfSpeech + ": " + description;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof PartOfSpeech) {
			return equals((PartOfSpeech) obj);
		} else {
			return false;
		}
	}
	
	/**
	 * Returns true, if this part of speech's getText() equals the given object's getText().
	 * @param pos PartOfSpeech.
	 * @return boolean
	 */
	public boolean equals(PartOfSpeech pos) {
		return pos.getText().equals(partOfSpeech);
	}
	
}
