package randy.owl.types;

import javax.xml.bind.annotation.XmlAttribute;

import randy.owl.NamespaceManager;

public class OWLSubClass {

	private String resource;
	
	@XmlAttribute(namespace=NamespaceManager.RDF_NAMESPACE)
	public String getResource() {
		return resource;
	}

	public void setResource(String resource) {
		this.resource = resource;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
