package src.trees;


public class SimpleBinaryNode{
	SimpleBinaryNode left;
	SimpleBinaryNode right;
    int value;
    
    public SimpleBinaryNode(int newValue){
    	this.value = newValue;
    }
    
    void print(){
    	System.out.print( value + " ");
    }

	public void printTab(String tabs) {
		System.out.print( tabs  + value + " \n " );
	}
}