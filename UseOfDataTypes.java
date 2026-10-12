public class UseOfDataTypes
{
    byte $a = 127;
    short $s = 32767;
    int $i = 2147483647;
    long $l = 9223372036854775807L;
    char $c = 'c';
    boolean isRamadan=false;


public void displayInfo() {
    System.out.println("Max value we can set for byte is :"+$a);
    System.out.println("Max value we can set for short is :"+$s);
    System.out.println("Max value we can set for int is :"+$i);
    System.out.println("Max value we can set for long is :"+$l);
    System.out.println("Max value we can set for char is :"+$c);
//use of boolean value
    if(isRamadan)
    {
        System.out.println("it is Ramdan");
    }else{
        System.out.println("not Ramadan");
    }

}


}