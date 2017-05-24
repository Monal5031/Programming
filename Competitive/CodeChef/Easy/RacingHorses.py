T = input()

for k in range(0, T):
    N = input()
    S = [int(x) for x in raw_input().split()]
    S.sort()
    min = S[1]-S[0]
    for i in range(1, N):
        if S[i]-S[i-1] < min:
            min = S[i]-S[i-1]
    print min
