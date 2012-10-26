package randy.wsdl.types;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

import randy.NamespaceManager;

public class SemMessageExt {

	private String id;
	private SemExt semExt;
	
	@XmlAttribute(name="id")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@XmlElement(name="semExt", namespace=NamespaceManager.MECE_NAMESPACE)
	public SemExt getSemExt() {
		return semExt;
	}

	public void setSemExt(SemExt semExt) {
		this.semExt = semExt;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
