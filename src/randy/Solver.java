package randy;

import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import javax.xml.bind.JAXBException;

import randy.owl.SemanticsPool;
import randy.wsdl.ServicePool;

public class Solver {

	private final ServicePool servicePool;
	/**
	 * current output instance list
	 */
	private final HashSet<String> outputSet = new HashSet<String>();
	private final SemanticsPool semanticsPool;

	/**
	 * check the output Set to see if we have got the output yet
	 * 
	 * @param output
	 * @return
	 */
	private boolean checkOutputSet(String output) {
		for (String o : this.outputSet) {
			if (this.semanticsPool.isChild(o, output)) {
				System.out.println(o + " --- " + output);
				return true;
			}
		}
		return false;
	}
	public void solve(String input, String output, String outputFile){
		//TODO:
		this.outputSet.add(input);
		List<String> serviceSequence = new LinkedList<String>();
		do{
			String serviceID = this.servicePool
					.findPossibleService(this.outputSet);
			if (serviceID == null) {
				System.err.println("No service is usable now");
				return;
			}
			System.out.println("choose service " + serviceID);
			serviceSequence.add(serviceID);
		} while (!this.checkOutputSet(output));
	}

	/**
	 * using service file and owl file to create semantics pool and service pool
	 * 
	 * @param serviceFilePath
	 * @param owlFilePath
	 * @throws JAXBException
	 * @throws FileNotFoundException
	 */
	public Solver(String serviceFilePath, String owlFilePath)
			throws FileNotFoundException, JAXBException {
		this.semanticsPool = SemanticsPool.createFromXML(owlFilePath);
		this.servicePool = ServicePool.parseXML(this.semanticsPool,
				serviceFilePath);
	}

	/**
	 * @param args
	 * @throws JAXBException
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException,
	JAXBException {
		// TODO Auto-generated method stub
		Solver solver = new Solver("Services.wsdl", "Taxonomy.owl");
		solver.solve("inst2139388127", "inst162515103", null);
	}

}
