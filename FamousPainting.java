public class FamousPainting extends Paintings{
  int value;

  public FamousPainting(String artist, String title){
    if(artist.equals("Degas") || artist.equals("Monet") || artist.equals("Picasso") || artist.equals("Rembrandt")){
      value = 25000;
    }
    else{
      value = 400;
    }
  }
}
