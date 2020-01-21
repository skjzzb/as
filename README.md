# as
firebaseConfig = {
  apiKey: "AIzaSyDSA2bt010RfWMj4A5tJhND_trPY9DLOrQ",
  authDomain: "demodd-928e1.firebaseapp.com",
  databaseURL: "https://demodd-928e1.firebaseio.com",
  projectId: "demodd-928e1",
  storageBucket: "demodd-928e1.appspot.com",
  messagingSenderId: "481416529650",
  appId: "1:481416529650:web:360ef91d95c081e23db26b",
  measurementId: "G-4BKY52Z3WG"
}
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

