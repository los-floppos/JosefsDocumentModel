package hardcode.papierjosef.model.document;

import hardcode.papierjosef.model.document.annotation.TextElementProperty;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Abstract document model super class.
 * @param <T> Type of child elements. Example: For documents, Paragraph is the type of child elements.
 */
public abstract class TextElement<T> {
	private List<T> list;
	private long start;
	private long end;
	private Map<String, TextElementProperty> properties;
	
	/**
	 * Creates a new TextElement.
	 * @param list List of child elements
	 * @param start long: position of the first char in the list, relative to the whole document
	 * @param end long: position of the last char in the list, relative to the whole document
	 * @throws HumbugException if the given list does not make sense.
	 */
	public TextElement(List<T> list, long start, long end) throws HumbugException {
		this.list = list;
		this.start = start;
		this.end = end;
		properties = new HashMap<String, TextElementProperty>();		
	} 
	
	/**
	 * Adds an element to this TextElement
	 * @param child: The child element
	 * @param lenght long: Length of the child element in number of chars.
	 */
	public void addElement(T child, long lenght) {
		list.add(child);
		end += lenght;
	}
	
	/**
	 * Returns the list of child elements
	 * @return List of child elements
	 */
	public List<T> getChildElements() {
		return list;
	}
	
	/**
	 * Returns the position of the first char in this TextElement, relative to the whole document
	 * @return long: Position of the first char
	 */
	public long getStart() {
		return start;
	}
	
	/**
	 * Sets the position of the first char in this TextElement, relative to the whole document
	 * @param start long: Position of the first char
	 */
	public void setStart(long start) {
		this.start = start;
	}
	
	/**
	 * Returns the position of the last char in this TextElement, relative to the whole document
	 * @return long: Position of the last char
	 */
	public long getEnd() {
		return end;
	}
	
	/**
	 * Sets the position of the last char in this TextElement, relative to the whole document
	 * @param ende long: Position of the last char
	 */
	public void setEnd(long ende) {
		this.end = ende;
	}
	
	/**
	 * Returns the TextElementProperty mapped to the given key.
	 * @param key String: The TextElementProperty's key
	 * @return TextElementProperty: The mapped TextElementProperty
	 */
	public TextElementProperty getProperty(String key) {
		return properties.get(key);
	}
	
	/**
	 * Returns the set of keys of TextElementProperties contained in this TextElement
	 * @return Set of keys
	 */
	public Set<String> getPropertyKeys() {
		return properties.keySet();
	}
	
	/**
	 * Checks if the given key of a TextElementProperty is contained in the map of properties for this TextElement.
	 * @param key String: The key of the TextElementProperty
	 * @return true, if it already contains a mapping for the given key, false otherwise.
	 */
	public boolean hasProperty(String key) {
		return properties.containsKey(key);
	}
	
	/**
	 * Adds a property to the map of TextElementProperties
	 * @param property TextElementProperty: The property to be added
	 * @return the previous value associated with key, or null if there was no mapping for key. 
	 */
	public TextElementProperty addProperty(TextElementProperty property) {
		return properties.put(property.getKey(), property);
	}
	
	/**
	 * Removes all TextElementProperties from this TextElement
	 */
	public void clearProperties() {
		properties.clear();
	}
	
	/**
	 * Return the size of the list of child elements
	 * @return int: Size of the list of child elements
	 */
	public int size() {
		return list.size();
	}
	
	/**
	 * Returns a String representation of this TextElement.
	 * @return String representation
	 */
	public abstract String getText();
}
