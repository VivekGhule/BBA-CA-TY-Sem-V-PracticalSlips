# Define a list of tuples
lst = [(1, 'a'), (2, 'b'), (3, 'c')]

# Use zip() and * operator to unzip the list of tuples
nums, letters = zip(*lst)

# Print the unzipped lists
print(nums) # Output: (1, 2, 3)
print(letters) # Output: ('a', 'b', 'c')
