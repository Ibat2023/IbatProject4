package GeometryTest;



import org.testng.Assert;
import org.testng.annotations.Test;


import lib.Geometry;
public class GeometryTest {
	private Geometry geometry = new Geometry();
  @Test
  public void testAreaRect1() {
  float width = 4.0f;
  float height = 5.0f;
  float expectedArea = 20.0f;
  float actualArea = geometry.areaRect(width, height);
  Assert.assertEquals(actualArea, expectedArea, 0.001f);
  }
  
  @Test
  public void testAreaRect2() {
  float width = 1.0f;
  float height = 5.0f;
  float expectedArea = 5.0f;
  float actualArea = geometry.areaRect(width, height);
  Assert.assertEquals(actualArea, expectedArea, 0.001f);
  }
 
  @Test
  public void testAreaRect3() {
  float width = 16.0f;
  float height = 5.0f;
  float expectedArea = 80.0f;
  float actualArea = geometry.areaRect(width, height);
  Assert.assertEquals(actualArea, expectedArea, 0.001f);
  }
  @Test
  public void testAreaRect4() {
  float width = 8.0f;
  float height = 5.0f;
  float expectedArea = 40.0f;
  float actualArea = geometry.areaRect(width, height);
  Assert.assertEquals(actualArea, expectedArea, 0.001f);
  }
}
