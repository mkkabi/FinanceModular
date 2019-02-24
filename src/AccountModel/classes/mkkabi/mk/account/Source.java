
package mkkabi.mk.account;

import java.util.ArrayList;
import java.util.List;

public class Source {
	private String name;
	private static List<Source> sources = new ArrayList();

	public Source(String name) {
		this.name = name;
		sources.add(this);
	}

	public String getName() {
		return name;
	}

	public static List<Source> getSources() {
		return sources;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Source{" + "name=" + name + '}';
	}

	
	
}
