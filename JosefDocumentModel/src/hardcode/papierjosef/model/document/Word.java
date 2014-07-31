package hardcode.papierjosef.model.document;

import java.util.List;

public class Word extends TextElement<String> {
	private PartOfSpeech pos;
	private String appendix;

	public String getAppendix() {
		return appendix;
	}

	public void setAppendix(String appendix) {
		this.appendix = appendix;
	}

	public Word(List<String> list, long start, long end, PartOfSpeech pos)
			throws HumbugException {
		super(list, start, end);

		if (list.size() != 1) {
			throw new HumbugException("Invalid number of list elements.");
		}

		this.pos = pos;
	}

	public String getWord() {
		return getChildElements().get(0);
	}

	public PartOfSpeech getPartOfSpeech() {
		return pos;
	}

	@Override
	public String getText() {
		return getChildElements().get(0) + appendix;
	}
}
