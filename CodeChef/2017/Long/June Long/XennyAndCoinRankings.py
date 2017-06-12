def main():
	tc = int(input())
	for _  in range(tc):
		x, y = map(int, input().split())
		print(  ((y * (y + 1)) // 2) +  (((x + 1) * (x + 2)) // 2)  + (y * x))
 
 
if __name__ == '__main__':
	main()
