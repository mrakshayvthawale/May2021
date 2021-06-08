
class Queue
   {
   private int size;
   private int[] Q;
   private int front;
   private int rear;
   private int n;

   public Queue(int s)          
      {
      size = s;
      Q = new int[size];
      front = 0;
      rear = -1;
      n = 0;
      }

   public void insert(int j)   
      {
      if(rear == size-1)         
         rear = -1;
      Q[++rear] = j;         
      n++;                     
      }

   public int remove()        
      {
      int temp = Q[front++]; 
      if(front == size)           
         front = 0;
      n--;                      
      return temp;
      }

   public int peekFront()      
      {
      return Q[front];
      }

   public boolean isEmpty()   
      {
      return (n==0);
      }

   public boolean isFull()    
      {
      return (n==size);
      }

   public int size()           
      {
      return n;
      }

   }  

class Queue1
   {
   public static void main(String[] args)
      {
      Queue q1 = new Queue(5);  

      q1.insert(110);           
      q1.insert(120);
      q1.insert(130);
      q1.insert(140);

      q1.remove();              
      q1.remove();             
      q1.remove();

      q1.insert(150);            
      q1.insert(160);            
      q1.insert(170);
      q1.insert(180);

      while( !q1.isEmpty() )   
         {                           
        int n = q1.remove();  
         System.out.print(n);
         System.out.print(" ");
         }
      System.out.println("");
      }  
   } 