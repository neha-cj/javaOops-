import java.util.Scanner;
class garbage
{
public static void main(String args[])
{
Runtime r=Runtime.getRuntime();
long mem1;
Integer someints[]= new Integer[1000];
System.out.println("Total memory: "+r.totalMemory());
mem1=r.freeMemory();
System.out.println("Initial free memory: "+mem1);
r.gc();
mem1=r.freeMemory();
System.out.println("Final free memory after garbage
collection: "+mem1);
}
}
