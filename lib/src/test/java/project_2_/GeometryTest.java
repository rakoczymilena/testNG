package project_2_;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.testng.annotations.Test;

public class GeometryTest {
  
	@Test 
  public void someLibraryMethodTest() {
    throw new RuntimeException("Test not implemented");
  }
  
  @Test 
  void someLibraryMethodReturnsTrue() {
      Geometry classUnderTest = new Geometry();
      assertTrue(classUnderTest.someLibraryMethod(), 
    		  "someLibraryMethod should return 'true'");
  } 
  @Test
  public void validateRectangleArea() {

      float epsilon = 0.1f;
      float height = 12.4f;
      float width = 4.47f;
      Geometry geometry = new Geometry();
      assertEquals(geometry.areaRect(height, width), height * width,epsilon);
 
}
  @Test
  public void validateSphereArea() {
      float epsilon = 0.1f;
      float radius = (float) Math.PI;
      Geometry geometry = new Geometry();
      assertEquals(geometry.surfaceAreaSphere(radius), 4*Math.PI*radius*radius,epsilon);

  }

  @Test
  public void validateSphereVolume() {
      float epsilon = 0.1f;
      float radius = (float) Math.PI;
      Geometry geometry = new Geometry();
      assertEquals(geometry.volumeSphere(radius), 4*Math.PI*radius*radius*radius/3,epsilon);

  }
}
