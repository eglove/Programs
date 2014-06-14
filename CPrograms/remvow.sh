for filename in *
do
	current_name=$filename
	voweless_name=`echo $current_name | sed -e "s/[aeiou]//g"`
		new_name_no_ext=`echo $voweless_name | sed -e "s/\.[^.]\+$//"`
		echo "$new_name_no_ext"
		if [ "$new_name_no_ext" != "" -a "$current_name" != "$voweless_name" ]
		then 
			mv "$current_name" "$voweless_name"
		fi
done