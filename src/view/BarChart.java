package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Paint;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import model.Department;
import model.Employee;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.labels.ItemLabelAnchor;
import org.jfree.chart.labels.ItemLabelPosition;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.StandardBarPainter;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.TextAnchor;
import service.DepartmentService;
import service.EmployeeService;

public class BarChart extends JPanel{
    private DepartmentService depService = new DepartmentService();
    private EmployeeService empService = new EmployeeService();
     List<Department> listDep = new ArrayList<Department>();
     List<Employee> listEmp = new ArrayList<Employee>();
    
 
    public BarChart() throws SQLException {
          AddChart();
          setSize(500, 500);
          setBackground(Color.white);
          setVisible(true);
       
    }
    private void AddChart() throws SQLException{
        this.add(new ChartPanel(createChart(createDataset())));
    }
    private CategoryDataset createDataset() throws SQLException {
           listDep = depService.getAllDepartment();
           listEmp = empService.getAllEmployee();
           int ds[][] = new int[listDep.size()][2];
           for(int i = 0 ; i< listDep.size(); i++){
               ds[i][0] = listDep.get(i).getDepartment_Id();
               ds[i][1] = 0;
           }
           for(Employee i : listEmp){
               for(int j = 0 ; j< listDep.size(); j++){
                   if(ds[j][0]==i.getDepartment_Id()){
                       ds[j][1]++;
                   }
               }
           }
          
        String row = "Row";
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
         for(int i =0; i< ds.length;i++){
                 dataset.addValue(ds[i][1], row, depService.getDepartmentById(ds[i][0]).getDepartment_Name());
           }
        return dataset;
    }

    private JFreeChart createChart(CategoryDataset dataset) {
        CategoryAxis categoryAxis = new CategoryAxis("Department Chart");
        ValueAxis valueAxis = new NumberAxis("");
        valueAxis.setVisible(false);
        BarRenderer renderer = new BarRenderer() {

            @Override
            public Paint getItemPaint(int row, int column) {
                switch (column) {
                    case 0:
                        return new Color(255, 154, 99);
                    case 1:
                        return new Color(255, 154, 99);
                    case 2:
                        return new Color(255, 154, 99);
                    case 3:
                        return new Color(255, 154, 99);
                    case 4:
                        return new Color(255, 154, 99);
                    case 5:
                        return new Color(255, 154, 99);
                    default:
                        return new Color(255, 154, 99);
                }
            }
        };
        renderer.setDrawBarOutline(false);
        renderer.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator());
        renderer.setBasePositiveItemLabelPosition(new ItemLabelPosition(
            ItemLabelAnchor.OUTSIDE12, TextAnchor.BOTTOM_CENTER));
        renderer.setBaseItemLabelsVisible(Boolean.TRUE);
        renderer.setBarPainter(new StandardBarPainter());
        CategoryPlot plot = new CategoryPlot(dataset, categoryAxis, valueAxis, renderer);
        JFreeChart chart = new JFreeChart("", JFreeChart.DEFAULT_TITLE_FONT, plot, false);
        chart.setBackgroundPaint(Color.white);
        return chart;
    }
    
}