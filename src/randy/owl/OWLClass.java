package randy.owl;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class OWLClass {
	
	private String ID;
	private OWLSubClass subClass;
	
	
	@XmlAttribute(name="ID", namespace=NamespaceManager.RDF_NAMESPACE)
	public String getID() {
		return ID;
	}


	public void setID(String iD) {
		ID = iD;
	}


	@XmlElement(name="subClassOf", namespace=NamespaceManager.RDFS_NAMESPACE)
	public OWLSubClass getSubClass() {
		return subClass;
	}


	public void setSubClass(OWLSubClass subClass) {
		this.subClass = subClass;
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
