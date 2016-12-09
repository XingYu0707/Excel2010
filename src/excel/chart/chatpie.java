package excel.chart;

import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.FileOutputStream;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

public class chatpie {
	//private static final String CHART_PATH = "G:/apache-tomcat-7.0.57/webapps/Quality/upload/";
	private static final String CHART_PATH = "F:/java/j2ee/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Excel2010/upload/";
	
    public static void main(String[] args) {   
          
    	makePieChart("11","111","123","234","345","456",32.5,11.8,22.4,11.2,"台湾","");   
  
    }   
    public static void makePieChart(String name,String date,String a,String b,String c,String d,double pre0,double pre1,double pre2,double pre3,String project,String piename) {   
        System.out.println("已执行makepiechart");
    	double[] data = {pre0,pre1, pre2, pre3};   
        String[] keys = {a,b,c,d};   
  
        createValidityComparePimChar(getDataPieSetByUtil(data, keys), piename,   
                name+date+project+"缺陷统计.png", keys);
    }   
    public static void makePieChartage(String name,String date,String a,String b,String c,String d,String e,String f,double pre0,double pre1,double pre2,double pre3,double pre4,double pre5,String project,String piename) {   
        System.out.println("已执行makepiechart");
    	double[] data = {pre0,pre1, pre2, pre3,pre4,pre5};   
        String[] keys = {a,b,c,d,e,f};   
  
        createValidityComparePimChar(getDataPieSetByUtil(data, keys), piename,   
        		name+date+project+"问题年龄统计.png", keys);   
    }   
    public static PieDataset getDataPieSetByUtil(double[] data,   
            String[] datadescription) {   
  
        if (data != null && datadescription != null) {   
            if (data.length == datadescription.length) {   
                DefaultPieDataset dataset = new DefaultPieDataset();   
                for (int i = 0; i < data.length; i++) {   
                    dataset.setValue(datadescription[i], data[i]);   
                }   
                return dataset;   
            }   
  
        }   
  
        return null;   
    }   
    public static String createValidityComparePimChar(PieDataset dataset,   
            String chartTitle, String charName, String[] pieKeys) {   
        JFreeChart chart = ChartFactory.createPieChart3D(chartTitle, // chart   
                // title   
                dataset,// data   
                true,// include legend   
                true, false);   
  
        // 使下说明标签字体清晰,去锯齿类似于   
        // chart.getRenderingHints().put(RenderingHints.KEY_TEXT_ANTIALIASING,RenderingHints.VALUE_TEXT_ANTIALIAS_OFF);的效果   
        chart.setTextAntiAlias(false);   
        // 图片背景色   
        chart.setBackgroundPaint(Color.white);   
        // 设置图标题的字体重新设置title   
        Font font = new Font("隶书", Font.BOLD, 25);   
        TextTitle title = new TextTitle(chartTitle);   
        title.setFont(font);   
        chart.setTitle(title);   
  
        PiePlot3D plot = (PiePlot3D) chart.getPlot();   
        // 图片中显示百分比:默认方式   
  
        // 指定饼图轮廓线的颜色   
        // plot.setBaseSectionOutlinePaint(Color.BLACK);   
        // plot.setBaseSectionPaint(Color.BLACK);   
  
        // 设置无数据时的信息   
        plot.setNoDataMessage("无对应的数据，请重新查询。");   
  
        // 设置无数据时的信息显示颜色   
        plot.setNoDataMessagePaint(Color.red);   
  
        // 图片中显示百分比:自定义方式，{0} 表示选项， {1} 表示数值， {2} 表示所占比例 ,小数点后两位   
        plot.setLabelGenerator(new StandardPieSectionLabelGenerator(   
                "{0}={1}({2})", NumberFormat.getNumberInstance(),   
                new DecimalFormat("0.00%")));   
        // 图例显示百分比:自定义方式， {0} 表示选项， {1} 表示数值， {2} 表示所占比例   
        plot.setLegendLabelGenerator(new StandardPieSectionLabelGenerator(   
                "{0}={1}({2})"));   
  
        plot.setLabelFont(new Font("SansSerif", Font.TRUETYPE_FONT, 12));   
  
        // 指定图片的透明度(0.0-1.0)   
        plot.setForegroundAlpha(0.65f);   
        // 指定显示的饼图上圆形(false)还椭圆形(true)   
        plot.setCircular(false, true);   
  
        // 设置第一个 饼块section 的开始位置，默认是12点钟方向   
        plot.setStartAngle(90);   
  
        // // 设置分饼颜色   
        plot.setSectionPaint(pieKeys[0], new Color(244, 194, 144));   
        plot.setSectionPaint(pieKeys[1], new Color(144, 233, 144));   
  
        FileOutputStream fos_jpg = null;   
        try {   
            // 文件夹不存在则创建   
            isChartPathExist(CHART_PATH);   
            String chartName = CHART_PATH + charName;   
            System.out.println("上传图片路径"+chartName);
            fos_jpg = new FileOutputStream(chartName);   
            // 高宽的设置影响椭圆饼图的形状   
            ChartUtilities.writeChartAsPNG(fos_jpg, chart, 500, 300);   
  
            return chartName;   
        } catch (Exception e) {   
            e.printStackTrace();   
            return null;   
        } finally {   
            try {   
                fos_jpg.close();   
                System.out.println("create pie-chart.");   
            } catch (Exception e) {   
                e.printStackTrace();   
            }   
        }   
	
}
    
    private static void isChartPathExist(String chartPath) {   
        File file = new File(chartPath);   
        if (!file.exists()) {   
            file.mkdirs();   
        // log.info("CHART_PATH="+CHART_PATH+"create.");   
        }   
    }   
}