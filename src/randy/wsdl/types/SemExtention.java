package randy.wsdl.types;

import javax.xml.bind.annotation.XmlElement;

import randy.NamespaceManager;

public class SemExtention {

	private SemMessageExt semMessageExt;
	
	@XmlElement(name="semMessageExt", namespace=NamespaceManager.MECE_NAMESPACE)
	public SemMessageExt getSemMessageExt() {
		return semMessageExt;
	}

	public void setSemMessageExt(SemMessageExt semMessageExt) {
		this.semMessageExt = semMessageExt;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
