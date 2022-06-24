import java.util.*

class Music {

    val musicTitle = listOf("(1) Down Flat", "(2) Koroba[RENTED]", "(3) Iskaba", "(4) Comic Sans", "(5) Blue Flame")
    val musicArtist = listOf("Kelvyn boy", "Tiwa Savage", "Wande Coal", "Audrey Nuna", "Lesserafim")
    val musicID = listOf(758302, 758463, 394836, 495044, 585937)
    val rentedItems = mutableListOf<String>("Koroba [RENTED]")


    //Display Screen
    fun muiscDisplayMenu() {
        println("{R}:" + " Rent")
        println("{V}:" + " View rented items")
        println("{Q}:" + " Quit\n")

        val userInput = Scanner(System.`in`)
        println("Enter Action:")
        var input = userInput.next()


        //Rent and Menu selection option /////////////////////////////////////////////////////////////////////////
        if (input.equals("R", ignoreCase = true)) {
            for (element in musicTitle) {
                println(element)
            }
            val userRentInfo = Scanner(System.`in`)
            println("What song would you like to Rent:")
            var rentInfo = userRentInfo.nextInt()
            if (rentInfo == 1) {
                val x = " ->[NOW RENTED]"
                print(
                    "Song: " + musicTitle.get(0) + "|" + " Artist: " + musicArtist.get(0) + "|" + " ID #: " + musicID.get(
                        0
                    ) + x
                )
                print("\n**You have sucessfully rented!**\n")
                println()
                rentedItems.add("\nDown Flat [RENTED]")

                val userDecision = Scanner(System.`in`)
                println("\nReturn to menu? (Y/N)")
                var inputDecision = userInput.next()
                while (inputDecision.equals("Y", ignoreCase = true)) {
                    muiscDisplayMenu()
                    break
                }
                return System.exit(0)
            }

            if (rentInfo == 2) {
                print("\n{{Already rented!}}\n")

                val userDecision = Scanner(System.`in`)
                println("\nReturn to menu? (Y/N)")
                var inputDecision = userInput.next()
                if (inputDecision.equals("Y", ignoreCase = true)) {

                    muiscDisplayMenu()
                } else {
                    return System.exit(0)
                }
            }

            if (rentInfo == 3) {
                val x = "[RENTED]"
                print(
                    "Song: " + musicTitle.get(2) + "|" + " Artist: " + musicArtist.get(2) + "|" + " ID #: " + musicID.get(
                        2
                    ) + x
                )
                print("\n**You have sucessfully rented!**\n")
                rentedItems.add("\nIskaba [RENTED]")

                val userDecision = Scanner(System.`in`)
                println("\nReturn to menu? (Y/N)")
                var inputDecision = userInput.next()
                while (inputDecision.equals("Y", ignoreCase = true)) {

                    muiscDisplayMenu()
                    break
                }
                return System.exit(0)
            }

            if (rentInfo == 4) {
                val x = "[RENTED]"
                print(
                    "Song: " + musicTitle.get(3) + "|" + " Artist: " + musicArtist.get(3) + "|" + " ID #: " + musicID.get(
                        3
                    ) + x
                )
                print("\n**You have sucessfully rented!**\n")
                rentedItems.add("\nComic Sans [RENTED]")

                val userDecision = Scanner(System.`in`)
                println("\nReturn to menu? (Y/N)")
                var inputDecision = userInput.next()
                while (inputDecision.equals("Y", ignoreCase = true)) {
                    muiscDisplayMenu()
                    break
                }
                return System.exit(0)
            }

            if (rentInfo == 5) {
                val x = "[RENTED]"
                print(
                    "Song: " + musicTitle.get(4) + "|" + " Artist: " + musicArtist.get(4) + "|" + " ID #: " + musicID.get(
                        4
                    ) + x
                )
                print("\n**You have sucessfully rented!**\n")
                rentedItems.add("\nBlue Flame [RENTED]")

                val userDecision = Scanner(System.`in`)
                println("\nReturn to menu? (Y/N)")
                var inputDecision = userInput.next()
                while (inputDecision.equals("Y", ignoreCase = true)) {

                    muiscDisplayMenu()
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
            while (inputDecision.equals("Y", ignoreCase = true)) {
                muiscDisplayMenu()
                break
            }


            //Quiting////////////////////////////////////////////////////////////////////////////////////////////////
            if (input.equals("Q", ignoreCase = true)) {
                System.exit(0)
            }


        }
    }
}

