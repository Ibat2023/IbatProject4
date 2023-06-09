package GeometryTest;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;

import lib.Geometry;
public class GeometryTest {
	private Geometry geometry = new Geometry();
	private float epsilon = 0.1f;
	//Test cases for Area Rectangle
	
	//Test Case 1
  @Test
  public void testAreaRect1() {
  float width = 4.0f;
  float height = 5.0f;
  float expectedArea = 20.0f;
  float actualArea = geometry.areaRect(width, height);
  Assert.assertEquals(actualArea, expectedArea, epsilon);
  }
  	//Test Case 2
  @Test
  public void testAreaRect2() {
  float width = 1.0f;
  float height = 5.0f;
  float expectedArea = 5.0f;
  float actualArea = geometry.areaRect(width, height);
  Assert.assertEquals(actualArea, expectedArea, epsilon);
  }
  	//Test case 3
  @Test
  public void testAreaRect3() {
  float width = 16.0f;
  float height = 5.0f;
  float expectedArea = 80.0f;
  float actualArea = geometry.areaRect(width, height);
  Assert.assertEquals(actualArea, expectedArea, epsilon);
  }
  	//Test Case 4
  @Test
  public void testAreaRect4() {
  float width = 8.0f;
  float height = 5.0f;
  float expectedArea = 40.0f;
  float actualArea = geometry.areaRect(width, height);
  Assert.assertEquals(actualArea, expectedArea, epsilon);
  }
  
  	//Test cases for Perimetar Rectangle
  
  	//Test case 1
  @Test
  public void testPerimeterRect1() {
      float width = 10.0f;
      float height = 10.0f;
      float expectedPerimeter = 40.0f;
      float actualPerimeter = Geometry.perimetarRect(width, height);
      Assert.assertEquals(actualPerimeter, expectedPerimeter, epsilon);
}
  
  	//Test case 2
  @Test
  public void testPerimeterRect2() {
      float width = 4.0f;
      float height = 4.0f;
      float expectedPerimeter = 16.0f;
      float actualPerimeter = Geometry.perimetarRect(width, height);
      Assert.assertEquals(actualPerimeter, expectedPerimeter, epsilon);
}
  
  	//Test Case 3 
  @Test
  public void testPerimeterRect3() {
      float width = 2.0f;
      float height = 2.0f;
      float expectedPerimeter = 8.0f;
      float actualPerimeter = Geometry.perimetarRect(width, height);
      Assert.assertEquals(actualPerimeter, expectedPerimeter, epsilon);
}
  
  	//Test Case 4
  @Test
  public void testPerimeterRect4() {
      float width = 20.0f;
      float height = 20.0f;
      float expectedPerimeter = 80.0f;
      float actualPerimeter = Geometry.perimetarRect(width, height);
      Assert.assertEquals(actualPerimeter, expectedPerimeter, epsilon);
}
  
  		//Test cases for calculating Volume of the Sphare
  
  //Test case 1
  @Test
  public void testVolumeSphare1() {
	  float radius = 10.0f;
	  float expectedVolume = 4188.7902f;
	  float actualVolume = geometry.volumeSphere(radius);
	  Assert.assertEquals(actualVolume, expectedVolume, epsilon);
  }
  //Test case 2
  @Test
  public void testVolumeSphare2() {
	  float radius = 2.0f;
	  float expectedVolume = 33.51032f;
	  float actualVolume = geometry.volumeSphere(radius);
	  Assert.assertEquals(actualVolume, expectedVolume, epsilon);
  }
  //Test case 3
  @Test
  public void testVolumeSphare3() {
	  float radius = 1.5f;
	  float expectedVolume = 14.13717f;
	  float actualVolume = geometry.volumeSphere(radius);
	  Assert.assertEquals(actualVolume, expectedVolume, epsilon);
  }
  //Test case 4
  @Test
  public void testVolumeSphare4() {
	  float radius = 6.0f;
	  float expectedVolume = 904.77868f;
	  float actualVolume = geometry.volumeSphere(radius);
	  Assert.assertEquals(actualVolume, expectedVolume, epsilon);
  }
  		//Test cases for calculating Surface Area of Sphere
  
  	//Test 1
  
  	public void testSurfaceAreaSphere1() {
  		float radius = 2.0f;
  		float expected = 50.27f;
  		float actual = geometry.surfaceAreaSphere(radius);
  		Assert.assertEquals(actual,  expected, epsilon);
  	}
  	
  //Test2
    
  	public void testSurfaceAreaSphere2() {
  		float radius = 4.0f;
  		float expected = 201.06f;
  		float actual = geometry.surfaceAreaSphere(radius);
  		Assert.assertEquals(actual,  expected, epsilon);
  	}
  	
  //Test 3
    
  	public void testSurfaceAreaSphere3() {
  		float radius = 10.0f;
  		float expected = 1256.64f;
  		float actual = geometry.surfaceAreaSphere(radius);
  		Assert.assertEquals(actual,  expected, epsilon);
  	}
  	
  //Test 4
    
  	public void testSurfaceAreaSphere4() {
  		float radius = 8.0f;
  		float expected = 804.25f;
  		float actual = geometry.surfaceAreaSphere(radius);
  		Assert.assertEquals(actual,  expected, epsilon);
  	}
}
