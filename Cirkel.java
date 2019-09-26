package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.*;

public class Cirkel extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
	      //Drawing a Rect
	      Rectangle r = new Rectangle();

	      //Setting the properties of the rectangle
	      r.setFill(Color.YELLOW);
	      r.setWidth(400);
	      r.setHeight(200);
	      r.setX(100);
	      r.setY(50);
		//Drawing the bottom triangle
		Polygon b = new Polygon();

		//Setting the properties of the polygon
		b.setFill(Color.GREEN);
		b.getPoints().addAll(new Double[]{
				100.0, 250.0,
				300.0, 170.0,
				500.0, 250.0 });
		//Drawing the top triangle
		Polygon t = new Polygon();

		//Setting the properties of the polygon
		t.setFill(Color.GREEN);
		t.getPoints().addAll(new Double[]{
				100.0, 50.0,
				300.0, 125.0,
				500.0, 50.0 });

		//Drawing the left triangle
		Polygon l = new Polygon();

		//Setting the properties of the polygon
		l.setFill(Color.BLACK);
		l.getPoints().addAll(new Double[]{
				100.0, 70.0,
				250.0, 150.0,
				100.0, 230.0 });

		//Drawing the right triangle
		Polygon ri = new Polygon();

		//Setting the properties of the polygon
		ri.setFill(Color.BLACK);
		ri.getPoints().addAll(new Double[]{
				500.0, 70.0,
				350.0, 150.0,
				500.0, 230.0 });




	      //Creating a Group object  
	      Group root = new Group(r,b,t,l,ri);

	      //Creating a scene object 
	      Scene scene = new Scene(root, 600, 300);
	      //Setting title to the Stage 
	      primaryStage.setTitle("THE JAMAICAN FLAG");
	      
	      primaryStage.setScene(scene);
	      
	      primaryStage.show();
	}

}