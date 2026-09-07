#!/bin/sh

# References: 
# https://stackoverflow.com/questions/10067266/when-should-i-wrap-quotes-around-a-shell-variable
# https://stackoverflow.com/questions/68622119/how-to-use-if-elif-else-in-bash

help() {
    echo -e "Run Java Applications 
        [1] Single line comment
        [2] Block comment
        [3] End of of line comment 
        [4] Trailing comment
    "
}

opt="$1"
if [[ "$opt" == "1" ]]; then
    java -cp bin SingleLineComment
elif [[ "$opt" == "2" ]]; then
    java -cp bin BlockComment
elif [[ "$opt" == "3" ]]; then
    java -cp bin EndOfLineComment
elif [[ "$opt" == "4" ]]; then
    java -cp bin TrailingComment
else 
    help
fi