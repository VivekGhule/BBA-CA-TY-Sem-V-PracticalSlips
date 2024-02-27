# create a list a with the given elements
a = [1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89]
# create an empty list b to store the elements that are less than 5
b = []
# loop through the list a
for x in a:
  # check if the element x is less than 5
  if x < 5:
    # append x to the list b
    b.append(x)
# print the list b
print(b)
