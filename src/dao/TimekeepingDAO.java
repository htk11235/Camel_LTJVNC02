package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Postion;
import model.Timekeeping;

public class TimekeepingDAO {
    public List<Timekeeping> getAllPostion() throws SQLException {
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
}
