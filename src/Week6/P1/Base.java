package P1;

public class Base {
	private   void pri( ) { System.out.println("Base.pri()"); }
    		  void pac( ) { System.out.println("Base.pac()"); }
    protected void pro( ) { System.out.println("Base.pro()"); }
    public    void pub( ) { System.out.println("Base.pub()"); }

    public  final void show( ) {
    	pri();  pac();  pro();  pub(); 
    }
}
