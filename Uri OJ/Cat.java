public class Cat{ 
      public String color = "White"; 
      public String action = "sitting"; 
       public Cat()
      {
      }
       
     public Cat(String s1)
      {
            color = s1;
      }
       public Cat(String s2,String a)
      {
            color = s2;
            action=a;
      }
      public void printCat()
      {
            System.out.println(color+"  cat is "+action);
      }
      public void changeColor(String s3)
      {
            color = s3;
      }
}

