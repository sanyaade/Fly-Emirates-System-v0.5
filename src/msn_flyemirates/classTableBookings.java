package msn_flyemirates;

import java.sql.*;
import java.util.*;

public class classTableBookings {

public Connection dbConnection()throws Exception
{
DBConnection bConnection = new DBConnection();
return bConnection.connect();

}

public Vector getPassenger()throws Exception
{
Vector<Vector<String>> PassengerVector = new Vector<Vector<String>>();

Connection conn = dbConnection();
PreparedStatement pre = conn.prepareStatement("select * from bookings");

ResultSet rs = pre.executeQuery();

while(rs.next())
{
Vector<String> Passenger = new Vector<String>();
Passenger.add(rs.getString(1));
Passenger.add(rs.getString(2));
Passenger.add(rs.getString(3));
Passenger.add(rs.getString(4));
Passenger.add(rs.getString(5));
Passenger.add(rs.getString(6));
Passenger.add(rs.getString(7));
Passenger.add(rs.getString(8));
Passenger.add(rs.getString(9));
Passenger.add(rs.getString(10));
Passenger.add(rs.getString(11));
Passenger.add(rs.getString(12));
Passenger.add(rs.getString(13));
PassengerVector.add(Passenger);
}

return PassengerVector;
}
}
