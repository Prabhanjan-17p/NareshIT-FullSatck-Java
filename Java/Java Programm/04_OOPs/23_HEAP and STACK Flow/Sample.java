public class Sample
{	
	private Integer i1 = 900;

	public static void main(String[] args) 
	{
		Sample s1 = new Sample();    
		                              
		Sample s2 = new Sample();       

	    Sample s3 = modify(s2); 

		s1 = null;

         //GC [4 objects, 1000x, 2000x, 5000x and 6000x are eligible]
		 
		System.out.println(s2.i1);	
		System.out.println(s3);	
		System.out.println(s1);	
	}
    public static Sample modify(Sample s)
	{
		s.i1=9;
		s = new Sample();
		s.i1= 20;  
        System.out.println(s.i1);
		s=null;
		return s;
	}
}
