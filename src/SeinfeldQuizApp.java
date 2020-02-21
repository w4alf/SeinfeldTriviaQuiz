//Created Feb. 19, 2020 by Christian Bravo as Demo Java Console App
// To demo some basic Java skills and for Fun - Seinfeld Trivia Console App!
//Thank you for Kroger interview.


import java.util.ArrayList;
import java.util.List;



public class SeinfeldQuizApp {


	boolean isTrue = false;


	public static void main(String[] args) {

		System.out.println("Welcome to the Seinfeld Trivia App");

		String command = "";

		 int[] selectedQuestions = new int[20];



        // Question Pool using a List
		List<QuestionAndAnswer> questions = new ArrayList<>();
		questions.add(new QuestionAndAnswer("0", "What popular female actress was George trying to date?", "Terry Bradshaw", "Elle McPherson", "Marisa Tomei", "Marisa Tomei","C"));
		questions.add(new QuestionAndAnswer("1", "What street did Jerry live on?", "West 81st Street", "West 71st Street", "East 43 Street", "West 81st Street","A"));
		questions.add(new QuestionAndAnswer("2", "What was the name of the file George worked on at his potential job he interviews for?", "Newman file", "Saccamano file", "Penske file", "Penske file","C"));
		questions.add(new QuestionAndAnswer("3", "What animal was left with no food when Elaine had Kramer short the power out in her hallway due to animal noises?", "Cat", "Dog", "Parrot", "Cat","A"));
		questions.add(new QuestionAndAnswer("4", "What video game did George have a high score in during high school?", "Frogger", "Space Invaders", "Pac-man", "Frogger","A"));
		questions.add(new QuestionAndAnswer("5", "What was the name of the chicken restaurant that placed a bright neon sign that shined into Kramer's apartment?", "Lenny's", "Mendy's", "Kenny Roger's", "Kenny Roger's","C"));
		questions.add(new QuestionAndAnswer("6", "Where did George supposedly have a cabin that Susan's parents believed he lied about?", "Poconos", "Hampton's", "Jersey Shore", "Hampton's","B"));
		questions.add(new QuestionAndAnswer("7", "What alleged act did Jerry's model girlfriend believe he had committed?", "Nose Pick", "Not wipe gym equipment", "changed barber's", "Nose Pick","A"));
		questions.add(new QuestionAndAnswer("8", "What was the name of Jerry's new barber that Enzo suspected he had switched to?", "Bizzaro Enzo", "Gino", "Antonio", "Gino","B"));
		questions.add(new QuestionAndAnswer("9", "What kind of model was George discovered as?", "Hand Model", "Hair Model", "Leg Model", "Hand Model","A"));
		questions.add(new QuestionAndAnswer("10", "What was Jerry's sentenced to be in his NBC pilot show entitle Jerry?", "Butler", "Nanny", "Bus Driver", "Butler","A"));
		questions.add(new QuestionAndAnswer("11", "What was the name of the restaurant Elaine was banned from?", "Golden Dragon", "Hop Sings", "Chinese Restaurant", "Hop Sings","B"));
		questions.add(new QuestionAndAnswer("12", "What pant size does Jerry boast having since college?", "31", "30", "32", "31","A"));
		questions.add(new QuestionAndAnswer("13", "The Tao of Jerry: Newman is the what to his Superman?", "Kryptonite", "Batman", "Lex Luthor", "Lex Luthor","C"));
		questions.add(new QuestionAndAnswer("14", "What was the scent idea of the perfume that Calvin Klein stole from Kramer?", "The Zoo", "The Beach", "Manhattan", "The Beach","B"));
		questions.add(new QuestionAndAnswer("15", "What is one of Elaine's not so great talents?", "Dancing", "Singing", "Skating", "Dancing","A"));
		questions.add(new QuestionAndAnswer("16", "What is the name retirement community in Florida that Jerry's parents moved to?", "Palm Harbor", "Shady Oaks", "Del Boca Vista", "Del Boca Vista","C"));
		questions.add(new QuestionAndAnswer("17", "What was the defect with the Cashmere sweater that George bought at a discount?", "Red Dot", "A Rip", "Missing Pocket", "Red Dot","A"));
		questions.add(new QuestionAndAnswer("18", "What was the name of street gang that beat up George and almost beat up Kramer?", "Van Buren Boys", "Los Locos", "Perry Boys", "Van Buren Boys","C"));
		questions.add(new QuestionAndAnswer("19", "What was the name of one of Elaine's boyfriends that had a house in Tuscany?", "Bob Cobb", "Putty", "Jon Jermaine", "Bobb Cobb aka The Maestro","A"));





		while (!command.equals("99")) {


			command = Console.getString(getMenu());
			command.toLowerCase();
			int commandInt =0;

			switch (command) {


				case "1":

                    //Take Quiz

					selectedQuestions = questionPicker();


					int totalQuestionCount = 0;
					int totalQuestionsCorrect = 0;
					double score;




					//5 Questions at a time, there are a total of 20 questions in pool.
					for (int i=0; i<5; i++) {

						System.out.println("\nQuestion " + (i+1) + " of 5. \n");


						System.out.println(questions.get(selectedQuestions[i]).getQuestion()+"\n");
						System.out.println("A. " + questions.get(selectedQuestions[i]).getAnswer1());
						System.out.println("B. " + questions.get(selectedQuestions[i]).getAnswer2());
						System.out.println("C. " + questions.get(selectedQuestions[i]).getAnswer3());


                        command = Console.getSelection("\nEnter the letter of the correct answer: ");


						totalQuestionCount += 1;

                        if(command.equalsIgnoreCase(questions.get(selectedQuestions[i]).getCorrectAnswerAbc())){
							System.out.println("That is correct!");

							totalQuestionsCorrect++;

						} else {

							System.out.println("That is incorrect. :(");
						}


					}

					if (totalQuestionsCorrect==0) {
						score = 0;
					} else {
						score = (double) totalQuestionsCorrect/ (double) totalQuestionCount * 100 ;
					}



					System.out.println("\nThat is the end of the Quiz! You got "+ totalQuestionsCorrect + " out of " + totalQuestionCount +" Correct. You scored " +  score + "%.\n");

					if(totalQuestionsCorrect==5){
						System.out.println("Congrats! You sure know your Seinfeld\n");


					} else if (totalQuestionsCorrect==0) {

						System.out.println("Time to watch more Seinfeld!\n");
					}

					break;

				case "2":
					// All quiz Questions and Answers

					for(QuestionAndAnswer q : questions){

						System.out.println("\nQuestion: " + q.getQuestion());
						System.out.println("\nAnswer: " + q.getCorrectAnswer());
					}

					break;

				case "3":
					//Easter egg - Selection not on menu :)

					easterEgg();

					break;


				case "99":
					byeBye();
					break;

				case "exit":
					//exit
					command = "99";
					byeBye();
					break;

				default:
					System.out.println("Invalid command selection, please try again.");
					break;

			} // switch loop end

		}    // while loop end


	}// main method end


    // This method will randomize 20 questions in the pool without repeating a question previously selected
	private static int[] questionPicker() {

		//note: 0 thru 19
		int numberOfQuestions = 19;


		int questionsTotal = 0;
		int[] questionsSelected = new int[numberOfQuestions];
		int randomQuestion;
		boolean questionPickedFlag = false;


        ArrayList questions = new ArrayList();

		while (questionsTotal<numberOfQuestions) {


            randomQuestion = (int) ((Math.random() * numberOfQuestions) + 1);



            if (questions.contains(randomQuestion)) {
                continue;
            } else {
                questionsSelected[questionsTotal] = randomQuestion;

                questionsTotal += 1;
				questions.add(randomQuestion);

            }





		} //end of while loop

        return questionsSelected;

	} // questionPicker end





	private static String getMenu() {
		String menu = "\n" +
					  "**********************************\n"+
					  "*           MAIN MENU:           *\n" +
					  "**********************************\n"+
					  "1 -   Take Quiz \n" +
					  "2 -   See All Questions & Answers \n" +
					  "99 -  Exit App\n" +
					  "Enter your Menu Number Selection: ";
		return menu;
	}
	

	
	private static void byeBye() {
		
		System.out.println();
		System.out.println();
		System.out.println("           GAME OVER ");
		System.out.println();
		System.out.println("         ##          ##");
		System.out.println("           ##      ##");
		System.out.println("        ##############");
		System.out.println("      ####  ######  ####");
		System.out.println("    ######################");
		System.out.println("    ##  ##############  ##");
		System.out.println("    ##  ##          ##  ##");
		System.out.println("          ####  ####");
		System.out.println("");
		System.out.println("     1. GLC 860,630 PTS");
		
	}

	private static void easterEgg() {

		System.out.println("                                      ^;;::i*+nxnxWMxxxW@##@@@@@WMWWxxn###xz*^");
		System.out.println("                                     .;iznnzzxMW@WW@@@W@@@#@###@@W@@WWWMxMMxz+:.");
		System.out.println("                                    *:;+zM@@@@@@@@@##@#@#@#@@#######@@@@@@@WWMn*.  *");
		System.out.println("                                  **:+zxW@@@@@########################@@@@@@@@@n;**");
		System.out.println("                                   .*#nxW@@############################@@@@###@@@n^*");
		System.out.println("                                  *:*#xW@@#################################@@@@#@#@@@z** *");
		System.out.println("                                *;+zW@@@#@#####################################@#@Wx;.**");
		System.out.println("                             **:+nW@@@@@@@@###############################@@@@@@@@@@@Wni^.");
		System.out.println("                           ^zM@@@@@@@##################################################@@WM+.");
		System.out.println("                         ***MW@@@#######################################################@@x+^*");
		System.out.println("                         *;n@@@@@###############################@###@@@@WW@@@@###########@Wz^***");
		System.out.println("                         *ix@@@#######@@@########################@@#@WWWMznzzxM@#########@@x:**");
		System.out.println("                        *.+M###############@@@@@@#@###############WMWnMMn#+**+zx@#########@M*.**");
		System.out.println("                        *:+x@@@#######@@@WMxxxMW@@@W@@######@@@@@MznMzzzzi*;;i**n@########@W#^*");
		System.out.println("                        *:*z@@########@xz+*#++#nznnnxxMWWMMWMxnxM#+xn#+++;:::;i*#W@#########M*^*");
		System.out.println("                        *:+#W#####@#@@ziiii*ii****+++++###+##+++z#+#+iii;:^^::i*+zM@#@######@z;^*");
		System.out.println("                        *ixMW@####@@@zi;:;;:;;;;;;ii;;iiiiiiii;i*++*;;:::^^^^:;;i*z@#@######Wxi^***");
		System.out.println("                        .*M#@W@###@@@;::^^:::::::;:::::;:::::::;;;;;::^^^^^^^^:::;*M########Wxn^***");
		System.out.println("                        *iM##@@####@z:^^^.^^^^^^^::^::::^^^^::::::^^^^^^^^^^^^::::;z@######@@Mx:**");
		System.out.println("                       *.:M#######@Mi^.^....^^^.^^^^^^^^^^^^^^^^^^^...^..^^^^^^^:::*M@#######@Wi**");
		System.out.println("                        **@#######W#:^...............^^^^...^^^^^^^........^^^^^^^:in@########@#.*");
		System.out.println("                        *+W@#####@M;^^......................................^^^^^^:;#W######@#@z.**");
		System.out.println("                       *.zW######@n:^^........................................^^^^^:*M######@##z.**");
		System.out.println("                       *^n@######@+^.^........................................^^^^^:iz########@+**");
		System.out.println("                       *^+M#####@Wi^^........................................^^^^^^:i+W#######W;**");
		System.out.println("                       *^;z@####@M;.........................................^^^^^^^:;*M###@##@M^**");
		System.out.println("                       *.;in@##@@x:^.........................................^^^^..^^;#@###@@Wi***");
		System.out.println("                      **^ix@##@@x:^.^.......................................^.^.^^^^:+@###@@W:  **");
		System.out.println("                       **:iM@###@x:^......................................^^.....^^^^^*@##@@@n.**");
		System.out.println("                      **:z@@###@x:^......................................^^^..^^.^^^^z@@#@@@+.**");
		System.out.println("                      **;n@@###@x:^^.....................................^^^^^^^^.^^:zx@@#@ni***");
		System.out.println("                       **^z@@###@x;^^....^^................................^^^^^^.^^^*;+x@M+i;.**");
		System.out.println("                       **.+M@#@#@x;......^^.................................^^^^^^^:;*:;+nn;;:***");
		System.out.println("                        **^z@##@@n;^..^^^^^.........................^.....^^^.^^^^^:*;^:*nz;:^**");
		System.out.println("                         **iMzM#@ni^..^^^^^...................^^^^^^^.^^^^::::^^^^:ii^^:i#zi:.**");
		System.out.println("                        ***^#*n@@x#^..^^^^^.......^^....^^^^^^^^^^^^::;ii***ii::^:^#:^^^;+#*;****");
		System.out.println("                        ***^#*n@@x#^..^^^^^.......^^....^^^^^^^^^^^^::;ii***ii::^:^#:^^^;+#*;****");
		System.out.println("                         ***:*n@@Mn^.^.^^........^^^^^^^^^^^^:::^::i#nMnzz###nz+;:i*:^^^:;+i:** *");
		System.out.println("                       ******^ix@@n:.^.^^^.....^^^^^^:::::::::;;;*+#z+i;;;::::;*z#i:^^^^^^:;^*  **");
		System.out.println("                       ********;nWn:^^^^.^^:^:^:::::::;::::;;;i*z++++*i***++*ii;ii:^^^^^^^^:^*  **");
		System.out.println("                       ****** **^++::^^^^:;;;i*+i+*##*i;;:::;+#z+*+##zxxMWWWMz+*i*^^^^^^^^^^^* ***");
		System.out.println("                       **********:;:;:^::::*#xn#+#+#znx+*;i*+Mn+znnxMWMMxz+*i:;;:#:^^^^^^^^^.*   *");
		System.out.println("                       **********^:^::^:;*i;;;;ii++###+zx*iii*##nxxnz+**i;::;;:^:+:::^^^^^^^^*   *");
		System.out.println("                       **********.^^;:;#+;;ii+zxMWMMxnxnn*i;:i++++*iii;;;;;ii;^:^#:^^^^^^^^^.****");
		System.out.println("                       **********.^;+z+;;*zxMM@#@MMxxxxM+:^^:*z*iii;;;;;ii;:^^^;*^^^^^^^^^^.** *");
		System.out.println("                       ************.^*i:;;iii*****iiii*+x*^.^^inMii**iii;;:^^^^^+;^:::^^^^^^.** *");
		System.out.println("                       ***********..^:i^:::^:::;;ii;;;i*M+^..^:#ni;iiii;::^^^.^;*^:::^^^^^^^.** *");
		System.out.println("                       ***********.^^^+^^::;;;;;iii;;ii*x*....^;+#;::::^^^^^^^;+^^^:^^^^^^^^.** *");
		System.out.println("                       ***********..^^*;:^^;iiiii;;i;;;i*:...^^:;+#:^^^^^^::^**::^^:::^^^^^^^.***");
		System.out.println("                       ***********..^^;+^^^^^^:::;;::::ii^...^^^^:i++:^^^::i+*;::::::::::^^^^.***");
		System.out.println("                       ***********..^^^i;.^^^^^^^^^^^^;i^^....^^.^^;*z##+++i:::::::::::::^^^^.***");
		System.out.println("                       ***********.^^^:^ii:^^^^^^::^^i+:^.......^^^^;;iii;:^^:;;;;;;:::::^^^^.***");
		System.out.println("                       ***********.^^:^^^;*:^^::::::i+i^......^^^^.^:;;;;;:::;;;;;;;;:;;::^^^.***");
		System.out.println("                       ***********..^^:^^^^:i***ii****i:^^......^^...:;ii*i;;ii;;;;;;;;;;::^^^.****");
		System.out.println("                      ************.^^:^^^^^:::^::;i*+i:^^^^.^^^^^^^:;;:;i*+#+**iiiii;;i;;:::^.****");
		System.out.println("                      ************.^^:::^::;:;;;i*+#*i:^^^^^^^^^^:;ii:;;i*++##z+**iii;i;;;::^.****");
		System.out.println("                      ************^^^^::::;;;;i**##+*i;;:^^^^:::i*+i;;;;ii*+#nx#+**iii;;;;:::.****");
		System.out.println("                      ************^^^^::::;iii*+zz#+*iiii;::;;;i++ii;;;:;i*#xMx#+**iii;;;;;::.****");
		System.out.println("                      ************^^^^:::;;ii*+znz+**iiiii;;ii*++*i;;:;;i#xWWMn+***i;;;;;;;;:.****");
		System.out.println("                      ************.^^:::;;;i*++xxz+*i;;;;i***+##+ii;;;;+xWWxzz#*iiii;;:::;;;:^****");
		System.out.println("                      ************.^^:::;;;ii+#xMxnz+i;;:;i*+##+*i;iii;*MWz*+++*iii;;:::;;;;:^.***");
		System.out.println("                      *************^::::;;;ii*+#nxxW@Mn+;i;i*iiii**i:^^iM#iiiiii;;;;;;:;;;;i::.****");
		System.out.println("                      *************^::::;;;;ii*+#z+#x@@i:;i*****i:^.::xn#;;;;;i;;;;;;;;;;;;i;:^..**");
		System.out.println("                      *************.^::::;;;ii*+++**+nWz#:^^^^:^^^;;xn#+;::;:;;;;;;;;;;;iiii;;....*");
		System.out.println("                      *************.^:::::;;;;;i**i;;*nn+#nn++znxnnz+*i;::^:;;;:;;;;;;;iiiii;;^....*");
		System.out.println("                      **************^:::::::;;;;ii;::;i+:^:;:;**i:;iii;:::::;;::;;;;;;iiiii;i;^....*");
		System.out.println("                      **************.:::::::::::;;;::::;;:^^::::;;;;;;:^^^::;:::;;;;;iiiiiiii;^...*");
		System.out.println("                      **************.::::::::::::::::^::;;;::;;;;;;;;::^^^::::^:;;;;ii*iiii*i:^...*");
		System.out.println("                      **************.^::::::::::::::^^^^::::;;;;;;;;;:::^^^::^^:;;;ii***ii*+i:....*");
		System.out.println("                      **************.^::::::::::::^^^^^^^::;;;iiiii;::^^^^^^^^:;;;;i****ii++;:....*");
		System.out.println("                      **....*******..^:::::::::;;:^^^^^^^::;;;;;;:::::^^^^^^^^:;;;i*++*ii*#*;^....*");
		System.out.println("                     **......*********.^::;;;;;::::^........**......^^^^^^^^^:;;ii*******n+;:^....*");
		System.out.println("                     **.....**********.^::;;;;;;::^.....*..*****........^^^::;;ii*******#z*;:^....*");
		System.out.println("                     **.....***********.::;;;;;::^......*...............^^:;;iii*******+n*i::^....*");
		System.out.println("                     *......***********.^:::::^...........^::^^..........^:;iiii******+z#*;:^.....*");
		System.out.println("                     *.......**********.^::^...........^::;**;::^..........:;ii****+++#n+:^:^.....*");
		System.out.println("                     *.......***********.^^.......^^^^:;i*+*i*i;:^^^........^i*****++#n+:^^^^.....*");
		System.out.println("                     *......************.........^:::;i*++*:^:i*i;:^^........:*+++#+#zzi^^^:^.....*");
		System.out.println("                     *......************.......^^:;i**+++i:..*.:i*i::^.......^;*++##nz##n;:^......*");
		System.out.println("                     *......************.^....^^:;i*+i;::^^.***..^;;;::^^....^^;##zxW#++nn:^^.....*");
		System.out.println("                     *......*.*********..^..^::;;***;:^^...******..^^:;::^^..^^^*zx@M#**n#^^......*");
		System.out.println("                     *......**********...^^::;ii*i:^^...*..^^..**.....^:;;:^^.^^:zW@z*;;+:^^^.....*");
		System.out.println("                     **.......********...^^;ii;:^......*..:ii:^..........^^^^^.^.iWn+i;:^^........*");
		System.out.println("                     **......*********...^^^^^..........^:i*i*;:^............^..^^+*i;:^^^....*...*");
		System.out.println("                     **....*.********..^.............^^:;i*ii+**;:^^............^^^;i;:^^.^....*..*");
		System.out.println("                     **.....*********.^.............^^:i*++*+#*+++i;^^.........^^..^^:^^^.....*...*");
		System.out.println("                     **...*.********............^^:;;i*+++++#n+++++*;:^........^^^^.^:^^^..^......*");
		System.out.println("                     **...*.*******...........^^::i*+++++++#nM##++++*;::^.....^^^.....^^^^...^....*");
		System.out.println("                     **....********....^^^^.^^::;*+*i*+###znxWnz##z#+*i;:^^^^^^^.^^....^.....*....*");
		System.out.println("                     ***...***.*.*.....^^^^:::ii*+ii++znnnnxMWMn#znz##*ii;:^^..^.....^^...........*");
		System.out.println("                     ****..***.*.*....^^^::;i*++x*:iznnxxxxxxMMnnnnnnz#*ii;:^^.^..................*");
		System.out.println("                     *****.******....^^^^:;**++z#^i++xMMMMnzzzzznMxxMnn*;;;:^^^.^^....^..........**");
		System.out.println("                     *****.******....^^^:;i***++:;*+#zMWMn+;;i**#nxxMMz*iii;::.^^^^^...^^.......***");
		System.out.println("                     ************...^^^::;i**+++i*++**#z*;:...^^^:i*zz+**iii:^^^^^^^^^.........****");
		System.out.println("                     ************...^^::;;i*++*ii;:^^.......****.....^^:;;ii;;::^^^^^^^.^.*********");
		System.out.println("                     ***********....^^::;iii;:^^.......**...*****....*...^^:;;:^^^^^^^^^^.*********");
		System.out.println("");
		System.out.println("                              ------ I LOVE BROCCOLI!?...IT'S.....GOOD FOR YOU  --------");


	} //end of easter egg


} // SeinfeldQuizApp end
