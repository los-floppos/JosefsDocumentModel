package hardcode.papierjosef.model.document;

import java.util.List;

public class Sentence extends TextElement<Word> {

	public Sentence(List<Word> list, long start, long end) throws HumbugException {
		super(list, start, end);
	}	
}
