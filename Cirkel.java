package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Flaggor extends Application implements EventHandler<ActionEvent> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	Button knapp;
	Button knapp2;
	Button knapp3;
	Button knapp4;
	Button knapp5;
	Stage stage;
	Scene scene;
	BorderPane mainLayout;

	@Override
	public void start(Stage primaryStage) throws Exception {
		stage=primaryStage;
		knapp = new Button("Jamaica");
		knapp.setOnAction(this::handle);
		knapp2 = new Button("Sweden");
		knapp2.setOnAction(this::handle);
		knapp3 = new Button("France");
		knapp3.setOnAction(this::handle);
		knapp4 = new Button("Trinidad");
		knapp4.setOnAction(this::handle);
		knapp5 = new Button("Thailand");
		knapp5.setOnAction(this::handle);

		mainLayout = new BorderPane();

		HBox box = new HBox(knapp,knapp2,knapp3,knapp4,knapp5);

		mainLayout.setTop(box);
		//Creating a scene object
		scene = new Scene(mainLayout, 800, 400);
		//Setting title to the Stage
		stage.setTitle("Flag Viewer");

		stage.setScene(scene);

		stage.show();
	}

	@Override
	public void handle(ActionEvent event) {
		if(event.getSource().equals(knapp))
		{
			mainLayout.setCenter(drawJamaicanFlag());
		}
		if(event.getSource().equals(knapp2))
		{
			mainLayout.setCenter(drawSwedishFlag());
		}
		if(event.getSource().equals(knapp3))
		{
			mainLayout.setCenter(drawTheFranceFlag());
		}
		if(event.getSource().equals(knapp4))
		{
			mainLayout.setCenter(drawTheTrinidadFlag());
		}
		if(event.getSource().equals(knapp5))
		{
			mainLayout.setCenter(drawTheThailandFlag());
		}
	}
	private Group drawTheThailandFlag(){
		//Drawing the first red rectangle
		Rectangle r = new Rectangle();

		r.setFill(Color.CRIMSON);
		r.setWidth(450);
		r.setHeight(50);
		r.setX(100);
		r.setY(50);

		//Drawing the first white rectangle
		Rectangle w = new Rectangle();

		w.setFill(Color.WHITE);
		w.setWidth(450);
		w.setHeight(50);
		w.setX(100);
		w.setY(100);

		//Drawing the rectangle
		Rectangle b = new Rectangle();

		b.setFill(Color.DARKBLUE);
		b.setWidth(450);
		b.setHeight(100);
		b.setX(100);
		b.setY(150);

		//Drawing the rectangle
		Rectangle w2 = new Rectangle();

		w2.setFill(Color.WHITE);
		w2.setWidth(450);
		w2.setHeight(50);
		w2.setX(100);
		w2.setY(250);

		//Drawing the first red rectangle
		Rectangle r2 = new Rectangle();

		r2.setFill(Color.CRIMSON);
		r2.setWidth(450);
		r2.setHeight(50);
		r2.setX(100);
		r2.setY(300);

		//Creating/returning a Group object
		return new Group(r,w,b,w2,r2);
	}
	private Group drawTheTrinidadFlag() {
		//Drawing the rectangle
		Rectangle r = new Rectangle();

		r.setFill(Color.RED);
		r.setWidth(500);
		r.setHeight(300);
		r.setX(100);
		r.setY(50);

		//Drawing the white diagonal band
		Polygon w1 = new Polygon();

		w1.setFill(Color.WHITE);
		w1.getPoints().addAll(new Double[]{
				100.0, 50.0,
				120.0, 50.0,
				520.0, 350.0,
				500.0, 350.0,});

		//Drawing the black diagonal band
		Polygon b = new Polygon();

		b.setFill(Color.BLACK);
		b.getPoints().addAll(new Double[]{
				120.0, 50.0,
				180.0, 50.0,
				580.0, 350.0,
				520.0, 350.0,});

		//Drawing the second white diagonal band
		Polygon w2 = new Polygon();

		w2.setFill(Color.WHITE);
		w2.getPoints().addAll(new Double[]{
				180.0, 50.0,
				200.0, 50.0,
				600.0, 350.0,
				580.0, 350.0,});

		//Creating/returning a Group object
		return new Group(r,w1,b,w2);
	}
	private Group drawTheFranceFlag(){
		//Drawing the rectangle
		Rectangle b = new Rectangle();

		b.setFill(Color.BLUE);
		b.setWidth(100);
		b.setHeight(200);
		b.setX(100);
		b.setY(50);

		//Drawing the rectangle
		Rectangle w = new Rectangle();

		w.setFill(Color.WHITE);
		w.setWidth(100);
		w.setHeight(200);
		w.setX(200);
		w.setY(50);

		//Drawing the rectangle
		Rectangle r = new Rectangle();

		r.setFill(Color.RED);
		r.setWidth(100);
		r.setHeight(200);
		r.setX(300);
		r.setY(50);

		//Creating/returning a Group object
		return new Group(b,w,r);
	}
	private Group drawSwedishFlag() {
		//Drawing the rectangle
		Rectangle r = new Rectangle();

		r.setFill(Color.BLUE);
		r.setWidth(400);
		r.setHeight(250);
		r.setX(100);
		r.setY(50);

		//Drawing the vertical rectangle

		Polygon v = new Polygon();

		v.setFill(Color.YELLOW);
		v.getPoints().addAll(new Double[]{
				225.0, 50.0,
				275.0, 50.0,
				275.0, 300.0,
				225.0, 300.0,});

		//Drawing the horizontal rectangle

		Polygon h = new Polygon();

		h.setFill(Color.YELLOW);
		h.getPoints().addAll(new Double[]{
				100.0, 150.0,
				100.0, 200.0,
				500.0, 200.0,
				500.0, 150.0,});

		//Creating/returning a Group object
		return new Group(r,v,h);
	}
	private Group drawJamaicanFlag() {
		//Drawing the rectangle
		Rectangle r = new Rectangle();

		r.setFill(Color.YELLOW);
		r.setWidth(400);
		r.setHeight(200);
		r.setX(100);
		r.setY(50);

		//Drawing the top triangle

		Polygon t = new Polygon();

		t.setFill(Color.GREEN);
		t.getPoints().addAll(new Double[]{
				100.0, 50.0,
				300.0, 125.0,
				500.0, 50.0 });

		//Drawing the bottom triangle
		Polygon b = new Polygon();

		b.setFill(Color.GREEN);
		b.getPoints().addAll(new Double[]{
				100.0, 250.0,
				300.0, 170.0,
				500.0, 250.0 });

		//Drawing the left triangle
		Polygon l = new Polygon();

		l.setFill(Color.BLACK);
		l.getPoints().addAll(new Double[]{
				100.0, 80.0,
				270.0, 150.0,
				100.0, 220.0 });

		//Drawing the right triangle
		Polygon ri = new Polygon();

		ri.setFill(Color.BLACK);
		ri.getPoints().addAll(new Double[]{
				500.0, 80.0,
				330.0, 150.0,
				500.0, 220.0 });

		//Creating/returning a Group object
		return new Group(r,b,t,l,ri);
	}
}
