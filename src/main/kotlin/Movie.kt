import java.util.*

class Movie {
    val movieTitles: Array<String> = arrayOf(
        "(1) Spiderman: Far from home [RENTED]", "(2) A Quiet Place", "(3) A Silent Voice",
        "(4) Demon Slayer: Kimetsu no Yaiba", "(5) Jujutsu Kaisen 0: The Movie"
    )
    val movieLead = listOf("Tom Holland", "John Krasinski", "Saori Hayami", "Natsuki Hanae", "Megumi Ogata\n")
    val movieID = listOf(8503675, 977453, 85673564, 8695473, 969385)
    val rentedItems = mutableListOf<String>("Spiderman: Far from home [RENTED]")


    fun movieDisplayMenu()
    {
        println("{R}:" + " Rent")
        println("{V}:" + " View rented items")
        println("{Q}:" + " Quit\n")

        val userInput = Scanner(System.`in`)
        println("Enter Action:")
        var input = userInput.next()

        //Rent and Menu selection option /////////////////////////////////////////////////////////////////////////
        if (input.equals("R", ignoreCase = true)) {
            for (element in movieTitles) {
                println(element)
            }
            val userRentInfo = Scanner(System.`in`)
            println("What movie would you like to Rent:")
            var rentInfo = userRentInfo.nextInt()

            if (rentInfo == 2)
            {
                val x = " ->[NOW RENTED]"
                print("Movie: " + movieTitles.get(3) + "|" + " Lead: " + movieLead.get(3) + "|" + " ID #: " + movieID
                    .get(3) + x)
                print("\n**You have sucessfully rented!**\n")
                println()
                rentedItems.add("\nA Silent Voice [RENTED]")

                val userDecision = Scanner(System.`in`)
                println("\nReturn to menu? (Y/N)")
                var inputDecision = userInput.next()
                while (inputDecision.equals("Y", ignoreCase = true)) {
                    movieDisplayMenu()
                    break
                }
                return System.exit(0)

            }
            if (rentInfo == 1) {
                print("\n{{Already rented!}}\n")

                val userDecision = Scanner(System.`in`)
                println("\nReturn to menu? (Y/N)")
                var inputDecision = userInput.next()
                if (inputDecision.equals("Y", ignoreCase = true)) {

                    movieDisplayMenu()
                } else {
                    return System.exit(0)
                }

            }
            if (rentInfo == 3) {
                val x = "[RENTED]"
                print("Movie: " + movieTitles.get(2) + "|" + " Lead: " + movieLead.get(2) + "|" + " ID #: " + movieID.get(2) + x)
                print("\n**You have sucessfully rented!**\n")
                rentedItems.add("\nA Quiet Place [RENTED]")

                val userDecision = Scanner(System.`in`)
                println("\nReturn to menu? (Y/N)")
                var inputDecision = userInput.next()
                while (inputDecision.equals("Y", ignoreCase = true)) {

                    movieDisplayMenu()
                    break
                }
                return System.exit(0)

            }
            if (rentInfo == 4) {
                val x = "[RENTED]"
                print("Movie: " + movieTitles.get(3) + "|" + " Lead: " + movieLead.get(3) + "|" + " ID #: " + movieID.get(3) + x)
                print("\n**You have sucessfully rented!**\n")
                rentedItems.add("\nDemon Slayer: Kimetsu no Yaiba [RENTED]")

                val userDecision = Scanner(System.`in`)
                println("\nReturn to menu? (Y/N)")
                var inputDecision = userInput.next()
                while (inputDecision.equals("Y", ignoreCase = true)) {
                    movieDisplayMenu()
                    break
                }
                return System.exit(0)
            }
            if (rentInfo == 5)
            {
                val x = "[RENTED]"
                print("Movie: " + movieTitles.get(4) + "|" + " Lead: " + movieLead.get(4) + "|" + " ID #: " +
                        movieID.get(4) + x)
                print("\n**You have sucessfully rented!**\n")
                rentedItems.add("\nJujutsu Kaisen 0: The Movie [RENTED]")

                val userDecision = Scanner(System.`in`)
                println("\nReturn to menu? (Y/N)")
                var inputDecision = userInput.next()
                while (inputDecision.equals("Y", ignoreCase = true)) {

                    movieDisplayMenu()
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
                movieDisplayMenu()
                break
            }

            //Quiting////////////////////////////////////////////////////////////////////////////////////////////////
            if (input.equals("Q", ignoreCase = true)) {
                System.exit(0)
            }

        }
    }
}