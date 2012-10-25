package randy.owl;

import java.io.FileNotFoundException;
import java.util.HashMap;

import javax.xml.bind.JAXBException;

import randy.owl.types.OWLClass;
import randy.owl.types.OWLInst;
import randy.owl.types.RDF;

public class SemanticsPool {

	private HashMap<String, OWLClass> owlClassHashMap = new HashMap<String, OWLClass>();
	private HashMap<String, OWLInst> owlInstHashMap = new HashMap<String, OWLInst>();
	
	
	public HashMap<String, OWLClass> getOwlClassHashMap() {
		return owlClassHashMap;
	}
	public HashMap<String, OWLInst> getOwlInstHashMap() {
		return owlInstHashMap;
	}
	public static SemanticsPool createFromXML(String filePath) throws FileNotFoundException, JAXBException{
		RDF rdf = RDF.parseXML(filePath);
		SemanticsPool sp = new SemanticsPool();
		for (OWLClass cl : rdf.getOwlClassList()){
			sp.owlClassHashMap.put(cl.getID(), cl);
			System.out.println("put " + cl.getID());
		}
		for (OWLInst inst : rdf.getOwlInstList()){
			sp.owlInstHashMap.put(inst.getID(), inst);
			System.out.println("put " + inst.getID());
		}
		return sp;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			SemanticsPool sp = SemanticsPool.createFromXML("Taxonomy.owl");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
