
n=gets.to_i;
for i in 0...n 
  a = gets.chomp.to_i;
  tot=1;
  a.downto(1) do |j|
    tot=tot*j;
  end
   if tot<=10
       puts tot
   else
     puts tot%10;
   end
end
  

