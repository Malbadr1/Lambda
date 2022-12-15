import static java.lang.System.out;

public interface MyLambda {


    void getResult(int n, Main obj);
  


}
interface Call{
     void getNumber(int number);
}

interface Bole{
    boolean callTruOrFalls(double a ,double b);
}


class Main{

    void sayhallo(){
        out.println("hallo");
    }
    public static void main(String[] args) {

 Call lambda= (o)->{
           out.println(o);   };

        lambda.getNumber(9);

        Main obj=new Main();
      MyLambda  lambda1=(i,ob)->{
          obj.sayhallo();
          int r=i*i;
      };

      Bole bo=(a,b)->(b==a);
        out.println( bo.callTruOrFalls(9,9));
    }
}
