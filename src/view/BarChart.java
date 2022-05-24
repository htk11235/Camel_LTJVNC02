package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Paint;
import javax.swing.JFrame;
import javax.swing.JPanel;
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

/**
 
 */
public class BarChart extends JPanel{
    public BarChart() {
          AddChart();
          setSize(500, 500);
          setBackground(Color.white);
          setVisible(true);
    }
    private void AddChart(){
        this.add(new ChartPanel(createChart(createDataset())));
    }
    private CategoryDataset createDataset() {
        String row = "Row";
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1, row, "A");
        dataset.addValue(2, row, "B");
        dataset.addValue(3, row, "C");
        dataset.addValue(4, row, "D");
        dataset.addValue(5, row, "E");
        dataset.addValue(6, row, "F");
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