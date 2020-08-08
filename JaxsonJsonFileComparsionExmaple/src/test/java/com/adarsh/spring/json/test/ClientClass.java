package com.adarsh.spring.json.test;

import com.adarsh.spring.json.JsonFileComparator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

/**
 * @author Adarsh
 * @author $LastChangedBy: adarsh $
 * @version $Revision: 1595 $, $Date:: 5/4/12 6:12 PM#$
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/spring/spring-cfg.xml"})
public class ClientClass {

    @Autowired(required = true)
    private JsonFileComparator jsonFileComparator;

   final String jsonString="{\n" +
           "    \"empid\": \"101\",\n" +
           "    \"empName\": \"Adarsh kumar\",\n" +
           "    \"empDept\": {\n" +
           "        \"deptId\": \"IT\",\n" +
           "        \"deptLoc\": \"INDIA\"\n" +
           "    },\n" +
           "    \"empPhone\": \"8197416336\",\n" +
           "    \"empEmail\": \"adarshkumarsingh83@gmail.com\"\n" +
           "}";

	@Test
    public void testFileCompassionForEmployee1()throws Exception{
        Assert.isTrue(this.jsonFileComparator.compareJson(jsonString,"json/employee1.json"),"JSON FILE AND JSON PASSED DOESN'T MATCH");
    }

    @Test
    public void testFileCompassionForEmployee2()throws Exception{
        Assert.isTrue(this.jsonFileComparator.compareJson(jsonString,"json/employee2.json"),"JSON FILE AND JSON PASSED DOESN'T MATCH");
    }
}
