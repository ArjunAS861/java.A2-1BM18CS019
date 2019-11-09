/*program to illustrate Generics*/
class Box<A, B> 
{
   private A t;
   private B s;

   public void add(A t, B s)
   {
      this.t = t;
      this.s = s;
   }

   public A get1() 
   {
      return t;
   } 

   public B get2()
   {
      return s;
   } 
}
class GenericsDem
 {
   public static void main(String[] args)
    {
      Box<Integer,String> box = new Box<Integer,String>();
      box.add(Integer.valueOf(10),"Hello World");
      System.out.println(box.get1());
      System.out.println(box.get2());

      Box<String,String> box1 = new Box<String,String>();
      box1.add("Message","Hello World");
      System.out.println("String value:"+box1.get1());
      System.out.println("String value:"+box1.get2());
   }
}
