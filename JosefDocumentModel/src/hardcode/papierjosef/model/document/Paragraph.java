package hardcode.papierjosef.model.document;

import java.util.List;

public class Paragraph extends TextElement<Sentence> {

	public Paragraph(List<Sentence> list, long start, long end)
			throws HumbugException {
		super(list, start, end);
	}

}