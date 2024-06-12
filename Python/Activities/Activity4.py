# Get the names of the users
user1 = input("Enter Player 1 name ")
user2 = input("Enter Player 2 name ")

# While looping endlessly
while True:
    # Ask User1's choice
    user1_answer = input(user1 + ", do you want to choose rock, paper or scissors? ").lower()

    # Ask User2's choice
    user2_answer = input(user2 + ", do you want to choose rock, paper or scissors? ").lower()

    # Run the algorithm to see who wins
    if user1_answer == user2_answer:
        print("It's a tie!")
    elif user1_answer == 'rock':
        if user2_answer == 'scissors':
            print(user1 + " wins! Rock beats scissors")
        else:
            print(user2 + " wins!")
    elif user1_answer == 'scissors':
        if user2_answer == 'paper':
            print(user1 + " win! Scissors beat paper")
        else:
            print(user2 + " wins!")
    elif user1_answer == 'paper':
        if user2_answer == 'rock':
            print(user1 + " wins! Paper beats rock")
        else:
            print(user2 + " win!")
    else:
        print("Invalid input! You have not entered rock, paper or scissors, try again.")

    # Ask them if they want to play again
    repeat = input("Do you want to play another round? Yes/No: ").lower()

    # If they say yes, don't do anything
    if repeat == "yes":
        pass
    # If they say no, exit the game
    elif repeat == "no":
        raise SystemExit
    # If they say anything else, exit with an error message.
    else:
        print("You entered an invalid option. Exiting now.")
        raise SystemExit
