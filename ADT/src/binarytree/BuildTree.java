package binarytree;

public class BuildTree
{
   public Element root;
   public 	Element aknoten=root;

   public BuildTree()
   {
      root = new Element(100);
      root.left = new Element(50);
      root.right = new Element(150);   
   }
   
   
   
   public void insert(int value) {
	   

	   if(aknoten.value > value) {
		   if(root.left ==null) {
			   root.left= new Element(value);
		   }else {
			   aknoten=root.left;
			   insert(value);
		   }
		   
	   }else {
		   if(root.right ==null) {
			   root.right= new Element(value);
		   }else {
			   aknoten=root.right;
			   insert(value);
		   }
	   }
   }
}
