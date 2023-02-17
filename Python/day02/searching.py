

def linearSearch(a, key):
	for i in range(len(a)):
		if(a[i] == key):
			return i
	return -1

def binarySearch(arr, key):
	left = 0
	right = len(arr)-1
	while(left <= right):
		mid = int((left + right) / 2)
		if(key == arr[mid]):
			return mid
		if(key < arr[mid]):
			right = mid - 1
		else: # if(key > arr[mid])
			left = mid + 1
	return -1 # element not found

	
def recBinarySearch(arr, left, right, key):
	# if invalid partition, return element not found.
	if(right < left):
		return -1
	# find middle of partition
	mid = int((left + right) / 2)
	# if key is same as middle element, return its index
	if(key == arr[mid]):
		return mid
	# if key is smaller than middle element, search in left partition
	if(key < arr[mid]):
		index = recBinarySearch(arr, left, mid-1, key)
	# if key is greater than middle element, search in right partition
	else: # if(key > arr[mid])
		index = recBinarySearch(arr, mid+1, right, key)
	return index


def main():
	arr = [ 11, 22, 33, 44, 55, 66, 77, 88, 99 ]
	num = int(input("Enter number to be searched: "))
	# index = linearSearch(arr, num)
	# index = binarySearch(arr, num)
	index = recBinarySearch(arr, 0, len(arr)-1, num)
	if(index == -1):
		print(f"Element {num} is not found.")
	else:
		print(f"Element {num} found at {index}");


if __name__ == "__main__":
	main()










