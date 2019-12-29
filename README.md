# as

-------
Setup
-------

sudo apt install git

git config --global user.name "John Doe"

git config --global user.email "email_id"

------
Get Started
------
git init

git add -A

git commit -m "First Update"

git remote add origin [url]

git push origin [master/branch name]

git log

git status

-------
Make Changes
-------

git add -A

git commit -m "Second Update"

git diff

git push origin [master/branch name]

git show  [hash_value of commit]

---------
Go to Previous Changes
---------

git checkout [hash_value of commit]

git revert [hash_value of commit]

----------
Delete all after wards changes
-----------

git reset [hash_value of commit]

------------
create new branch
------------

git branch

git checkout -b [new branch name]         OR      git branch [new branch name]

git checkout [branch name]

git add -A

git commit -m "Third Update"

git push origin [new branch name]


------------
pull branch
------------

git pull

------------
mearge two branches
------------

 git commit -m "Saurabh By barnch"
   
 git push -u origin saaurbh
   
 git pull
   
 git checkout master
   
 git merge saaurbh
   
 git push -u origin master

