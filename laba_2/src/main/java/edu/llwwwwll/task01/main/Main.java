package edu.llwwwwll.task01.main;

import edu.llwwwwll.task01.entity.criteria.SearchCriteria;
import edu.llwwwwll.task01.service.ApplianceService;
import edu.llwwwwll.task01.service.ServiceFactory;


/**
 * The type Main.
 */
public class Main {

	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		System.out.println("Appliance with min price:");
		PrintApplianceInfo.print(service.findApplianceWithMinPrice());

		System.out.println("All teapots:");
		PrintApplianceInfo.print(service.findAll(SearchCriteria.Teapot.class));
	}
}