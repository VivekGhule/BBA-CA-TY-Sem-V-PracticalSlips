# Write a Python script to generate and print a dictionary which contains a number
# (between 1 and n) in the form (x, x*x)

# Take the input for n
n = int(input("Enter a number: "))

# Create an empty dictionary
d = {}

# Loop over the range of numbers from 1 to n
for x in range(1, n + 1):
    # Assign the square of x as the value of the key x
    d[x] = x * x

# Print the dictionary
print(d)
