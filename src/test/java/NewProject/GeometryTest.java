package NewProject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GeometryTest {

  @Test
  public void areaRect() {

      float epsilon = 0.1f;
      float height = 12.4f;
      float width = 4.47f;
      Geometry geometry = new Geometry();
      Assert.assertEquals(geometry.areaRect(height, width), height * width,epsilon);


  }

  @Test
  public void perimeterRect() {
      float epsilon = 0.1f;
      float height = 12.4f;
      float width = 4.47f;
      Geometry geometry = new Geometry();
      Assert.assertEquals(geometry.perimeterRect(height, width), 2 * (height + width),epsilon);
  }
  @Test
  public void volumeSphere() {
      float epsilon = 0.1f;
      float radius = (float) Math.PI;
      Geometry geometry = new Geometry();
      Assert.assertEquals(geometry.volumeSphere(radius), 4*Math.PI*radius*radius*radius/3,epsilon);
  }

  @Test
  public void surfaceAreaSphere() {
      float epsilon = 0.1f;
      float radius = (float) Math.PI;
      Geometry geometry = new Geometry();
      Assert.assertEquals(geometry.surfaceAreaSphere(radius), 4*Math.PI*radius*radius,epsilon);
  }
 
}
  


