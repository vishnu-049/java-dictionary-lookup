# Java Dictionary Lookup

A simple Java program to fetch English word definitions using the free [dictionaryapi.dev](https://dictionaryapi.dev/) API.  
No API key required!

## Features
- Enter any English word and see its definition instantly.
- Uses only Java standard libraries (no external dependencies).
- Good for beginners learning about HTTP requests and APIs.

## Sample Usage

Enter an English word: sun
API Response: [...] // (shows JSON)
Definition: The star at the center of the Solar System.

## How it works

- Prompts the user for a word.
- Calls the public dictionaryapi.dev endpoint for that word.
- Extracts and prints the first returned definition from the API response.
- Handles words that don’t exist with a user-friendly message.

## How to Run

1. Copy `DictionaryLookup.java` to your computer.
2. Compile in your terminal:  
javac DictionaryLookup.java

3. Run:  
java DictionaryLookup

## Credits

- Uses [dictionaryapi.dev](https://dictionaryapi.dev/) (free and open API)
- Created by Gangisetty vishnu

## License
This project is licensed for educational and personal portfolio use.  
See [dictionaryapi.dev terms](https://dictionaryapi.dev/) for API reuse policy.

This project is licensed for educational and personal portfolio use.  
See [dictionaryapi.dev terms](https://dictionaryapi.dev/) for API reuse policy.
