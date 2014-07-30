package pl.programmers.jfreechart.ver2;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GradientPaint;
import java.text.NumberFormat;

import javax.swing.*;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.labels.CategoryItemLabelGenerator;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.Align;


public class BarChartDemo extends JFrame{

    private static final long serialVersionUID = 1L;

    public BarChartDemo()
    {
        setSize(1360,922);    //ustawiamy wielkość okienka
        setLayout(null);    //wywalamy layout czyli wszystko ręcznie

        //definiujemy górny panel rozmiar, położenie i kolor wraz z kanałem Alpha
        JPanel upPanel = new JPanel();
        upPanel.setBounds(0, 0, 1342, 100);
        upPanel.setBackground(new Color(0.0f,0.0f,0.0f,0.0f));

        //definiujemy dolny panel rozmiar, położenie i kolor wraz z kanałem Alpha
        JPanel bottomPanel=new JPanel();
        bottomPanel.setBounds(0,822,1342,100);
        bottomPanel.setBackground(new Color(0.0f,0.0f,0.0f,0.0f));

        //wywołujemy metody tworzące wykres
        final CategoryDataset dataset = createDataset();
        final JFreeChart chart = createChart(dataset);
        final ChartPanel chartPanel = new ChartPanel(chart);

        //definiujemy rozmiar ramki panelu wykresu i kolor wraz z kanałem Alpha
        chartPanel.setBounds(0,100,1342,722);
        chartPanel.setBackground(new Color(0.0f,0.0f,0.0f,0.0f));

        //definiujemy rozmiar wykresu wewnątrz ramki wykresu i kolor wraz z kanałem Alpha
        chart.setBackgroundPaint(new Color(0.0f,0.0f,0.0f,0.0f));

        //dodajemy panele do ramki
        add(chartPanel);
        add(upPanel);
        add(bottomPanel);

        //dodajemy obrazek będący tłem całej ramki
        JLabel tlo=new JLabel(new ImageIcon("TloWykresu1.jpg"));
        tlo.setBounds(0, 0, 1342, 877);
        add(tlo);
    }

    //ponniżej metoda tworząca dataset z danymi do wykresu
    private CategoryDataset createDataset() {

        // create the dataset...
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        dataset.addValue(3.35, "", "1601-brzeski");
        dataset.addValue(15.07, "", "1602-głubczycki");
        dataset.addValue(5.90, "", "1603-kędzierzyńsko-kozielski");
        dataset.addValue(2.63, "", "1604-kluczborski");
        dataset.addValue(5.25, "", "1605-krapkowicki");
        dataset.addValue(8.32, "", "1606-namysłowski");
        dataset.addValue(11.15, "", "1607-nyski");
        dataset.addValue(3.39, "", "1608-oleski");
        dataset.addValue(3.97, "", "1609-opolski");
        dataset.addValue(3.20, "", "1610-prudnicki");
        dataset.addValue(2.80, "", "1611-strzelecki");
        dataset.addValue(16.45, "", "1661-Opole");

        return dataset;

    }

    //poniżej metoda tworząca wykres
    private JFreeChart createChart(final CategoryDataset dataset) {

        // tworzymy wykres...
        final JFreeChart chart = ChartFactory.createBarChart(
                "",         // tytuł wykresu
                "",               // tytuł osi X
                "Liczba łóżek",                  // tytuł osi Y
                dataset,                  // dane wykresu
                PlotOrientation.VERTICAL, // orientacja wykresu
                false,                     // czy jest legenda
                true,                     // czy są tooltips?
                false                     // czy jest URLs?
        );

        // teraz upiększamy wykres
        final CategoryPlot plot = chart.getCategoryPlot();
        plot.setBackgroundPaint(Color.lightGray);
        plot.setDomainGridlinePaint(Color.darkGray);
        plot.setRangeGridlinePaint(Color.darkGray);

        // ustawiamy wyświetlanie cyferek na osi X...
        final NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
        //rangeAxis.setUpperMargin(0.05);

        // ramka punktów danych
        final BarRenderer renderer = (BarRenderer) plot.getRenderer();
        renderer.setDrawBarOutline(true);

        // ustawiamy gradientowe wypełnienie słupków danych
        final GradientPaint gp0 = new GradientPaint(
                0.0f, 0.0f, Color.lightGray,
                0.0f, 0.0f, Color.blue
        );

        renderer.setSeriesPaint(0, gp0);

        final CategoryAxis domainAxis = plot.getDomainAxis();
        domainAxis.setCategoryLabelPositions(
                CategoryLabelPositions.createUpRotationLabelPositions(Math.PI / 6.0)
        );

        //ustawiamy font dla etykiet na osi X
        Font font = new Font("Dialog", Font.BOLD, 16);
        domainAxis.setTickLabelFont(font);

        //ustawiamy font dla tytułu osi X
        Font font1 = new Font("Dialog", Font.BOLD, 24);
        domainAxis.setLabelFont(font1);

        //włączamy etykiety z danymi dla słupków
        CategoryItemRenderer itemRenderer = plot.getRenderer();
        CategoryItemLabelGenerator generator = new StandardCategoryItemLabelGenerator("{2}", NumberFormat.getInstance());
        itemRenderer.setItemLabelGenerator(generator);
        itemRenderer.setItemLabelsVisible(true);
        Font font2 = new Font("Dialog", Font.BOLD, 12);
        itemRenderer.setBaseItemLabelFont(font2);

        plot.setBackgroundPaint(null);

        return chart;

    }

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run() {

                BarChartDemo chartFrame = new BarChartDemo();

                ImageIcon icon = new ImageIcon("logov1.png");
                chartFrame.setIconImage(icon.getImage()); //tu ustawiamy mini ikonkę okna

                chartFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

                chartFrame.setVisible(true);
            }

        });
    }

}