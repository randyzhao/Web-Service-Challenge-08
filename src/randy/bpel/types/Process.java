//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.25 at 08:26:25 PM CST 
//


package randy.bpel.types;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sequence">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://schemas.xmlsoap.org/ws/2003/03/business-process/}receive"/>
 *                   &lt;element name="switch">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="case" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;choice>
 *                                       &lt;element ref="{http://schemas.xmlsoap.org/ws/2003/03/business-process/}switch"/>
 *                                       &lt;element ref="{http://schemas.xmlsoap.org/ws/2003/03/business-process/}sequence"/>
 *                                       &lt;element ref="{http://schemas.xmlsoap.org/ws/2003/03/business-process/}flow"/>
 *                                     &lt;/choice>
 *                                     &lt;attribute name="name" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;pattern value="(Alternative-Solution)[A-Za-z0-9]*"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="name" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;pattern value="(SolutionAlternatives)[A-Za-z0-9]*"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="name">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="main"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="WSC08"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="targetNamespace" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyURI">
 *             &lt;enumeration value="http://www.ws-challenge.org/WSC08CompositionSolution/"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
		"sequence"
})
@XmlRootElement(name = "process")
public class Process {

	@XmlElement(required = true)
	protected Process.Sequence sequence;
	@XmlAttribute(required = true)
	protected String name;
	@XmlAttribute(required = true)
	protected String targetNamespace;

	/**
	 * Gets the value of the sequence property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link Process.Sequence }
	 *     
	 */
	public Process.Sequence getSequence() {
		return this.sequence;
	}

	/**
	 * Sets the value of the sequence property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link Process.Sequence }
	 *     
	 */
	public void setSequence(Process.Sequence value) {
		this.sequence = value;
	}

	/**
	 * Gets the value of the name property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Sets the value of the name property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	public void setName(String value) {
		this.name = value;
	}

	/**
	 * Gets the value of the targetNamespace property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	public String getTargetNamespace() {
		return this.targetNamespace;
	}

	/**
	 * Sets the value of the targetNamespace property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	public void setTargetNamespace(String value) {
		this.targetNamespace = value;
	}


	/**
	 * <p>Java class for anonymous complex type.
	 * 
	 * <p>The following schema fragment specifies the expected content contained within this class.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element ref="{http://schemas.xmlsoap.org/ws/2003/03/business-process/}receive"/>
	 *         &lt;element name="switch">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence>
	 *                   &lt;element name="case" maxOccurs="unbounded">
	 *                     &lt;complexType>
	 *                       &lt;complexContent>
	 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                           &lt;choice>
	 *                             &lt;element ref="{http://schemas.xmlsoap.org/ws/2003/03/business-process/}switch"/>
	 *                             &lt;element ref="{http://schemas.xmlsoap.org/ws/2003/03/business-process/}sequence"/>
	 *                             &lt;element ref="{http://schemas.xmlsoap.org/ws/2003/03/business-process/}flow"/>
	 *                           &lt;/choice>
	 *                           &lt;attribute name="name" use="required">
	 *                             &lt;simpleType>
	 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                 &lt;pattern value="(Alternative-Solution)[A-Za-z0-9]*"/>
	 *                               &lt;/restriction>
	 *                             &lt;/simpleType>
	 *                           &lt;/attribute>
	 *                         &lt;/restriction>
	 *                       &lt;/complexContent>
	 *                     &lt;/complexType>
	 *                   &lt;/element>
	 *                 &lt;/sequence>
	 *                 &lt;attribute name="name" use="required">
	 *                   &lt;simpleType>
	 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                       &lt;pattern value="(SolutionAlternatives)[A-Za-z0-9]*"/>
	 *                     &lt;/restriction>
	 *                   &lt;/simpleType>
	 *                 &lt;/attribute>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *       &lt;attribute name="name">
	 *         &lt;simpleType>
	 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *             &lt;enumeration value="main"/>
	 *           &lt;/restriction>
	 *         &lt;/simpleType>
	 *       &lt;/attribute>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = {
			"receive",
			"_switch"
	})
	public static class Sequence {

		@XmlElement(required = true)
		protected Receive receive;
		@XmlElement(name = "switch", required = true)
		protected Process.Sequence.Switch _switch;
		@XmlAttribute
		protected String name;

		/**
		 * Gets the value of the receive property.
		 * 
		 * @return
		 *     possible object is
		 *     {@link Receive }
		 *     
		 */
		public Receive getReceive() {
			return this.receive;
		}

		/**
		 * Sets the value of the receive property.
		 * 
		 * @param value
		 *     allowed object is
		 *     {@link Receive }
		 *     
		 */
		public void setReceive(Receive value) {
			this.receive = value;
		}

		/**
		 * Gets the value of the switch property.
		 * 
		 * @return
		 *     possible object is
		 *     {@link Process.Sequence.Switch }
		 *     
		 */
		public Process.Sequence.Switch getSwitch() {
			return this._switch;
		}

		/**
		 * Sets the value of the switch property.
		 * 
		 * @param value
		 *     allowed object is
		 *     {@link Process.Sequence.Switch }
		 *     
		 */
		public void setSwitch(Process.Sequence.Switch value) {
			this._switch = value;
		}

		/**
		 * Gets the value of the name property.
		 * 
		 * @return
		 *     possible object is
		 *     {@link String }
		 *     
		 */
		public String getName() {
			return this.name;
		}

		/**
		 * Sets the value of the name property.
		 * 
		 * @param value
		 *     allowed object is
		 *     {@link String }
		 *     
		 */
		public void setName(String value) {
			this.name = value;
		}


		/**
		 * <p>Java class for anonymous complex type.
		 * 
		 * <p>The following schema fragment specifies the expected content contained within this class.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence>
		 *         &lt;element name="case" maxOccurs="unbounded">
		 *           &lt;complexType>
		 *             &lt;complexContent>
		 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                 &lt;choice>
		 *                   &lt;element ref="{http://schemas.xmlsoap.org/ws/2003/03/business-process/}switch"/>
		 *                   &lt;element ref="{http://schemas.xmlsoap.org/ws/2003/03/business-process/}sequence"/>
		 *                   &lt;element ref="{http://schemas.xmlsoap.org/ws/2003/03/business-process/}flow"/>
		 *                 &lt;/choice>
		 *                 &lt;attribute name="name" use="required">
		 *                   &lt;simpleType>
		 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                       &lt;pattern value="(Alternative-Solution)[A-Za-z0-9]*"/>
		 *                     &lt;/restriction>
		 *                   &lt;/simpleType>
		 *                 &lt;/attribute>
		 *               &lt;/restriction>
		 *             &lt;/complexContent>
		 *           &lt;/complexType>
		 *         &lt;/element>
		 *       &lt;/sequence>
		 *       &lt;attribute name="name" use="required">
		 *         &lt;simpleType>
		 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *             &lt;pattern value="(SolutionAlternatives)[A-Za-z0-9]*"/>
		 *           &lt;/restriction>
		 *         &lt;/simpleType>
		 *       &lt;/attribute>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = {
				"_case"
		})
		public static class Switch {

			@XmlElement(name = "case", required = true)
			protected List<Process.Sequence.Switch.Case> _case;
			@XmlAttribute(required = true)
			protected String name;

			/**
			 * Gets the value of the case property.
			 * 
			 * <p>
			 * This accessor method returns a reference to the live list,
			 * not a snapshot. Therefore any modification you make to the
			 * returned list will be present inside the JAXB object.
			 * This is why there is not a <CODE>set</CODE> method for the case property.
			 * 
			 * <p>
			 * For example, to add a new item, do as follows:
			 * <pre>
			 *    getCase().add(newItem);
			 * </pre>
			 * 
			 * 
			 * <p>
			 * Objects of the following type(s) are allowed in the list
			 * {@link Process.Sequence.Switch.Case }
			 * 
			 * 
			 */
			public List<Process.Sequence.Switch.Case> getCase() {
				if (this._case == null) {
					this._case = new ArrayList<Process.Sequence.Switch.Case>();
				}
				return this._case;
			}

			/**
			 * Gets the value of the name property.
			 * 
			 * @return
			 *     possible object is
			 *     {@link String }
			 *     
			 */
			public String getName() {
				return this.name;
			}

			/**
			 * Sets the value of the name property.
			 * 
			 * @param value
			 *     allowed object is
			 *     {@link String }
			 *     
			 */
			public void setName(String value) {
				this.name = value;
			}


			/**
			 * <p>Java class for anonymous complex type.
			 * 
			 * <p>The following schema fragment specifies the expected content contained within this class.
			 * 
			 * <pre>
			 * &lt;complexType>
			 *   &lt;complexContent>
			 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *       &lt;choice>
			 *         &lt;element ref="{http://schemas.xmlsoap.org/ws/2003/03/business-process/}switch"/>
			 *         &lt;element ref="{http://schemas.xmlsoap.org/ws/2003/03/business-process/}sequence"/>
			 *         &lt;element ref="{http://schemas.xmlsoap.org/ws/2003/03/business-process/}flow"/>
			 *       &lt;/choice>
			 *       &lt;attribute name="name" use="required">
			 *         &lt;simpleType>
			 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *             &lt;pattern value="(Alternative-Solution)[A-Za-z0-9]*"/>
			 *           &lt;/restriction>
			 *         &lt;/simpleType>
			 *       &lt;/attribute>
			 *     &lt;/restriction>
			 *   &lt;/complexContent>
			 * &lt;/complexType>
			 * </pre>
			 * 
			 * 
			 */
			@XmlAccessorType(XmlAccessType.FIELD)
			@XmlType(name = "", propOrder = {
					"_switch",
					"sequence",
					"flow"
			})
			public static class Case {

				@XmlElement(name = "switch")
				protected randy.bpel.types.Switch _switch;
				protected randy.bpel.types.Sequence sequence;
				protected Flow flow;
				@XmlAttribute(required = true)
				protected String name;

				/**
				 * Gets the value of the switch property.
				 * 
				 * @return
				 *     possible object is
				 *     {@link randy.bpel.types.Switch }
				 *     
				 */
				public randy.bpel.types.Switch getSwitch() {
					return this._switch;
				}

				/**
				 * Sets the value of the switch property.
				 * 
				 * @param value
				 *     allowed object is
				 *     {@link randy.bpel.types.Switch }
				 *     
				 */
				public void setSwitch(randy.bpel.types.Switch value) {
					this._switch = value;
				}

				/**
				 * Gets the value of the sequence property.
				 * 
				 * @return
				 *     possible object is
				 *     {@link randy.bpel.types.Sequence }
				 *     
				 */
				public randy.bpel.types.Sequence getSequence() {
					return this.sequence;
				}

				/**
				 * Sets the value of the sequence property.
				 * 
				 * @param value
				 *     allowed object is
				 *     {@link randy.bpel.types.Sequence }
				 *     
				 */
				public void setSequence(randy.bpel.types.Sequence value) {
					this.sequence = value;
				}

				/**
				 * Gets the value of the flow property.
				 * 
				 * @return
				 *     possible object is
				 *     {@link Flow }
				 *     
				 */
				public Flow getFlow() {
					return this.flow;
				}

				/**
				 * Sets the value of the flow property.
				 * 
				 * @param value
				 *     allowed object is
				 *     {@link Flow }
				 *     
				 */
				public void setFlow(Flow value) {
					this.flow = value;
				}

				/**
				 * Gets the value of the name property.
				 * 
				 * @return
				 *     possible object is
				 *     {@link String }
				 *     
				 */
				public String getName() {
					return this.name;
				}

				/**
				 * Sets the value of the name property.
				 * 
				 * @param value
				 *     allowed object is
				 *     {@link String }
				 *     
				 */
				public void setName(String value) {
					this.name = value;
				}

			}

		}

	}

	public static Process fromServiceSequence(List<String> serviceSequence) {
		System.out.println("list size is " + serviceSequence.size());
		Process process = new Process();
		process.setName("WSC08");
		process.setTargetNamespace("http://www.ws-challenge.org/WSC08CompositionSolution/");

		Sequence sequence = new Sequence();
		process.setSequence(sequence);
		sequence.setName("main");

		Receive receive = new Receive();
		sequence.setReceive(receive);
		receive.setName("receiveQuery");
		receive.setPortType("solutionProcess");
		receive.setVariable("query");

		Process.Sequence.Switch switchInst = new Process.Sequence.Switch();
		sequence.setSwitch(switchInst);
		switchInst.setName("SolutionAlternativesA");

		Process.Sequence.Switch.Case caseInst = new Process.Sequence.Switch.Case();
		caseInst.setName("Alternative-SolutionA");
		switchInst.getCase().add(caseInst);
		randy.bpel.types.Sequence tempSequence = new randy.bpel.types.Sequence();
		caseInst.setSequence(tempSequence);

		do {
			String serviceName = serviceSequence.get(0);
			serviceSequence.remove(0);

			Invoke invoke = new Invoke();
			tempSequence.getSwitchOrInvokeOrSequence().add(invoke);
			invoke.setName("serv" + serviceName + "Service");
			invoke.setPortType("serv" + serviceName + "PortType");
			invoke.setOperation("serv" + serviceName + "Operation");

			if (serviceSequence.size() == 0) {
				break;
			}

			randy.bpel.types.Switch tempSwitchInst = new randy.bpel.types.Switch();
			tempSwitchInst.setName("Alternative-ServicesA");
			tempSequence.getSwitchOrInvokeOrSequence().add(tempSwitchInst);
			randy.bpel.types.Case tempCaseInst = new randy.bpel.types.Case();
			tempCaseInst.setName("case");
			tempSwitchInst.getCase().add(tempCaseInst);
			tempSequence = new randy.bpel.types.Sequence();
			tempCaseInst.setSequence(tempSequence);

		} while (!serviceSequence.isEmpty());
		return process;

	}
}
