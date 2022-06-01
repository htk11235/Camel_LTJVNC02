package service;

import dao.TimekeepingDAO;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;
import model.Timekeeping;

public class TimekeepingService {

        TimekeepingDAO td_16 = new TimekeepingDAO();

        public List<Timekeeping> getAllTimekeeping() throws SQLException {
                return td_16.getAllTimekeeping();
        }

        public int addTimekeeping(Timekeeping timekeeping) throws SQLException {
                return td_16.addTimekeeping(timekeeping);
        }

        public int updateTimekeeping(Timekeeping timekeeping) throws SQLException {
                return td_16.updateTimekeeping(timekeeping);
        }

        public List<Timekeeping> getTimekeepingByDay(Date day) throws SQLException {
                return td_16.getTimekeepingByDay(day);
        }

        public Timekeeping getTimekeepingById(int i) throws SQLException {
                return td_16.getTimekeepingById(i);
        }

        public List<Timekeeping> getAllTimekeepingByMT(int m, int y, int id) throws SQLException {
                return td_16.getAllTimekeepingByMT(m, y, id);
        }
}
