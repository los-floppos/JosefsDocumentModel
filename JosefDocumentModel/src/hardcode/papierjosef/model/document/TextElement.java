package hardcode.papierjosef.model.document;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class TextElement<T> {
	
	private List<T> list;
	private long start;
	private long end;
	private Map<String, String> properties;
	
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
		properties = new HashMap<String, String>();		
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
	
	public String getProperty(String key) {
		return properties.get(key);
	}
	
	public Set<String> getPropertyKeys() {
		return properties.keySet();
	}
	
	public String putProperty(String key, String value) {
		return properties.put(key, value);
	}
	
	public void clearProperties() {
		properties.clear();
	}
}
