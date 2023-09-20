class Mult{
   void mTable(int n){
int res=1;
for(int i=1;i<=10;i++)
       System.out.println(n+"*"+i+"="+(n*i));
try{
  Thread.sleep(2);
}
catch(InterruptedException ie){
     System.out.println(ie);
}
   }
}



class T1 extends Thread{
Mult obj;
T1(Mult obj){
this.obj=obj;
}
public void run(){
   obj.mTable(5);
}}
class T2 extends Thread{
Mult obj;
T2(Mult obj){
this.obj=obj;
}
public void run(){
   obj.mTable(10);
}}
class NonSync
{
public static void main(String args[])
{
 Mult obj=new Mult();
T1 tobj=new T1(obj);
T2 tobj1=new T2(obj);
tobj.start();
tobj1.start();
}
}