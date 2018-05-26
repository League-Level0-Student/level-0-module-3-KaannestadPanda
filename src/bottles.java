import javax.swing.JOptionPane;

public class bottles {

	public static void main(String[] args) {
	
	
	bottle();
	
	}
	
	
	
	
	
	
	
	
	public static void bottle() {
	for(int b = 99;b>-1;b=b) {
		String one = " bottles of beer on the wall, ";
		String two = " bottles of beer.  ";
		String twopointfive = "Take one down and pass it around, ";
		String three = " bottles of beer on the wall.";
		
		String oneone = " bottle of beer on the wall, ";
		String twotwo = " bottle of beer.  ";
		String twofive = "Take one down and pass it around, ";
		String threethree = " bottles of beer on the wall.";
		
	
		String threethreethree = " bottle of beer on the wall.";
		if(b>2) {
		JOptionPane.showMessageDialog(null, b +one+b--+two+twopointfive+b+three);
		}
else if(b>1){
			
			JOptionPane.showMessageDialog(null, b +one+b--+two+twopointfive+b+threethreethree);
			
			}
		else if(b>0){
			
			JOptionPane.showMessageDialog(null, b +oneone+b--+twotwo+twofive+"no more"+threethree);
			
			}
		else {
			
		JOptionPane.showMessageDialog(null, "No more"+one+"no more"+two+"Go to the store and buy some more, 99"+three);
		b--;
		}
		
	}
	}
}
