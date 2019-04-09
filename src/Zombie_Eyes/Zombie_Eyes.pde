void setup(){
  size(500, 500);
  PImage face = loadImage("face.jpeg");
  image(face, 0, 0);
  face.resize(1000, 500);
  
}
void draw() {
    fill(252, mouseX, mouseY);
  ellipse(115, 60, 25, 25);
  ellipse(83, 60, 25, 25);
  fill(#030303);
  ellipse(115, 60, 10, 10);
  ellipse(83, 60, 10, 10);
}