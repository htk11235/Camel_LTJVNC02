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

        Connection connection = JDBCConnection.getJDBCConnection();

        String sql = "select * from timekeeping";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                 Timekeeping timekeeping = new Timekeeping();
                 timekeeping.setTimekeeping_Id(rs.getInt("timekeeping_Id"));
                 timekeeping.setEmployee_Id(rs.getInt("employee_Id"));
                  timekeeping.setDay_keeping(rs.getDate("day_keeping"));
                 timekeeping.setStatus_(rs.getString("status_"));
               
                timekeepings.add(timekeeping);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return timekeepings;
    }
     public int addTimekeeping(Timekeeping timekeeping) throws SQLException {

        Connection connection = JDBCConnection.getJDBCConnection();

        String sql = "INSERT INTO timekeeping VALUES(?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, timekeeping.getEmployee_Id());
            preparedStatement.setDate(2, (Date) timekeeping.getDay_keeping());
            preparedStatement.setString(3, timekeeping.getStatus_());
            
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
            return rs;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int updateTimekeeping(Timekeeping timekeeping) throws SQLException {

        Connection connection = JDBCConnection.getJDBCConnection();

        String sql = "UPDATE timekeeping SET timekeeping_Id = ?, employee_Id =?,  day_keeping=?, status_=?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, timekeeping.getEmployee_Id());
            preparedStatement.setDate(2, (Date) timekeeping.getDay_keeping());
            preparedStatement.setString(3, timekeeping.getStatus_());

            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
            return rs;
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
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                Timekeeping timekeeping = new Timekeeping();
                  timekeeping.setTimekeeping_Id(rs.getInt("timekeeping_Id"));
                 timekeeping.setEmployee_Id(rs.getInt("employee_Id"));
                  timekeeping.setDay_keeping(rs.getDate("day_keeping"));
                 timekeeping.setStatus_(rs.getString("status_"));
               
                 timekeepings.add(timekeeping);
                
            }
            return timekeepings;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
