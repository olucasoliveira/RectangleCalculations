package entities;

public class retangulo {
	
	public double width;
	public double heigth;
	
	public double area(){
		
		return heigth * width;
	}
	
	public double perimeter() {
		
		 return (heigth * 2) + (width * 2);
	}
	
	public double diagonal() {
		
		double Diagonal;
		Diagonal = Math.sqrt((Math.pow(width, 2)) + (Math.pow(heigth, 2)));
		
		return Diagonal;
	}
public String toString() {
		
		return "Area: " 
				+ String.format("%.2f", area())
				+ " Perimetro: " 
				+ perimeter()
				+ " Diagonal: " 
				+ String.format("%.2f", diagonal());
				
	}

}


