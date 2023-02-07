public class Car implements AutoCloseable {


    @Override
    public void close()  {
        System.out.println("Машина закрывается");

    }
    public static void drive(){
        System.out.println("Машина отправляется в Сочи");
    }

}