# A function that takes a plain text and a shift value and returns a cipher text
def caesar_encrypt(plain_text, shift):
    # An empty string to store the cipher text
    cipher_text = ""
    # Loop through each character in the plain text
    for char in plain_text:
        # If the character is an uppercase letter
        if char.isupper():
            # Find the ASCII code of the letter
            code = ord(char)
            # Add the shift value to the code
            code += shift
            # If the code goes beyond the range of uppercase letters
            if code > ord("Z"):
                # Wrap it around from the beginning
                code -= 26
            # Convert the code back to a letter and append it to the cipher text
            cipher_text += chr(code)
        # If the character is a lowercase letter
        elif char.islower():
            # Find the ASCII code of the letter
            code = ord(char)
            # Add the shift value to the code
            code += shift
            # If the code goes beyond the range of lowercase letters
            if code > ord("z"):
                # Wrap it around from the beginning
                code -= 26
            # Convert the code back to a letter and append it to the cipher text
            cipher_text += chr(code)
        # If the character is not a letter, just append it to the cipher text
        else:
            cipher_text += char
    # Return the cipher text
    return cipher_text

# A function that takes a cipher text and a shift value and returns a plain text
def caesar_decrypt(cipher_text, shift):
    # An empty string to store the plain text
    plain_text = ""
    # Loop through each character in the cipher text
    for char in cipher_text:
        # If the character is an uppercase letter
        if char.isupper():
            # Find the ASCII code of the letter
            code = ord(char)
            # Subtract the shift value from the code
            code -= shift
            # If the code goes below the range of uppercase letters
            if code < ord("A"):
                # Wrap it around from the end
                code += 26
            # Convert the code back to a letter and append it to the plain text
            plain_text += chr(code)
        # If the character is a lowercase letter
        elif char.islower():
            # Find the ASCII code of the letter
            code = ord(char)
            # Subtract the shift value from the code
            code -= shift
            # If the code goes below the range of lowercase letters
            if code < ord("a"):
                # Wrap it around from the end
                code += 26
            # Convert the code back to a letter and append it to the plain text
            plain_text += chr(code)
        # If the character is not a letter, just append it to the plain text
        else:
            plain_text += char
    # Return the plain text
    return plain_text

# Ask the user to enter a plain text
plain_text = input("Enter a plain text: ")
# Ask the user to enter a shift value
shift = int(input("Enter a shift value: "))
# Encrypt the plain text using the shift value
cipher_text = caesar_encrypt(plain_text, shift)
# Print the cipher text
print("The cipher text is:", cipher_text)
# Decrypt the cipher text using the same shift value
decrypted_text = caesar_decrypt(cipher_text, shift)
# Print the decrypted text
print("The decrypted text is:", decrypted_text)
