package UnitTests;

import geometries.*;
import primitives.*;
import Elements.*;
import Renderer.*;
import static org.junit.Assert.*;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.awt.Color;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.*;
import java.util.Random;


import java.awt.*;

import static org.junit.Assert.*;

public class RenderTest {
//   @Test
  /*  public void spotLightTest2(){

		
		Scene scene = new Scene();
		scene.setScreenDistance(200);
		Material m=new Material();
		m.setShiny(20);
		Sphere sphere = new Sphere( new Point3D(0.0, 0.0, -1000),500,m,new Color(0, 0, 100));
		scene.addGeometry(sphere);		

                Material ml=new Material();
                ml.setShiny(4);
		Triangle triangle = new Triangle(new Point3D(-125, -225, -260), new Point3D(-225, -125, -260),
										 new Point3D(-225, -225, -270),ml,
										 new Color (0, 0, 100));
		scene.addGeometry(triangle);
		
		scene.addLight(new spotLight(new Point3D(-200.0, -200.0, -150.0),new Vector(2.0, 2.0, -3.0), new Color(255, 100, 100),0.1));
	
		ImageWriter imageWriter = new ImageWriter("Spot test 2", 500, 500, 500, 500);
		
		Render render = new Render(scene,imageWriter);
		
		render.RenderImage();
		
	}
	
	
	@Test
	public void spotLightTest(){
		
		Scene scene = new Scene();
		Material m=new Material();
		m.setShiny(20);
                Sphere sphere = new Sphere( new Point3D(0.0, 0.0, -1000),800,m,new Color(0, 0, 100));

		scene.addGeometry(sphere);
		scene.addLight(new spotLight(new Color(255, 100, 100), new Point3D(-200, -200, -100), 
					   new Vector(2, 2, -3), 0, 0.00001, 0.000005));
	
		ImageWriter imageWriter = new ImageWriter("Spot test", 500, 500, 500, 500);
		
		Render render = new Render(scene,imageWriter);
		
		render.RenderImage();
		
	}

*/	 
	@Test
	public void pointLightTest(){
		
		Scene scene = new Scene();
                //scene.setScreenDistance(50); //set the screendistance to 50
		Material m=new Material();
		m.setShiny(20);
                Sphere sphere = new Sphere( new Point3D(0.0, 0.0, -1000),800,m,new Color(0, 0, 100));
		scene.addGeometry(sphere);
		scene.addLight(new pointLight(new Color(255,100,100), new Point3D(-200, -200, -100),0.0, 0.00001, 0.000005));
	
		ImageWriter imageWriter = new ImageWriter("Pointtest", 500, 500, 500, 500);
		
		Render render = new Render(scene,imageWriter);
		
		render.RenderImage();
		
		
	}
	
/*	@Test
	public void spotLightTest3(){
		
		Scene scene = new Scene();
                Material m=new Material();
                m.setShiny(5);
		
		Triangle triangle = new Triangle(new Point3D(  3500,  3500, -2000),
				 						 new Point3D( -3500, -3500, -1000),
				 						 new Point3D(  3500, -3500, -2000),m,
				 						 new Color(0,0,0));

		Triangle triangle2 = new Triangle(new Point3D(  3500,  3500, -2000),
				  						  new Point3D( -3500,  3500, -1000),
				  						  new Point3D( -3500, -3500, -1000),m,
					 						 new Color(0,0,0));
		
		scene.addGeometry(triangle);
		scene.addGeometry(triangle2);
		
		scene.addLight(new spotLight(new Color(255, 100, 100), new Point3D(200, 200, -100), 
					   new Vector(-2, -2, -3), 0, 0.000001, 0.0000005));
	
		
		ImageWriter imageWriter = new ImageWriter("Spot test 3", 500, 500, 500, 500);
		
		Render render = new Render(scene,imageWriter);
		
		render.RenderImage();
		
	}
*/	
	@Test
	public void pointLightTest2(){
		
		Scene scene = new Scene();
		Material m=new Material();
		m.setShiny(20);
                Sphere sphere = new Sphere(new Point3D(0.0, 0.0, -1000),800,m,new Color(0, 0, 100));

                Material mt=new Material();
                m.setShiny(5);
		
		Triangle triangle = new Triangle(new Point3D(  3500,  3500, -2000),
				 						 new Point3D( -3500, -3500, -1000),
				 						 new Point3D(  3500, -3500, -2000),mt,
				 						 new Color(0,0,0));

		Triangle triangle2 = new Triangle(new Point3D(  3500,  3500, -2000),
				  						  new Point3D( -3500,  3500, -1000),
				  						  new Point3D( -3500, -3500, -1000),mt,
					 						 new Color(0,0,0));
		
		scene.addGeometry(triangle);
		scene.addGeometry(triangle2);
		scene.addGeometry(sphere);
		scene.addLight(new pointLight(new Color(255, 100, 100), new Point3D(200, 200, -100),   0, 0.000001, 0.0000005));
	
		
		ImageWriter imageWriter = new ImageWriter("Pointtest 2", 500, 500, 500, 500);
		
		Render render = new Render(scene,imageWriter);
		
		render.RenderImage();
		
	}
	

}