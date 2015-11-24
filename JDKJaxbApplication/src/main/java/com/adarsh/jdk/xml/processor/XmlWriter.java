package com.adarsh.jdk.xml.processor;

/**
 * @author $CreatedBy Adarsh_K
 * @author $LastChangedBy: Adarsh_K
 * @version $Revision: ${File.version} $, $Date:: 19/8/13 3:02 PM
 * @see
 */

import java.io.File;
import javax.xml.bind.Marshaller;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import com.adarsh.jdk.xml.bean.Customer;

public class XmlWriter {

    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.setId(100);
        customer.setName("adarsh kumar");
        customer.setAge(30);

        try {

            File file = new File("src\\main\\resources\\file.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
            Marshaller marshaller = jaxbContext.createMarshaller();

            // output pretty printed
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            marshaller.marshal(customer, file);
            marshaller.marshal(customer, System.out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }
}
