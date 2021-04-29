package projectPart1;


import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;

import projectPart2.Predictor;

import java.awt.*;
import java.io.*;

public class DummyPredictor extends Predictor {


	public ArrayList<DataPoint> readData(String filename){
        ArrayList<DataPoint> data = new ArrayList<DataPoint>(2);

        File file = new File(filename);
		try {
			Scanner br = new Scanner(file);
			while (br.hasNextLine()) {
				
				double f1 = br.nextDouble();
				double f2 = br.nextDouble();
				String label = br.next();
				boolean isTest = br.nextBoolean();
				DataPoint obj = new DataPoint(f1,f2,label,isTest);
				data.add(obj);
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       return data;
        
	}
           

	 public String test(DataPoint data) {
	        return data.getLabel();
	    }
	 
    public double getAccuracy(ArrayList<DataPoint> data){
    	return 1.0;

    }

    public double getPrecision(ArrayList<DataPoint> data){
    	return 2.0;

    }
    
    
    public static void main(String args[]) {
    	
    	JFrame myFrame = new JFrame();
    	myFrame.setTitle("Data Points");
    	myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	Container contentPane = myFrame.getContentPane();
    	
    	DummyPredictor dum = new DummyPredictor();
    	ArrayList<DataPoint> list = dum.readData("Point.txt");
    	DataPoint trainPoint = list.get(0);
    	DataPoint testPoint = list.get(1);
    	System.out.println(dum.test(testPoint));
    	System.out.println(dum.getAccuracy(list));
    	System.out.println(dum.getPrecision(list));
    	
    	
    	JLabel accuracy = new JLabel("Accuracy is" + dum.getAccuracy(list));
    	contentPane.add(accuracy);
    	JLabel precison = new JLabel("Precision is" + dum.getPrecision(list));
    	contentPane.add(precison);
    	
    	myFrame.setVisible(true);
    	myFrame.setLayout(new GridLayout(2,2));
    	myFrame.setSize(200,200);
    	
    	


      
    }


  
}
