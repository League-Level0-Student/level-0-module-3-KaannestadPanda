void setup(){
  size(2000,1000);
}





int one=500;
int two=1500;

int onespeed=3;
int twospeed=-3;

void draw(){
noFill();
background(0,255,0);



  
  
int z=10;
for (int y = 0; y<40; y++){


  ellipse(one,500,z,z);
  z+=10;
  }
  
  int k=10;
  for (int y = 0; y<40; y++){
 
    ellipse(two,500,k,k);
  
  k+=10;
  }
  if(one>2000){
    onespeed=-onespeed;
  }
  if(one<0){
    onespeed=-onespeed;
  }
 
  
  
   if(two>2000){
    twospeed=-twospeed;
  }
  if(two<0){
    twospeed=-twospeed;
  }
  two+=twospeed;
 one+=onespeed;








}