







void setup(){
  size(400,400);
  for (int y = 400; y>0; y-=50){
if(y%100 == 0){
fill(255,255,255);
}
else{
fill(255,0,0);
}
ellipse(200,200,y,y);
  }
}