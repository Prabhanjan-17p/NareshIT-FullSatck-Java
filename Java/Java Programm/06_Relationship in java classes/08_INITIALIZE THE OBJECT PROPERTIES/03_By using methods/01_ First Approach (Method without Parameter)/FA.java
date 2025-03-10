class Test
{
   int x,y;

   public void setData()  
   {                         
      x = 100;  y = 200;
   }
}

public class FA {

   public static void main(String[] args) {
      Test t1 = new Test();  
      t1.setData();  
      // [x = 100   y = 200]
      Test t2 = new Test();  
      t2.setData();  
      // [x = 100   y = 200]
   }
}

 
//Note - Here also, all the objects will be iniatilized with same value.
