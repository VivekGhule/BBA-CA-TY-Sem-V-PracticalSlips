# Queue implementation in Python using list
queue = [] # Create an empty list
# Add an element to the end of the queue
def enqueue(item):
  queue.append(item)
# Remove an element from the front of the queue
def dequeue():
  if len(queue) > 0:
    return queue.pop(0)
  else:
    return None
# Display the queue
def display():
  print(queue)
# Test the queue
enqueue(1)
enqueue(2)
enqueue(3)
display() # [1, 2, 3]
dequeue()
display() # [2, 3]
