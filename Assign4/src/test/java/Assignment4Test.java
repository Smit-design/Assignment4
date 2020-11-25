import org.junit.Test;

import java.util.*;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class Assignment4Test {

    Assignment4 assignment4;


    @Test
    public void TestList(){

        assignment4 = new Assignment4();
        List<Integer> actualList  = assignment4.getTotals();
        List<Integer> expectedList = Arrays.asList(45,38,26);

        Map<String,String> actualMap = assignment4.getLocation();
        Map expectedMap = new HashMap();
        expectedMap.put("Western Cape", "Ceres");
        expectedMap.put("Northern Cape", "Kimberly");
        expectedMap.put("Gauteng", "Johannesburg");

        Set<String> actualSet = assignment4.getSurnames();
        Set<String> expectedSet = new HashSet<String>();
        expectedSet.add("Arend");
        expectedSet.add("Jacobs");
        expectedSet.add("David");
        TreeSet sort = new TreeSet(expectedSet);

        /* @Test
    public void getTotals() {}*/
    //LIST

        assertThat(actualList,is(expectedList));
        assertThat(actualList,hasItems(45));
        assertThat(actualList,hasItems(38));
        assertThat(actualList,hasItems(26));

       /* @Test
        public void getSurnames() {}*/

     //set
        assertThat(actualSet,is(expectedSet));
        assertThat(actualSet,hasItems("Arend"));


       /* @Test
        public void getLocation() { }
        */

       //Map

        assertThat(actualMap,is(expectedMap));
        assertThat(actualMap.size(),is (3));
    }}

