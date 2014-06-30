#!/bin/sh

#  rename_tests.sh
#  
#
#  Created by Fernando Cury Gorodscy on 2014-05-19.
#

cd test_cases

for test in *.txt
do
    mv ${test} ${test%.txt}.in
done