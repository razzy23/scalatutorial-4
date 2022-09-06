object Q1 extends App{
  
  val alphabet = "abcdefghijklmnopqrstuvwxyz" 
  
  val E = (c:Char, key:Int, a:String)=>a((a.indexOf(c.toLower)+key)%a.size)
  val D = (c:Char, key:Int, a:String)=>a((a.indexOf(c.toLower)-key)%a.size) 
  
  val cipher =(algo:(Char,Int,String)=>Char,s:String,key:Int,a:String)=>s.map(algo(_,key,a))
  
  val ct = cipher(E,"s",5,alphabet) //should print as x 
  val pt = cipher(D,ct,5,alphabet) //decyphering and printing s again
  
  println(ct)
  println(pt)  
}