package randy.wsdl.types;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="definitions")
public class Definitions {

	private List<Service> serviceList = new ArrayList<Service>();
	private List<Binding> bindingList = new ArrayList<Binding>();
	private List<PortType> portTypeList = new ArrayList<PortType>();
	private List<Message> messageList = new ArrayList<Message>();
	private List<SemExtention> semExtensionList = new ArrayList<SemExtention>();
	
	@XmlElement(name="service")
	public List<Service> getServiceList() {
		return serviceList;
	}

	@XmlElement(name="binding")
	public List<Binding> getBindingList() {
		return bindingList;
	}

	@XmlElement(name="portType")
	public List<PortType> getPortTypeList() {
		return portTypeList;
	}

	@XmlElement(name="message")
	public List<Message> getMessageList() {
		return messageList;
	}

	@XmlElement(name="semExtension")
	public List<SemExtention> getSemExtensionList() {
		return semExtensionList;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
