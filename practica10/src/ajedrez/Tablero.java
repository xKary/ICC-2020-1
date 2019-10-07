package ajedrez;

import processing.core.PApplet;

public class Tablero extends PApplet {
  public static void main(String[] args) {
    PApplet.main("ajedrez.Tablero");
  }

  @Override
  public void settings(){
    size(displayHeight - 100 ,displayHeight - 100);
  }
  @Override
  public void setup(){

  }
  @Override
  public void draw(){
    float lado = (displayHeight - 100) / 8;
    for (int i = 0;i < 8; i++) {
      for (int j = 0; j < 8;j++) {
        fill(((j%2 != 0 && i%2 !=0 )||(j%2 == 0 && i%2 ==0 ))? 0xFFFFFF :0x000000);
        rect(j*lado,i*lado,lado,lado);
      }
    }

  }
}
