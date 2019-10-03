package ajedrez;

import processing.core.PApplet;

public class Tablero extends PApplet {
  public static void main(String[] args) {
    PApplet.main("ajedrez.Tablero");
  }

  @Override
  public void settings(){
    size(displayHeight - 200 ,displayHeight - 200);
    //fullScreen();
  }
  @Override
  public void setup(){

  }
  @Override
  public void draw(){
    float alto = (displayHeight - 200) / 8;
    float ancho = alto;//(displayWidth - 200) / 8;
    for (int i = 0;i < 8; i++) {
      for (int j = 0; j < 8;j++) {
        fill(((j%2 != 0 && i%2 !=0 )||(j%2 == 0 && i%2 ==0 ))? 0xFFFFFF :0x000000);
        rect(j*ancho,i*alto,ancho,alto);
      }
    }

  }
}
