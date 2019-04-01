def iq_test(numbers):

    arr = numbers.split()
    
    for i in arr:
        plag = 0
        if(int(i)%2 == 0):
            plag = plag+1
            even_idx = i
        else:
            plag = plag-1
            odd_idx = i

        if(plag>0):
            return odd_idx
        elif(plag<0):
            return even_idx
        else:
            return null
