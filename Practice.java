import java.util.Scanner;
import java.lang.String;

class App {
static Scanner Input = new Scanner(System.in);
public static void main(String[] args) throws Exception {
System.out.println("\nNot an Integrated Program ");

System.out.println("\n A. Convert C to F \n B. Convert C to F \n C. Convert Secs to Mins \n D. Convert Hours to Mins \n E. Convert Mb to Gb \n F. Check Your Phone's number of digits \n G. Check if you BFF's name is in UpperCase \n H. Check the Capital of Philippines \n I. Know the Human Senses \n J. Find the Word 'love' in your sentence \n ");

System.out.println("\nWhat would want to do?");
String choice = Input.next();
String upCaseChoice = choice.toUpperCase();

switch(upCaseChoice){
    case "A":
      tempConverterCelsiusToFahrenheit();
    break;
    case "B":
      tempConverterFahrenheitToCelsius();
    break;
    case "C":
      timeConverterSecondsToMinutes();
    break;
    case "D":
      timeConverterHoursToMinutes();
    break;
    case "E":
      byteConverterMegabytesToGigabytes();
    break;
    case "F":
      numberDigitChecker();
    break;
    case "G":
      nameUppercaseChecker();
    break;
    case "H":
      capitalChecker();
    break;
    case "I":
      humanSensesChecker();
    break;
    case "J":
      findLoveWord();
    break;
    default:
      System.out.println("\n Invalid Choice");
    break;
  }
  Input.close();
}


static void tempConverterCelsiusToFahrenheit(){

  System.out.println("\nInput temperature in Celsius: ");
  Double celsius = Input.nextDouble();
  Double fahrenheit = (celsius*9/5)+32;
  System.out.printf("\nThe temperature in Fahrenheit is %.2f F\n",fahrenheit);
}

static void tempConverterFahrenheitToCelsius() {

  System.out.println("\nInput temperature in Fahrenheit: ");
  Double fahrenheit = Input.nextDouble();
  Double celsius = ((fahrenheit - 32) * 5) /9;
  System.out.printf("\nThe temperature in Celsius is %.2f F\n", celsius);
}

static void timeConverterSecondsToMinutes() {
  System.out.println("\nInput time in Seconds: ");
  Double seconds = Input.nextDouble();
  Double minutes = seconds/60;
  System.out.printf("\nThe time in Minutes is %.2f \n", minutes);
}

static void timeConverterHoursToMinutes() {

  System.out.println("\nInput time in Hours: ");
  Double hours = Input.nextDouble();
  Double minutes = hours * 60;
  System.out.printf("\nThe time in Minutes is %.2f \n", minutes);
}

static void byteConverterMegabytesToGigabytes() {

  System.out.println("\nInput storage value in Megabytes: ");
  Double megabytes = Input.nextDouble();
  Double gigabytes = megabytes / 1000;
  System.out.printf("\nThe storage value in Gigabytes %.2f \n", gigabytes);
}

static void numberDigitChecker() {

System.out.println("\nInput your 11-digit mobile number: ");
String mobileNumber = Input.next();

int mobileNumberLength = mobileNumber.length();

if (mobileNumberLength == 11){
    System.out.println("Your Mobile Number is Valid");
  }
  
  else if (mobileNumberLength <= 11) {
    System.out.printf("\nYour Mobile Number is Not Valid because it lacks %d more digits\n",11-mobileNumberLength);
  }

  else if (mobileNumberLength >= 11) {
    System.out.printf("\nYour Mobile Number is Not Valid because it has %d more digits\n", mobileNumberLength-11);
  }

  else {
    System.out.println("\n Invalid Input");
  }
}

static void nameUppercaseChecker() {

System.out.println("\nInput your bestfriends name in UPPERCASE: ");
String bestFriendsName = Input.next();

  if (bestFriendsName.equals(bestFriendsName.toUpperCase())) {
  System.out.println("\nYour Bestfriends Name is in UPPERCASE");
  }
  
  else {
    System.out.printf("\nYour Bestfriends Name is not in UPPERCASE");
  }
}
static void capitalChecker() {

System.out.println("\nInput the Capital of the Philippines: ");
String capitalPh = Input.next();
String upCaseCapitalPh = capitalPh.toUpperCase();

switch(upCaseCapitalPh){
    case "MANILA":
      System.out.println("\nCORRECT!\n");
    break;
    default:
      System.out.println("\nWRONG!\n");
    break;
  }
}

static void humanSensesChecker() {

System.out.println("\nInput any of the five human senses: ");
String humanSenses = Input.next();
String upCaseHumanSenses = humanSenses.toUpperCase();

switch (upCaseHumanSenses) {
  case "SIGHT","EYES":
    System.out.println("\nCORRECT!\n");
  break;
  case "TOUCH","HANDS":
    System.out.println("\nCORRECT!\n");
  break;
  case "HEARING","EARS":
    System.out.println("\nCORRECT!\n");
  break;
  case "SMELL","SCENT","NOSE":
    System.out.println("\nCORRECT!\n");
  break;
  case "TASTE","TONGUE":
    System.out.println("\nCORRECT!\n");
  break;
  default:
    System.out.println("\nWRONG!\n");
  break;
  }
}

static void findLoveWord() {

  System.out.println("\nUse the word 'love' in any sentence: ");
  Input.nextLine();
  String sentence = Input.nextLine();
  String findWord = "love";

    if (sentence.contains(findWord)){
      System.out.printf("\nThe word '%s' is PRESENT in the sentence\n",findWord);
    }

    else {
      System.out.printf("\nThe word is '%s' NOT found in the sentence\n",findWord);
    }
  }
}
