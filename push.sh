#!/bin/bash

git checkout test
date +"%Y-%m-%d %H:%M:%S'" > README.md
git add .
git commit -m "update"
git push origin test
