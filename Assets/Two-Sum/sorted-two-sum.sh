#!/bin/bash

declare -a nums=(2 7 11 15);
target=9;

indices=( "${#nums[@]}" )
right_index=$(( $indices-1 ))
right=${nums[right_index]}
left_index=0;
left=${nums[0]};
sum=0;

while [ $sum -ne $target ]; do 
	sum=$(( $right + $left ));
	if [ $target -gt $sum ]; then
		left_index=$(( $left_index++ ))
		left=${nums[$left_index]};
	elif [ $target -lt $sum ]; then
		right_index=$(( $right_index-1 ))
		right=${nums[$right_index]};	
	fi
done
echo "$left $right"