# Encryptor

## Overview
The **Encryptor** program is a Java-based application designed to encrypt a given string using a two-key mechanism. It converts characters to their ASCII values, applies transformations using the keys, and outputs the encrypted data as an array. The program can be paired with a decryptor to reverse the encryption process.

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

## How to Use
1. Clone or download this repository.
2. Open the project in your favorite Java IDE (e.g., IntelliJ IDEA, Eclipse, BlueJ).
3. Compile and run the `Encryptor.java` file.
4. Follow the prompts:
   - Enter the string to be encrypted.
   - Enter two integer keys.
5. View the output, which includes:
   - `Key 1`: Used for ASCII multiplication.
   - `Key 2`: Prime factor for encoding.
   - Encrypted array: Space-separated integers representing the encrypted data.

## Example
### Input:
```
Enter the string to be encrypted:
Hello123
Enter key 1 and key 2:
2
3
```
### Output:
```
Encrypted data (keys and array):
Key 1: 2
Key 2: 3
Encrypted Array: [23460, 22644, 23868, 22848, 23664, 21420, 21828, 9996, 10200]
```

## Methods Explained
### `toAscii(String s, int k1)`
- Converts each character of the input string to its ASCII value.
- Multiplies the ASCII value by `Key 1`.

### `toPrime(int[] a, int k2)`
- Checks if each ASCII value is a prime number.
- If prime, multiplies it by `Key 2`.

### `encode(int primeFactor, int[] asciiArray)`
- Multiplies each value in the ASCII array by the prime factor to produce the final encrypted array.

## Requirements
- **Java Version:** 8 or higher
- **IDE/Compiler:** Any Java-supported IDE or terminal with `javac` and `java` commands.

## Contributing
Contributions are welcome! Please fork this repository, make changes, and submit a pull request.

## License
This project is licensed under the MIT License. Feel free to use, modify, and distribute it as needed.

