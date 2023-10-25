import javafx.application.Application; 
import javafx.collections.FXCollections;  
import javafx.collections.ObservableList; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.stage.Stage; 
import javafx.scene.chart.PieChart; 
         
public class L1Q4 extends Application {  
   @Override 
   public void start(Stage stage) { 
      //Preparing ObservbleList object         
      ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
         new PieChart.Data("January", 2500), 
         new PieChart.Data("February", 1600), 
         new PieChart.Data("March", 2000), 
         new PieChart.Data("April", 2700),
         new PieChart.Data("May", 3200),
         new PieChart.Data("June", 800)); 
       
      //Creating a Pie chart 
      PieChart pieChart = new PieChart(pieChartData); 
              
      //Setting the title of the Pie chart 
      pieChart.setTitle("Total Sales of Product A in 2016"); 
       
      //setting the direction to arrange the data 
      pieChart.setClockwise(true); 
       
      //Setting the length of the label line 
      pieChart.setLabelLineLength(50); 

      //Setting the labels of the pie chart visible  
      pieChart.setLabelsVisible(true); 
       
      //Setting the start angle of the pie chart  
      pieChart.setStartAngle(180);     
         
      //Creating a Group object  
      Group root = new Group(pieChart); 
         
      //Creating a scene object 
      Scene scene = new Scene(root, 600, 400);  
      
      //Setting title to the Stage 
      stage.setTitle("Pie chart"); 
         
      //Adding scene to the stage 
      stage.setScene(scene); 
         
      //Displaying the contents of the stage 
      stage.show();         
   }     
   public static void main(String args[]){ 
      launch(args); 
   } 
} 
