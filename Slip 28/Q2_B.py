# Write a Python program to accept two lists and merge the two lists into list of tuple

# Take the input for the first list
list1 = input("Enter the first list: ").split()
# Take the input for the second list
list2 = input("Enter the second list: ").split()

# Use the zip() function to merge the two lists into an iterator of tuples
merged = zip(list1, list2)
# Use the list() function to convert the iterator to a list
merged_list = list(merged)

# Display the merged list
print(merged_list)
