# Create a sample dictionary
d = {"F": 3, "A": 1, "B": 2, "C": 2, "E": 2, "D": 1}

# Sort the dictionary by key in ascending order
sorted_by_key_asc = sorted(d.items())
print(sorted_by_key_asc)
# Output: [('A', 1), ('B', 2), ('C', 2), ('D', 1), ('E', 2), ('F', 3)]

# Sort the dictionary by key in descending order
sorted_by_key_desc = sorted(d.items(), reverse=True)
print(sorted_by_key_desc)
# Output: [('F', 3), ('E', 2), ('D', 1), ('C', 2), ('B', 2), ('A', 1)]

# Sort the dictionary by value in ascending order
sorted_by_value_asc = sorted(d.items(), key=lambda x: x[1])
print(sorted_by_value_asc)
# Output: [('A', 1), ('D', 1), ('B', 2), ('C', 2), ('E', 2), ('F', 3)]

# Sort the dictionary by value in descending order
sorted_by_value_desc = sorted(d.items(), key=lambda x: x[1], reverse=True)
print(sorted_by_value_desc)
# Output: [('F', 3), ('B', 2), ('C', 2), ('E', 2), ('A', 1), ('D', 1)]
