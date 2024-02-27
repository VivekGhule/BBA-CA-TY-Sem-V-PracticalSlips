# Write a Python program to convert a tuple of string values to a tuple of integer values

# Define the original tuple values
original_tuple = (('333', '33'), ('1416', '55'))
print("Original tuple values:", original_tuple)

# Use a list comprehension to convert each string value to an integer value
# Use the tuple() function to convert the list to a tuple
new_tuple = tuple([int(x) for x in original_tuple])
print("New tuple values:", new_tuple)
