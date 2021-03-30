import java.util.ArrayList;
import inClass.DataPoint;
import java.io.*;

public class DummyPredictor extends Predictor {

    public ArrayList<DataPoint> readData(String filename){
        File file = new File(filename);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        while ((st = br.readLine()) != null)
            System.out.println(st);

        Double greenAvg = 0.0;
        Double blueAvg = 0.0;
        int g = 0;
        int b = 0;
        for (int i = 0; i < data.length; i++ ) {
            DataPoint d = data[i];
            Double f1 = d.getF1();
            Double f2 = d.getF2();
            String label = d.getLabel();
            if (label == "Good true") {
                greenAvg += greenAvg;
                g++;
            }
            if (label == "Bad false") {
                blueAvg += blueAvg;
                b++;
            }
            this.greenAvg = greenAvg/g;
            this.blueAvg = blueAvg/b;
        }

    public String test(DataPoint){
        double d = Math.abs(data.getF1() - this.greenAvg);
        double d1 = Math.abs(data.getF1() - this.blueAvg);

        if (d > d1) {
            return "Green";
        }
        else {
            return "Blue";
        }

    }
    public Double getAccuracy(ArrayList<DataPoint> data){

    }

    public Double getPrecision(ArrayList<DataPoint> data){

    }


    public static void main(String[] args) {
            Predictor predictor = new Predictor();
            DataPoint [] data = new DataPoint[2];
            data [0] = new DataPoint(1.0, 1.0, "Good true");
            data [1] = new DataPoint(2.0, 2.0, "Bad false");
            DataPoint testData = new DataPoint(9.0);

            predictor.readData(data);
            System.out.println(predictor.test(testData));


        }

}
