import java.util.*

fun main(args: Array<String>)
{

    println("**Welcome to The Everything Store!**")
    println("{M}:" + " Music Shop")
    println("{B}:" + " Book Shop")
    println("{MV}:" + " Movie Shop\n")

    val userInput = Scanner(System.`in`)
    println("Select Shop:")
    var input = userInput.next()

    if(input.equals("M", ignoreCase = true) )
    {
        val m1 = Music()
        m1.muiscDisplayMenu()
    }
    if(input.equals("B", ignoreCase = true))
    {
        val b1 = Book()
        b1.bookDisplayMenu()
    }
    if(input.equals("MV", ignoreCase = true))
    {
        val mv1 = Movie()
        mv1.movieDisplayMenu()
    }


}

