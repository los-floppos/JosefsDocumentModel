package hardcode.papierjosef.model.document;

import java.util.List;

/**
 * Represents a Paragraph. A Paragraph contains Sentences. Paragraphs are contained by a Document.  
 */
public class Paragraph extends TextElement<Sentence> {
	/**
	 * Creates a new Paragraph.
	 * @param list List of Sentences
	 * @param start long: position of the first char in the list, relative to the whole document
	 * @param end long: position of the last char in the list, relative to the whole document
	 * @throws HumbugException if an action to the document model does not make sense.
	 */
	public Paragraph(List<Sentence> list, long start, long end)
			throws HumbugException {
		super(list, start, end);
	}

	@Override
	public String getText() {
		StringBuffer buf = new StringBuffer();
		for (Sentence sent: getChildElements())
			buf.append(sent.getText());
		return buf.toString();
	}

}