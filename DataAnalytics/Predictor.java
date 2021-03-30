import java.util.ArrayList;
import inClass.DataPoint;

public abstract class Predictor {

    public abstract ArrayList<DataPoint> redData(String filename);
    public abstract String test(DataPoint);
    public abstract Double getAccuracy(ArrayList<DataPoint> data);
    public abstract Double getPrecision(ArrayList<DataPoint> data);


}
