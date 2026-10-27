import java.util.Scanner;
public class rayven {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String name;
        int age;
        double allowance;


        System.out.print("==============STUDENT LIFE MANAGER===============\n");
        System.out.println("Enter your name: ");
        name = input.nextLine();

        System.out.println("Enter your age: ");
        age = input.nextInt();

        System.out.println("Enter your weekly allowance: ");
        allowance = input.nextDouble();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Allowance:P " + allowance);


            int choice;
            do {

                System.out.println("======MENU=======");
                System.out.println("1. Check Age");
                System.out.println("2. Allowance Calculator");
                System.out.println("3. Grade Checker");
                System.out.println("4. Number Counter");
                System.out.println("5. Guessing Game");
                System.out.println("6 Exit");

                System.out.println("Enter your choice: ");
                choice = input.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Age Checker selected");
                        System.out.println("Your age is: " + age);
                        if(age >= 18){
                            System.out.println("Status: Adult");
                        }
                        else {
                            System.out.println("Status: Minor");
                        }
                        break;

                    case 2:
                        System.out.println("Allowance Calculator selected");
                        int transportation;
                        int skuldays;
                        int food;
                        int totalt;
                        int foodt;
                        int totalexpense;
                        double remaining;

                        System.out.println("Enter your transportation fee: ");
                        transportation = input.nextInt();

                        System.out.println("Enter the school days: ");
                        skuldays = input.nextInt();

                        System.out.println("Enter food cost: ");
                        food = input.nextInt();

                        totalt = transportation * skuldays;
                        System.out.println("Your total transportation fee is: "+ totalt);

                        foodt = food * skuldays;
                        System.out.println("Your total food cost is: "+ foodt);

                        totalexpense = totalt + foodt;
                        System.out.println("Total expense is: "+ totalexpense);

                        remaining = allowance - totalexpense;
                        System.out.println("Remaining Allowance is: "+ remaining);
                        break;

                    case 3:
                        System.out.println("Grade Checker selected");
                        int grade;
                        System.out.println("Enter your grade: ");
                        grade = input.nextInt();
                        if (grade > 100 || grade < 0){
                        System.out.println("Invalid Grade");
                    }
                        else if (grade >= 95) {
                            System.out.println("Excellent");
                        }
                        else if (grade >= 90){
                            System.out.println("Very good");
                        }
                        else if (grade >= 85){
                            System.out.println("Good");
                        }
                        else if (grade >= 80){
                            System.out.println("Nice");
                        }
                        else {
                            System.out.println("Do better next time");
                        }

                        break;

                    case 4:
                        System.out.println("Number Counter selected");
                        int number;
                        int count = 1;
                        System.out.println("Enter a number: ");
                        number = input.nextInt();

                        while (count <= number){
                            System.out.println(count);
                            count++;
                        }
                        break;

                    case 5:
                        System.out.println("Guessing Game selected");
                        int secret = 50;
                        int guess;
                        System.out.println("Enter your guess: ");
                        guess = input.nextInt();

                        while(secret != guess){
                            System.out.println("Try again: ");
                            guess = input.nextInt();
                            if (guess > secret){
                                System.out.println("Guess to High");
                            }
                            else if(guess < secret){
                                System.out.println("Guess to Low");
                            }
                        }


                        System.out.println("Great guess");
                        break;

                    case 6:
                        System.out.println("Exit");
                        break;

                    default:
                        System.out.println("Invalid choice");
                }
            } while (choice != 6);


        }
    }
