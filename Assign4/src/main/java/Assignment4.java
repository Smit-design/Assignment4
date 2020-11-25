import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

public class Assignment4 {

    private List<Integer> totals;
    private Map location;
    private Set surnames;
    private TreeSet sort;

    public Assignment4(){
        totals = new ArrayList();
        totals.add(45);
        totals.add(38);
        totals.add(26);
        System.out.print(totals);
        Collections.sort(totals);

        surnames = new HashSet();
        surnames.add("AREND");
        surnames.add("JACOBS");
        surnames.add("KEMAL");
        System.out.print(surnames);
        sort = new TreeSet(surnames);

        location = new HashMap();
        location.put("Western Cape","Ceres");
        location.put("Northern Cape","Kimberly");
        location.put("Gauteng","Johanessburg");
        System.out.print(location);



    }

    public List<Integer> getTotals() {
        return totals;
    }

    public Map <String, String> getLocation() {
        return location;
    }

    public Set<String> getSurnames() {
        return surnames;
    }




    }

