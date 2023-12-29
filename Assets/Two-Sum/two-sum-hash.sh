#!/bin/bash

declare -a nums=(2 7 11 15);
target=9;

for i in ${!nums[@]}; do
    sum=$(( $target-${nums[i]} ));
    index=$(( $( printf "%s\n" "${nums[@]}" | grep -nm 1  "^$sum$" | cut -d ":" -f1 ) - 1 ));
    if [ $index -gt -1 ]; then
        echo $index;
    fi
done;

# $( ... ) is the same as using backticks to capture output of a command into a variable
# printf outputs mydata one element per line
# (all quotes necessary, along with @ instead of *. this avoids splitting "hello world" into 2 lines)
# grep searches for exact string: ^ and $ match beginning and end of line
# grep -n returns line #, in form of 4:hello world
# grep -m 1 finds first match only
# cut extracts just the line number
# subtract 1 from returned line number
# $(( ... )) does integer arithmetic








