package hardcode.papierjosef.model.document;

import hardcode.papierjosef.model.document.annotation.TextElementProperty;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class TextElement<T> {
	
	private List<T> list;
	private long start;
	private long end;
	private Map<String, TextElementProperty> properties;
	
	/**
	 * TODO
	 * @param text
	 * @param start
	 * @param ende
	 */
	public TextElement(List<T> list, long start, long end) throws HumbugException {
		this.list = list;
		this.start = start;
		this.end = end;
		properties = new HashMap<String, TextElementProperty>();		
	} 
	
	public void addElement(T child, long lenght) {
		list.add(child);
		end += lenght;
	}
	
	public List<T> getChildElements() {
		return list;
	}
	
	public long getStart() {
		return start;
	}
	
	public void setStart(long start) {
		this.start = start;
	}
	
	public long getEnd() {
		return end;
	}
	
	public void setEnd(long ende) {
		this.end = ende;
	}
	
	public TextElementProperty getProperty(String key) {
		return properties.get(key);
	}
	
	public Set<String> getPropertyKeys() {
		return properties.keySet();
	}
	
	public TextElementProperty addProperty(TextElementProperty property) {
		return properties.put(property.getKey(), property);
	}
	
	public void clearProperties() {
		properties.clear();
	}
	
	public int size() {
		return list.size();
	}
	
	public abstract String getText();
}
