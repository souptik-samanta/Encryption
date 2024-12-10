# Encryptor

## Overview
The **Encryptor** program is a Java-based application designed to encrypt a given string using a two-key mechanism. It converts characters to their ASCII values, applies transformations using the keys, and outputs the encrypted data as an array. The program can be paired with a decryptor to reverse the encryption process.
AI USED TO MAKE GRAMMER CORRECT
## Features
- Converts a string into encrypted data.
- Uses two keys to enhance security.
- Outputs the encrypted array and the keys for future decryption.

## How It Works
1. **Input String and Keys:** The program takes a string and two integer keys as input.
2. **ASCII Conversion:** Converts each character of the string to its ASCII value and multiplies it by `Key 1`.
3. **Prime Factor Generation:** Checks if the ASCII values are prime, and if so, multiplies them by `Key 2`.
4. **Encoding:** Further transforms the ASCII values using the generated prime factor.
5. **Output:** Displays the two keys and the encrypted array.



## License
This project is licensed under the MIT License. Feel free to use, modify, and distribute it as needed.

