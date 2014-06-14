echo "What absolute directory do you want to count?"
read DIR
cd $DIR
files=`ls`
toal=0;
for name in $files
do
	toal=`expr $total + 1`
done
echo "$total"