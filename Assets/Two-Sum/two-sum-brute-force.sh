#!/bin/bash

declare -a nums=(2 7 11 15);
target=9;
nums1=(${nums[*]});
nums2=(${nums[*]});

for i in ${!nums1[@]}; do
    for j in ${!nums2[@]}; do
        sum=$(expr ${nums1[i]} + ${nums2[j]});
        if [ ${sum} -eq ${target} ]; then
            echo "Numbers at index $i and index $j = ${target}."; 
        fi
    done;
done;









