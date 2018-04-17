package w18comp1008s2apr17;

import java.util.ArrayList;

/**
 *
 * @author JWright
 */
public class W18COMP1008S2Apr17
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        TuesdayAfternoonSession tas = new TuesdayAfternoonSession();
        WednesdayMorningSession wms = new WednesdayMorningSession();
        
        ArrayList<ExcuseInterface> list = new ArrayList<>();
        list.add(tas);
        list.add(wms);
        
        for (ExcuseInterface excuse: list)
        {
            System.out.println(excuse.getExcuse());
        }
        
    }
    
}
