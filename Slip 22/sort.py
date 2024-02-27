# define a function bubble_sort that takes a list as a parameter
def bubble_sort(my_list):
  # get the length of the list
  n = len(my_list)
  # loop through the list n-1 times
  for i in range(n-1):
    # loop through the list from 0 to n-1-i
    for j in range(0, n-1-i):
      # compare the adjacent elements
      if my_list[j] > my_list[j+1]:
        # swap them if they are in the wrong order
        my_list[j], my_list[j+1] = my_list[j+1], my_list[j]
  # return the sorted list
  return my_list

# create a sample list
unsorted_list = [34, 76, 90, 12, 32, 44, 55]
# apply the bubble_sort function to sort it
sorted_list = bubble_sort(unsorted_list)
# print the sorted list
print(sorted_list)
