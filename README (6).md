# Regex Basics

## Due: Fri 2/21 at 11:59 PM

- Create a program called `RegexBasics.java`
- Prompt the user for a filename containing hexadecimal color codes
- Prompt the user for a filename containing phone numbers
- Prompt the user for a filename containing email addresses
- Read in all the lines from the hex color codes file into an ArrayList
- Read in all the lines from the phone numbers file into another ArrayList
- Read in all the lines from the email addresses file into another ArrayList
- Print whether each hex color code is a valid hex color code or not
  - A hex color code is valid if it contains only 0 through 9 and A through F for each of the six digits
- Print whether each phone number is a valid phone number or not
  - A phone number is valid if it follows any of the following formats where # is a digit
    - (###) ###-####
    - ###-###-####
    - ##########
- Print whether each email address is a valid email address or not
  - An email address is valid if it follows the format username@domain.extension with the following being true
    - username contains only alphanumeric characters, dots, dashes, and underscores
    - domain contains only alphanumeric characters and dashes
    - extension is two to four letters

***Example Input:***\
hex1.txt\
phone1.txt\
email1.txt\
***Example Output:***\
AABBCC is a valid hex color code\
ZZ9900 is not a valid hex color code\
001122 is a valid hex color code\
00HH33 is not a valid hex color code\
AA99FF is a valid hex color code\
123456 is a valid hex color code\
#$!@%& is not a valid hex color code\
ABCDEF is a valid hex color code\
ABCDHH is not a valid hex color code\
ABCDE is not a valid hex color code\
0-1+2/ is not a valid hex color code\
\
(123) 456-7890 is a valid phone number\
123 456 7890 is not a valid phone number\
(123) 45-7890 is not a valid phone number\
1234567890 is a valid phone number\
123456789 is not a valid phone number\
(123) 456 7890 is not a valid phone number\
123-456-7890 is a valid phone number\
23-456-7890 is not a valid phone number\
123-4456-7890 is not a valid phone number\
\
abcdef@abc.com is a valid email address\
abc!@#abc.d is not a valid email address\
#$%@abc.com is not a valid email address\
fedcba@fed.org is a valid email address\
abcdef@&*().com is not a valid email address\
abcdef@abc.123 is not a valid email address\
mail@mail.mail is a valid email address
