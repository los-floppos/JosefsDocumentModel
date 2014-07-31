package hardcode.papierjosef.model.document;

import java.util.List;

public class Document extends TextElement<Paragraph> {

	public Document(List<Paragraph> list, long start, long end)	throws HumbugException {
		super(list, start, end);
	}

	@Override
	public String getText() {
		StringBuffer buf = new StringBuffer();
		for (Paragraph paragraph: getChildElements())
			buf.append(paragraph.getText());
		return buf.toString();
	}
	
}
