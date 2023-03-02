public class Photo {
  private String url;
  private String filename;
  private double width, height;

  public Photo(String url, String filename, double width, double height) {
    this.url = url;
    this.filename = filename;
    this.width = width;
    this.height = height;
  }

  public String getUrl() {return this.url;}
  public void setUrl(String url) {this.url = url;}

  public String getFilename() {return this.filename;}
  public void setFilename(String filename) {this.filename = filename;}

  public double getWidth() {return this.width;}
  public void setWidth(double width) {this.width = width;}

  public double getHeight() {return this.height;}
  public void setHeight(double height) {this.height = height;}

}