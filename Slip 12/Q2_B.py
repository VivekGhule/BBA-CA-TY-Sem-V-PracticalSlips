# Define a function to count repeated characters in a string
def count_repeated_chars(string):
  # Create an empty dictionary to store the character counts
  char_counts = {}
  # Loop through each character in the string
  for char in string:
    # If the character is already in the dictionary, increment its count
    if char in char_counts:
      char_counts[char] += 1
    # Otherwise, initialize its count to 1
    else:
      char_counts[char] = 1
  # Return the dictionary of character counts
  return char_counts

# Test the function with an example string
example = "hello world"
# Call the function and print the result
print(count_repeated_chars(example))
