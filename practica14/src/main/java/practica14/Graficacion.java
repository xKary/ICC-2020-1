package practica14;

import org.knowm.xchart.XYChart;
import org.knowm.xchart.XYChartBuilder;
import org.knowm.xchart.XYSeries;
import org.knowm.xchart.XYSeries.XYSeriesRenderStyle;
import org.knowm.xchart.style.Styler.LegendPosition;
import org.knowm.xchart.style.Styler.ChartTheme;
import org.knowm.xchart.style.colors.ChartColor;
import org.knowm.xchart.style.colors.XChartSeriesColors;
import org.knowm.xchart.SwingWrapper;
import java.util.List;
import java.util.LinkedList;
/**
 * Clase para mostrar puntos en el plano cartesiano y
 * su egresión lineal simple.
 * @author Prado Oropeza Karina Vianey
*/
public class Graficacion {

    public static void main(String[] args) {
        XYChart chart = new XYChartBuilder()
                            .title("Regresión lineal")
                            .width(800)
                            .height(600)
                            .xAxisTitle("X")
                            .yAxisTitle("Y")
                            .theme(ChartTheme.Matlab)
                            .build();

        chart.getStyler().setPlotBackgroundColor(ChartColor.getAWTColor(ChartColor.GREY));
        chart.getStyler().setChartTitleVisible(true);
        chart.getStyler().setLegendPosition(LegendPosition.InsideSW);
        chart.getStyler().setPlotGridLinesVisible(false);
        chart.getStyler().setMarkerSize(6);

        //Arreglos donde se guardaran las coordenadas x's & y's
        double[] equis;
        double[] yes;

        //Contador
        int i = 0;

        //Intentar obtener las cooordenadas del archivo csv
        try {
          //Obtener las coordenadas del archivo csv
          List<String[]> coordenadas = LectorCSV.leer("src/main/resources/317133231.csv");

          //Inicializar los arreglos
          equis = new double[coordenadas.size()];
          yes = new double[coordenadas.size()];

          for (String[] coordenada: coordenadas){
            equis[i] = Double.valueOf(coordenada[0]);
            yes[i] = Double.valueOf(coordenada[1]);
            i++;
          }

        } catch(Exception e) {
          //En caso de error mostrar la Exception
          System.out.println(e);

          double[] xData= {
            18.9, 19.0, 19.1, 19.200000000000003, 19.3, 19.4, 19.5, 19.6, 19.700000000000003, 19.8,
            19.9, 20.0, 20.1, 20.200000000000003, 20.3, 20.4, 20.5, 20.6, 20.700000000000003, 20.8,
            20.9};
          double[] yData = {
              86.40610837642784, 83.37448897179846, 86.56154350293059, 87.65809329579216,
              86.02472987061864, 86.001793060768, 88.11165222325307, 87.17772191929602,
              86.9516860927733, 86.38851266393492, 87.78827482434914, 88.09415959933646,
              88.52744410606394, 88.70236347227599, 90.8435430169986, 89.64180808163006,
              89.17187870717119, 93.38116658661869, 91.44624618688697, 91.97093296325215,
              92.54215624918812};

          //Asignar los valores de xData y yData a los arreglos que guarda las coordenadas
          equis = new double [xData.length];
          equis = xData;
          yes = new double [xData.length];
          yes = yData;

        }

        //Calcular pendiente
        double sumaXY,sumaX,sumaY, equisCuadrada, multiXY;
        sumaXY = sumaX = sumaY = equisCuadrada = 0;

        //Sumas
        for (int j = 0; j < equis.length; j++ ) {
          sumaXY += equis[j] * yes[j];
          sumaX += equis[j];
          sumaY += yes[j];
          equisCuadrada += equis[j] * equis[j];
        }

        //Multiplicar las sumas por n (equis.length)
        sumaXY = equis.length * sumaXY;
        equisCuadrada = equis.length * equisCuadrada;

        multiXY = sumaX * sumaY;

        //Calcular la pendiente y la ordena al origen
        double m = (sumaXY - multiXY) / (equisCuadrada - Math.pow(sumaX,2)) ;
        double b = (sumaY - (m * sumaX)) / equis.length;

        //Agregar los puntos
        XYSeries sampleSeries = chart.addSeries("Observaciones", equis, yes);
        sampleSeries.setXYSeriesRenderStyle(XYSeriesRenderStyle.Scatter);
        sampleSeries.setMarkerColor(XChartSeriesColors.RED);

        //Calcular las y's para la linea, usando la 1ra y última x (y = mx + b)
        double y1 = (m * equis[0]) + b,
               y2 = (m * equis[equis.length - 1]) + b;

        //Agregar la linea
        XYSeries lineSeries = chart.addSeries(
            "Línea", new double[]{equis[0], equis[equis.length - 1]}, new double[]{y1, y2});
        lineSeries.setXYSeriesRenderStyle(XYSeriesRenderStyle.Line);
        lineSeries.setLineColor(XChartSeriesColors.BLUE);
        lineSeries.setLineWidth(3);

        new SwingWrapper<XYChart>(chart).displayChart();
    }

}
