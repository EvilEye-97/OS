object scala_basic {
def test(x:Int, y:Int) : Unit =
{
if(x==y){
 println("X is Equal to Y")
}
else if(x>y){
 println("X is greater than Y")
}
else{
 println("Y is Grater than X")
}
}
def main(args: Array[String]): Unit = {
test(30, 0);
test(25, 5);
test(30, 20);
test(25, 20);
}
}
