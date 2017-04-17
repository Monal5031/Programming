T = input()
for i in range(T):
    total, comp = [int(x) for x in raw_input().split()]
    c_lst=[int(y) for y in raw_input().split()]         #thats how we input a line of int's
    i_lst=[]                    #empty list for chef to clean
    for z in range(1,total+1):
        if z not in c_lst:
                i_lst.append(z)
        #print(i_lst)
    for w in range(0,len(i_lst),2): #the 3rd parameter in range depicts that we take steps of 2 from 0
        print i_lst[w],
    print ''
    for w in range(1,len(i_lst),2):
            print i_lst[w],
    print ''

