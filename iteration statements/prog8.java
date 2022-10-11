class prog8
{
public static void main(String[] args)
{
for(int x=1;x<=9;x++)
{
for(int i=1;i<=x;i++)
{
System.out.print(x);
}
if(x!=9)
System.out.print(",");
else
System.out.println(".");
}
}
}