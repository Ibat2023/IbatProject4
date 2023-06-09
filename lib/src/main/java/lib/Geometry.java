package lib;

public class Geometry {
	//Calculating the area of the rectangle.
	public float areaRect(float width, float height) {
		float area = width*height;
		return area;
		
	}
	//Calculating the Perimetar of the rectangle
	public static float perimetarRect(float width, float height) {
		float perimetar = 2*(width+height);
		return perimetar;
		
	}
	
	//Calculating the sphare volume
	public float volumeSphere(float radius) {
		float volume = (4.0f / 3.0f) * (float) Math.PI * radius * radius * radius;
		return volume;
	}
	//Calculating the surface area of sphere
	public float surfaceAreaSphere(float radius) {
		float surface = 4.0f * (float) Math.PI * radius * radius;
		return surface;
	}
}
