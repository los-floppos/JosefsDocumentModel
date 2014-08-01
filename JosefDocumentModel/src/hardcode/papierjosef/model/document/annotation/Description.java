package hardcode.papierjosef.model.document.annotation;

import java.util.HashMap;
import java.util.Map;

/**
 * Description may be available in different languages.
 */
public class Description {
	
	public final static String DEFAULT_DESCRIPTION_KEY = "#DEFAULT_DESCRIPTION_KEY__";
	
	private Map<String, String> descriptions;
	
	public Description(String defaultDescription) {
		descriptions = new HashMap<String, String>();
		descriptions.put(DEFAULT_DESCRIPTION_KEY, defaultDescription);
	}
	
	public boolean addDescription(String locale, String text) {
		if(locale.equals(DEFAULT_DESCRIPTION_KEY)) {
			return false;
		}
		descriptions.put(locale, text);
		return true;
	}
	
	public String getDescription(String locale) {
		return descriptions.get(locale);
	}
	
	public String getDefaultDescription() {
		return descriptions.get(DEFAULT_DESCRIPTION_KEY);
	}	
}
