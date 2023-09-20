//Write a java peogrgam to implement synchronized method for fingding power of given number
class Power{
    synchronized void p(int n){
        int res=1;
        for(int i=1;i<=5;i++){
            res*=n;
            System.out.println(n+"^"+i+"="+res);
        }

    }
}
class T1 extends Thread{
Power obj;
T1(Power obj){
this.obj=obj;
}
public void run(){
   obj.p(5);
}}
class T2 extends Thread{
Power obj;
T2(Power obj){
this.obj=obj;
}
public void run(){
   obj.p(10);
}}
class Powersync
{
public static void main(String args[])
{
 Power obj=new Power();
T1 tobj=new T1(obj);
T2 tobj1=new T2(obj);
tobj.start();
tobj1.start();
}
}