package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Postion;
import model.Timekeeping;

public class TimekeepingDAO {
    public List<Timekeeping> getAllTimekeeping() throws SQLException {
        List<Timekeeping> timekeepings = new ArrayList<Timekeeping>();

        Connection connection_16 = JDBCConnection.getJDBCConnection();

        String sql_16= "select * from timekeeping";

        try {
            PreparedStatement preparedStatement = connection_16.prepareStatement(sql_16);

            ResultSet rs_16 = preparedStatement.executeQuery();

            while (rs_16.next()) {
                 Timekeeping timekeeping = new Timekeeping();
                 timekeeping.setTimekeeping_Id(rs_16.getInt("timekeeping_Id"));
                 timekeeping.setEmployee_Id(rs_16.getInt("employee_Id"));
                  timekeeping.setDay_keeping(rs_16.getDate("day_keeping"));
                 timekeeping.setStatus_(rs_16.getString("status_"));
               
                timekeepings.add(timekeeping);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return timekeepings;
    }
     public int addTimekeeping(Timekeeping timekeeping) throws SQLException {

        Connection connection = JDBCConnection.getJDBCConnection();

        String sql_16 = "INSERT INTO timekeeping VALUES(?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql_16);
            preparedStatement.setInt(1, timekeeping.getEmployee_Id());
            preparedStatement.setDate(2, (Date) timekeeping.getDay_keeping());
            preparedStatement.setString(3, timekeeping.getStatus_());
            
            int rs_16 = preparedStatement.executeUpdate();
            System.out.println(rs_16);
            return rs_16;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int updateTimekeeping(Timekeeping timekeeping) throws SQLException {

        Connection connection = JDBCConnection.getJDBCConnection();

        String sql_16 = "UPDATE timekeeping SET status_ = ? where timekeeping_Id = ? ";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql_16);
 
            preparedStatement.setString(1, timekeeping.getStatus_());
            preparedStatement.setInt(2, timekeeping.getTimekeeping_Id());

            int rs_16 = preparedStatement.executeUpdate();
            System.out.println(rs_16);
            return rs_16;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
    public  List<Timekeeping> getTimekeepingByDay(Date day) throws SQLException {
        List<Timekeeping> timekeepings = new ArrayList<Timekeeping>();
        Connection connection = JDBCConnection.getJDBCConnection();

        String sql = "SELECT * FROM  timekeeping WHERE day_keeping = FORMAT( ?,'yyyy-MM-dd')";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setDate(1, day);
            ResultSet rs_16 = preparedStatement.executeQuery();

            while (rs_16.next()) {
                Timekeeping timekeeping = new Timekeeping();
                  timekeeping.setTimekeeping_Id(rs_16.getInt("timekeeping_Id"));
                 timekeeping.setEmployee_Id(rs_16.getInt("employee_Id"));
                  timekeeping.setDay_keeping(rs_16.getDate("day_keeping"));
                 timekeeping.setStatus_(rs_16.getString("status_"));
               
                 timekeepings.add(timekeeping);
                
            }
            return timekeepings;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
    public  Timekeeping getTimekeepingById(int i) throws SQLException {
        
        Connection connection = JDBCConnection.getJDBCConnection();

        String sql = "SELECT * FROM  timekeeping WHERE timekeeping_Id=?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, i);
            ResultSet rs_16 = preparedStatement.executeQuery();

            while (rs_16.next()) {
                Timekeeping timekeeping = new Timekeeping();
                  timekeeping.setTimekeeping_Id(rs_16.getInt("timekeeping_Id"));
                 timekeeping.setEmployee_Id(rs_16.getInt("employee_Id"));
                  timekeeping.setDay_keeping(rs_16.getDate("day_keeping"));
                 timekeeping.setStatus_(rs_16.getString("status_"));
               
                
                return timekeeping;
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
