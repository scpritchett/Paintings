//Susanna Pritchett

import java.util.Scanner;

public class Paintings{
  protected String title;
  protected String artist;
  protected int value;

  public Paintings(){
    title = "";
    artist = "";
    value = 400;
  }

  public Paintings(String title, String artist){
    this.title = title;
    this.artist = artist;
    this.value = 400;
  }

  public void Display(){
    System.out.println("Title: " + title);
    System.out.println("Artist: " + artist);
    System.out.println("Value: $" + this.value);
    System.out.println();
  }

  public static void main(String[] args){

  int value = 0;

  Paintings [] paintings = new Paintings[10];

  Scanner sc = new Scanner(System.in);

  for(int i = 0; i < 10; i++){

    System.out.print("Enter the title of the painting: ");
    String title = sc.nextLine();

    System.out.print("Enter the artist of the painting: ");
    String artist = sc.nextLine();

    if(artist.equals("Degas") || artist.equals("Monet") || artist.equals("Picasso") || artist.equals("Rembrandt")){
      FamousPainting paintfam = new FamousPainting(title,artist);
      paintings[i] = paintfam;
    }
    else{
      Paintings paint = new Paintings(title,artist);
      paintings[i] = paint;
    }
  }

  for(int i = 0; i < 10; i++){
    paintings[i].Display();
  }
  }
}
