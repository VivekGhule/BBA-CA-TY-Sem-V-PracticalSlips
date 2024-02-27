# A function that takes a string as an argument and returns a new string with odd index characters removed
def remove_odd_index(string):
    # An empty string to store the result
    result = ""
    # Loop through each character in the string
    for i in range(len(string)):
        # If the index is even, append the character to the result
        if i % 2 == 0:
            result += string[i]
    # Return the result
    return result

# Ask the user to enter a string
string = input("Enter a string: ")
# Call the function and print the result
print("The new string is:", remove_odd_index(string))
