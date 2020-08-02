package coffee;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import java.text.NumberFormat;
import java.text.DecimalFormat;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;


public class Coffee extends Application {
    
    /*Here, I create four labels, one for the coffee shop name and the other
    three to list my choices in three groups. Then i will create seven radio
    buttons to choose the coffe the customer wants to order. and another seven 
    check boxes to add different toppings to the coffee. And seven checkboxes 
    for muffins. And finally two buttons one to calculate the total and the 
    other is to clear check boxes and radio buttons.*/
    Label TitleCoffee = new Label ("Welcome to Alex Brozovic's café");
    Label Coffee = new Label("Coffee");
    Label Additions = new Label ("Additions");
    Label Muffins = new Label ("Muffins");
    
    RadioButton None = new RadioButton("None");         
    RadioButton RegularCoffee = new RadioButton("Regular Coffee");   
    RadioButton DecafCoffee = new RadioButton("Decaf Coffee");
    RadioButton Cappuccino = new RadioButton("Cappuccino");   
    RadioButton Latte = new RadioButton("Latte");
    RadioButton Espresso = new RadioButton("Espresso");   
    RadioButton Vienna = new RadioButton("Vienna");
   
    CheckBox Cream = new CheckBox("Cream");
    CheckBox Sugar = new CheckBox ("Sugar");
    CheckBox Artificialsweetener = new CheckBox("Artificial sweetener"); 
    CheckBox Cinnamon = new CheckBox("Cinnamon");
    CheckBox Caramel = new CheckBox("Caramel");
    CheckBox IceCream = new CheckBox("Ice Cream");
    CheckBox Chocolate = new CheckBox("Chocolate");
    
    CheckBox Blueberry = new CheckBox("Blueberry");
    CheckBox Chocolatechip = new CheckBox("Chocolate chip");
    CheckBox Banananut = new CheckBox("Banana nut");
    CheckBox Bran = new CheckBox("Bran");
    CheckBox Cornbread = new CheckBox("Cornbread");
    CheckBox Honey = new CheckBox("Honey");
    CheckBox Raspberry = new CheckBox("Raspberry");    

    Button Calculate  = new Button("Calculate");
    Button Exit = new Button("Exit");
    
    @Override
    public void start(Stage stage) { 
        
        TitleCoffee.setFont(Font.font("Calibri", FontWeight.BOLD, 27));
        
        Coffee.setFont(Font.font("Constantia", FontWeight.BOLD, 22));
        
        Additions.setFont(Font.font("Constantia", FontWeight.BOLD, 22));
        
        Muffins.setFont(Font.font("Constantia", FontWeight.BOLD, 22));
        
        /*I will toggle the different types of coffees to each other in order to
        choose only one of them.*/
        ToggleGroup  Coffees = new ToggleGroup();
        None.setToggleGroup(Coffees); 
        RegularCoffee.setToggleGroup(Coffees); 
        DecafCoffee.setToggleGroup(Coffees); 
        Cappuccino.setToggleGroup(Coffees);
        Latte.setToggleGroup(Coffees); 
        Espresso.setToggleGroup(Coffees); 
        Vienna.setToggleGroup(Coffees);
        
        //I will organize the nodes on scene in gridpane.
        GridPane GP = new GridPane();
        
        GP.setPadding(new Insets(10, 10, 20, 10));
        GP.setHgap(50);
        GP.setVgap(30);
        
        GP.add(Coffee, 0, 0);
        GP.add(None, 0, 1);
        GP.add(RegularCoffee, 0, 2);
        GP.add(DecafCoffee, 0, 3);
        GP.add(Cappuccino, 0, 4);
        GP.add(Latte, 0, 5);
        GP.add(Espresso, 0, 6);
        GP.add(Vienna, 0, 7);
        
        GP.add(Additions, 1, 0);
        GP.add(Cream, 1, 1);
        GP.add(Sugar, 1, 2);
        GP.add(Artificialsweetener, 1, 3);
        GP.add(Cinnamon, 1, 4);
        GP.add(Caramel, 1, 5);
        GP.add(IceCream, 1, 6);
        GP.add(Chocolate, 1, 7);
        
        GP.add(Muffins, 2, 0);
        GP.add(Blueberry, 2, 1);
        GP.add(Chocolatechip, 2, 2);
        GP.add(Banananut, 2, 3);
        GP.add(Bran, 2, 4);
        GP.add(Cornbread, 2, 5);
        GP.add(Honey, 2, 6);
        GP.add(Raspberry, 2, 7);
        
        GP.setAlignment(Pos.CENTER);
        
        //I will add buttons to each other using Hbox.
        HBox HB = new HBox (30); 
        HB.getChildren().addAll(Calculate, Exit);
        HB.setAlignment(Pos.CENTER);
     
        /*Then i will use VBox to put the title, gridpane and Hbox with
        each other.*/
        VBox VB =new VBox(25);   
        VB.getChildren().addAll(TitleCoffee, GP, HB);
        VB.setAlignment(Pos.CENTER);
        
        Calculate.setOnAction(event->{
            
            /*I will define three variables to calculate the total cost.*/
            double Order = 0;
            double Tax , Total;
            
            /*Here, I will specify a cost for each node chosen in this application
            and i will add them to each other.*/
            if (None.isSelected()){
                Order = 0;
            }
            if (RegularCoffee.isSelected() | DecafCoffee.isSelected() | Cappuccino.isSelected()){
                Order = 3;
            }
            if (Latte.isSelected() | Espresso.isSelected() | Vienna.isSelected()){
                Order = 3;
            }
            
            
            if (Cream.isSelected()){
                Order += 0.25;
            }
            if (Sugar.isSelected()){
                Order += 0.25;
            }
            if (Artificialsweetener.isSelected()){
                Order += 0.25;
            }
            if (Cinnamon.isSelected()){
                Order += 0.25;
            }
            if (Caramel.isSelected()){
                Order += 0.25;
            }
            if (IceCream.isSelected()){
                Order += 0.25;
            }
            if (Chocolate.isSelected()){
                Order += 0.25;
            }
            
            
            if (Blueberry.isSelected()){
                Order += 2.25;
            }
            if (Chocolatechip.isSelected()){
                Order += 2.25;
            }
            if (Banananut.isSelected()){
                Order += 2.25;
            }
            if (Bran.isSelected()){
                Order += 2.25;
            }
            if (Cornbread.isSelected()){
                Order += 2.25;
            }
            if (Honey.isSelected()){
                Order += 2.25;
            }
            if (Raspberry.isSelected()){
                Order += 2.25;
            }
           
         
            /*I will calculate the tax by addinf 7% of the cost of the 
            order to the order.Then i will add the tax to order
            and assign the result in Total.*/
            Tax = (double)(.07 * Order);
            Total= (double)(Order + Tax);
                
            /*I will display the output in an alert message with a format of only
            three decimal numbers.*/
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Message");
            alert.setHeaderText(null);
            NumberFormat formatter = new DecimalFormat("#0.000");
            alert.setContentText("Subtotal: $ "+ Order +" \n"+" Tax:$ "+formatter.format(Tax) +"\n" + " Total : " +formatter.format(Total));
            alert.showAndWait();
        });      
         
        //This button will close the application.
        Exit.setOnAction(event->{
            stage.close();
        });
       
        Scene s = new Scene (VB ,500, 550);  
        stage.setScene(s);

        stage.show();          
        stage.setTitle("Coffee Shop Order Calculator"); 
    }
    
    public static void main(String[] args) { 
        Application.launch();
    }
}
