n=int(input())
for i in range(0,n): 
  a = int(input());
  tot=1;
  for j in reversed(range(1,a+1)):
    tot=tot*j
  if tot<=10:
       print(tot)
  else:
     print(tot%10)
  