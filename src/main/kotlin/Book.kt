import java.util.*

class Book
{
    val bookTitles: Array<String> = arrayOf("(1) Perks of being a Wallflower", "(2) Refugee", "(3) The Great Gatsby",
        "(4) I Will Always Write Back","(5) Jujutsu Kaisen Manga [RENTED]")
    val bookAuthor = listOf("Stephen Chbosky", "Alan Gratz", "F. Scott Fitzgerald", "Caitlin Alifirenka", "Gege Akutami\n")
    val bookID = listOf(2654745, 2745625, 3715271, 1273527, 8382617)
    val rentedItems = mutableListOf<String>("Perks of being a Wallflower [RENTED]")

    fun bookDisplayMenu()
    {
        println("{R}:" + " Rent")
        println("{V}:" + " View rented items")
        println("{Q}:" + " Quit\n")

        val userInput = Scanner(System.`in`)
        println("Enter Action:")
        var input = userInput.next()

        //Rent and Menu selection option /////////////////////////////////////////////////////////////////////////
        if (input.equals("R", ignoreCase = true)) {
            for (element in bookTitles) {
                println(element)
            }
            val userRentInfo = Scanner(System.`in`)
            println("What book would you like to Rent:")
            var rentInfo = userRentInfo.nextInt()

            if (rentInfo == 2)
            {
                val x = " ->[NOW RENTED]"
                print("Book Title: " + bookTitles.get(3) + "|" + " Author: " + bookAuthor.get(3) + "|" + " ID #: " + bookID.get(3) + x)
                print("\n**You have sucessfully rented!**\n")
                println()
                rentedItems.add("\nRefugee [RENTED]")

                val userDecision = Scanner(System.`in`)
                println("\nReturn to menu? (Y/N)")
                var inputDecision = userInput.next()
                while (inputDecision.equals("Y", ignoreCase = true)) {
                    bookDisplayMenu()
                    break
                }
                return System.exit(0)
            }

            if (rentInfo == 5) {
                print("\n{{Already rented!}}\n")

                val userDecision = Scanner(System.`in`)
                println("\nReturn to menu? (Y/N)")
                var inputDecision = userInput.next()
                if (inputDecision.equals("Y", ignoreCase = true)) {

                    bookDisplayMenu()
                } else {
                    return System.exit(0)
                }
            }

            if (rentInfo == 3) {
                val x = "[RENTED]"
                print("Book Title: " + bookTitles.get(2) + "|" + " Author: " + bookAuthor.get(2) + "|" + " ID #: " +
                        bookID.get(2) + x)
                print("\n**You have sucessfully rented!**\n")
                rentedItems.add("\nThe Great Gatsby [RENTED]")

                val userDecision = Scanner(System.`in`)
                println("\nReturn to menu? (Y/N)")
                var inputDecision = userInput.next()
                while (inputDecision.equals("Y", ignoreCase = true)) {

                    bookDisplayMenu()
                    break
                }
                return System.exit(0)
            }

            if (rentInfo == 4) {
                val x = "[RENTED]"
                print("Book Title: " + bookTitles.get(3) + "|" + " Author: " + bookAuthor.get(3) + "|" + " ID #: " +
                        bookID.get
                            (3) + x)
                print("\n**You have sucessfully rented!**\n")
                rentedItems.add("\nI Will Always Write Back [RENTED]")

                val userDecision = Scanner(System.`in`)
                println("\nReturn to menu? (Y/N)")
                var inputDecision = userInput.next()
                while (inputDecision.equals("Y", ignoreCase = true)) {
                    bookDisplayMenu()
                    break
                }
                return System.exit(0)
            }

            if (rentInfo == 1)
            {
                val x = "[RENTED]"
                print("Book Title: " + bookTitles.get(0) + "|" + " Author: " + bookAuthor.get(0) + "|" + " ID #: " +
                        bookID.get(0) + x)
                print("\n**You have sucessfully rented!**\n")
                rentedItems.add("\nJujutsu Kaisen Manga [RENTED]")

                val userDecision = Scanner(System.`in`)
                println("\nReturn to menu? (Y/N)")
                var inputDecision = userInput.next()
                while (inputDecision.equals("Y", ignoreCase = true)) {

                    bookDisplayMenu()
                    break
                }
                return System.exit(0)
            }

            if (rentInfo > 5 || rentInfo < 1) {
                print("\nInvalid Input\n")
            }
        }

        //Viewing Rented Items//////////////////////////////////////////////////////////////////////////////////////
        if (input.equals("V", ignoreCase = true)) {
            print("**Rented Items**\n")
            for (element in rentedItems) {
                print(element)
            }

            val userDecision = Scanner(System.`in`)
            println("\nReturn to menu? (Y/N)")
            var inputDecision = userInput.next()
            while (inputDecision.equals("Y", ignoreCase = true))
            {
                bookDisplayMenu()
                break
            }

            //Quiting////////////////////////////////////////////////////////////////////////////////////////////////
            if (input.equals("Q", ignoreCase = true)) {
                System.exit(0)
            }

        }
    }
}