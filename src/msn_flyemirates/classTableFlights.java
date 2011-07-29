
package msn_flyemirates;

import java.sql.*;
import java.util.*;

public class classTableFlights {

public Connection dbConnection()throws Exception
{
DBConnection bConnection = new DBConnection();
return bConnection.connect();

}
public Vector getAbbr()throws Exception
{
Vector<Vector<String>> AbbrVector = new Vector<Vector<String>>();

Connection conn = dbConnection();
PreparedStatement pre = conn.prepareStatement("select * from Airplane");

ResultSet rs = pre.executeQuery();

while(rs.next())
{
Vector<String> Abbr = new Vector<String>();
Abbr.add(rs.getString(1));
Abbr.add(rs.getString(2));
Abbr.add(rs.getString(3));
Abbr.add(rs.getString(4));
Abbr.add(rs.getString(5));

AbbrVector.add(Abbr);
}

return AbbrVector;
}
}
