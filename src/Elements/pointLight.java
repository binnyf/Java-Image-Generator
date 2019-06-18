/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elements;

import java.awt.Color;
import primitives.Point3D;
import primitives.Vector;

/**
 *
 * @author Binyamin
 */
public class pointLight extends Light implements LightSource{ //inherits from abstract class 'Light'
    protected Point3D position;
    protected double Kc,Kl,Kq;
    protected double distance;
    
    //default constructor
    public pointLight(){
        position=new Point3D();
        Kc=0.0;
        Kl=0.0;
        Kq=0.0;
    }
    //end of default constructor
    
    //variable constructor
    public pointLight(Color cl, Point3D p, double a, double b, double c){
        color = cl;
        position=p;
        Kc=a;
        Kl=b;
        Kq=c;
    }
    //end of variable constructor
    
    //getters and setters
    public double getKc(){
        return new Double(Kc);
    }
    public double getKl(){
        return new Double(Kl);
    }
     public double getKq(){
        return new Double(Kq);
    }
     
   public void setKc(double a){
       Kc=a;
   }
   
   public void setKl(double b){
       Kl=b;
   }
      
      public void setKq(double c){
       Kq=c;
   }
      
   public Point3D getPosition(){
       return position;
   }
   
   public void setPosition(Point3D p){
       position=p;
   }
   //end of getters and setters

    @Override
    public Color getIntensity(Point3D point) {
        double distance = position.distance(point);
        int newRed = color.getRed()/((int) (Kc + Kl*distance + Kq*distance*distance));
        int newGreen = color.getGreen()/((int) (Kc + Kl*distance + Kq*distance*distance));
        int newBlue = color.getBlue()/((int) (Kc + Kl*distance + Kq*distance*distance));

        return new Color(newRed, newGreen, newBlue);
    }

	public Vector getL(Point3D point) {
		return new Vector(point.subtract(position)).normal();
	}
}