public class sortarray
{
  public static void main(String arg[])
{
  int j[]= {1,1,1,1,0,0,1,0};   
  for(int x=0;x<=j.length-1;x++){
  for(int y=0;y<=j.length-2;y++){
         if(j[y]>j[y+1])
	{  
    	int temp=0;    
    	temp=j[y];     
	j[y]=j[y+1];   
	j[y+1]=temp;    
	}            
}   
}
for(int x=0;x<=j.length-1;x++){
System.out.print(j[x]+" ");     
}   
}
}