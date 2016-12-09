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
          
    	makePieChart("11","111","123","234","345","456",32.5,11.8,22.4,11.2,"̨��","");   
  
    }   
    public static void makePieChart(String name,String date,String a,String b,String c,String d,double pre0,double pre1,double pre2,double pre3,String project,String piename) {   
        System.out.println("��ִ��makepiechart");
    	double[] data = {pre0,pre1, pre2, pre3};   
        String[] keys = {a,b,c,d};   
  
        createValidityComparePimChar(getDataPieSetByUtil(data, keys), piename,   
                name+date+project+"ȱ��ͳ��.png", keys);
    }   
    public static void makePieChartage(String name,String date,String a,String b,String c,String d,String e,String f,double pre0,double pre1,double pre2,double pre3,double pre4,double pre5,String project,String piename) {   
        System.out.println("��ִ��makepiechart");
    	double[] data = {pre0,pre1, pre2, pre3,pre4,pre5};   
        String[] keys = {a,b,c,d,e,f};   
  
        createValidityComparePimChar(getDataPieSetByUtil(data, keys), piename,   
        		name+date+project+"��������ͳ��.png", keys);   
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
  
        // ʹ��˵����ǩ��������,ȥ���������   
        // chart.getRenderingHints().put(RenderingHints.KEY_TEXT_ANTIALIASING,RenderingHints.VALUE_TEXT_ANTIALIAS_OFF);��Ч��   
        chart.setTextAntiAlias(false);   
        // ͼƬ����ɫ   
        chart.setBackgroundPaint(Color.white);   
        // ����ͼ�����������������title   
        Font font = new Font("����", Font.BOLD, 25);   
        TextTitle title = new TextTitle(chartTitle);   
        title.setFont(font);   
        chart.setTitle(title);   
  
        PiePlot3D plot = (PiePlot3D) chart.getPlot();   
        // ͼƬ����ʾ�ٷֱ�:Ĭ�Ϸ�ʽ   
  
        // ָ����ͼ�����ߵ���ɫ   
        // plot.setBaseSectionOutlinePaint(Color.BLACK);   
        // plot.setBaseSectionPaint(Color.BLACK);   
  
        // ����������ʱ����Ϣ   
        plot.setNoDataMessage("�޶�Ӧ�����ݣ������²�ѯ��");   
  
        // ����������ʱ����Ϣ��ʾ��ɫ   
        plot.setNoDataMessagePaint(Color.red);   
  
        // ͼƬ����ʾ�ٷֱ�:�Զ��巽ʽ��{0} ��ʾѡ� {1} ��ʾ��ֵ�� {2} ��ʾ��ռ���� ,С�������λ   
        plot.setLabelGenerator(new StandardPieSectionLabelGenerator(   
                "{0}={1}({2})", NumberFormat.getNumberInstance(),   
                new DecimalFormat("0.00%")));   
        // ͼ����ʾ�ٷֱ�:�Զ��巽ʽ�� {0} ��ʾѡ� {1} ��ʾ��ֵ�� {2} ��ʾ��ռ����   
        plot.setLegendLabelGenerator(new StandardPieSectionLabelGenerator(   
                "{0}={1}({2})"));   
  
        plot.setLabelFont(new Font("SansSerif", Font.TRUETYPE_FONT, 12));   
  
        // ָ��ͼƬ��͸����(0.0-1.0)   
        plot.setForegroundAlpha(0.65f);   
        // ָ����ʾ�ı�ͼ��Բ��(false)����Բ��(true)   
        plot.setCircular(false, true);   
  
        // ���õ�һ�� ����section �Ŀ�ʼλ�ã�Ĭ����12���ӷ���   
        plot.setStartAngle(90);   
  
        // // ���÷ֱ���ɫ   
        plot.setSectionPaint(pieKeys[0], new Color(244, 194, 144));   
        plot.setSectionPaint(pieKeys[1], new Color(144, 233, 144));   
  
        FileOutputStream fos_jpg = null;   
        try {   
            // �ļ��в������򴴽�   
            isChartPathExist(CHART_PATH);   
            String chartName = CHART_PATH + charName;   
            System.out.println("�ϴ�ͼƬ·��"+chartName);
            fos_jpg = new FileOutputStream(chartName);   
            // �߿������Ӱ����Բ��ͼ����״   
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