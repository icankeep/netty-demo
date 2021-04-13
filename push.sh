#!/bin/bash

cd /Users/passer/dev/code/netty-demo
git checkout master
date +"%Y-%m-%d %H:%M:%S" > README.md
git add .
git commit -m "update"
git push origin master
