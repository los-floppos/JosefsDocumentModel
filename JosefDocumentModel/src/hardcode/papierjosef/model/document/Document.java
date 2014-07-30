package hardcode.papierjosef.model.document;

import java.util.List;

public class Document extends TextElement<Paragraph> {

	public Document(List<Paragraph> list, long start, long end)	throws HumbugException {
		super(list, start, end);
	}
	
}
