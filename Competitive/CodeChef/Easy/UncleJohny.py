t= int(input())
for i in range(0,t):
	n=int(input())
	arr=[int(y) for y in raw_input().split()]
	temp=arr[int(raw_input())-1]
	arr.sort()
	for w in range(0,n):
		if temp==arr[w] :
			print w+1
			break
