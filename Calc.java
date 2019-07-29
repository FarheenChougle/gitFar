class Calc
{
    
    public static void main(String[] args) {
      System.out.println(add(23,32));
      System.out.println(sub(45,12));
      System.out.println(multiply(3,2));
      System.out.println(div());  
    }
    int add(int x, int y)
    {
        return x + y;
    }
    int sub(int x, int y)
    {
        return x - y;
    }
    int multiply(int x, int y)
    {
        return x * y;
    }
    int div(int x, int y)
    {
        return x/y;
    }
}