
/**
 * @author 
 * @version 
 */
public class Patient
{
    private String zName;
    private String zVorname;
    private String zkk;
    public Patient(String pVorname, String pName, String pkk)
    {
        zName = pName;
        zVorname = pVorname;
        zkk = pkk;
    }
    public String gibName()
    {
        return zName;
    }
    public String gibVorname()
    {
        return zVorname;
    }
    public String gibkk()
    {
        return zkk;
    }
}
