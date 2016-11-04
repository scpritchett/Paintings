//Susanna Pritchett

public class FamousPainting extends Paintings{
  int value;

  public FamousPainting(){
    value = 0;
  }

  public FamousPainting(String title, String artist){
    this.artist = artist;
    this.title = title;
    this.value = 25000;
  }

  public void Display(){

    System.out.println("Title: " + title);
    System.out.println("Artist: " + artist);
    System.out.println("Value: $" + this.value);
    System.out.println();
  }
}
