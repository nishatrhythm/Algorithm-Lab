
package Core;

public class Edge {
         public   String stNode;
         public   String endNode;
         public   int edWeight;
         
         public Edge(String st, String end , int w)
         {
             stNode=st;
             endNode=end;
             edWeight=w;
         }
         public Edge(String st, String end)
         {
             stNode=st;
             endNode=end;
         }
         public int getWeight()
         {
             return edWeight;
         }
    
         
}
