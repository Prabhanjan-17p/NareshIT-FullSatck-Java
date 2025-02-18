public class SyntaxForParameterizedConstructor
{
   private int customerId ;
   private String customerName ;
   
   public SyntaxForParameterizedConstructor(int customerId, String customerName)
   {
      this.customerId = customerId;
      this.customerName = customerName;
   }

   @Override
   public String toString() {
      return "SyntaxForParameterizedConstructor [customerId=" + customerId + ", customerName=" + customerName + "]";
   }


   public static void main(String[] args) {
      SyntaxForParameterizedConstructor sep = new SyntaxForParameterizedConstructor(101, "raj");
      System.out.println(sep);

   }
}
