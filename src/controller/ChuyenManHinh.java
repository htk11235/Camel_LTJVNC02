package controller;
import java.util.List;
import bean.DanhMucBean;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import view.EmployeeJPanel;
import view.PostionJPanel;
import view.SalaryJPanel;
import view.TimekeepingJPanel;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.border.MatteBorder;
import view.BarChart;
import view.DepartmentJPanel;
import view.DepartmentListJPanel;
/**
 *
 * @author Jonny Dam
 */             
        public class ChuyenManHinh {
            private JPanel jpbView;
            private String kindSelected = " ";
            List<DanhMucBean> listDanhMuc = null;
                
            public ChuyenManHinh (JPanel jpbView){
                this.jpbView = jpbView;
            }
                    
            public void setDashboard(JPanel jpnItem, JLabel jlbItem) throws SQLException {
               kindSelected = "Department";

               jlbItem.setForeground(new Color(255, 154, 99));
               JPanel node = new DepartmentJPanel();
               
               jpbView.removeAll();
               jpbView.setLayout(new BorderLayout());
               jpbView.add(node);
               jpbView.validate();
               jpbView.repaint();
            }
              public void setDashboardOfDepartment(JPanel jpnItem, JLabel jlbItem) throws SQLException {
               kindSelected = "DepartmentList";

               jlbItem.setForeground(new Color(255, 154, 99));
               JPanel node = new DepartmentListJPanel();
               
               jpbView.removeAll();
               jpbView.setLayout(new BorderLayout());
               jpbView.add(node);
//               jpbView.validate();
//               jpbView.repaint();
            }
            public void setEvent(List<DanhMucBean> listDanhMuc){
                this.listDanhMuc = listDanhMuc;
                 for(DanhMucBean item : listDanhMuc){
                        item.getJpn().addMouseListener(new LabelEvent(item.getKind(), item.getJpn(), item.getJlb()));
                 }         
            }
        class LabelEvent implements MouseListener {

                private JPanel panel;
                private String kind;

                private JPanel jpnItem;
                private JLabel jlbItem;

                public LabelEvent(String kind, JPanel jpnItem, JLabel jlbItem) {
                     this.kind = kind;
                     this.jpnItem = jpnItem;
                     this.jlbItem = jlbItem;
                }

                @Override
                public void mouseClicked(MouseEvent e) {
                      switch (kind) {
                          case "Department":
                          {
                          try {
                              panel = new DepartmentJPanel();
                          } catch (SQLException ex) {
                              Logger.getLogger(ChuyenManHinh.class.getName()).log(Level.SEVERE, null, ex);
                          }
                          }
                              break;


                          case "Employee":
                              panel = new EmployeeJPanel();
                              break;
                          case "Timekeeping":
                              panel = new TimekeepingJPanel();
                              break;
                          case "Postion":
                          {
                              try {
                                  panel = new PostionJPanel();
                              } catch (SQLException ex) {
                                  Logger.getLogger(ChuyenManHinh.class.getName()).log(Level.SEVERE, null, ex);
                              }
                          }
                              break;

                          case "Salary":
                              panel = new SalaryJPanel();
                              break;
                              
                              
                          case "DepartmentList":
                          {
                              try {
                                  panel = new DepartmentListJPanel();
                              } catch (SQLException ex) {
                                  Logger.getLogger(ChuyenManHinh.class.getName()).log(Level.SEVERE, null, ex);
                              }
                          }
                          break;
                          
                          case "DepartmentChart":
                          {
                          try {
                              panel = new BarChart();
                          } catch (SQLException ex) {
                              Logger.getLogger(ChuyenManHinh.class.getName()).log(Level.SEVERE, null, ex);
                          }
                          }
                              break;


                          // more
                          default:
                              break;
                     }
                     jpbView.removeAll();
                     jpbView.setLayout(new BorderLayout());
                     jpbView.add(panel);
                     jpbView.validate();
                     jpbView.repaint();
                     setChangeBackground(kind);
                }

                @Override
                public void mousePressed(MouseEvent e) {
                     kindSelected = kind;
//                     jpnItem.setBackground(new Color(0, 118, 104));
                     jlbItem.setForeground(new Color(255, 154, 99));
                                         jpnItem.setBorder(new MatteBorder(0, 0, 1, 0, Color.black));
                }

                @Override
                public void mouseReleased(MouseEvent e) {
//                             jpnItem.setBorder(null);
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    jpnItem.setBorder(new MatteBorder(0, 0, 1, 0, Color.black));
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    if (!kindSelected.equalsIgnoreCase(kind)) {
                          jpnItem.setBorder(null);
                    }
                }
                
          }
        private void setChangeBackground(String kind){
            for(DanhMucBean item : listDanhMuc){
                if(item.getKind().equalsIgnoreCase(kind)){
                    item.getJlb ().setForeground(new Color(255, 154, 99));
                    item.getJpn().setBorder(new MatteBorder(0, 0, 1, 0, Color.black));
                }else{
                    item.getJlb ().setForeground(new Color(119, 119, 119));
                    item.getJpn().setBorder(null);
                }
            }
        }
}
